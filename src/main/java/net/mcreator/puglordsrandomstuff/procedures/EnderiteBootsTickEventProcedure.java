package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.entity.Entity;

public class EnderiteBootsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			entity.fallDistance = 0;
		}
	}
}
