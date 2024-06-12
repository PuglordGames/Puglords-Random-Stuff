
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.puglordsrandomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.puglordsrandomstuff.block.WarperFullBlock;
import net.mcreator.puglordsrandomstuff.block.WarperFull6Block;
import net.mcreator.puglordsrandomstuff.block.WarperFull5Block;
import net.mcreator.puglordsrandomstuff.block.WarperFull4Block;
import net.mcreator.puglordsrandomstuff.block.WarperFull3Block;
import net.mcreator.puglordsrandomstuff.block.WarperFull2Block;
import net.mcreator.puglordsrandomstuff.block.WarperBlock;
import net.mcreator.puglordsrandomstuff.block.TallEndmossBlock;
import net.mcreator.puglordsrandomstuff.block.GlowflowerBlock;
import net.mcreator.puglordsrandomstuff.block.EndwoodPlanksBlock;
import net.mcreator.puglordsrandomstuff.block.EndwoodLogBlock;
import net.mcreator.puglordsrandomstuff.block.EndwoodLeavesBlock;
import net.mcreator.puglordsrandomstuff.block.EndmossBlockBlock;
import net.mcreator.puglordsrandomstuff.block.EndmossBlock;
import net.mcreator.puglordsrandomstuff.block.EnderiteOreBlock;
import net.mcreator.puglordsrandomstuff.block.EnderiteBlockBlock;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

public class PuglordsRandomStuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PuglordsRandomStuffMod.MODID);
	public static final RegistryObject<Block> WARPER = REGISTRY.register("warper", () -> new WarperBlock());
	public static final RegistryObject<Block> WARPER_FULL = REGISTRY.register("warper_full", () -> new WarperFullBlock());
	public static final RegistryObject<Block> ENDERITE_ORE = REGISTRY.register("enderite_ore", () -> new EnderiteOreBlock());
	public static final RegistryObject<Block> WARPER_FULL_2 = REGISTRY.register("warper_full_2", () -> new WarperFull2Block());
	public static final RegistryObject<Block> WARPER_FULL_3 = REGISTRY.register("warper_full_3", () -> new WarperFull3Block());
	public static final RegistryObject<Block> WARPER_FULL_4 = REGISTRY.register("warper_full_4", () -> new WarperFull4Block());
	public static final RegistryObject<Block> WARPER_FULL_5 = REGISTRY.register("warper_full_5", () -> new WarperFull5Block());
	public static final RegistryObject<Block> WARPER_FULL_6 = REGISTRY.register("warper_full_6", () -> new WarperFull6Block());
	public static final RegistryObject<Block> ENDERITE_BLOCK = REGISTRY.register("enderite_block", () -> new EnderiteBlockBlock());
	public static final RegistryObject<Block> ENDWOOD_LOG = REGISTRY.register("endwood_log", () -> new EndwoodLogBlock());
	public static final RegistryObject<Block> ENDWOOD_LEAVES = REGISTRY.register("endwood_leaves", () -> new EndwoodLeavesBlock());
	public static final RegistryObject<Block> ENDWOOD_PLANKS = REGISTRY.register("endwood_planks", () -> new EndwoodPlanksBlock());
	public static final RegistryObject<Block> ENDMOSS = REGISTRY.register("endmoss", () -> new EndmossBlock());
	public static final RegistryObject<Block> ENDMOSS_BLOCK = REGISTRY.register("endmoss_block", () -> new EndmossBlockBlock());
	public static final RegistryObject<Block> TALL_ENDMOSS = REGISTRY.register("tall_endmoss", () -> new TallEndmossBlock());
	public static final RegistryObject<Block> GLOWFLOWER = REGISTRY.register("glowflower", () -> new GlowflowerBlock());
}
