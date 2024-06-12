
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.puglordsrandomstuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.puglordsrandomstuff.client.renderer.Warper6Renderer;
import net.mcreator.puglordsrandomstuff.client.renderer.Warper5Renderer;
import net.mcreator.puglordsrandomstuff.client.renderer.Warper4Renderer;
import net.mcreator.puglordsrandomstuff.client.renderer.Warper3Renderer;
import net.mcreator.puglordsrandomstuff.client.renderer.Warper2Renderer;
import net.mcreator.puglordsrandomstuff.client.renderer.Warper1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PuglordsRandomStuffModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PuglordsRandomStuffModEntities.WARPER_1.get(), Warper1Renderer::new);
		event.registerEntityRenderer(PuglordsRandomStuffModEntities.WARPER_2.get(), Warper2Renderer::new);
		event.registerEntityRenderer(PuglordsRandomStuffModEntities.WARPER_3.get(), Warper3Renderer::new);
		event.registerEntityRenderer(PuglordsRandomStuffModEntities.WARPER_4.get(), Warper4Renderer::new);
		event.registerEntityRenderer(PuglordsRandomStuffModEntities.WARPER_5.get(), Warper5Renderer::new);
		event.registerEntityRenderer(PuglordsRandomStuffModEntities.WARPER_6.get(), Warper6Renderer::new);
	}
}
