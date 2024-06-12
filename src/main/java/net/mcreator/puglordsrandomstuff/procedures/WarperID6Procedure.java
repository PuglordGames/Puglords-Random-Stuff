package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.puglordsrandomstuff.network.PuglordsRandomStuffModVariables;
import net.mcreator.puglordsrandomstuff.init.PuglordsRandomStuffModBlocks;

public class WarperID6Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (PuglordsRandomStuffModVariables.MapVariables.get(world).warper6placed == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("A warper of this ID is already placed!"), true);
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else {
			world.setBlock(BlockPos.containing(x, y, z), PuglordsRandomStuffModBlocks.WARPER_FULL_6.get().defaultBlockState(), 3);
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
