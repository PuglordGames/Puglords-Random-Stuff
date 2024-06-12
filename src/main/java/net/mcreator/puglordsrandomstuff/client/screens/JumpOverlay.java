
package net.mcreator.puglordsrandomstuff.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.puglordsrandomstuff.procedures.Meter9Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter8Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter7Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter6Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter5Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter4Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter3Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter2Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter1Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter14Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter13Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter12Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter11Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter10Procedure;
import net.mcreator.puglordsrandomstuff.procedures.Meter0Procedure;
import net.mcreator.puglordsrandomstuff.procedures.JumpIndicator3Procedure;
import net.mcreator.puglordsrandomstuff.procedures.JumpIndicator2Procedure;
import net.mcreator.puglordsrandomstuff.procedures.JumpIndicator1Procedure;
import net.mcreator.puglordsrandomstuff.procedures.JumpDisplayOverlayIngameProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class JumpOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (JumpDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/screen.png"), 0, 0, 0, 0, w, h, w, h);
			event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/jump_indicator_0.png"), w - 52, h / 2 + -76, 0, 0, 64, 64, 64, 64);

			if (JumpIndicator3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/jump_indicator_3.png"), w - 52, h / 2 + -76, 0, 0, 64, 64, 64, 64);
			}
			if (JumpIndicator2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/jump_indicator_2.png"), w - 52, h / 2 + -76, 0, 0, 64, 64, 64, 64);
			}
			if (JumpIndicator1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/jump_indicator_1.png"), w - 52, h / 2 + -76, 0, 0, 64, 64, 64, 64);
			}
			if (Meter0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_0.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_1.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_2.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_3.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_4.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_5.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_6.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_7.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_8.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_9.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_10.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_11.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_12.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_13.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
			if (Meter14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("puglords_random_stuff:textures/screens/meter_14.png"), w / 2 + -9, h / 2 + 5, 0, 0, 16, 3, 16, 3);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
