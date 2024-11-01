package net.iyun.goldyheart.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.iyun.goldyheart.block.ModBlocks;
import net.iyun.goldyheart.block.custom.*;
import net.iyun.goldyheart.item.ModItems;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.DIRT_SLAB, slabDrops(ModBlocks.DIRT_SLAB));
        addDrop(ModBlocks.OAK_WOOD_SLAB, slabDrops(ModBlocks.OAK_WOOD_SLAB));
        addDrop(ModBlocks.OAK_WOOD_SLAB_S, slabDrops(ModBlocks.OAK_WOOD_SLAB_S));
        addDrop(ModBlocks.BIRCH_WOOD_SLAB_S, slabDrops(ModBlocks.BIRCH_WOOD_SLAB_S));
        addDrop(ModBlocks.BIRCH_WOOD_SLAB, slabDrops(ModBlocks.BIRCH_WOOD_SLAB));
        addDrop(ModBlocks.ACA_WOOD_SLAB, slabDrops(ModBlocks.ACA_WOOD_SLAB));
        addDrop(ModBlocks.ACA_WOOD_SLAB_S, slabDrops(ModBlocks.ACA_WOOD_SLAB_S));
        addDrop(ModBlocks.CHERRY_WOOD_SLAB, slabDrops(ModBlocks.CHERRY_WOOD_SLAB_S));
        addDrop(ModBlocks.CHERRY_WOOD_SLAB_S, slabDrops(ModBlocks.CHERRY_WOOD_SLAB_S));
        addDrop(ModBlocks.JUNGLE_WOOD_SLAB_S, slabDrops(ModBlocks.JUNGLE_WOOD_SLAB_S));
        addDrop(ModBlocks.JUNGLE_WOOD_SLAB, slabDrops(ModBlocks.JUNGLE_WOOD_SLAB));
        addDrop(ModBlocks.DARK_OAK_WOOD_SLAB, slabDrops(ModBlocks.DARK_OAK_WOOD_SLAB));
        addDrop(ModBlocks.DARK_OAK_WOOD_SLAB_S, slabDrops(ModBlocks.DARK_OAK_WOOD_SLAB_S));
        addDrop(ModBlocks.MANGROVE_WOOD_SLAB, slabDrops(ModBlocks.MANGROVE_WOOD_SLAB));
        addDrop(ModBlocks.MANGROVE_WOOD_SLAB_S, slabDrops(ModBlocks.MANGROVE_WOOD_SLAB_S));
        addDrop(ModBlocks.SPRUCE_WOOD_SLAB, slabDrops(ModBlocks.SPRUCE_WOOD_SLAB));
        addDrop(ModBlocks.SPRUCE_WOOD_SLAB_S, slabDrops(ModBlocks.SPRUCE_WOOD_SLAB_S));
        addDrop(ModBlocks.COARSE_DIRT_SLAB, slabDrops(ModBlocks.COARSE_DIRT_SLAB));
        addDrop(ModBlocks.SOUL_SAND_SLAB, slabDrops(ModBlocks.SOUL_SAND_SLAB));
        addDrop(ModBlocks.SOUL_SOIL_SLAB, slabDrops(ModBlocks.SOUL_SOIL_SLAB));
        addDrop(ModBlocks.ROOTED_DIRT_SLAB, slabDrops(ModBlocks.ROOTED_DIRT_SLAB));
        addDrop(ModBlocks.PACKED_ICE_SLAB, slabDrops(ModBlocks.PACKED_ICE_SLAB));
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB, slabDrops(ModBlocks.SMOOTH_BASALT_SLAB));
        addDrop(ModBlocks.SAND_SLAB, slabDrops(ModBlocks.SAND_SLAB));
        addDrop(ModBlocks.CALCITE_SLAB, slabDrops(ModBlocks.CALCITE_SLAB));
        addDrop(ModBlocks.DEAD_HORN_CORAL_SLAB, slabDrops(ModBlocks.DEAD_HORN_CORAL_SLAB));
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_SLAB, slabDrops(ModBlocks.DEAD_BUBBLE_CORAL_SLAB));
        addDrop(ModBlocks.DEAD_FIRE_CORAL_SLAB, slabDrops(ModBlocks.DEAD_FIRE_CORAL_SLAB));
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_SLAB, slabDrops(ModBlocks.DEAD_BRAIN_CORAL_SLAB));
        addDrop(ModBlocks.DEAD_TUBE_CORAL_SLAB, slabDrops(ModBlocks.DEAD_TUBE_CORAL_SLAB));
        addDrop(ModBlocks.EXPOSED_COPPER_SLAB, slabDrops(ModBlocks.EXPOSED_COPPER_SLAB));
        addDrop(ModBlocks.WEATHERED_COPPER_SLAB, slabDrops(ModBlocks.WEATHERED_COPPER_SLAB));
        addDrop(ModBlocks.OXIDIZED_COPPER_SLAB, slabDrops(ModBlocks.OXIDIZED_COPPER_SLAB));
        addDrop(ModBlocks.COPPER_SLAB, slabDrops(ModBlocks.COPPER_SLAB));
        addDrop(ModBlocks.AMETHYST_SLAB, slabDrops(ModBlocks.AMETHYST_SLAB));
        addDrop(ModBlocks.TUFF_SLAB, slabDrops(ModBlocks.TUFF_SLAB));
        addDrop(ModBlocks.SAND_STAIR);
        addDrop(ModBlocks.TUFF_STAIRS);
        addDrop(ModBlocks.COPPER_STAIRS);
        addDrop(ModBlocks.OXIDIZED_COPPER_STAIRS);
        addDrop(ModBlocks.WEATHERED_COPPER_STAIRS);
        addDrop(ModBlocks.EXPOSED_COPPER_STAIRS);
        addDrop(ModBlocks.AMETHYST_STAIRS);
        addDrop(ModBlocks.DEAD_FIRE_CORAL_STAIRS);
        addDrop(ModBlocks.DEAD_BUBBLE_CORAL_STAIRS);
        addDrop(ModBlocks.DEAD_TUBE_CORAL_STAIRS);
        addDrop(ModBlocks.DEAD_HORN_CORAL_STAIRS);
        addDrop(ModBlocks.DEAD_BRAIN_CORAL_STAIRS);
        addDrop(ModBlocks.IRON_STAIRS);
        addDrop(ModBlocks.CALCITE_STAIRS);
        //   addDrop(ModBlocks.TUFF_BUTTON);
        addDrop(ModBlocks.GOLD_STAIRS);
        addDrop(ModBlocks.RED_SAND_STAIR);
        addDrop(ModBlocks.WHITE_WOOL_SLAB, slabDrops(ModBlocks.WHITE_WOOL_SLAB));
        addDrop(ModBlocks.BLACK_WOOL_SLAB, slabDrops(ModBlocks.BLACK_WOOL_SLAB));
        addDrop(ModBlocks.BLUE_WOOL_SLAB, slabDrops(ModBlocks.BLUE_WOOL_SLAB));
        addDrop(ModBlocks.MAGENTA_WOOL_SLAB, slabDrops(ModBlocks.MAGENTA_WOOL_SLAB));
        addDrop(ModBlocks.PINK_WOOL_SLAB, slabDrops(ModBlocks.PINK_WOOL_SLAB));
        addDrop(ModBlocks.RED_SAND_SLAB, slabDrops(ModBlocks.RED_SAND_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_WOOL_SLAB));
        addDrop(ModBlocks.LIME_WOOL_SLAB, slabDrops(ModBlocks.LIME_WOOL_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_WOOL_SLAB));
        addDrop(ModBlocks.GRAVEL_SLAB, slabDrops(ModBlocks.GRAVEL_SLAB));
        addDrop(ModBlocks.CYAN_WOOL_SLAB, slabDrops(ModBlocks.CYAN_WOOL_SLAB));
        addDrop(ModBlocks.RED_WOOL_SLAB, slabDrops(ModBlocks.RED_WOOL_SLAB));
        addDrop(ModBlocks.YELLOW_WOOL_SLAB, slabDrops(ModBlocks.YELLOW_WOOL_SLAB));
        addDrop(ModBlocks.GREEN_WOOL_SLAB, slabDrops(ModBlocks.GREEN_WOOL_SLAB));
        addDrop(ModBlocks.GRAY_WOOL_SLAB, slabDrops(ModBlocks.GRAY_WOOL_SLAB));
        addDrop(ModBlocks.ORANGE_WOOL_SLAB, slabDrops(ModBlocks.ORANGE_WOOL_SLAB));
        addDrop(ModBlocks.PURPLE_WOOL_SLAB, slabDrops(ModBlocks.PURPLE_WOOL_SLAB));
        addDrop(ModBlocks.BROWN_WOOL_SLAB, slabDrops(ModBlocks.BROWN_WOOL_SLAB));
        addDrop(ModBlocks.MOSS_SLAB, slabDrops(ModBlocks.MOSS_SLAB));
        addDrop(ModBlocks.GRASS_SLAB, slabDrops(ModBlocks.GRASS_SLAB));
        addDrop(ModBlocks.GOLD_SLAB, slabDrops(ModBlocks.GOLD_SLAB));
        addDrop(ModBlocks.IRON_SLAB, slabDrops(ModBlocks.IRON_SLAB));

        //   addDrop(ModBlocks.ANCIENT_BUTTON);
        addDrop(ModBlocks.ANCIENT_STAIRS);
        addDrop(ModBlocks.ANCIENT_FENCE);
        //  addDrop(ModBlocks.ANCIENT_FENCE_GATE);
        //  addDrop(ModBlocks.ANCIENT_PRESSUREPLATE);
        //  addDrop(ModBlocks.ANCIENT_TRAPDOOR);
        addDrop(ModBlocks.ANCIENT_WOOD_WALL);
        addDrop(ModBlocks.ANCIENT_WOOD_WALL_S);
        addDrop(ModBlocks.ANCIENT_PLANKS);
        // addDrop(ModBlocks.ANCIENT_SAPLING);
        addDrop(ModBlocks.ANCIENT_LOG);
        addDrop(ModBlocks.ANCIENT_WOOD);
        addDrop(ModBlocks.STRIPPED_ANCIENT_LOG);
        addDrop(ModBlocks.STRIPPED_ANCIENT_WOOD);
        //  addDrop(ModBlocks.ANCIENT_DOOR, doorDrops(ModBlocks.ANCIENT_DOOR));
        addDrop(ModBlocks.ANCIENT_WOOD_SLAB, slabDrops(ModBlocks.ANCIENT_WOOD_SLAB));
        // addDrop(ModBlocks.ANCIENT_LEAVES,leavesDrops(ModBlocks.ANCIENT_LEAVES, ModBlocks.ANCIENT_SAPLING, 0.025f));
        addDrop(ModBlocks.ANCIENT_SLAB, slabDrops(ModBlocks.ANCIENT_SLAB));
        addDrop(ModBlocks.ANCIENT_WOOD_SLAB_S, slabDrops(ModBlocks.ANCIENT_WOOD_SLAB_S));

        //  addDrop(ModBlocks.OLD_BUTTON);
        addDrop(ModBlocks.OLD_STAIRS);
        addDrop(ModBlocks.OLD_FENCE);
        //  addDrop(ModBlocks.OLD_FENCE_GATE);
        //  addDrop(ModBlocks.OLD_PRESSUREPLATE);
        //  addDrop(ModBlocks.OLD_TRAPDOOR);
        addDrop(ModBlocks.OLD_WOOD_WALL);
        addDrop(ModBlocks.OLD_WOOD_WALL_S);
        addDrop(ModBlocks.OLD_PLANKS);
        //  addDrop(ModBlocks.OLD_SAPLING);
        addDrop(ModBlocks.OLD_LOG);
        addDrop(ModBlocks.OLD_WOOD);
        addDrop(ModBlocks.STRIPPED_OLD_LOG);
        addDrop(ModBlocks.STRIPPED_OLD_WOOD);
        // addDrop(ModBlocks.OLD_DOOR, doorDrops(ModBlocks.OLD_DOOR));
        addDrop(ModBlocks.OLD_WOOD_SLAB, slabDrops(ModBlocks.OLD_WOOD_SLAB));
        //  addDrop(ModBlocks.OLD_LEAVES,leavesDrops(ModBlocks.OLD_LEAVES, ModBlocks.OLD_SAPLING, 0.0025f));
        addDrop(ModBlocks.OLD_SLAB, slabDrops(ModBlocks.OLD_SLAB));
        addDrop(ModBlocks.OLD_WOOD_SLAB_S, slabDrops(ModBlocks.OLD_WOOD_SLAB_S));

        //   addDrop(ModBlocks.FANCY_PRESSUREPLATE);
        //   addDrop(ModBlocks.GLASS_TRAPDOOR);
        //   addDrop(ModBlocks.STONE_TRAPDOOR);
        //  addDrop(ModBlocks.COBBLESTONE_TRAPDOOR);
        //  addDrop(ModBlocks.FANCY_BUTTON);
        addDrop(ModBlocks.FANCY_FENCE);
        //  addDrop(ModBlocks.FANCY_FENCE_GATE);
        addDrop(ModBlocks.FANCY_PLANK);
        addDrop(ModBlocks.FANCY_WALL);
        addDrop(ModBlocks.FANCY_STAIRS);
        addDrop(ModBlocks.FANCY_SLAB, slabDrops(ModBlocks.FANCY_SLAB));

        //   addDrop(ModBlocks.SPIRAL_BUTTON);
        addDrop(ModBlocks.SPIRAL_STAIRS);
        addDrop(ModBlocks.TUFF_WALL);
        addDrop(ModBlocks.SPIRAL_FENCE);
        //  addDrop(ModBlocks.SPIRAL_FENCE_GATE);
        //  addDrop(ModBlocks.SPIRAL_PRESSUREPLATE);
        //  addDrop(ModBlocks.SPIRAL_TRAPDOOR);
        addDrop(ModBlocks.SPIRAL_PLANKS);
        addDrop(ModBlocks.SPIRAL_WOOD_WALL);
        addDrop(ModBlocks.SPIRAL_WOOD_WALL_S);
        // addDrop(ModBlocks.SPIRAL_SAPLING);
        addDrop(ModBlocks.SPIRAL_LOG);
        addDrop(ModBlocks.SPIRAL_WOOD);
        addDrop(ModBlocks.STRIPPED_SPIRAL_LOG);
        addDrop(ModBlocks.STRIPPED_SPIRAL_WOOD);
        // addDrop(ModBlocks.SPIRAL_DOOR, doorDrops(ModBlocks.SPIRAL_DOOR));
        addDrop(ModBlocks.SPIRAL_WOOD_SLAB, slabDrops(ModBlocks.SPIRAL_WOOD_SLAB));
        //  addDrop(ModBlocks.SPIRAL_LEAVES,leavesDrops(ModBlocks.SPIRAL_LEAVES, ModBlocks.SPIRAL_SAPLING, 0.0025f));
        addDrop(ModBlocks.SPIRAL_SLAB, slabDrops(ModBlocks.SPIRAL_SLAB));
        addDrop(ModBlocks.SPIRAL_WOOD_SLAB_S, slabDrops(ModBlocks.SPIRAL_WOOD_SLAB_S));

        //  addDrop(ModBlocks.DARK_SPIRAL_BUTTON);
        addDrop(ModBlocks.DARK_SPIRAL_STAIRS);
        addDrop(ModBlocks.DARK_SPIRAL_FENCE);
        //  addDrop(ModBlocks.DARK_SPIRAL_FENCE_GATE);
        //  addDrop(ModBlocks.DARK_SPIRAL_PRESSUREPLATE);
        //  addDrop(ModBlocks.DARK_SPIRAL_TRAPDOOR);
        addDrop(ModBlocks.DARK_SPIRAL_PLANKS);
        //   addDrop(ModBlocks.DARK_SPIRAL_SAPLING);
        addDrop(ModBlocks.DARK_SPIRAL_LOG);
        addDrop(ModBlocks.DARK_SPIRAL_WOOD_WALL);
        addDrop(ModBlocks.DARK_SPIRAL_WOOD_WALL_S);
        addDrop(ModBlocks.DARK_SPIRAL_LOG);
        addDrop(ModBlocks.DARK_SPIRAL_WOOD);
        addDrop(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD);
        addDrop(ModBlocks.STRIPPED_DARK_SPIRAL_LOG);
        // addDrop(ModBlocks.DARK_SPIRAL_LEAVES,leavesDrops(ModBlocks.DARK_SPIRAL_LEAVES, ModBlocks.DARK_SPIRAL_SAPLING, 0.0025f));
        addDrop(ModBlocks.STRIPPED_SPIRAL_WOOD);
        //  addDrop(ModBlocks.DARK_SPIRAL_DOOR, doorDrops(ModBlocks.DARK_SPIRAL_DOOR));
        addDrop(ModBlocks.DARK_SPIRAL_WOOD_SLAB, slabDrops(ModBlocks.DARK_SPIRAL_WOOD_SLAB));
        addDrop(ModBlocks.DARK_SPIRAL_SLAB, slabDrops(ModBlocks.DARK_SPIRAL_SLAB));
        addDrop(ModBlocks.DARK_SPIRAL_WOOD_SLAB_S, slabDrops(ModBlocks.DARK_SPIRAL_WOOD_SLAB_S));

        addDrop(ModBlocks.WEATHERED_PLANKS);
        addDrop(ModBlocks.WEATHERED_WOOD);
        addDrop(ModBlocks.STRIPPED_WEATHERED_LOG);
        addDrop(ModBlocks.STRIPPED_WEATHERED_WOOD);
        addDrop(ModBlocks.WEATHERED_PLANK_STAIRS);
        //  addDrop(ModBlocks.WEATHERED_LEAVES,leavesDrops(ModBlocks.WEATHERED_LEAVES, ModBlocks.WEATHERED_SAPLING, 0.0025f));
        // addDrop(ModBlocks.WEATHERED_SAPLING);
        addDrop(ModBlocks.WEATHERED_PLANK_SLABS, slabDrops(ModBlocks.WEATHERED_PLANK_SLABS));

        addDrop(ModBlocks.STRAWBER_BUSH);
        addDrop(ModBlocks.BLUEBER_BUSH);
        addDrop(ModBlocks.OLD_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_OLD_ROSE);
        addDrop(ModBlocks.TINY_LILLY);
        addDrop(ModBlocks.ASTROPHYLLIA);
        addPottedPlantDrops(ModBlocks.POTTED_TINY_LILLY);
        addPottedPlantDrops(ModBlocks.POTTED_ASTROPHYLLIA);

        BlockStatePropertyLootCondition.Builder builder1 = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create().exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(ModBlocks.TOMATO_CROP, this.cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATOSEEDS, ModItems.TOMATO, builder1));

        BlockStatePropertyLootCondition.Builder builder8 = BlockStatePropertyLootCondition.builder(ModBlocks.COFFEE_CROP).properties(StatePredicate.Builder.create().exactMatch(CoffeeCropBlock.AGE, 5));
        addDrop(ModBlocks.COFFEE_CROP, this.cropDrops(ModBlocks.COFFEE_CROP, ModItems.COFFEEBEAN, ModItems.COFFEEBEAN, builder8));

        BlockStatePropertyLootCondition.Builder builder4 = BlockStatePropertyLootCondition.builder(ModBlocks.CUCUMBER_CROP).properties(StatePredicate.Builder.create().exactMatch(CucumberCropBlock.AGE, 5));
        addDrop(ModBlocks.CUCUMBER_CROP, this.cropDrops(ModBlocks.CUCUMBER_CROP, ModItems.CUCUMBERSEEDS, ModItems.CUCUMBER, builder4));

        BlockStatePropertyLootCondition.Builder builder11 = BlockStatePropertyLootCondition.builder(ModBlocks.LETTUCE_CROP).properties(StatePredicate.Builder.create().exactMatch(LettuceCropBlock.AGE, 7));
        addDrop(ModBlocks.LETTUCE_CROP, this.cropDrops(ModBlocks.LETTUCE_CROP, ModItems.LETTUCESEEDS, ModItems.LETTUCE, builder11));

        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.ONION_CROP).properties(StatePredicate.Builder.create().exactMatch(OnionCropBlock.AGE, 5));
        addDrop(ModBlocks.ONION_CROP, this.cropDrops(ModBlocks.ONION_CROP, ModItems.ONION, ModItems.ONION,builder3));

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.GRAPE_CROP).properties(StatePredicate.Builder.create().exactMatch(GrapeCropBlock.AGE, 7));
        addDrop(ModBlocks.GRAPE_CROP, this.cropDrops(ModBlocks.GRAPE_CROP, ModItems.GRAPESEEDS, ModItems.GRAPES,builder2));

        BlockStatePropertyLootCondition.Builder builder14 = BlockStatePropertyLootCondition.builder(ModBlocks.HOP_CROP).properties(StatePredicate.Builder.create().exactMatch(HopsCropBlock.AGE, 4));
        addDrop(ModBlocks.HOP_CROP, this.cropDrops(ModBlocks.HOP_CROP, ModItems.HOPSEEDS, ModItems.HOPS,builder14));

        BlockStatePropertyLootCondition.Builder builder5 = BlockStatePropertyLootCondition.builder(ModBlocks.CHILLI_CROP).properties(StatePredicate.Builder.create().exactMatch(ChilliCropBlock.AGE, 7));
        addDrop(ModBlocks.CHILLI_CROP, this.cropDrops(ModBlocks.CHILLI_CROP, ModItems.CHILLISEEDS, ModItems.CHILLI,builder5));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.PARSLEY_CROP).properties(StatePredicate.Builder.create().exactMatch(ParsleyCropBlock.AGE, 3));
        addDrop(ModBlocks.PARSLEY_CROP, this.cropDrops(ModBlocks.PARSLEY_CROP, ModItems.PARSLEYSEEDS, ModItems.PARSLEY,builder));

        BlockStatePropertyLootCondition.Builder builder6 = BlockStatePropertyLootCondition.builder(ModBlocks.BELLPEPPER_CROP).properties(StatePredicate.Builder.create().exactMatch(BellCropBlock.AGE, 5));
        addDrop(ModBlocks.BELLPEPPER_CROP, this.cropDrops(ModBlocks.BELLPEPPER_CROP, ModItems.BELLPEPPERSEEDS, ModItems.BELLPEPPER,builder6));

        BlockStatePropertyLootCondition.Builder builder7 = BlockStatePropertyLootCondition.builder(ModBlocks.GARLIC_CROP).properties(StatePredicate.Builder.create().exactMatch(GarlicCropBlock.AGE, 3));
        addDrop(ModBlocks.GARLIC_CROP, this.cropDrops(ModBlocks.GARLIC_CROP, ModItems.GARLIC, ModItems.GARLIC,builder7));

        BlockStatePropertyLootCondition.Builder builder9 = BlockStatePropertyLootCondition.builder(ModBlocks.RICE_CROP).properties(StatePredicate.Builder.create().exactMatch(RiceCropBlock.AGE, 7));
        addDrop(ModBlocks.RICE_CROP, this.cropDrops(ModBlocks.RICE_CROP, ModItems.RICE, ModItems.RICE,builder9));

        BlockStatePropertyLootCondition.Builder builder10 = BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create().exactMatch(CornCropBlock.AGE, 7));
        addDrop(ModBlocks.CORN_CROP, this.cropDrops(ModBlocks.CORN_CROP, ModItems.CORNSEEDS, ModItems.CORN,builder10));

        BlockStatePropertyLootCondition.Builder builder12 = BlockStatePropertyLootCondition.builder(ModBlocks.RUHBARB_CROP).properties(StatePredicate.Builder.create().exactMatch(RuhbarbCropBlock.AGE, 7));
        addDrop(ModBlocks.RUHBARB_CROP, this.cropDrops(ModBlocks.RUHBARB_CROP, ModItems.RUHBARBSEEDS, ModItems.RHUBARB,builder12));

        BlockStatePropertyLootCondition.Builder builder13 = BlockStatePropertyLootCondition.builder(ModBlocks.ANCIENT_CROP).properties(StatePredicate.Builder.create().exactMatch(AncientCropBlock.AGE, 7));
        addDrop(ModBlocks.ANCIENT_CROP, this.cropDrops(ModBlocks.ANCIENT_CROP, ModItems.ANCIENTFRUIT, Items.AIR,builder13));
    }
}
