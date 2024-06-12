package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.puglordsrandomstuff.network.PuglordsRandomStuffModVariables;
import net.mcreator.puglordsrandomstuff.init.PuglordsRandomStuffModBlocks;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

public class Warper4TeleportProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (PuglordsRandomStuffModVariables.MapVariables.get(world).warper4placed == true) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PuglordsRandomStuffModBlocks.WARPER_FULL.get()) {
				world.setBlock(BlockPos.containing(x, y, z), PuglordsRandomStuffModBlocks.WARPER.get().defaultBlockState(), 3);
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 255, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 20, 255, false, false));
			PuglordsRandomStuffMod.queueServerWork(20, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"tp @p @e[type=puglords_random_stuff:warper_4,limit=1]");
			});
			PuglordsRandomStuffModVariables.MapVariables.get(world).warper4placed = false;
			PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
		} else {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Warper not found!"), true);
		}
	}
}
