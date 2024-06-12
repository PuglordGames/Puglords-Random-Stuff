package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.puglordsrandomstuff.network.PuglordsRandomStuffModVariables;

public class WarperOpenOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.cpressed = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
