
package net.mcreator.puglordsrandomstuff.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.puglordsrandomstuff.world.inventory.WarperConfigureMenu;
import net.mcreator.puglordsrandomstuff.procedures.WarperTeleportProcedure;
import net.mcreator.puglordsrandomstuff.procedures.Warper6TeleportProcedure;
import net.mcreator.puglordsrandomstuff.procedures.Warper5TeleportProcedure;
import net.mcreator.puglordsrandomstuff.procedures.Warper4TeleportProcedure;
import net.mcreator.puglordsrandomstuff.procedures.Warper3TeleportProcedure;
import net.mcreator.puglordsrandomstuff.procedures.Warper2TeleportProcedure;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WarperConfigureButtonMessage {
	private final int buttonID, x, y, z;

	public WarperConfigureButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public WarperConfigureButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(WarperConfigureButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(WarperConfigureButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = WarperConfigureMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			WarperTeleportProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			Warper2TeleportProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			Warper3TeleportProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Warper4TeleportProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Warper5TeleportProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			Warper6TeleportProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PuglordsRandomStuffMod.addNetworkMessage(WarperConfigureButtonMessage.class, WarperConfigureButtonMessage::buffer, WarperConfigureButtonMessage::new, WarperConfigureButtonMessage::handler);
	}
}
