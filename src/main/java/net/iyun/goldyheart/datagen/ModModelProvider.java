package net.iyun.goldyheart.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.iyun.goldyheart.block.ModBlocks;
import net.iyun.goldyheart.block.custom.*;
import net.iyun.goldyheart.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool dirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIRT);
        BlockStateModelGenerator.BlockTexturePool obsidianPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OBSIDIAN);
        BlockStateModelGenerator.BlockTexturePool gravelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAVEL);
        BlockStateModelGenerator.BlockTexturePool icePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PACKED_ICE);
        BlockStateModelGenerator.BlockTexturePool smoothbasaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
        BlockStateModelGenerator.BlockTexturePool sandPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SAND);
        BlockStateModelGenerator.BlockTexturePool redsandPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_SAND);
        BlockStateModelGenerator.BlockTexturePool whitewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
        BlockStateModelGenerator.BlockTexturePool bluewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool cyanwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL);
        BlockStateModelGenerator.BlockTexturePool redwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
        BlockStateModelGenerator.BlockTexturePool blackwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL);
        BlockStateModelGenerator.BlockTexturePool yellowwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL);
        BlockStateModelGenerator.BlockTexturePool magnetawoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL);
        BlockStateModelGenerator.BlockTexturePool lightbluewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool greenwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL);
        BlockStateModelGenerator.BlockTexturePool graywoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool pinkwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_WOOL);
        BlockStateModelGenerator.BlockTexturePool orangewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL);
        BlockStateModelGenerator.BlockTexturePool limewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_WOOL);
        BlockStateModelGenerator.BlockTexturePool brownwoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL);
        BlockStateModelGenerator.BlockTexturePool purplewoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL);
        BlockStateModelGenerator.BlockTexturePool lightgraywoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool rootdirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ROOTED_DIRT);
        BlockStateModelGenerator.BlockTexturePool coarsedirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COARSE_DIRT);
        BlockStateModelGenerator.BlockTexturePool weatheredPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_PLANKS);
        BlockStateModelGenerator.BlockTexturePool overgrownPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OVERGROWN_GRASS);
        BlockStateModelGenerator.BlockTexturePool mossPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MOSS_BLOCK);
        BlockStateModelGenerator.BlockTexturePool goldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GOLD_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ironPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.IRON_BLOCK);
        BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        BlockStateModelGenerator.BlockTexturePool tubePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_TUBE_CORAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool brainPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_BRAIN_CORAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool bubblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_BUBBLE_CORAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool firePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_FIRE_CORAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool hornPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEAD_HORN_CORAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool amethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
        BlockStateModelGenerator.BlockTexturePool tuffPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TUFF);
        BlockStateModelGenerator.BlockTexturePool soulPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SOUL_SAND);
        BlockStateModelGenerator.BlockTexturePool soulsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SOUL_SOIL);
        BlockStateModelGenerator.BlockTexturePool copperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COPPER_BLOCK);
        BlockStateModelGenerator.BlockTexturePool copper2Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EXPOSED_COPPER);
        BlockStateModelGenerator.BlockTexturePool copper3Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WEATHERED_COPPER);
        BlockStateModelGenerator.BlockTexturePool copper4Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OXIDIZED_COPPER);
        BlockStateModelGenerator.BlockTexturePool oakwoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OAK_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool oakwoodsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OAK_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool birchwoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIRCH_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool birchwoodsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIRCH_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool darkwoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_OAK_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool darkwoodsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_OAK_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool cherrywoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHERRY_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool cherrywoodsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHERRY_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool junglewoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.JUNGLE_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool junglewoodsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.JUNGLE_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool sprucewoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRUCE_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool sprucewoodsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRUCE_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool acawoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ACA_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool acawoodsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ACA_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool mangrovewoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MANGROVE_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool mangrovewoodsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MANGROVE_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool ancientPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool ancientwoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool ancientwoodsPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool fancyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FANCY_PLANK);
        BlockStateModelGenerator.BlockTexturePool darkspiPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_SPIRAL_PLANKS);
        BlockStateModelGenerator.BlockTexturePool darkspisPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_SPIRAL_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool darkspiasPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_SPIRAL_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool spiamPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPIRAL_PLANKS);
        BlockStateModelGenerator.BlockTexturePool spiaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPIRAL_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool spiasPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPIRAL_WOOD_ALLSIDE_S);
        BlockStateModelGenerator.BlockTexturePool oldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OLD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool oldaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OLD_WOOD_ALLSIDE);
        BlockStateModelGenerator.BlockTexturePool oldasPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OLD_WOOD_ALLSIDE_S);

        oakwoodPool.slab(ModBlocks.OAK_WOOD_SLAB);
        oakwoodsPool.slab(ModBlocks.OAK_WOOD_SLAB_S);
        birchwoodPool.slab(ModBlocks.BIRCH_WOOD_SLAB);
        birchwoodsPool.slab(ModBlocks.BIRCH_WOOD_SLAB_S);
        darkwoodPool.slab(ModBlocks.DARK_OAK_WOOD_SLAB);
        darkwoodsPool.slab(ModBlocks.DARK_OAK_WOOD_SLAB_S);
        cherrywoodPool.slab(ModBlocks.CHERRY_WOOD_SLAB);
        cherrywoodsPool.slab(ModBlocks.CHERRY_WOOD_SLAB_S);
        junglewoodPool.slab(ModBlocks.JUNGLE_WOOD_SLAB);
        junglewoodsPool.slab(ModBlocks.JUNGLE_WOOD_SLAB_S);
        sprucewoodPool.slab(ModBlocks.SPRUCE_WOOD_SLAB);
        sprucewoodsPool.slab(ModBlocks.SPRUCE_WOOD_SLAB_S);
        acawoodPool.slab(ModBlocks.ACA_WOOD_SLAB);
        acawoodsPool.slab(ModBlocks.ACA_WOOD_SLAB_S);
        mangrovewoodPool.slab(ModBlocks.MANGROVE_WOOD_SLAB);
        mangrovewoodsPool.slab(ModBlocks.MANGROVE_WOOD_SLAB_S);

        copper4Pool.stairs(ModBlocks.OXIDIZED_COPPER_STAIRS);
        copper4Pool.slab(ModBlocks.OXIDIZED_COPPER_SLAB);
        copper3Pool.stairs(ModBlocks.WEATHERED_COPPER_STAIRS);
        copper3Pool.slab(ModBlocks.WEATHERED_COPPER_SLAB);
        copper2Pool.stairs(ModBlocks.EXPOSED_COPPER_STAIRS);
        copper2Pool.slab(ModBlocks.EXPOSED_COPPER_SLAB);
        copperPool.stairs(ModBlocks.COPPER_STAIRS);
        copperPool.slab(ModBlocks.COPPER_SLAB);
        ironPool.slab(ModBlocks.IRON_SLAB);
        soulPool.slab(ModBlocks.SOUL_SAND_SLAB);
        soulsPool.slab(ModBlocks.SOUL_SOIL_SLAB);
        ironPool.stairs(ModBlocks.IRON_STAIRS);
        goldPool.slab(ModBlocks.GOLD_SLAB);
        goldPool.stairs(ModBlocks.GOLD_STAIRS);
        calcitePool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitePool.slab(ModBlocks.CALCITE_SLAB);
        amethystPool.slab(ModBlocks.AMETHYST_SLAB);
        amethystPool.stairs(ModBlocks.AMETHYST_STAIRS);

        hornPool.slab(ModBlocks.DEAD_HORN_CORAL_SLAB);
        hornPool.stairs(ModBlocks.DEAD_HORN_CORAL_STAIRS);
        bubblePool.stairs(ModBlocks.DEAD_BUBBLE_CORAL_STAIRS);
        bubblePool.slab(ModBlocks.DEAD_BUBBLE_CORAL_SLAB);
        firePool.slab(ModBlocks.DEAD_FIRE_CORAL_SLAB);
        firePool.stairs(ModBlocks.DEAD_FIRE_CORAL_STAIRS);
        brainPool.stairs(ModBlocks.DEAD_BRAIN_CORAL_STAIRS);
        brainPool.slab(ModBlocks.DEAD_BRAIN_CORAL_SLAB);
        tubePool.slab(ModBlocks.DEAD_TUBE_CORAL_SLAB);
        tubePool.stairs(ModBlocks.DEAD_TUBE_CORAL_STAIRS);
        tuffPool.stairs(ModBlocks.TUFF_STAIRS);
        tuffPool.slab(ModBlocks.TUFF_SLAB);
        tuffPool.wall(ModBlocks.TUFF_WALL);
        tuffPool.button(ModBlocks.TUFF_BUTTON);

        dirtPool.slab(ModBlocks.DIRT_SLAB);
        mossPool.slab(ModBlocks.MOSS_SLAB);

        coarsedirtPool.slab(ModBlocks.COARSE_DIRT_SLAB);
        rootdirtPool.slab(ModBlocks.ROOTED_DIRT_SLAB);
        obsidianPool.slab(ModBlocks.OBSIDIAN_SLAB);
        gravelPool.slab(ModBlocks.GRAVEL_SLAB);
        icePool.slab(ModBlocks.PACKED_ICE_SLAB);

        smoothbasaltPool.slab(ModBlocks.SMOOTH_BASALT_SLAB);
        smoothbasaltPool.stairs(ModBlocks.SMOOTH_BASALT_STAIRS);

        sandPool.slab(ModBlocks.SAND_SLAB);
        redsandPool.slab(ModBlocks.RED_SAND_SLAB);
        sandPool.stairs(ModBlocks.SAND_STAIR);
        redsandPool.stairs(ModBlocks.RED_SAND_STAIR);

        whitewoolPool.slab(ModBlocks.WHITE_WOOL_SLAB);
        bluewoolPool.slab(ModBlocks.BLUE_WOOL_SLAB);
        cyanwoolPool.slab(ModBlocks.CYAN_WOOL_SLAB);
        redwoolPool.slab(ModBlocks.RED_WOOL_SLAB);
        blackwoolPool.slab(ModBlocks.BLACK_WOOL_SLAB);
        yellowwoolPool.slab(ModBlocks.YELLOW_WOOL_SLAB);
        magnetawoolPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);
        lightbluewoolPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
        greenwoolPool.slab(ModBlocks.GREEN_WOOL_SLAB);
        graywoolPool.slab(ModBlocks.GRAY_WOOL_SLAB);
        pinkwoolPool.slab(ModBlocks.PINK_WOOL_SLAB);
        brownwoolPool.slab(ModBlocks.BROWN_WOOL_SLAB);
        orangewoolPool.slab(ModBlocks.ORANGE_WOOL_SLAB);
        limewoolPool.slab(ModBlocks.LIME_WOOL_SLAB);
        purplewoolPool.slab(ModBlocks.PURPLE_WOOL_SLAB);
        lightgraywoolPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);

        overgrownPool.slab(ModBlocks.GRASS_SLAB);

        fancyPool.slab(ModBlocks.FANCY_SLAB);
        fancyPool.button(ModBlocks.FANCY_BUTTON);
        fancyPool.pressurePlate(ModBlocks.FANCY_PRESSUREPLATE);
        fancyPool.wall(ModBlocks.FANCY_WALL);
        fancyPool.fence(ModBlocks.FANCY_FENCE);
        fancyPool.fenceGate(ModBlocks.FANCY_FENCE_GATE);
        fancyPool.stairs(ModBlocks.FANCY_STAIRS);

        weatheredPool.slab(ModBlocks.WEATHERED_PLANK_SLABS);
        weatheredPool.stairs(ModBlocks.WEATHERED_PLANK_STAIRS);

        ancientPool.slab(ModBlocks.ANCIENT_SLAB);
        ancientPool.button(ModBlocks.ANCIENT_BUTTON);
        ancientPool.pressurePlate(ModBlocks.ANCIENT_PRESSUREPLATE);
        ancientPool.fence(ModBlocks.ANCIENT_FENCE);
        ancientPool.fenceGate(ModBlocks.ANCIENT_FENCE_GATE);
        ancientPool.stairs(ModBlocks.ANCIENT_STAIRS);
        ancientwoodPool.wall(ModBlocks.ANCIENT_WOOD_WALL);
        ancientwoodsPool.wall(ModBlocks.ANCIENT_WOOD_WALL_S);
        ancientwoodPool.slab(ModBlocks.ANCIENT_WOOD_SLAB);
        ancientwoodsPool.slab(ModBlocks.ANCIENT_WOOD_SLAB_S);
        blockStateModelGenerator.registerLog(ModBlocks.ANCIENT_LOG).log(ModBlocks.ANCIENT_LOG).wood(ModBlocks.ANCIENT_WOOD);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ANCIENT_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.ANCIENT_DOOR);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ANCIENT_LOG).log(ModBlocks.STRIPPED_ANCIENT_LOG).wood(ModBlocks.STRIPPED_ANCIENT_WOOD);
        blockStateModelGenerator.registerTintableCross(ModBlocks.ANCIENT_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_LEAVES);

        darkspiPool.stairs(ModBlocks.DARK_SPIRAL_STAIRS);
        darkspisPool.slab(ModBlocks.DARK_SPIRAL_WOOD_SLAB);
        darkspiasPool.slab(ModBlocks.DARK_SPIRAL_WOOD_SLAB_S);
        darkspiasPool.wall(ModBlocks.DARK_SPIRAL_WOOD_WALL_S);
        darkspisPool.wall(ModBlocks.DARK_SPIRAL_WOOD_WALL);
        darkspiPool.slab(ModBlocks.DARK_SPIRAL_SLAB);
        darkspiPool.pressurePlate(ModBlocks.DARK_SPIRAL_PRESSUREPLATE);
        darkspiPool.fence(ModBlocks.DARK_SPIRAL_FENCE);
        darkspiPool.fenceGate(ModBlocks.DARK_SPIRAL_FENCE_GATE);
        darkspiPool.button(ModBlocks.DARK_SPIRAL_BUTTON);
        blockStateModelGenerator.registerLog(ModBlocks.DARK_SPIRAL_LOG).log(ModBlocks.DARK_SPIRAL_LOG).wood(ModBlocks.DARK_SPIRAL_WOOD);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.DARK_SPIRAL_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.DARK_SPIRAL_DOOR);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DARK_SPIRAL_LOG).log(ModBlocks.STRIPPED_DARK_SPIRAL_LOG).wood(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD);
           blockStateModelGenerator.registerTintableCross(ModBlocks.DARK_SPIRAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_SPIRAL_LEAVES);

        spiasPool.slab(ModBlocks.SPIRAL_WOOD_SLAB_S);
        spiasPool.wall(ModBlocks.SPIRAL_WOOD_WALL_S);
        spiaPool.wall(ModBlocks.SPIRAL_WOOD_WALL);
        spiaPool.slab(ModBlocks.SPIRAL_WOOD_SLAB);
        spiamPool.slab(ModBlocks.SPIRAL_SLAB);
        spiamPool.fence(ModBlocks.SPIRAL_FENCE);
        spiamPool.fenceGate(ModBlocks.SPIRAL_FENCE_GATE);
        spiamPool.stairs(ModBlocks.SPIRAL_STAIRS);
        spiamPool.pressurePlate(ModBlocks.SPIRAL_PRESSUREPLATE);
        spiamPool.button(ModBlocks.SPIRAL_BUTTON);
        blockStateModelGenerator.registerLog(ModBlocks.SPIRAL_LOG).log(ModBlocks.SPIRAL_LOG).wood(ModBlocks.SPIRAL_WOOD);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SPIRAL_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.SPIRAL_DOOR);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SPIRAL_LOG).log(ModBlocks.STRIPPED_SPIRAL_LOG).wood(ModBlocks.STRIPPED_SPIRAL_WOOD);
           blockStateModelGenerator.registerTintableCross(ModBlocks.SPIRAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPIRAL_LEAVES);

        oldaPool.slab(ModBlocks.OLD_WOOD_SLAB);
        oldaPool.wall(ModBlocks.OLD_WOOD_WALL);
        oldasPool.wall(ModBlocks.OLD_WOOD_WALL_S);
        oldasPool.slab(ModBlocks.OLD_WOOD_SLAB_S);
        oldPool.slab(ModBlocks.OLD_SLAB);
        oldPool.stairs(ModBlocks.OLD_STAIRS);
        oldPool.fence(ModBlocks.OLD_FENCE);
        oldPool.fenceGate(ModBlocks.OLD_FENCE_GATE);
        oldPool.pressurePlate(ModBlocks.OLD_PRESSUREPLATE);
        oldPool.button(ModBlocks.OLD_BUTTON);
        blockStateModelGenerator.registerLog(ModBlocks.OLD_LOG).log(ModBlocks.OLD_LOG).wood(ModBlocks.OLD_WOOD);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.OLD_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.OLD_DOOR);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_OLD_LOG).log(ModBlocks.STRIPPED_OLD_LOG).wood(ModBlocks.STRIPPED_OLD_WOOD);
        blockStateModelGenerator.registerTintableCross(ModBlocks.OLD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OLD_LEAVES);

// The 3 sides thing
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.CUBE_BOTTOM_TOP);

// This does the same thing as simplecubeall apperently however it makes the item not be rendered correctly in the inventory
      //  blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.CUBE_MIRRORED_ALL);

// This acts similar to cube bottom top investigation needed
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);

// This should be used for the carpet call and not for a full block unless you wanna fuck with players
     //   blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.CARPET);

// This is used mostly used for the jukebox
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.CUBE_TOP);

// This is used mostly for coral that is on the floor
      //  blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.CORAL_FAN);

// This is used mostly for the petal flowers from 1-4
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.FLOWERBED_1);
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.FLOWERBED_2);
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.FLOWERBED_3);
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.FLOWERBED_4);

// This is used for the blocks such as furnace and other player facing blocks
         // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.ORIENTABLE_WITH_BOTTOM);

// This is the same as orient with bottom?
        // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.ORIENTABLE);

// Top and Bottom Only no rotate
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE2, TexturedModel.CUBE_COLUMN);

// Use this when using custom pillars
        // blockStateModelGenerator.registerAxisRotated(ModBlocks.TESTSIDE2, TexturedModel.CUBE_COLUMN);

// This is used for particels duh do not use blockstate
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.PARTICLE);

// This is used for the lantern
       // blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.TEMPLATE_LANTERN);

// This is used for the  hanging lantern
      //  blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.TEMPLATE_HANGING_LANTERN);

// This is used for the anvil but wat?? its weird
        //blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.TEMPLATE_ANVIL);

// This is used for the seagrass
      //  blockStateModelGenerator.registerSingleton(ModBlocks.TESTSIDE, TexturedModel.TEMPLATE_SEAGRASS);



        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.OLD_ROSE, ModBlocks.POTTED_OLD_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.TINY_LILLY, ModBlocks.POTTED_TINY_LILLY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ASTROPHYLLIA, ModBlocks.POTTED_ASTROPHYLLIA, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.WEATHERED_LOG).log(ModBlocks.WEATHERED_LOG).wood(ModBlocks.WEATHERED_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WEATHERED_LOG).log(ModBlocks.STRIPPED_WEATHERED_LOG).wood(ModBlocks.STRIPPED_WEATHERED_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEATHERED_LEAVES);
         blockStateModelGenerator.registerTintableCross(ModBlocks.WEATHERED_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.GLASS_TRAPDOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.STONE_TRAPDOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.COBBLESTONE_TRAPDOOR);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.TOMATO_CROP, BlockStateModelGenerator.TintType.NOT_TINTED, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.CORN_CROP, BlockStateModelGenerator.TintType.NOT_TINTED,CornCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.RUHBARB_CROP,BlockStateModelGenerator.TintType.NOT_TINTED, RuhbarbCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.COFFEE_CROP,BlockStateModelGenerator.TintType.NOT_TINTED, CoffeeCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.ONION_CROP, BlockStateModelGenerator.TintType.NOT_TINTED,OnionCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BELLPEPPER_CROP,BlockStateModelGenerator.TintType.NOT_TINTED, BellCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.CUCUMBER_CROP,BlockStateModelGenerator.TintType.NOT_TINTED, CucumberCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.LETTUCE_CROP, BlockStateModelGenerator.TintType.NOT_TINTED,LettuceCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.RICE_CROP, BlockStateModelGenerator.TintType.NOT_TINTED,RiceCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.GRAPE_CROP, GrapeCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerCrop(ModBlocks.HOP_CROP, HopsCropBlock.AGE, 0, 1, 2, 3, 4);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.CHILLI_CROP, BlockStateModelGenerator.TintType.NOT_TINTED, ChilliCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.PARSLEY_CROP,BlockStateModelGenerator.TintType.NOT_TINTED, ParsleyCropBlock.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.GARLIC_CROP, BlockStateModelGenerator.TintType.NOT_TINTED, GarlicCropBlock.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.ANCIENT_CROP,BlockStateModelGenerator.TintType.NOT_TINTED,AncientCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.STRAWBER_BUSH,
                BlockStateModelGenerator.TintType.NOT_TINTED, StrawberBushBlock.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BLUEBER_BUSH,
                BlockStateModelGenerator.TintType.NOT_TINTED, BlueberryBushBlock.AGE, 0, 1, 2, 3);

        }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUCKETOFSALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUTBREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRUFFLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUCKETOFPEPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOLTENSUGAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MARSHMELLOW, Models.GENERATED);
        itemModelGenerator.register(ModItems.MARSHMELLOWSTICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLIGHTLYCOOKEDMARSHMELLOW, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAWBACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPIDEREYESOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITEBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMONDBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALDBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDSTONEBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.COALBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPERBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPISBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRONBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYSTBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MASHEDPOTATOES, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIEDEGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKEDBACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHISKEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANDIEDSPIDEREYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGGONBREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOILEDEGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNTMARSHMELLOWSTICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNTMARSHMELLOW, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKEDMARSHMELLOW, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKEDMARSHMELLOWSTICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHILLI, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENTWINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGMASMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHUBARBCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHUBARBMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHUBARBSMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHUBARBCAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHUBARBWINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTEREDPOTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUTTOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COFFEE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUCUMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPES, Models.GENERATED);
        itemModelGenerator.register(ModItems.LETTUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLEPIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOAST2, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARROTCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBERRYCAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRYCAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERSMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLSTEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.POPCORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTERCORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOILEDSNIFFEGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.SNIFFEROMLETTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLECAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETBERRYCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRYCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBERRYCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHORUSCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOGLINSANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELONSCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWBERRYCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATEPIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMKINWINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENTFRUIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOPS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATOSOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.PANCAKES, Models.GENERATED);
        itemModelGenerator.register(ModItems.CROISSANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKINSOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOODLES, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPAGHETTI, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEAKANDPOTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUMPLING, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRINGROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUFFEDMUSHROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGIRISUSHI, Models.GENERATED);
        itemModelGenerator.register(ModItems.VEGGIEMAKI, Models.GENERATED);
        itemModelGenerator.register(ModItems.VEGGIESANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOTCHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGEMEATROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLESMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARROTSMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKINSMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETBERRYSMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATERMELONSMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOASTWITHBACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOASTWITHBUTTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOASTWITHJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLEJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOASTWITHEGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIEDCHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAWCHICKENLEG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PARSLEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKSMITHPICKSIGLWOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKSMITHAXESIGLWOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKSMITHHOESIGLWOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKSMITHSHOVELSIGLWOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACKSMITHSWORDSIGLWOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIZZA, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIZZASLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAWONIONRING, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIEDONIONRING, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESEPIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUCUMBERSLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BELLPEPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BELLPEPPERSLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GARLICBREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONIONSLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWBERRYSMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERQUARTZBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRILLEDCORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUFFEDBELLPEPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.LETTUCELEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOUGHTNUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHORUSDONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWDONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLEDONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETDONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCODONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZERODNOODLES, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIGBOWL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEETDONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEDONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARROTDONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELONDONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWDONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATERMELONCAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETBERRYCAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWBERRYCAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLECAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARROTCAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHORUSCAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEETROOTCAKESLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEETROOTCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELONJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHORUSJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARROTJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEETJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEETCOOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHORUSCOOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETCOOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWCOOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBERJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWJAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICCRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBERSMOOTHIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICCRYSTAL_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICCRYSTAL_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICCRYSTAL_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICCRYSTAL_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICCRYSTAL_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICCRYSTAL_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGICCRYSTAL_8, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOSTRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLEMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELONMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARROTMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKINMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKELS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKELTOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKELSTRAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKELONION, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKELCORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKELCHILLI, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKELCARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKELBLUE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PICKELBELL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEMUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUECOOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELONWINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEETWINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHORUSWINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWWINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWCOOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEETWINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHUBARB, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELONCOOKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANDBREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_KNIFE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CANDIED_APPLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDIED_BEET, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDIED_BLUEBER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDIED_CARROT, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDIED_GLOWBER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDIED_MELON, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDIED_PUMPKIN, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDIED_STRAWBER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CANDIED_SWEETBER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROCK_CANDY_APPLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROCK_CANDY_BEET, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROCK_CANDY_BLUEBER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROCK_CANDY_CARROT, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROCK_CANDY_GLOWBER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROCK_CANDY_MELON, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROCK_CANDY_PUMPKIN, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROCK_CANDY_STRAWBER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROCK_CANDY_SWEETBER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TAFFY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CANDY_CORN, Models.GENERATED);

    }
}
