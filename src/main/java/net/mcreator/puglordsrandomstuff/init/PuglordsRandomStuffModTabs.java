
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.puglordsrandomstuff.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PuglordsRandomStuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PuglordsRandomStuffMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(PuglordsRandomStuffModBlocks.ENDERITE_BLOCK.get().asItem());
			tabData.accept(PuglordsRandomStuffModBlocks.ENDWOOD_PLANKS.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(PuglordsRandomStuffModBlocks.WARPER.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(PuglordsRandomStuffModItems.ENHANCED_NETHERITE_SWORD.get());
			tabData.accept(PuglordsRandomStuffModItems.ENHANCED_NETHERITE_HELMET.get());
			tabData.accept(PuglordsRandomStuffModItems.ENHANCED_NETHERITE_CHESTPLATE.get());
			tabData.accept(PuglordsRandomStuffModItems.ENHANCED_NETHERITE_LEGGINGS.get());
			tabData.accept(PuglordsRandomStuffModItems.ENHANCED_NETHERITE_BOOTS.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_HELMET.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_CHESTPLATE.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_LEGGINGS.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_BOOTS.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_INGOT.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDSTONE_FRAGMENTS.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDSTONE_SCRAPS.get());
			tabData.accept(PuglordsRandomStuffModItems.RAW_ENDERITE.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDSTONE_ROD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PuglordsRandomStuffModItems.ENHANCED_NETHERITE_AXE.get());
			tabData.accept(PuglordsRandomStuffModItems.ENHANCED_NETHERITE_PICKAXE.get());
			tabData.accept(PuglordsRandomStuffModItems.ENHANCED_NETHERITE_SHOVEL.get());
			tabData.accept(PuglordsRandomStuffModItems.ENHANCED_NETHERITE_HOE.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_PICKAXE.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_AXE.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_SHOVEL.get());
			tabData.accept(PuglordsRandomStuffModItems.ENDERITE_HOE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PuglordsRandomStuffModBlocks.ENDERITE_ORE.get().asItem());
			tabData.accept(PuglordsRandomStuffModBlocks.ENDWOOD_LOG.get().asItem());
			tabData.accept(PuglordsRandomStuffModBlocks.ENDWOOD_LEAVES.get().asItem());
			tabData.accept(PuglordsRandomStuffModBlocks.ENDMOSS.get().asItem());
			tabData.accept(PuglordsRandomStuffModBlocks.ENDMOSS_BLOCK.get().asItem());
			tabData.accept(PuglordsRandomStuffModBlocks.TALL_ENDMOSS.get().asItem());
			tabData.accept(PuglordsRandomStuffModBlocks.GLOWFLOWER.get().asItem());
		}
	}
}
