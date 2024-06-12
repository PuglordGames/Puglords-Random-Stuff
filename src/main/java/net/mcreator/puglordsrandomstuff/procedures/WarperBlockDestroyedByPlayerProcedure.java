package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.puglordsrandomstuff.network.PuglordsRandomStuffModVariables;

public class WarperBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world) {
		PuglordsRandomStuffModVariables.MapVariables.get(world).warper_id = PuglordsRandomStuffModVariables.MapVariables.get(world).warper_id - 1;
		PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
	}
}
