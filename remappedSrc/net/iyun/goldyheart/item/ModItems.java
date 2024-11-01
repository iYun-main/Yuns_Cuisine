package net.iyun.goldyheart.item;

import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.block.ModBlocks;
import net.iyun.goldyheart.item.custom.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SALT = registerItem("salt", new Item(new Item.Settings().food(ModFoodComponents.SALT)));
    public static final Item RAWCHICKENLEG = registerItem("chicken_legs", new Item(new Item.Settings().food(ModFoodComponents.RAWCHICKENLEG)));
    public static final Item FRIEDCHICKEN = registerItem("fried_chicken", new Item(new Item.Settings().food(ModFoodComponents.FRIEDCHICKEN)));
    public static final Item BUCKETOFSALT = registerItem("bucket_of_salt", new GlobalBucketieItem(new Item.Settings().maxCount(16).food(ModFoodComponents.SALTBUCKET).recipeRemainder(Items.BUCKET)));
    public static final Item PEPPER = registerItem("pepper", new Item(new Item.Settings().food(ModFoodComponents.PEPPER)));
    public static final Item BUCKETOFPEPPER = registerItem("bucket_of_pepper", new GlobalBucketieItem(new Item.Settings().maxCount(16).food(ModFoodComponents.BUCKETOFPEPPER).recipeRemainder(Items.BUCKET)));
    public static final Item MARSHMELLOW = registerItem("marshmallow", new Item(new Item.Settings().food(ModFoodComponents.MARSHMELLOW)));
    public static final Item MARSHMELLOWSTICK = registerItem("marshmallow_stick", new GlobalMashStickItem(new Item.Settings().food(ModFoodComponents.MARSHMELLOWSTICK)));
    public static final Item COOKEDMARSHMELLOW = registerItem("cooked_marshmallow", new Item(new Item.Settings().food(ModFoodComponents.COOKEDMARSHMELLOW)));
    public static final Item COOKEDMARSHMELLOWSTICK = registerItem("cooked_marshmallow_stick", new GlobalMashStickItem(new Item.Settings().food(ModFoodComponents.COOKEDMARSHMELLOWSTICK)));
    public static final Item SLIGHTLYCOOKEDMARSHMELLOWSTICK = registerItem("slightly_cooked_marshmallow_stick", new GlobalMashStickItem(new Item.Settings().food(ModFoodComponents.SLIGHTLYCOOKEDMARSHMELLOWSTICK)));
    public static final Item SLIGHTLYCOOKEDMARSHMELLOW = registerItem("slightly_cooked_marshmallow", new Item(new Item.Settings().food(ModFoodComponents.SLIGHTLYCOOKEDMARSHMELLOW)));
    public static final Item BURNTMARSHMELLOW = registerItem("burnt_marshmallow", new Item(new Item.Settings().food(ModFoodComponents.BURNTMARSHMELLOW)));
    public static final Item BURNTMARSHMELLOWSTICK = registerItem("burnt_marshmallow_stick", new GlobalMashStickItem(new Item.Settings().food(ModFoodComponents.BURNTMARSHMELLOWSTICK)));
    public static final Item BOILEDEGG = registerItem("boiled_egg", new Item(new Item.Settings().food(ModFoodComponents.BOILEDEGG)));
    public static final Item COPPERBERRY = registerItem("copper_berry", new Item(new Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item DIAMONDBERRY = registerItem("diamond_berry", new Item(new Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item IRONBERRY = registerItem("iron_berry", new Item(new Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item LAPISBERRY = registerItem("lapis_berry", new Item(new Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item EMERALDBERRY = registerItem("emerald_berry", new Item(new Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item NETHERITEBERRY = registerItem("netherite_berry", new Item(new Item.Settings().fireproof().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item AMETHYSTBERRY = registerItem("amethyst_berry", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item COALBERRY = registerItem("coal_berry", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item NETHERQUARTZBERRY = registerItem("nether_quartz_berry", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item GOLDBERRY = registerItem("gold_berry", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item REDSTONEBERRY = registerItem("redstone_berry", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMAGICBERRIES)));
    public static final Item BUTTER = registerItem("butter", new Item(new  Item.Settings().food(ModFoodComponents.BUTTER)));
    public static final Item MELTEDBUTTER = registerItem("melted_butter", new MeltedButterItem(new  Item.Settings().food(ModFoodComponents.MELTEDBUTTER).recipeRemainder(Items.BUCKET)));
    public static final Item TRUFFLE = registerItem("truffle", new Item(new  Item.Settings().food(ModFoodComponents.TRUFFLE)));
    public static final Item FRIEDEGG = registerItem("fried_egg", new Item(new  Item.Settings().food(ModFoodComponents.FRIEDEGG)));
    public static final Item EGGONBREAD = registerItem("egg_on_bread", new Item(new  Item.Settings().food(ModFoodComponents.EGGONBREAD)));
    public static final Item GARLICBREAD = registerItem("garlic_bread", new Item(new  Item.Settings().food(ModFoodComponents.GARLICBREAD)));
    public static final Item GLOWBERRYSMOOTHIE = registerItem("glow_berry_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item CANDIEDSPIDEREYE = registerItem("candied_spider_eye", new Item(new  Item.Settings().food(ModFoodComponents.CANDIEDSPIDEREYE)));
    public static final Item CHILLI = registerItem("chilli", new Item(new  Item.Settings().food(ModFoodComponents.CHILLI)));
    public static final Item CHILLISEEDS = registerItem("chilli_seeds", new AliasedBlockItem(ModBlocks.CHILLI_CROP, new  Item.Settings()));
    public static final Item RUHBARBSEEDS = registerItem("rhubarb_seeds", new AliasedBlockItem(ModBlocks.RUHBARB_CROP, new  Item.Settings()));
    public static final Item ANCIENTSEEDS = registerItem("ancient_seeds", new AliasedBlockItem(ModBlocks.ANCIENT_CROP, new  Item.Settings()));
    public static final Item STRAWBERRY = registerItem("strawberry", new AliasedBlockItem(ModBlocks.STRAWBER_BUSH, new  Item.Settings().food(ModFoodComponents.BERRIES)));
    public static final Item BLUEBERRY = registerItem("blueberry", new AliasedBlockItem(ModBlocks.BLUEBER_BUSH, new  Item.Settings().food(ModFoodComponents.BERRIES)));
    public static final Item WHISKEY = registerItem("whiskey", new WhiskyItem(new  Item.Settings().food(ModFoodComponents.WHISKEY)));
    public static final Item CUTBREAD = registerItem("cut_bread", new Item(new  Item.Settings().food(ModFoodComponents.CUTBREAD)));
    public static final Item RAWBACON = registerItem("raw_bacon", new Item(new  Item.Settings().food(ModFoodComponents.RAWBACON)));
    public static final Item COOKEDBACON = registerItem("cooked_bacon", new Item(new  Item.Settings().food(ModFoodComponents.COOKEDBACON)));
    public static final Item SPIDEREYESOUP = registerItem("spider_eye_soup", new GlobalBowlsItem(new  Item.Settings().food(ModFoodComponents.SPIDEREYESOUP)));
    public static final Item MASHEDPOTATOES = registerItem("mashed_potatoes", new GlobalBowlsItem(new  Item.Settings().food(ModFoodComponents.MASHEDPOTATO)));
    public static final Item STUFFEDBELLPEPPER = registerItem("stuffed_bell_pepper", new Item(new  Item.Settings().food(ModFoodComponents.STUFFEDBELLPEPPER)));
    public static final Item BUTTEREDPOTATO = registerItem("buttered_potato", new Item(new  Item.Settings().food(ModFoodComponents.BUTTEREDBAKEDPOTATO)));
    public static final Item TOMATOSEEDS = registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new  Item.Settings()));
    public static final Item COFFEEBEAN = registerItem("coffee_bean", new AliasedBlockItem(ModBlocks.COFFEE_CROP, new  Item.Settings()));
    public static final Item HOPSEEDS = registerItem("hops_seeds", new AliasedBlockItem(ModBlocks.HOP_CROP, new  Item.Settings()));
    public static final Item ONION = registerItem("onion", new AliasedBlockItem(ModBlocks.ONION_CROP, new  Item.Settings().food(ModFoodComponents.ONION)));
    public static final Item RICE = registerItem("rice", new AliasedBlockItem(ModBlocks.RICE_CROP, new  Item.Settings().food(ModFoodComponents.RICE)));
    public static final Item HOPS = registerItem("hops", new Item(new  Item.Settings().food(ModFoodComponents.HOPS)));
    public static final Item GARLIC = registerItem("garlic", new AliasedBlockItem(ModBlocks.GARLIC_CROP, new  Item.Settings().food(ModFoodComponents.GARLIC)));
    public static final Item TOMATO = registerItem("tomato", new Item(new  Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item ANCIENTFRUIT = registerItem("ancient_fruit", new Item(new  Item.Settings().food(ModFoodComponents.TOMATO).food(ModFoodComponents.BERRIES)));
    public static final Item RHUBARB = registerItem("rhubarb", new Item(new  Item.Settings().food(ModFoodComponents.RUHBARB)));
    public static final Item RAWONIONRING = registerItem("raw_onion_ring", new Item(new  Item.Settings().food(ModFoodComponents.RAWONIONRING)));
    public static final Item LETTUCELEAF = registerItem("lettuce_leaf", new Item(new  Item.Settings().food(ModFoodComponents.LETTUCELEAF)));
    public static final Item ONIONSLICE = registerItem("onion_slice", new Item(new  Item.Settings().food(ModFoodComponents.ONIONSLICE)));
    public static final Item FRIEDONIONRING = registerItem("fried_onion_ring", new Item(new  Item.Settings().food(ModFoodComponents.FRIEDONIONRING)));
    public static final Item CUTTOMATO = registerItem("cut_tomato", new Item(new  Item.Settings().food(ModFoodComponents.CUTTOMATO)));
    public static final Item TOMATOSOUP = registerItem("tomato_soup", new TomatoSoupItem(new  Item.Settings().food(ModFoodComponents.TOMATOSOUP).recipeRemainder(Items.BOWL)));
    public static final Item COFFEE = registerItem("coffee", new CoffeeItem(new  Item.Settings().food(ModFoodComponents.COFFEE)));
    public static final Item CUCUMBER = registerItem("cucumber", new Item(new  Item.Settings().food(ModFoodComponents.CUCUMBER)));
    public static final Item CUCUMBERSLICE = registerItem("cucumber_slice", new Item(new  Item.Settings().food(ModFoodComponents.CUCUMBERSLICE)));
    public static final Item PARSLEY = registerItem("parsley", new Item(new  Item.Settings().food(ModFoodComponents.PARSLEY)));
    public static final Item CUCUMBERSEEDS = registerItem("cucumber_seeds", new AliasedBlockItem(ModBlocks.CUCUMBER_CROP, new  Item.Settings()));
    public static final Item LETTUCESEEDS = registerItem("lettuce_seeds", new AliasedBlockItem(ModBlocks.LETTUCE_CROP,new  Item.Settings()));
    public static final Item GRAPESEEDS = registerItem("grape_seeds", new AliasedBlockItem(ModBlocks.GRAPE_CROP,new  Item.Settings()));
    public static final Item PARSLEYSEEDS = registerItem("parsley_seeds", new AliasedBlockItem(ModBlocks.PARSLEY_CROP,new  Item.Settings()));
    public static final Item BELLPEPPERSEEDS = registerItem("bellpepper_seeds", new AliasedBlockItem(ModBlocks.BELLPEPPER_CROP,new  Item.Settings()));
    public static final Item CORNSEEDS = registerItem("corn_seeds", new AliasedBlockItem(ModBlocks.CORN_CROP,new  Item.Settings()));
    public static final Item GRAPES = registerItem("grape", new Item(new  Item.Settings().food(ModFoodComponents.GRAPES)));
    public static final Item LETTUCE = registerItem("lettuce", new Item(new  Item.Settings().food(ModFoodComponents.LETTUCE)));
    public static final Item APPLEPIE = registerItem("apple_pie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALPIE)));
    public static final Item TOAST = registerItem("toast", new Item(new  Item.Settings().food(ModFoodComponents.TOAST)));
    public static final Item BELLPEPPER = registerItem("bell_pepper", new Item(new  Item.Settings().food(ModFoodComponents.BELLPEPPER)));
    public static final Item BELLPEPPERSLICE = registerItem("bell_pepper_slice", new Item(new  Item.Settings().food(ModFoodComponents.BELLPEPPERSLICE)));
    public static final Item TOAST2 = registerItem("toasted_toast", new Item(new  Item.Settings().food(ModFoodComponents.TOAST2)));
    public static final Item CARROTCAKE = registerItem("carrot_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item APPLECAKE = registerItem("apple_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item SWEETBERRYCAKE = registerItem("sweet_berry_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item CHORUSCAKE = registerItem("chorus_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item MELONSCAKE = registerItem("melon_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item BLUEBERRYCAKE = registerItem("blueberry_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item STRAWBERRYCAKE = registerItem("strawberry_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item GLOWBERRYCAKE = registerItem("glow_berry_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item RHUBARBCAKE = registerItem("rhubarb_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item CHOCOLATEPIE = registerItem("chocolate_pie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALPIE)));
    public static final Item CHEESE = registerItem("cheese", new Item(new  Item.Settings().food(ModFoodComponents.CHEESE)));
    public static final Item CHEESEPIE = registerItem("cheese_pie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALPIE)));
    public static final Item PANCAKES = registerItem("pancakes", new Item(new  Item.Settings().food(ModFoodComponents.PANCAKES)));
    public static final Item CROISSANT = registerItem("croissant", new Item(new  Item.Settings().food(ModFoodComponents.CROISSANT)));
    public static final Item DOUGHTNUT = registerItem("donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item CHOCODONUT = registerItem("chocolate_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    //  public static final Item DOUGHTNUTJAM = registerItem("donut_jam", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item APPLEDONUT = registerItem("apple_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item BEETDONUT = registerItem("beetroot_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item BLUEDONUT = registerItem("blueberry_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item CARROTDONUT = registerItem("carrot_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item CHORUSDONUT = registerItem("chorus_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item MELONDONUT = registerItem("melon_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item STRAWDONUT = registerItem("strawberry_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item SWEETDONUT = registerItem("sweet_berry_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item GLOWDONUT = registerItem("glow_berry_donut", new Item(new  Item.Settings().food(ModFoodComponents.DOUGHNUT)));
    public static final Item SALAD = registerItem("salad", new GlobalBowlsItem(new  Item.Settings().food(ModFoodComponents.SALAD)));
    public static final Item PUMPKINSOUP = registerItem("pumpkin_soup", new TomatoSoupItem(new  Item.Settings().food(ModFoodComponents.PUMPKINSOUP)));
    public static final Item WINE = registerItem("wine", new WineItem(new  Item.Settings().food(ModFoodComponents.GLOBALWINES)));
    public static final Item SWEETWINE = registerItem("sweet_berry_wine", new WineItem(new  Item.Settings().food(ModFoodComponents.GLOBALWINES)));
    public static final Item MELONWINE = registerItem("melon_wine", new WineItem(new  Item.Settings().food(ModFoodComponents.GLOBALWINES)));
    public static final Item GLOWWINE = registerItem("glow_berry_wine", new WineItem(new  Item.Settings().food(ModFoodComponents.GLOBALWINES)));
    public static final Item BEETWINE = registerItem("beetroot_wine", new WineItem(new  Item.Settings().food(ModFoodComponents.GLOBALWINES)));
    public static final Item PUMKINWINE = registerItem("pumpkin_wine", new WineItem(new  Item.Settings().food(ModFoodComponents.GLOBALWINES)));
    public static final Item ANCIENTWINE = registerItem("ancient_wine", new WineItem(new  Item.Settings().food(ModFoodComponents.GLOBALWINES)));
    public static final Item CHORUSWINE = registerItem("chorus_wine", new WineItem(new  Item.Settings().food(ModFoodComponents.GLOBALWINES)));
    public static final Item RHUBARBWINE = registerItem("rhubarb_wine", new WineItem(new  Item.Settings().food(ModFoodComponents.GLOBALWINES)));
    public static final Item NOODLES = registerItem("noodles", new GlobalBowlsItem(new  Item.Settings().food(ModFoodComponents.NOODLES)));
    public static final Item PIZZA = registerItem("pizza", new Item(new  Item.Settings().food(ModFoodComponents.PIZZA)));
    public static final Item PIZZASLICE = registerItem("pizza_slice", new Item(new  Item.Settings().food(ModFoodComponents.PIZZASLICE)));
    public static final Item SPAGHETTI = registerItem("spaghetti", new GlobalBowlsItem(new  Item.Settings().food(ModFoodComponents.SPAGHETTI)));
    public static final Item STEAKANDPOTATO = registerItem("steak_and_potato", new GlobalBowlsItem(new  Item.Settings().food(ModFoodComponents.STEAKANDPOTATO)));
    public static final Item DUMPLING = registerItem("dumpling", new Item(new  Item.Settings().food(ModFoodComponents.DUMPLING)));
    public static final Item DOUGH = registerItem("dough", new Item(new  Item.Settings().food(ModFoodComponents.DOUGH)));
    public static final Item SPRINGROLL = registerItem("spring_roll", new Item(new  Item.Settings().food(ModFoodComponents.SPRINGROLL)));
    public static final Item STUFFEDMUSHROOM = registerItem("stuffed_mushroom", new Item(new  Item.Settings().food(ModFoodComponents.STUFFEDMUSHROOM)));
    public static final Item HOGLINSANDWICH = registerItem("hoglin_sandwich", new Item(new  Item.Settings().food(ModFoodComponents.HOGLINSANDWICH)));
    public static final Item NIGIRISUSHI = registerItem("nigiri_sushi", new Item(new  Item.Settings().food(ModFoodComponents.NIGIRISUSHI)));
    public static final Item VEGGIEMAKI = registerItem("veggie_maki", new Item(new  Item.Settings().food(ModFoodComponents.VEGGIEMAKI)));
    public static final Item VEGGIESANDWICH = registerItem("veggie_sandwich", new Item(new  Item.Settings().food(ModFoodComponents.VEGGIESANDWICH)));
    public static final Item HOTCHOCOLATE = registerItem("hot_chocolate", new HotcocolateItem(new  Item.Settings().food(ModFoodComponents.HOTCHOCOLATE)));
    public static final Item CABBAGEMEATROLL = registerItem("cabbage_meat_roll", new Item(new  Item.Settings().food(ModFoodComponents.CABBAGEMEATROLL)));
    public static final Item BURGER = registerItem("burger", new Item(new  Item.Settings().food(ModFoodComponents.BURGER)));
    public static final Item BEETCOOKIE = registerItem("beetroot_cookie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCOOKIE)));
    public static final Item CHORUSCOOKIE = registerItem("chorus_cookie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCOOKIE)));
    public static final Item GLOWCOOKIE = registerItem("glow_berry_cookie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCOOKIE)));
    public static final Item MELONCOOKIE = registerItem("melon_cookie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCOOKIE)));
    public static final Item SWEETCOOKIE = registerItem("sweet_berry_cookie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCOOKIE)));
    public static final Item BLUECOOKIE = registerItem("blueberry_cookie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCOOKIE)));
    public static final Item STRAWCOOKIE = registerItem("strawberry_cookie", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCOOKIE)));
    public static final Item APPLESMOOTHIE = registerItem("apple_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item CARROTSMOOTHIE = registerItem("carrot_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item PUMPKINSMOOTHIE = registerItem("pumpkin_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item SWEETBERRYSMOOTHIE = registerItem("sweet_berry_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item WATERMELONSMOOTHIE = registerItem("watermelon_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item BLUEBERSMOOTHIE = registerItem("blueberry_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item MAGMASMOOTHIE = registerItem("magma_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item STRAWBERSMOOTHIE = registerItem("strawberry_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item RHUBARBSMOOTHIE = registerItem("rhubarb_smoothie", new GlobalSmoothieItem(new  Item.Settings().food(ModFoodComponents.GLOBALSMOOTHIES)));
    public static final Item MELONJAM = registerItem("melon_jam", new GlobalJamItem(new  Item.Settings().food(ModFoodComponents.GLOBALJAMS).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item APPLEJAM = registerItem("apple_jam", new GlobalJamItem(new  Item.Settings().food(ModFoodComponents.GLOBALJAMS).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item BLUEBERJAM = registerItem("blueberry_jam", new GlobalJamItem(new  Item.Settings().food(ModFoodComponents.GLOBALJAMS).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item STRAWJAM = registerItem("strawberry_jam", new GlobalJamItem(new  Item.Settings().food(ModFoodComponents.GLOBALJAMS).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item CHORUSJAM = registerItem("chorus_jam", new GlobalJamItem(new  Item.Settings().food(ModFoodComponents.GLOBALJAMS).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item BEETJAM = registerItem("beetroot_jam", new GlobalJamItem(new  Item.Settings().food(ModFoodComponents.GLOBALJAMS).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item SWEETJAM = registerItem("sweet_berry_jam", new GlobalJamItem(new  Item.Settings().food(ModFoodComponents.GLOBALJAMS).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item GLOWJAM = registerItem("glow_berry_jam", new GlobalJamItem(new  Item.Settings().food(ModFoodComponents.GLOBALJAMS).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item CARROTJAM = registerItem("carrot_jam", new GlobalJamItem(new  Item.Settings().food(ModFoodComponents.GLOBALJAMS).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item TOASTWITHBACON = registerItem("toast_with_bacon", new Item(new  Item.Settings().food(ModFoodComponents.TOASTBACON)));
    public static final Item TOASTWITHBUTTER = registerItem("toast_with_butter", new Item(new  Item.Settings().food(ModFoodComponents.TOASTBUTTER)));
    public static final Item TOASTWITHEGG = registerItem("toast_with_egg", new Item(new  Item.Settings().food(ModFoodComponents.TOASTEGG)));
    public static final Item TOASTWITHJAM = registerItem("toast_with_jam", new Item(new  Item.Settings().food(ModFoodComponents.TOASTJAM)));
    public static final Item CARROTCAKESLICE = registerItem("carrot_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item CAKESLICE = registerItem("cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item APPLECAKESLICE = registerItem("apple_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item GLOWBERRYCAKESLICE = registerItem("glow_berry_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item SWEETBERRYCAKESLICE = registerItem("sweet_berry_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item WATERMELONCAKESLICE = registerItem("watermelon_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item CHORUSCAKESLICE = registerItem("chorus_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item BLUEBERRYCAKESLICE = registerItem("blueberry_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item STRAWBERRYCAKESLICE = registerItem("strawberry_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item BEETROOTCAKESLICE = registerItem("beetroot_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item RHUBARBCAKESLICE = registerItem("rhubarb_cake_slice", new Item(new  Item.Settings().food(ModFoodComponents.CAKESLICE)));
    public static final Item BEETROOTCAKE = registerItem("beetroot_cake", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALCAKES).maxCount(4)));
    public static final Item CORN = registerItem("corn", new Item(new  Item.Settings().food(ModFoodComponents.CORN)));
    //  public static final Item DEBUG = registerItem("debug", new Item(new  Item.Settings().food(ModFoodComponents.DEBUG)));
    public static final Item PEARLSTEW = registerItem("pearl_stew", new Item(new  Item.Settings().food(ModFoodComponents.PEARLSTEW)));
    public static final Item BUTTERCORN = registerItem("buttered_corn", new GlobalMashStickItem(new  Item.Settings().food(ModFoodComponents.BUTTERCORN)));
    public static final Item POPCORN = registerItem("popcorn", new Item(new  Item.Settings().food(ModFoodComponents.POPCORN)));
    public static final Item GRILLEDCORN = registerItem("grilled_corn", new Item(new  Item.Settings().food(ModFoodComponents.GRILLEDCORN)));
    public static final Item BOILEDSNIFFEGG = registerItem("boiled_sniffer_egg", new Item(new  Item.Settings().food(ModFoodComponents.BOILEDSNIFF)));
    public static final Item SNIFFEROMLETTE = registerItem("sniffer_omelette", new GlobalBigBowlsItem(new  Item.Settings().food(ModFoodComponents.OMLETTESNIFF)));
    public static final Item BLAZERODNOODLES = registerItem("blazerod_noodles", new GlobalBowlsItem(new  Item.Settings().food(ModFoodComponents.BLAZERODNOODLES)));
    public static final Item BIGBOWL = registerItem("big_wooden_bowl", new Item(new  Item.Settings()));
    public static final Item CHOCOSTRAWBERRY = registerItem("chocolate_strawberry", new Item(new  Item.Settings().food(ModFoodComponents.CHOCOSTRAW)));
    public static final Item MUFFIN = registerItem("muffin", new Item(new  Item.Settings().food(ModFoodComponents.MUFFIN)));
    public static final Item APPLEMUFFIN = registerItem("apple_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item BLUEMUFFIN = registerItem("blueberry_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item STRAWMUFFIN = registerItem("strawberry_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item MELONMUFFIN = registerItem("melon_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item GLOWMUFFIN = registerItem("glow_berry_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item CARROTMUFFIN = registerItem("carrot_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item SWEETMUFFIN = registerItem("sweet_berry_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item CHOCOMUFFIN = registerItem("chocolate_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item PUMPKINMUFFIN = registerItem("pumpkin_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item RHUBARBMUFFIN = registerItem("rhubarb_muffin", new Item(new  Item.Settings().food(ModFoodComponents.GLOBALMUFFINS)));
    public static final Item PICKELS = registerItem("pickles", new GlobalPickleItem(new  Item.Settings().food(ModFoodComponents.GLOBALPICKELS)));
    public static final Item PICKELTOMATO = registerItem("pickled_tomato", new GlobalPickleItem(new  Item.Settings().food(ModFoodComponents.GLOBALPICKELS)));
    public static final Item PICKELSTRAW = registerItem("pickled_strawberries", new GlobalPickleItem(new  Item.Settings().food(ModFoodComponents.GLOBALPICKELS)));
    public static final Item PICKELONION = registerItem("pickled_onion", new GlobalPickleItem(new  Item.Settings().food(ModFoodComponents.GLOBALPICKELS)));
    public static final Item PICKELCORN = registerItem("pickled_corn", new GlobalPickleItem(new  Item.Settings().food(ModFoodComponents.GLOBALPICKELS)));
    public static final Item PICKELCHILLI = registerItem("pickled_chili", new GlobalPickleItem(new  Item.Settings().food(ModFoodComponents.GLOBALPICKELS)));
    public static final Item PICKELCARROT = registerItem("pickled_carrots", new GlobalPickleItem(new  Item.Settings().food(ModFoodComponents.GLOBALPICKELS)));
    public static final Item PICKELBLUE = registerItem("pickled_blueberries", new GlobalPickleItem(new  Item.Settings().food(ModFoodComponents.GLOBALPICKELS)));
    public static final Item PICKELBELL = registerItem("pickled_bellpepper", new GlobalPickleItem(new  Item.Settings().food(ModFoodComponents.GLOBALPICKELS)));


    public static final Item BLACKSMITHPICKSIGLWOOD = registerItem("blacksmith_pick_sigl_wooden", new BlacksmithItem(new  Item.Settings()));
    public static final Item BLACKSMITHAXESIGLWOOD = registerItem("blacksmith_axe_sigl_wooden", new BlacksmithItem(new  Item.Settings()));
    public static final Item BLACKSMITHHOESIGLWOOD = registerItem("blacksmith_hoe_sigl_wooden", new BlacksmithItem(new  Item.Settings()));
    public static final Item BLACKSMITHSWORDSIGLWOOD = registerItem("blacksmith_sword_sigl_wooden", new BlacksmithItem(new  Item.Settings()));
    public static final Item BLACKSMITHSHOVELSIGLWOOD = registerItem("blacksmith_shovel_sigl_wooden", new BlacksmithItem(new  Item.Settings()));
    public static final Item ROPE = registerItem("rope", new RopeItem(new  Item.Settings()));


    public static final Item SANDBREAD = registerItem("sand_bread", new Item(new  Item.Settings().food(ModFoodComponents.SANDBREAD)));

// Some crystals that r prob most likely gonna be used for trims

    public static final Item MAGICCRYSTAL = registerItem("pink_magic_crystal", new Item(new  Item.Settings()));
    public static final Item MAGICCRYSTAL_2 = registerItem("orange_magic_crystal", new Item(new  Item.Settings()));
    public static final Item MAGICCRYSTAL_3 = registerItem("green_magic_crystal", new Item(new  Item.Settings()));
    public static final Item MAGICCRYSTAL_4 = registerItem("blue_magic_crystal", new Item(new  Item.Settings()));
    public static final Item MAGICCRYSTAL_5 = registerItem("red_magic_crystal", new Item(new  Item.Settings()));
    public static final Item MAGICCRYSTAL_6 = registerItem("rose_magic_crystal", new Item(new  Item.Settings()));
    public static final Item MAGICCRYSTAL_7 = registerItem("blood_crystal", new Item(new  Item.Settings()));
    public static final Item MAGICCRYSTAL_8 = registerItem("pure_crystal", new Item(new  Item.Settings()));
    public static final Item VOID = registerItem("void", new VoidItem(new  Item.Settings()));

// The knives

    public static final Item STONE_KNIFE = registerItem("stone_knive",
            new KniveItem(ToolMaterials.STONE, 0, 0f, new  Item.Settings().maxCount(1).maxDamage(100)));

    public static final Item IRON_KNIFE = registerItem("iron_knive",
            new KniveItem(ToolMaterials.IRON, 1, 0f, new  Item.Settings().maxCount(1).maxDamage(250)));

    public static final Item GOLD_KNIFE = registerItem("gold_knive",
            new KniveItem(ToolMaterials.GOLD, 0, 0f, new  Item.Settings().maxCount(1).maxDamage(150)));

    public static final Item DIAMOND_KNIFE = registerItem("diamond_knive",
            new KniveItem(ToolMaterials.DIAMOND, 2, 0f, new  Item.Settings().maxCount(1).maxDamage(400)));

    public static final Item NETHERITE_KNIFE = registerItem("netherite_knive",
            new KniveItem(ToolMaterials.NETHERITE, 3, 0f, new  Item.Settings().maxCount(1).maxDamage(550)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Goldy_Heart.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Goldy_Heart.LOGGER.info("Spawning Items for " + Goldy_Heart.MOD_ID);
    }
}
