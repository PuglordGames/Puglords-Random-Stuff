package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.puglordsrandomstuff.network.PuglordsRandomStuffModVariables;

public class WarperFull5BlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"summon puglords_random_stuff:warper_5 ~0.5 ~1 ~0.5 {NoAI:1b,Invulnerable:1}");
		PuglordsRandomStuffModVariables.MapVariables.get(world).warper5placed = true;
		PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
	}
}
