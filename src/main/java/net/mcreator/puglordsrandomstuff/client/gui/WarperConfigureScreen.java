package net.mcreator.puglordsrandomstuff.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.puglordsrandomstuff.world.inventory.WarperConfigureMenu;
import net.mcreator.puglordsrandomstuff.network.WarperConfigureButtonMessage;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WarperConfigureScreen extends AbstractContainerScreen<WarperConfigureMenu> {
	private final static HashMap<String, Object> guistate = WarperConfigureMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1;
	Button button_2;
	Button button_3;
	Button button_4;
	Button button_5;
	Button button_6;

	public WarperConfigureScreen(WarperConfigureMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 189;
		this.imageHeight = 132;
	}

	private static final ResourceLocation texture = new ResourceLocation("puglords_random_stuff:textures/screens/warper_configure.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.puglords_random_stuff.warper_configure.label_configure_warper"), 16, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_1 = Button.builder(Component.translatable("gui.puglords_random_stuff.warper_configure.button_1"), e -> {
			if (true) {
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new WarperConfigureButtonMessage(0, x, y, z));
				WarperConfigureButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 53, 30, 20).build();
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_2 = Button.builder(Component.translatable("gui.puglords_random_stuff.warper_configure.button_2"), e -> {
			if (true) {
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new WarperConfigureButtonMessage(1, x, y, z));
				WarperConfigureButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 76, this.topPos + 53, 30, 20).build();
		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);
		button_3 = Button.builder(Component.translatable("gui.puglords_random_stuff.warper_configure.button_3"), e -> {
			if (true) {
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new WarperConfigureButtonMessage(2, x, y, z));
				WarperConfigureButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 112, this.topPos + 53, 30, 20).build();
		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);
		button_4 = Button.builder(Component.translatable("gui.puglords_random_stuff.warper_configure.button_4"), e -> {
			if (true) {
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new WarperConfigureButtonMessage(3, x, y, z));
				WarperConfigureButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 89, 30, 20).build();
		guistate.put("button:button_4", button_4);
		this.addRenderableWidget(button_4);
		button_5 = Button.builder(Component.translatable("gui.puglords_random_stuff.warper_configure.button_5"), e -> {
			if (true) {
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new WarperConfigureButtonMessage(4, x, y, z));
				WarperConfigureButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 76, this.topPos + 89, 30, 20).build();
		guistate.put("button:button_5", button_5);
		this.addRenderableWidget(button_5);
		button_6 = Button.builder(Component.translatable("gui.puglords_random_stuff.warper_configure.button_6"), e -> {
			if (true) {
				PuglordsRandomStuffMod.PACKET_HANDLER.sendToServer(new WarperConfigureButtonMessage(5, x, y, z));
				WarperConfigureButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 112, this.topPos + 89, 30, 20).build();
		guistate.put("button:button_6", button_6);
		this.addRenderableWidget(button_6);
	}
}
