package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.puglordsrandomstuff.init.PuglordsRandomStuffModItems;

public class JumpDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == PuglordsRandomStuffModItems.ENHANCED_NETHERITE_BOOTS.get()
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == PuglordsRandomStuffModItems.ENDERITE_BOOTS.get()) {
			return true;
		}
		return false;
	}
}
