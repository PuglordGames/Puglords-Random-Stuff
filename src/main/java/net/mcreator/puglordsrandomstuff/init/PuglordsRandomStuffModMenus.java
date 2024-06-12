
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.puglordsrandomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.puglordsrandomstuff.world.inventory.WarperIDConfigureMenu;
import net.mcreator.puglordsrandomstuff.world.inventory.WarperConfigureMenu;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

public class PuglordsRandomStuffModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PuglordsRandomStuffMod.MODID);
	public static final RegistryObject<MenuType<WarperConfigureMenu>> WARPER_CONFIGURE = REGISTRY.register("warper_configure", () -> IForgeMenuType.create(WarperConfigureMenu::new));
	public static final RegistryObject<MenuType<WarperIDConfigureMenu>> WARPER_ID_CONFIGURE = REGISTRY.register("warper_id_configure", () -> IForgeMenuType.create(WarperIDConfigureMenu::new));
}
