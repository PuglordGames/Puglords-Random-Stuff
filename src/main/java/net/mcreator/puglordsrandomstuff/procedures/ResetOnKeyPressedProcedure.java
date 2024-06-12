package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.puglordsrandomstuff.network.PuglordsRandomStuffModVariables;

public class ResetOnKeyPressedProcedure {
	public static void execute(LevelAccessor world) {
		PuglordsRandomStuffModVariables.MapVariables.get(world).warper_id = 0;
		PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
		PuglordsRandomStuffModVariables.MapVariables.get(world).warper1placed = false;
		PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
		PuglordsRandomStuffModVariables.MapVariables.get(world).warper2placed = false;
		PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
		PuglordsRandomStuffModVariables.MapVariables.get(world).warper3placed = false;
		PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
		PuglordsRandomStuffModVariables.MapVariables.get(world).warper4placed = false;
		PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
		PuglordsRandomStuffModVariables.MapVariables.get(world).warper5placed = false;
		PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
		PuglordsRandomStuffModVariables.MapVariables.get(world).warper6placed = false;
		PuglordsRandomStuffModVariables.MapVariables.get(world).syncData(world);
	}
}
