package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.puglordsrandomstuff.network.PuglordsRandomStuffModVariables;

public class Meter1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PuglordsRandomStuffModVariables.PlayerVariables())).jump_cooldown == 2) {
			return false;
		}
		return true;
	}
}
