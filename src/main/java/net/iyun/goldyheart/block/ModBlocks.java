package net.iyun.goldyheart.block;

import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Blocks that will render but not obtainable in the Creative Inv

public static final Block ANCIENT_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "ancient_crop"),
        new AncientCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block HOP_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "hops_crop"),
        new HopsCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block STRAWBER_BUSH = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "strawber_bush"),
        new StrawberBushBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

public static final Block BLUEBER_BUSH = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "blueber_bush"),
        new BlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)));

public static final Block RUHBARB_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "rhubarb_crop"),
        new RuhbarbCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "tomato_crop"),
        new TomatoCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block CHILLI_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "chilli_crop"),
        new ChilliCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block COFFEE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "coffee_crop"),
        new CoffeeCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block CORN_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "corn_crop"),
        new CornCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block CUCUMBER_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "cucumber_crop"),
        new CucumberCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block GRAPE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "grape_crop"),
        new GrapeCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block LETTUCE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "lettuce_crop"),
        new LettuceCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block PARSLEY_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "parsley_crop"),
        new ParsleyCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block ONION_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "onion_crop"),
        new OnionCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block RICE_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "rice_crop"),
        new RiceCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block GARLIC_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "garlic_crop"),
        new GarlicCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));

public static final Block BELLPEPPER_CROP = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "bellpepper_crop"),
        new BellCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT).noCollision().sounds(BlockSoundGroup.CROP)));



public static final Block OLD_ROSE = registerBlock("old_rose",
        new FlowerBlock(StatusEffects.HEALTH_BOOST, 10, AbstractBlock.Settings.copy(Blocks.DANDELION).nonOpaque().noCollision()));

public static final Block POTTED_OLD_ROSE = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "potted_old_rose"),
        new FlowerPotBlock(OLD_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION).nonOpaque()));

public static final Block TINY_LILLY = registerBlock("tiny_lilly",
        new FlowerBlock(StatusEffects.HASTE, 10,AbstractBlock.Settings.copy(Blocks.DANDELION).nonOpaque().noCollision()));

public static final Block POTTED_TINY_LILLY = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "potted_tiny_lilly"),
        new FlowerPotBlock(TINY_LILLY, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION).nonOpaque()));

public static final Block ASTROPHYLLIA = registerBlock("astrophyllia",
        new FlowerBlock(StatusEffects.MINING_FATIGUE, 10, AbstractBlock.Settings.copy(Blocks.DANDELION).nonOpaque().noCollision()));

public static final Block POTTED_ASTROPHYLLIA = Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, "potted_astrophyllia"),
        new FlowerPotBlock(ASTROPHYLLIA,AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION).nonOpaque()));


// moved to different project w vertical slabs


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
         Registry.register(Registries.ITEM, Identifier.of(Goldy_Heart.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Goldy_Heart.LOGGER.info("Adding cool blocks from " + Goldy_Heart.MOD_ID);
    }
}
