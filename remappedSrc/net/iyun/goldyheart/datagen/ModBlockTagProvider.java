package net.iyun.goldyheart.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.iyun.goldyheart.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PLANKS)
            .add(ModBlocks.FANCY_PLANK)
            .add(ModBlocks.ANCIENT_PLANKS)
            .add(ModBlocks.OLD_PLANKS)
            .add(ModBlocks.DARK_SPIRAL_PLANKS)
            .add(ModBlocks.SPIRAL_PLANKS)
            .add(ModBlocks.WEATHERED_PLANKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.DEAD_BRAIN_CORAL_SLAB)
           // .add(ModBlocks.STONE_TRAPDOOR)
           // .add(ModBlocks.TUFF_BUTTON)
           // .add(ModBlocks.COBBLESTONE_TRAPDOOR)
           // .add(ModBlocks.GLASS_TRAPDOOR)
            .add(ModBlocks.DEAD_BRAIN_CORAL_SLAB)
            .add(ModBlocks.DEAD_BRAIN_CORAL_STAIRS)
            .add(ModBlocks.DEAD_FIRE_CORAL_SLAB)
            .add(ModBlocks.DEAD_FIRE_CORAL_STAIRS)
            .add(ModBlocks.DEAD_HORN_CORAL_SLAB)
            .add(ModBlocks.DEAD_HORN_CORAL_STAIRS)
            .add(ModBlocks.DEAD_BUBBLE_CORAL_SLAB)
            .add(ModBlocks.DEAD_BUBBLE_CORAL_STAIRS)
            .add(ModBlocks.DEAD_TUBE_CORAL_SLAB)
            .add(ModBlocks.DEAD_TUBE_CORAL_STAIRS)
            .add(ModBlocks.SMOOTH_BASALT_SLAB)
            .add(ModBlocks.SMOOTH_BASALT_STAIRS)
            .add(ModBlocks.GOLD_SLAB)
            .add(ModBlocks.GOLD_STAIRS)
            .add(ModBlocks.CALCITE_SLAB)
            .add(ModBlocks.CALCITE_STAIRS)
            .add(ModBlocks.AMETHYST_SLAB)
            .add(ModBlocks.TUFF_SLAB)
            .add(ModBlocks.TUFF_STAIRS)
            .add(ModBlocks.TUFF_WALL)
            .add(ModBlocks.IRON_SLAB)
            .add(ModBlocks.COPPER_SLAB)
            .add(ModBlocks.IRON_STAIRS)
            .add(ModBlocks.COPPER_STAIRS)
            .add(ModBlocks.EXPOSED_COPPER_SLAB)
            .add(ModBlocks.EXPOSED_COPPER_STAIRS)
            .add(ModBlocks.WEATHERED_COPPER_SLAB)
            .add(ModBlocks.WEATHERED_COPPER_STAIRS)
            .add(ModBlocks.OXIDIZED_COPPER_SLAB)
            .add(ModBlocks.OXIDIZED_COPPER_STAIRS)
            .add(ModBlocks.AMETHYST_STAIRS)
            .add(ModBlocks.PACKED_ICE_SLAB);

    getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
            .add(ModBlocks.ANCIENT_LOG)
            .add(ModBlocks.SPIRAL_LOG)
            .add(ModBlocks.SPIRAL_WOOD)
            .add(ModBlocks.STRIPPED_SPIRAL_LOG)
            .add(ModBlocks.DARK_SPIRAL_LOG)
            .add(ModBlocks.DARK_SPIRAL_WOOD)
            .add(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD)
            .add(ModBlocks.STRIPPED_DARK_SPIRAL_LOG)
            .add(ModBlocks.OLD_LOG)
            .add(ModBlocks.OLD_WOOD)
            .add(ModBlocks.STRIPPED_OLD_WOOD)
            .add(ModBlocks.STRIPPED_OLD_LOG)
            .add(ModBlocks.STRIPPED_ANCIENT_WOOD)
            .add(ModBlocks.ANCIENT_WOOD)
            .add(ModBlocks.WEATHERED_WOOD)
            .add(ModBlocks.STRIPPED_WEATHERED_LOG)
            .add(ModBlocks.STRIPPED_WEATHERED_LOG)
            .add(ModBlocks.WEATHERED_LOG);

    getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .add(ModBlocks.DIRT_SLAB)
            .add(ModBlocks.GRASS_SLAB)
            .add(ModBlocks.ROOTED_DIRT_SLAB)
            .add(ModBlocks.SAND_SLAB)
            .add(ModBlocks.SAND_STAIR)
            .add(ModBlocks.RED_SAND_SLAB)
            .add(ModBlocks.RED_SAND_STAIR)
            .add(ModBlocks.SOUL_SAND_SLAB)
            .add(ModBlocks.SOUL_SOIL_SLAB)
            .add(ModBlocks.GRAVEL_SLAB);

    getOrCreateTagBuilder(BlockTags.WOOL)
            .add(ModBlocks.WHITE_WOOL_SLAB)
            .add(ModBlocks.BLUE_WOOL_SLAB)
            .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)
            .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
            .add(ModBlocks.GRAY_WOOL_SLAB)
            .add(ModBlocks.GREEN_WOOL_SLAB)
            .add(ModBlocks.LIME_WOOL_SLAB)
            .add(ModBlocks.PURPLE_WOOL_SLAB)
            .add(ModBlocks.YELLOW_WOOL_SLAB)
            .add(ModBlocks.PINK_WOOL_SLAB)
            .add(ModBlocks.RED_WOOL_SLAB)
            .add(ModBlocks.MAGENTA_WOOL_SLAB)
            .add(ModBlocks.BROWN_WOOL_SLAB)
            .add(ModBlocks.ORANGE_WOOL_SLAB)
            .add(ModBlocks.CYAN_WOOL_SLAB)
            .add(ModBlocks.BLACK_WOOL_SLAB);

    getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
            .add(ModBlocks.OAK_WOOD_SLAB)
            .add(ModBlocks.OAK_WOOD_SLAB_S)
            .add(ModBlocks.BIRCH_WOOD_SLAB)
            .add(ModBlocks.ACA_WOOD_SLAB_S)
            .add(ModBlocks.ACA_WOOD_SLAB)
            .add(ModBlocks.DARK_OAK_WOOD_SLAB_S)
            .add(ModBlocks.DARK_OAK_WOOD_SLAB)
            .add(ModBlocks.JUNGLE_WOOD_SLAB)
            .add(ModBlocks.MANGROVE_WOOD_SLAB_S)
            .add(ModBlocks.MANGROVE_WOOD_SLAB)
            .add(ModBlocks.CHERRY_WOOD_SLAB)
            .add(ModBlocks.CHERRY_WOOD_SLAB_S)
            .add(ModBlocks.JUNGLE_WOOD_SLAB_S)
            .add(ModBlocks.DARK_OAK_WOOD_SLAB)
            .add(ModBlocks.ACA_WOOD_SLAB)
            .add(ModBlocks.BIRCH_WOOD_SLAB)
            .add(ModBlocks.BIRCH_WOOD_SLAB_S)
            .add(ModBlocks.STRIPPED_ANCIENT_LOG)
            .add(ModBlocks.STRIPPED_ANCIENT_WOOD)
            .add(ModBlocks.ANCIENT_PLANKS)
          //  .add(ModBlocks.ANCIENT_TRAPDOOR)
         //   .add(ModBlocks.ANCIENT_DOOR)
            .add(ModBlocks.ANCIENT_STAIRS)
            .add(ModBlocks.ANCIENT_SLAB)
            //   .add(ModBlocks.ANCIENT_FENCE_GATE)
            .add(ModBlocks.ANCIENT_FENCE)
            //   .add(ModBlocks.ANCIENT_BUTTON)
            //   .add(ModBlocks.ANCIENT_PRESSUREPLATE)
            .add(ModBlocks.ANCIENT_WOOD_WALL)
            .add(ModBlocks.ANCIENT_WOOD_WALL_S)
            .add(ModBlocks.ANCIENT_WOOD_SLAB)
            .add(ModBlocks.ANCIENT_WOOD_SLAB_S)
            .add(ModBlocks.SPRUCE_WOOD_SLAB_S)
            .add(ModBlocks.SPRUCE_WOOD_SLAB)
            .add(ModBlocks.ANCIENT_WOOD_SLAB_S);

    getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
            .add(ModBlocks.SPIRAL_LEAVES)
            .add(ModBlocks.DARK_SPIRAL_LEAVES)
            .add(ModBlocks.ANCIENT_LEAVES)
            .add(ModBlocks.OLD_LEAVES)
            .add(ModBlocks.WEATHERED_LEAVES)
            .add(ModBlocks.MOSS_SLAB);

    getOrCreateTagBuilder(BlockTags.FENCES)
            .add(ModBlocks.DARK_SPIRAL_FENCE)
            .add(ModBlocks.FANCY_FENCE)
            .add(ModBlocks.OLD_FENCE)
            .add(ModBlocks.SPIRAL_FENCE)
            .add(ModBlocks.ANCIENT_FENCE);

    getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
            .add(ModBlocks.DARK_SPIRAL_FENCE)
            .add(ModBlocks.OLD_FENCE)
            .add(ModBlocks.FANCY_FENCE)
            .add(ModBlocks.SPIRAL_FENCE)
            .add(ModBlocks.ANCIENT_FENCE);

    getOrCreateTagBuilder(BlockTags.FENCE_GATES);
            //  .add(ModBlocks.ANCIENT_FENCE_GATE)
            //    .add(ModBlocks.OLD_FENCE_GATE)
            //    .add(ModBlocks.FANCY_FENCE_GATE)
            //    .add(ModBlocks.SPIRAL_FENCE_GATE)
        //   .add(ModBlocks.DARK_SPIRAL_FENCE_GATE);

    getOrCreateTagBuilder(BlockTags.LEAVES)
            .add(ModBlocks.SPIRAL_LEAVES)
            .add(ModBlocks.ANCIENT_LEAVES)
            .add(ModBlocks.WEATHERED_LEAVES)
            .add(ModBlocks.OLD_LEAVES)
            .add(ModBlocks.DARK_SPIRAL_LEAVES);

    getOrCreateTagBuilder(BlockTags.WOODEN_DOORS);
            //  .add(ModBlocks.OLD_DOOR)
            //  .add(ModBlocks.SPIRAL_DOOR)
            //  .add(ModBlocks.DARK_SPIRAL_DOOR)
        //  .add(ModBlocks.ANCIENT_DOOR);

    getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS);
            //   .add(ModBlocks.ANCIENT_TRAPDOOR)
            //   .add(ModBlocks.SPIRAL_TRAPDOOR)
            //   .add(ModBlocks.DARK_SPIRAL_TRAPDOOR)
        //  .add(ModBlocks.OLD_TRAPDOOR);

    getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES);
            //     .add(ModBlocks.OLD_PRESSUREPLATE)
            //    .add(ModBlocks.SPIRAL_PRESSUREPLATE)
            //    .add(ModBlocks.DARK_SPIRAL_PRESSUREPLATE)
            //    .add(ModBlocks.FANCY_PRESSUREPLATE)
        //  .add(ModBlocks.ANCIENT_PRESSUREPLATE);

    getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS);
            //   .add(ModBlocks.OLD_BUTTON)
            //   .add(ModBlocks.SPIRAL_BUTTON)
            //  .add(ModBlocks.DARK_SPIRAL_BUTTON)
            //  .add(ModBlocks.FANCY_BUTTON)
        //  .add(ModBlocks.ANCIENT_BUTTON);

    getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
            .add(ModBlocks.OLD_STAIRS)
            .add(ModBlocks.DARK_SPIRAL_STAIRS)
            .add(ModBlocks.SPIRAL_STAIRS)
            .add(ModBlocks.FANCY_STAIRS)
            .add(ModBlocks.WEATHERED_PLANK_STAIRS)
            .add(ModBlocks.ANCIENT_STAIRS);

    getOrCreateTagBuilder(BlockTags.WALLS)
            .add(ModBlocks.ANCIENT_WOOD_WALL)
            .add(ModBlocks.OLD_WOOD_WALL)
            .add(ModBlocks.OLD_WOOD_WALL_S)
            .add(ModBlocks.SPIRAL_WOOD_WALL_S)
            .add(ModBlocks.SPIRAL_WOOD_WALL)
            .add(ModBlocks.FANCY_WALL)
            .add(ModBlocks.DARK_SPIRAL_WOOD_WALL)
            .add(ModBlocks.DARK_SPIRAL_WOOD_WALL_S)
            .add(ModBlocks.ANCIENT_WOOD_WALL_S)
            .add(ModBlocks.TUFF_WALL)
            .add(ModBlocks.ANCIENT_WOOD_WALL);

    getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(ModBlocks.ANCIENT_WOOD)
            .add(ModBlocks.WEATHERED_LOG)
            .add(ModBlocks.STRIPPED_WEATHERED_LOG)
            .add(ModBlocks.STRIPPED_WEATHERED_WOOD)
            .add(ModBlocks.WEATHERED_PLANKS)
            .add(ModBlocks.WEATHERED_PLANK_SLABS)
            .add(ModBlocks.WEATHERED_PLANK_STAIRS)
            .add(ModBlocks.WEATHERED_WOOD)
            .add(ModBlocks.ANCIENT_LOG)
            .add(ModBlocks.OAK_WOOD_SLAB)
            .add(ModBlocks.OAK_WOOD_SLAB_S)
            .add(ModBlocks.BIRCH_WOOD_SLAB)
            .add(ModBlocks.ACA_WOOD_SLAB_S)
            .add(ModBlocks.ACA_WOOD_SLAB)
            .add(ModBlocks.DARK_OAK_WOOD_SLAB_S)
            .add(ModBlocks.DARK_OAK_WOOD_SLAB)
            .add(ModBlocks.JUNGLE_WOOD_SLAB)
            .add(ModBlocks.MANGROVE_WOOD_SLAB_S)
            .add(ModBlocks.MANGROVE_WOOD_SLAB)
            .add(ModBlocks.CHERRY_WOOD_SLAB)
            .add(ModBlocks.CHERRY_WOOD_SLAB_S)
            .add(ModBlocks.JUNGLE_WOOD_SLAB_S)
            .add(ModBlocks.DARK_OAK_WOOD_SLAB)
            .add(ModBlocks.ACA_WOOD_SLAB)
            .add(ModBlocks.BIRCH_WOOD_SLAB)
            .add(ModBlocks.BIRCH_WOOD_SLAB_S)
            .add(ModBlocks.STRIPPED_ANCIENT_LOG)
            .add(ModBlocks.STRIPPED_ANCIENT_WOOD)
            .add(ModBlocks.ANCIENT_PLANKS)
            // .add(ModBlocks.ANCIENT_TRAPDOOR)
            //   .add(ModBlocks.ANCIENT_DOOR)
            .add(ModBlocks.ANCIENT_STAIRS)
            .add(ModBlocks.ANCIENT_SLAB)
            //  .add(ModBlocks.ANCIENT_FENCE_GATE)
            .add(ModBlocks.ANCIENT_FENCE)
            //  .add(ModBlocks.ANCIENT_BUTTON)
            //  .add(ModBlocks.ANCIENT_PRESSUREPLATE)
            .add(ModBlocks.ANCIENT_WOOD_WALL)
            .add(ModBlocks.ANCIENT_WOOD_WALL_S)
            .add(ModBlocks.ANCIENT_WOOD_SLAB)
            .add(ModBlocks.ANCIENT_WOOD_SLAB_S)
            .add(ModBlocks.SPRUCE_WOOD_SLAB_S)
            .add(ModBlocks.SPRUCE_WOOD_SLAB)
            .add(ModBlocks.ANCIENT_WOOD_SLAB_S)
            .add(ModBlocks.OLD_WOOD)
            .add(ModBlocks.STRIPPED_OLD_WOOD)
            .add(ModBlocks.STRIPPED_OLD_LOG)
            .add(ModBlocks.OLD_LOG)
            //   .add(ModBlocks.OLD_DOOR)
            //  .add(ModBlocks.OLD_TRAPDOOR)
            .add(ModBlocks.OLD_PLANKS)
            .add(ModBlocks.OLD_STAIRS)
            .add(ModBlocks.OLD_SLAB)
            // .add(ModBlocks.OLD_FENCE_GATE)
            .add(ModBlocks.OLD_FENCE)
            // .add(ModBlocks.OLD_BUTTON)
            //  .add(ModBlocks.OLD_PRESSUREPLATE)
            .add(ModBlocks.OLD_WOOD_WALL)
            .add(ModBlocks.OLD_WOOD_WALL_S)
            .add(ModBlocks.OLD_WOOD_SLAB)
            .add(ModBlocks.OLD_WOOD_SLAB_S)
            .add(ModBlocks.SPIRAL_WOOD)
            .add(ModBlocks.STRIPPED_SPIRAL_WOOD)
            .add(ModBlocks.STRIPPED_SPIRAL_LOG)
            .add(ModBlocks.SPIRAL_LOG)
            .add(ModBlocks.SPIRAL_PLANKS)
            .add(ModBlocks.SPIRAL_STAIRS)
            .add(ModBlocks.SPIRAL_SLAB)
            //    .add(ModBlocks.SPIRAL_FENCE_GATE)
            .add(ModBlocks.SPIRAL_FENCE)
            //   .add(ModBlocks.SPIRAL_DOOR)
            //    .add(ModBlocks.SPIRAL_TRAPDOOR)
            //     .add(ModBlocks.SPIRAL_BUTTON)
            //    .add(ModBlocks.SPIRAL_PRESSUREPLATE)
            .add(ModBlocks.SPIRAL_WOOD_WALL)
            .add(ModBlocks.SPIRAL_WOOD_WALL_S)
            .add(ModBlocks.SPIRAL_WOOD_SLAB)
            .add(ModBlocks.SPIRAL_WOOD_SLAB_S)
            .add(ModBlocks.DARK_SPIRAL_WOOD)
            .add(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD)
            .add(ModBlocks.STRIPPED_DARK_SPIRAL_LOG)
            .add(ModBlocks.DARK_SPIRAL_LOG)
            .add(ModBlocks.DARK_SPIRAL_PLANKS)
            .add(ModBlocks.DARK_SPIRAL_STAIRS)
            .add(ModBlocks.DARK_SPIRAL_SLAB)
            //  .add(ModBlocks.DARK_SPIRAL_FENCE_GATE)
            .add(ModBlocks.DARK_SPIRAL_FENCE)
            //   .add(ModBlocks.DARK_SPIRAL_BUTTON)
            //   .add(ModBlocks.DARK_SPIRAL_PRESSUREPLATE)
            .add(ModBlocks.DARK_SPIRAL_WOOD_WALL)
            //  .add(ModBlocks.DARK_SPIRAL_DOOR)
            .add(ModBlocks.DARK_SPIRAL_WOOD_WALL_S)
            .add(ModBlocks.DARK_SPIRAL_WOOD_SLAB)
            .add(ModBlocks.DARK_SPIRAL_WOOD_SLAB_S)
            .add(ModBlocks.FANCY_FENCE)
            //   .add(ModBlocks.FANCY_FENCE_GATE)
            //    .add(ModBlocks.FANCY_PRESSUREPLATE)
            //     .add(ModBlocks.FANCY_BUTTON)
            .add(ModBlocks.FANCY_SLAB)
            .add(ModBlocks.FANCY_STAIRS)
            .add(ModBlocks.FANCY_WALL)
            .add(ModBlocks.FANCY_PLANK);




   // getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
     //       .add(ModBlocks.FUNKYBLOCK);

    //getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
      //      .add(ModBlocks.FUNKYBLOCK);

    //getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "need_tool_level_4")))
      //      .add(ModBlocks.FUNKYBLOCK);


    }

}
