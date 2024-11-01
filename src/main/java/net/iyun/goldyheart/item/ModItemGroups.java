package net.iyun.goldyheart.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup AGOLDYFOOD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Goldy_Heart.MOD_ID,"aaaafood"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aaaafood"))
                    .icon(() -> new ItemStack(ModItems.NETHERITEBERRY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.ANCIENTFRUIT);
                    entries.add(ModItems.SALT);
                    entries.add(ModItems.BUCKETOFSALT);
                    entries.add(ModItems.PEPPER);
                    entries.add(ModItems.BUCKETOFPEPPER);
                    entries.add(ModItems.BUTTER);
                    entries.add(ModItems.MOLTENSUGAR);
                    entries.add(ModItems.MARSHMELLOW);
                    entries.add(ModItems.MARSHMELLOWSTICK);
                    entries.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOW);
                    entries.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK);
                    entries.add(ModItems.COOKEDMARSHMELLOW);
                    entries.add(ModItems.COOKEDMARSHMELLOWSTICK);
                    entries.add(ModItems.BURNTMARSHMELLOW);
                    entries.add(ModItems.BURNTMARSHMELLOWSTICK);
                    entries.add(ModItems.COPPERBERRY);
                    entries.add(ModItems.COALBERRY);
                    entries.add(ModItems.GOLDBERRY);
                    entries.add(ModItems.EMERALDBERRY);
                    entries.add(ModItems.IRONBERRY);
                    entries.add(ModItems.LAPISBERRY);
                    entries.add(ModItems.AMETHYSTBERRY);
                    entries.add(ModItems.DIAMONDBERRY);
                    entries.add(ModItems.NETHERITEBERRY);
                    entries.add(ModItems.REDSTONEBERRY);
                    entries.add(ModItems.NETHERQUARTZBERRY);
                    entries.add(ModItems.BOILEDEGG);
                    entries.add(ModItems.FRIEDEGG);
                    entries.add(ModItems.EGGONBREAD);
                    entries.add(ModItems.CUTBREAD);
                    entries.add(ModItems.TRUFFLE);
                    entries.add(ModItems.CANDIEDSPIDEREYE);
                    entries.add(ModItems.RAWBACON);
                    entries.add(ModItems.COOKEDBACON);
                    entries.add(ModItems.TOMATO);
                    entries.add(ModItems.CUTTOMATO);
                    entries.add(ModItems.CUCUMBER);
                    entries.add(ModItems.CUCUMBERSLICE);
                    entries.add(ModItems.GRAPES);
                    entries.add(ModItems.COFFEEBEAN);
                    entries.add(ModItems.LETTUCE);
                    entries.add(ModItems.LETTUCELEAF);
                    entries.add(ModItems.APPLEPIE);
                    entries.add(ModItems.CHOCOLATEPIE);
                    entries.add(ModItems.CHEESEPIE);
                    entries.add(ModItems.CHEESE);
                    entries.add(ModItems.TOAST);
                    entries.add(ModItems.TOAST2);
                    entries.add(ModItems.CAKESLICE);
                    entries.add(ModItems.CARROTCAKE);
                    entries.add(ModItems.SWEETBERRYCAKE);
                    entries.add(ModItems.GLOWBERRYCAKE);
                    entries.add(ModItems.APPLECAKE);
                    entries.add(ModItems.MELONSCAKE);
                    entries.add(ModItems.CHORUSCAKE);
                    entries.add(ModItems.BEETROOTCAKE);
                    entries.add(ModItems.STRAWBERRYCAKE);
                    entries.add(ModItems.BLUEBERRYCAKE);
                    entries.add(ModItems.RHUBARBCAKE);
                    entries.add(ModItems.MUFFIN);
                    entries.add(ModItems.APPLEMUFFIN);
                    entries.add(ModItems.BLUEMUFFIN);
                    entries.add(ModItems.STRAWMUFFIN);
                    entries.add(ModItems.MELONMUFFIN);
                    entries.add(ModItems.GLOWMUFFIN);
                    entries.add(ModItems.CARROTMUFFIN);
                    entries.add(ModItems.SWEETMUFFIN);
                    entries.add(ModItems.CHOCOMUFFIN);
                    entries.add(ModItems.PUMPKINMUFFIN);
                    entries.add(ModItems.RHUBARBMUFFIN);
                    entries.add(ModItems.PICKELS);
                    entries.add(ModItems.PICKELTOMATO);
                    entries.add(ModItems.PICKELSTRAW);
                    entries.add(ModItems.PICKELONION);
                    entries.add(ModItems.PICKELCORN);
                    entries.add(ModItems.PICKELCHILLI);
                    entries.add(ModItems.PICKELCARROT);
                    entries.add(ModItems.PICKELBLUE);
                    entries.add(ModItems.PICKELBELL);
                    entries.add(ModItems.PANCAKES);
                    entries.add(ModItems.CROISSANT);
                    entries.add(ModItems.WINE);
                    entries.add(ModItems.GLOWWINE);
                    entries.add(ModItems.BEETWINE);
                    entries.add(ModItems.CHORUSWINE);
                    entries.add(ModItems.MELONWINE);
                    entries.add(ModItems.SWEETWINE);
                    entries.add(ModItems.PUMKINWINE);
                    entries.add(ModItems.ANCIENTWINE);
                    entries.add(ModItems.RHUBARBWINE);
                    entries.add(ModItems.WHISKEY);
                    entries.add(ModItems.BUTTEREDPOTATO);
                    entries.add(ModItems.MASHEDPOTATOES);
                    entries.add(ModItems.TOMATOSOUP);
                    entries.add(ModItems.SPIDEREYESOUP);
                    entries.add(ModItems.SALAD);
                    entries.add(ModItems.PUMPKINSOUP);
                    entries.add(ModItems.NOODLES);
                    entries.add(ModItems.SPAGHETTI);
                    entries.add(ModItems.STEAKANDPOTATO);
                    entries.add(ModItems.DUMPLING);
                    entries.add(ModItems.DOUGH);
                    entries.add(ModItems.SPRINGROLL);
                    entries.add(ModItems.STUFFEDMUSHROOM);
                    entries.add(ModItems.NIGIRISUSHI);
                    entries.add(ModItems.VEGGIEMAKI);
                    entries.add(ModItems.VEGGIESANDWICH);
                    entries.add(ModItems.HOTCHOCOLATE);
                    entries.add(ModItems.COFFEE);
                    entries.add(ModItems.CABBAGEMEATROLL);
                    entries.add(ModItems.BURGER);
                    entries.add(ModItems.APPLESMOOTHIE);
                    entries.add(ModItems.CARROTSMOOTHIE);
                    entries.add(ModItems.PUMPKINSMOOTHIE);
                    entries.add(ModItems.SWEETBERRYSMOOTHIE);
                    entries.add(ModItems.WATERMELONSMOOTHIE);
                    entries.add(ModItems.GLOWBERRYSMOOTHIE);
                    entries.add(ModItems.MAGMASMOOTHIE);
                    entries.add(ModItems.BLUEBERSMOOTHIE);
                    entries.add(ModItems.STRAWBERSMOOTHIE);
                    entries.add(ModItems.RHUBARBSMOOTHIE);
                    entries.add(ModItems.TOASTWITHBUTTER);
                    entries.add(ModItems.TOASTWITHBACON);
                    entries.add(ModItems.TOASTWITHJAM);
                    entries.add(ModItems.TOASTWITHEGG);
                    entries.add(ModItems.FRIEDCHICKEN);
                    entries.add(ModItems.RAWCHICKENLEG);
                    entries.add(ModItems.PARSLEY);
                    entries.add(ModItems.ONION);
                    entries.add(ModItems.ONIONSLICE);
                    entries.add(ModItems.RAWONIONRING);
                    entries.add(ModItems.FRIEDONIONRING);
                    entries.add(ModItems.BELLPEPPER);
                    entries.add(ModItems.BELLPEPPERSLICE);
                    entries.add(ModItems.STUFFEDBELLPEPPER);
                    entries.add(ModItems.GARLIC);
                    entries.add(ModItems.GARLICBREAD);
                    entries.add(ModItems.PIZZA);
                    entries.add(ModItems.PIZZASLICE);
                    entries.add(ModItems.DOUGHTNUT);
                    entries.add(ModItems.BEETDONUT);
                    entries.add(ModItems.CARROTDONUT);
                    entries.add(ModItems.APPLEDONUT);
                    entries.add(ModItems.BLUEDONUT);
                    entries.add(ModItems.STRAWDONUT);
                    entries.add(ModItems.SWEETDONUT);
                    entries.add(ModItems.CHOCODONUT);
                    entries.add(ModItems.MELONDONUT);
                    entries.add(ModItems.CHORUSDONUT);
                    entries.add(ModItems.GLOWDONUT);
                    entries.add(ModItems.GLOWBERRYCAKESLICE);
                    entries.add(ModItems.APPLECAKESLICE);
                    entries.add(ModItems.SWEETBERRYCAKESLICE);
                    entries.add(ModItems.WATERMELONCAKESLICE);
                    entries.add(ModItems.CHORUSCAKESLICE);
                    entries.add(ModItems.CARROTCAKESLICE);
                    entries.add(ModItems.BEETROOTCAKESLICE);
                    entries.add(ModItems.STRAWBERRYCAKESLICE);
                    entries.add(ModItems.BLUEBERRYCAKESLICE);
                    entries.add(ModItems.RHUBARBCAKESLICE);
                    entries.add(ModItems.MELONJAM);
                    entries.add(ModItems.CARROTJAM);
                    entries.add(ModItems.CHORUSJAM);
                    entries.add(ModItems.BEETJAM);
                    entries.add(ModItems.SWEETJAM);
                    entries.add(ModItems.GLOWJAM);
                    entries.add(ModItems.BLUEBERJAM);
                    entries.add(ModItems.STRAWJAM);
                    entries.add(ModItems.APPLEJAM);
                    entries.add(ModItems.GLOWCOOKIE);
                    entries.add(ModItems.MELONCOOKIE);
                    entries.add(ModItems.SWEETCOOKIE);
                    entries.add(ModItems.BEETCOOKIE);
                    entries.add(ModItems.CHORUSCOOKIE);
                    entries.add(ModItems.BLUECOOKIE);
                    entries.add(ModItems.STRAWCOOKIE);
                    entries.add(ModItems.CHILLI);
                    entries.add(ModItems.CORN);
                    entries.add(ModItems.STRAWBERRY);
                    entries.add(ModItems.BLUEBERRY);
                    entries.add(ModItems.PEARLSTEW);
                    entries.add(ModItems.POPCORN);
                    entries.add(ModItems.BUTTERCORN);
                    entries.add(ModItems.SNIFFEROMLETTE);
                    entries.add(ModItems.BOILEDSNIFFEGG);
                    entries.add(ModItems.BLAZERODNOODLES);
                    entries.add(ModItems.GRILLEDCORN);
                    entries.add(ModItems.CHOCOSTRAWBERRY);
                    entries.add(ModItems.RHUBARB);
                    entries.add(ModItems.SANDBREAD);
                    entries.add(ModItems.HOPS);
                    entries.add(ModItems.CANDIED_APPLE);
                    entries.add(ModItems.CANDIED_BEET);
                    entries.add(ModItems.CANDIED_BLUEBER);
                    entries.add(ModItems.CANDIED_CARROT);
                    entries.add(ModItems.CANDIED_GLOWBER);
                    entries.add(ModItems.CANDIED_MELON);
                    entries.add(ModItems.CANDIED_PUMPKIN);
                    entries.add(ModItems.CANDIED_STRAWBER);
                    entries.add(ModItems.CANDIED_SWEETBER);
                    entries.add(ModItems.ROCK_CANDY_APPLE);
                    entries.add(ModItems.ROCK_CANDY_BEET);
                    entries.add(ModItems.ROCK_CANDY_BLUEBER);
                    entries.add(ModItems.ROCK_CANDY_CARROT);
                    entries.add(ModItems.ROCK_CANDY_GLOWBER);
                    entries.add(ModItems.ROCK_CANDY_MELON);
                    entries.add(ModItems.ROCK_CANDY_PUMPKIN);
                    entries.add(ModItems.ROCK_CANDY_STRAWBER);
                    entries.add(ModItems.ROCK_CANDY_SWEETBER);
                    entries.add(ModItems.TAFFY);
                    entries.add(ModItems.CANDY_CORN);
                    }).build());

    public static final ItemGroup AGOLDYBLOCK = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Goldy_Heart.MOD_ID,"aaablock"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aaablock"))
                    .icon(() -> new ItemStack(ModItems.DIAMONDBERRY)).entries((displayContext, entries) -> {
                    entries.add(ModBlocks.OLD_ROSE);
                    entries.add(ModBlocks.TINY_LILLY);
                    entries.add(ModBlocks.ASTROPHYLLIA);
                    }).build());


    //   public static final ItemGroup AGOLDYRP = Registry.register(Registries.ITEM_GROUP,
    //      new Identifier(Goldy_Heart.MOD_ID,"brpitem"),
    //      FabricItemGroup.builder().displayName(Text.translatable("itemgroup.brpitem"))
    //            .icon(() -> new ItemStack(ModItems.COPPERBERRY)).entries((displayContext, entries) -> {
    //            entries.add(ModItems.MANACRYSTAL);
    //            entries.add(ModItems.MANACRYSTAL_2);
    //            entries.add(ModItems.MANACRYSTAL_3);
    //            entries.add(ModItems.WORM);
    //            entries.add(ModItems.WORMBOWL);
    //            entries.add(ModItems.CANOFWORMS);
    //            entries.add(ModItems.LEATHERWHIP);
    //            entries.add(ModItems.MERMAIDTAIL);
    //            entries.add(ModItems.MANA_EMBER);
    //            entries.add(ModItems.MECH_SCREW);
    //            entries.add(ModItems.RODWITHWORM);
    //            entries.add(ModItems.LOOT_1);
    //            entries.add(ModItems.LOOT_2);
    //            entries.add(ModItems.LOOT_3);
    //            entries.add(ModItems.LOOT_4);
    //            entries.add(ModItems.LOOT_5);
    //            entries.add(ModItems.LOOT_6);
    //            entries.add(ModItems.LOOT_7);
    //            entries.add(ModItems.LOOT_8);
    //            entries.add(ModItems.LOOT_9);
    //            entries.add(ModItems.LOOT_10);
    //            entries.add(ModItems.LOOT_11);
    //            entries.add(ModItems.LOOT_12);
    //            entries.add(ModItems.LOOT_13);
    //            entries.add(ModItems.LOOT_14);
    //            entries.add(ModItems.LOOT_15);
    //            entries.add(ModItems.LOOT_16);
    //            entries.add(ModItems.LOOT_17);
    ////            entries.add(ModItems.LOOT_18);
    //          entries.add(ModItems.LOOT_19);
    //            entries.add(ModItems.LOOT_20);
    //            }).build());

    public static final ItemGroup AGOLDYFARMING = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Goldy_Heart.MOD_ID,"aafarming"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aafarming"))
                    .icon(() -> new ItemStack(ModItems.AMETHYSTBERRY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.CUCUMBERSEEDS);
                    entries.add(ModItems.GRAPESEEDS);
                    entries.add(ModItems.TOMATOSEEDS);
                    entries.add(ModItems.LETTUCESEEDS);
                    entries.add(ModItems.ONION);
                    entries.add(ModItems.CHILLISEEDS);
                    entries.add(ModItems.COFFEEBEAN);
                    entries.add(ModItems.PARSLEYSEEDS);
                    entries.add(ModItems.GARLIC);
                    entries.add(ModItems.BELLPEPPERSEEDS);
                    entries.add(ModItems.CORNSEEDS);
                    entries.add(ModItems.RICE);
                    entries.add(ModItems.STRAWBERRY);
                    entries.add(ModItems.BLUEBERRY);
                    entries.add(ModItems.RUHBARBSEEDS);
                    entries.add(ModItems.ANCIENTSEEDS);
                    entries.add(ModItems.HOPSEEDS);
                    }).build());

    public static final ItemGroup AGOLDYVOIDSTORAGE = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Goldy_Heart.MOD_ID,"astori"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.astori"))
                    .icon(() -> new ItemStack(ModItems.LAPISBERRY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.MAGICCRYSTAL);
                    entries.add(ModItems.MAGICCRYSTAL_2);
                    entries.add(ModItems.MAGICCRYSTAL_3);
                    entries.add(ModItems.MAGICCRYSTAL_4);
                    entries.add(ModItems.MAGICCRYSTAL_5);
                    entries.add(ModItems.MAGICCRYSTAL_6);
                    entries.add(ModItems.MAGICCRYSTAL_7);
                    entries.add(ModItems.MAGICCRYSTAL_8);
                    entries.add(ModItems.STONE_KNIFE);
                    entries.add(ModItems.IRON_KNIFE);
                    entries.add(ModItems.GOLD_KNIFE);
                    entries.add(ModItems.DIAMOND_KNIFE);
                    entries.add(ModItems.NETHERITE_KNIFE);
                    entries.add(ModItems.BLACKSMITHPICKSIGLWOOD);
                    entries.add(ModItems.BLACKSMITHAXESIGLWOOD);
                    entries.add(ModItems.BLACKSMITHHOESIGLWOOD);
                    entries.add(ModItems.BLACKSMITHSHOVELSIGLWOOD);
                    entries.add(ModItems.BLACKSMITHSWORDSIGLWOOD);
                    entries.add(ModItems.BIGBOWL);
                    }).build());

    public static void registerItemGroups() {
        Goldy_Heart.LOGGER.info("Loading Item Tabs of "+Goldy_Heart.MOD_ID);
    }
}
