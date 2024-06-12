
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.puglordsrandomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.puglordsrandomstuff.item.RawEnderiteItem;
import net.mcreator.puglordsrandomstuff.item.Enhanced_Netherite_ToolsSwordItem;
import net.mcreator.puglordsrandomstuff.item.Enhanced_Netherite_ToolsShovelItem;
import net.mcreator.puglordsrandomstuff.item.Enhanced_Netherite_ToolsPickaxeItem;
import net.mcreator.puglordsrandomstuff.item.Enhanced_Netherite_ToolsHoeItem;
import net.mcreator.puglordsrandomstuff.item.Enhanced_Netherite_ToolsAxeItem;
import net.mcreator.puglordsrandomstuff.item.EnhancedNetheriteItem;
import net.mcreator.puglordsrandomstuff.item.EndstoneScrapsItem;
import net.mcreator.puglordsrandomstuff.item.EndstoneRodItem;
import net.mcreator.puglordsrandomstuff.item.EndstoneFragmentsItem;
import net.mcreator.puglordsrandomstuff.item.EnderiteSwordItem;
import net.mcreator.puglordsrandomstuff.item.EnderiteShovelItem;
import net.mcreator.puglordsrandomstuff.item.EnderitePickaxeItem;
import net.mcreator.puglordsrandomstuff.item.EnderiteItem;
import net.mcreator.puglordsrandomstuff.item.EnderiteIngotItem;
import net.mcreator.puglordsrandomstuff.item.EnderiteHoeItem;
import net.mcreator.puglordsrandomstuff.item.EnderiteAxeItem;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

public class PuglordsRandomStuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PuglordsRandomStuffMod.MODID);
	public static final RegistryObject<Item> ENHANCED_NETHERITE_AXE = REGISTRY.register("enhanced_netherite_axe", () -> new Enhanced_Netherite_ToolsAxeItem());
	public static final RegistryObject<Item> ENHANCED_NETHERITE_PICKAXE = REGISTRY.register("enhanced_netherite_pickaxe", () -> new Enhanced_Netherite_ToolsPickaxeItem());
	public static final RegistryObject<Item> ENHANCED_NETHERITE_SWORD = REGISTRY.register("enhanced_netherite_sword", () -> new Enhanced_Netherite_ToolsSwordItem());
	public static final RegistryObject<Item> ENHANCED_NETHERITE_SHOVEL = REGISTRY.register("enhanced_netherite_shovel", () -> new Enhanced_Netherite_ToolsShovelItem());
	public static final RegistryObject<Item> ENHANCED_NETHERITE_HOE = REGISTRY.register("enhanced_netherite_hoe", () -> new Enhanced_Netherite_ToolsHoeItem());
	public static final RegistryObject<Item> ENHANCED_NETHERITE_HELMET = REGISTRY.register("enhanced_netherite_helmet", () -> new EnhancedNetheriteItem.Helmet());
	public static final RegistryObject<Item> ENHANCED_NETHERITE_CHESTPLATE = REGISTRY.register("enhanced_netherite_chestplate", () -> new EnhancedNetheriteItem.Chestplate());
	public static final RegistryObject<Item> ENHANCED_NETHERITE_LEGGINGS = REGISTRY.register("enhanced_netherite_leggings", () -> new EnhancedNetheriteItem.Leggings());
	public static final RegistryObject<Item> ENHANCED_NETHERITE_BOOTS = REGISTRY.register("enhanced_netherite_boots", () -> new EnhancedNetheriteItem.Boots());
	public static final RegistryObject<Item> WARPER = block(PuglordsRandomStuffModBlocks.WARPER);
	public static final RegistryObject<Item> WARPER_FULL = block(PuglordsRandomStuffModBlocks.WARPER_FULL);
	public static final RegistryObject<Item> ENDERITE_HELMET = REGISTRY.register("enderite_helmet", () -> new EnderiteItem.Helmet());
	public static final RegistryObject<Item> ENDERITE_CHESTPLATE = REGISTRY.register("enderite_chestplate", () -> new EnderiteItem.Chestplate());
	public static final RegistryObject<Item> ENDERITE_LEGGINGS = REGISTRY.register("enderite_leggings", () -> new EnderiteItem.Leggings());
	public static final RegistryObject<Item> ENDERITE_BOOTS = REGISTRY.register("enderite_boots", () -> new EnderiteItem.Boots());
	public static final RegistryObject<Item> ENDERITE_PICKAXE = REGISTRY.register("enderite_pickaxe", () -> new EnderitePickaxeItem());
	public static final RegistryObject<Item> ENDERITE_AXE = REGISTRY.register("enderite_axe", () -> new EnderiteAxeItem());
	public static final RegistryObject<Item> ENDERITE_SWORD = REGISTRY.register("enderite_sword", () -> new EnderiteSwordItem());
	public static final RegistryObject<Item> ENDERITE_SHOVEL = REGISTRY.register("enderite_shovel", () -> new EnderiteShovelItem());
	public static final RegistryObject<Item> ENDERITE_HOE = REGISTRY.register("enderite_hoe", () -> new EnderiteHoeItem());
	public static final RegistryObject<Item> ENDERITE_INGOT = REGISTRY.register("enderite_ingot", () -> new EnderiteIngotItem());
	public static final RegistryObject<Item> ENDSTONE_FRAGMENTS = REGISTRY.register("endstone_fragments", () -> new EndstoneFragmentsItem());
	public static final RegistryObject<Item> ENDSTONE_SCRAPS = REGISTRY.register("endstone_scraps", () -> new EndstoneScrapsItem());
	public static final RegistryObject<Item> RAW_ENDERITE = REGISTRY.register("raw_enderite", () -> new RawEnderiteItem());
	public static final RegistryObject<Item> ENDSTONE_ROD = REGISTRY.register("endstone_rod", () -> new EndstoneRodItem());
	public static final RegistryObject<Item> ENDERITE_ORE = block(PuglordsRandomStuffModBlocks.ENDERITE_ORE);
	public static final RegistryObject<Item> WARPER_FULL_2 = block(PuglordsRandomStuffModBlocks.WARPER_FULL_2);
	public static final RegistryObject<Item> WARPER_FULL_3 = block(PuglordsRandomStuffModBlocks.WARPER_FULL_3);
	public static final RegistryObject<Item> WARPER_FULL_4 = block(PuglordsRandomStuffModBlocks.WARPER_FULL_4);
	public static final RegistryObject<Item> WARPER_FULL_5 = block(PuglordsRandomStuffModBlocks.WARPER_FULL_5);
	public static final RegistryObject<Item> WARPER_FULL_6 = block(PuglordsRandomStuffModBlocks.WARPER_FULL_6);
	public static final RegistryObject<Item> ENDERITE_BLOCK = block(PuglordsRandomStuffModBlocks.ENDERITE_BLOCK);
	public static final RegistryObject<Item> ENDWOOD_LOG = block(PuglordsRandomStuffModBlocks.ENDWOOD_LOG);
	public static final RegistryObject<Item> ENDWOOD_LEAVES = block(PuglordsRandomStuffModBlocks.ENDWOOD_LEAVES);
	public static final RegistryObject<Item> ENDWOOD_PLANKS = block(PuglordsRandomStuffModBlocks.ENDWOOD_PLANKS);
	public static final RegistryObject<Item> ENDMOSS = block(PuglordsRandomStuffModBlocks.ENDMOSS);
	public static final RegistryObject<Item> ENDMOSS_BLOCK = block(PuglordsRandomStuffModBlocks.ENDMOSS_BLOCK);
	public static final RegistryObject<Item> TALL_ENDMOSS = doubleBlock(PuglordsRandomStuffModBlocks.TALL_ENDMOSS);
	public static final RegistryObject<Item> GLOWFLOWER = block(PuglordsRandomStuffModBlocks.GLOWFLOWER);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
