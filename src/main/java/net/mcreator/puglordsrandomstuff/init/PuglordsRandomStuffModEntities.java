
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.puglordsrandomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.puglordsrandomstuff.entity.Warper6Entity;
import net.mcreator.puglordsrandomstuff.entity.Warper5Entity;
import net.mcreator.puglordsrandomstuff.entity.Warper4Entity;
import net.mcreator.puglordsrandomstuff.entity.Warper3Entity;
import net.mcreator.puglordsrandomstuff.entity.Warper2Entity;
import net.mcreator.puglordsrandomstuff.entity.Warper1Entity;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PuglordsRandomStuffModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PuglordsRandomStuffMod.MODID);
	public static final RegistryObject<EntityType<Warper1Entity>> WARPER_1 = register("warper_1",
			EntityType.Builder.<Warper1Entity>of(Warper1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Warper1Entity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<Warper2Entity>> WARPER_2 = register("warper_2",
			EntityType.Builder.<Warper2Entity>of(Warper2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Warper2Entity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<Warper3Entity>> WARPER_3 = register("warper_3",
			EntityType.Builder.<Warper3Entity>of(Warper3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Warper3Entity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<Warper4Entity>> WARPER_4 = register("warper_4",
			EntityType.Builder.<Warper4Entity>of(Warper4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Warper4Entity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<Warper5Entity>> WARPER_5 = register("warper_5",
			EntityType.Builder.<Warper5Entity>of(Warper5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Warper5Entity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<Warper6Entity>> WARPER_6 = register("warper_6",
			EntityType.Builder.<Warper6Entity>of(Warper6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Warper6Entity::new).fireImmune().sized(0.9f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Warper1Entity.init();
			Warper2Entity.init();
			Warper3Entity.init();
			Warper4Entity.init();
			Warper5Entity.init();
			Warper6Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WARPER_1.get(), Warper1Entity.createAttributes().build());
		event.put(WARPER_2.get(), Warper2Entity.createAttributes().build());
		event.put(WARPER_3.get(), Warper3Entity.createAttributes().build());
		event.put(WARPER_4.get(), Warper4Entity.createAttributes().build());
		event.put(WARPER_5.get(), Warper5Entity.createAttributes().build());
		event.put(WARPER_6.get(), Warper6Entity.createAttributes().build());
	}
}
