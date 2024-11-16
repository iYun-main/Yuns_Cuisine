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
        itemModelGenerator.register(ModItems.BLUEBERSMOOTHIE, Models.GENERATED);
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
