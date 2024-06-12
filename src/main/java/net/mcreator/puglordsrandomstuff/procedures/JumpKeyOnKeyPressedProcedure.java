package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.puglordsrandomstuff.network.PuglordsRandomStuffModVariables;
import net.mcreator.puglordsrandomstuff.init.PuglordsRandomStuffModItems;
import net.mcreator.puglordsrandomstuff.PuglordsRandomStuffMod;

public class JumpKeyOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PuglordsRandomStuffModVariables.PlayerVariables())).jumpnumber == 4) {
			{
				boolean _setval = true;
				entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jumpvar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jumpnumber = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PuglordsRandomStuffModVariables.PlayerVariables())).player_can_jump == true
				&& (entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PuglordsRandomStuffModVariables.PlayerVariables())).jump_cooldown == 0
				&& !world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()
				&& ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == PuglordsRandomStuffModItems.ENHANCED_NETHERITE_BOOTS.get()
						|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == PuglordsRandomStuffModItems.ENDERITE_BOOTS.get())
				&& false == (entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PuglordsRandomStuffModVariables.PlayerVariables())).jumpvar) {
			{
				boolean _setval = false;
				entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.player_can_jump = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 15;
				entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jump_cooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 5), 1, (entity.getDeltaMovement().z() * 5)));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 25, 0.1, 0.1, 0.1, 1);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("puglords_random_stuff:double_jump")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("puglords_random_stuff:double_jump")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			{
				double _setval = (entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PuglordsRandomStuffModVariables.PlayerVariables())).jumpnumber + 1;
				entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jumpnumber = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			for (int index0 = 0; index0 < 15; index0++) {
				PuglordsRandomStuffMod.queueServerWork(3, () -> {
					{
						double _setval = (entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PuglordsRandomStuffModVariables.PlayerVariables())).jump_cooldown - 1;
						entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.jump_cooldown = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				});
			}
			PuglordsRandomStuffMod.queueServerWork(15, () -> {
				{
					boolean _setval = true;
					entity.getCapability(PuglordsRandomStuffModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.player_can_jump = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
