
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.puglordsrandomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

public class PuglordsRandomStuffModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PuglordsRandomStuffMod.MODID);
	public static final RegistryObject<SoundEvent> DOUBLE_JUMP = REGISTRY.register("double_jump", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("puglords_random_stuff", "double_jump")));
}
