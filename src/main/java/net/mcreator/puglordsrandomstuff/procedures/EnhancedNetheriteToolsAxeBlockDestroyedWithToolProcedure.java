package net.mcreator.puglordsrandomstuff.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class EnhancedNetheriteToolsAxeBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y + 1, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y - 1, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y - 1, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y - 1, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y + 1, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y + 1, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y - 1, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y - 1, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y - 1, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y - 1, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y + 1, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y + 1, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y - 1, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y - 1, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("puglords_random_stuff:enhanced_netherite_axe_can_break")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 1, y + 1, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
