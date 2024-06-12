
package net.mcreator.puglordsrandomstuff.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.puglordsrandomstuff.world.inventory.WarperIDConfigureMenu;
import net.mcreator.puglordsrandomstuff.procedures.WarperID6Procedure;
import net.mcreator.puglordsrandomstuff.procedures.WarperID5Procedure;
import net.mcreator.puglordsrandomstuff.procedures.WarperID4Procedure;
import net.mcreator.puglordsrandomstuff.procedures.WarperID3Procedure;
import net.mcreator.puglordsrandomstuff.procedures.WarperID2Procedure;
import net.mcreator.puglordsrandomstuff.procedures.WarperID1Procedure;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WarperIDConfigureButtonMessage {
	private final int buttonID, x, y, z;

	public WarperIDConfigureButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public WarperIDConfigureButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(WarperIDConfigureButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(WarperIDConfigureButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = WarperIDConfigureMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			WarperID1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			WarperID2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			WarperID3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			WarperID4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			WarperID5Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			WarperID6Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PuglordsRandomStuffMod.addNetworkMessage(WarperIDConfigureButtonMessage.class, WarperIDConfigureButtonMessage::buffer, WarperIDConfigureButtonMessage::new, WarperIDConfigureButtonMessage::handler);
	}
}
