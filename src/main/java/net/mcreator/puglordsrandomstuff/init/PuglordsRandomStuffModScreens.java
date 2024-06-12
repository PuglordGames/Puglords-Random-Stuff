
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.puglordsrandomstuff.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.puglordsrandomstuff.client.gui.WarperIDConfigureScreen;
import net.mcreator.puglordsrandomstuff.client.gui.WarperConfigureScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PuglordsRandomStuffModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PuglordsRandomStuffModMenus.WARPER_CONFIGURE.get(), WarperConfigureScreen::new);
			MenuScreens.register(PuglordsRandomStuffModMenus.WARPER_ID_CONFIGURE.get(), WarperIDConfigureScreen::new);
		});
	}
}
