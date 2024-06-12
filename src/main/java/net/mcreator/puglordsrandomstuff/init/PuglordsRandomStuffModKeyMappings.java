
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.puglordsrandomstuff.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.puglordsrandomstuff.network.WarperOpenMessage;
import net.mcreator.puglordsrandomstuff.network.ResetMessage;
import net.mcreator.puglordsrandomstuff.network.JumpKeyMessage;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PuglordsRandomStuffModKeyMappings {
	public static final KeyMapping JUMP_KEY = new KeyMapping("key.puglords_random_stuff.jump_key", GLFW.GLFW_KEY_SPACE, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new JumpKeyMessage(0, 0));
				JumpKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping RESET = new KeyMapping("key.puglords_random_stuff.reset", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new ResetMessage(0, 0));
				ResetMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping WARPER_OPEN = new KeyMapping("key.puglords_random_stuff.warper_open", GLFW.GLFW_KEY_C, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new WarperOpenMessage(0, 0));
				WarperOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				WARPER_OPEN_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - WARPER_OPEN_LASTPRESS);
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new WarperOpenMessage(1, dt));
				WarperOpenMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long WARPER_OPEN_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(JUMP_KEY);
		event.register(RESET);
		event.register(WARPER_OPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				JUMP_KEY.consumeClick();
				RESET.consumeClick();
				WARPER_OPEN.consumeClick();
			}
		}
	}
}
