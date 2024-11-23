package net.iyun.yunscuisine.datagen.langdatagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.iyun.yunscuisine.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProvider extends FabricLanguageProvider {
    public EnglishLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataGenerator, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add(ModItems.SALT,"Salt");
        translationBuilder.add(ModItems.RAWCHICKENLEG,"Raw Chicken Legs");
        translationBuilder.add(ModItems.FRIEDCHICKEN,"Fried Chicken Legs");
        translationBuilder.add(ModItems.BUCKETOFSALT,"Bucket of Salt");
        translationBuilder.add(ModItems.PEPPER,"Pepper");
        translationBuilder.add(ModItems.BUCKETOFPEPPER,"Bucket of Pepper");
        translationBuilder.add(ModItems.MARSHMELLOW,"Marshmellow");
        translationBuilder.add(ModItems.MARSHMELLOWSTICK,"Marshmellow on a Stick");
        translationBuilder.add(ModItems.COOKEDMARSHMELLOW,"Cooked Marshmellow");
        translationBuilder.add(ModItems.COOKEDMARSHMELLOWSTICK,"Cooked Marshmellow on a Stick");
        translationBuilder.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOW,"Slightly Cooked Marshmellow");
        translationBuilder.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK,"Slightly Cooked Marshmellow on a Stick");
        translationBuilder.add(ModItems.BURNTMARSHMELLOW,"Burnt Marshmellow");
        translationBuilder.add(ModItems.BURNTMARSHMELLOWSTICK,"Burnt Marshmellow on a Stick");
        translationBuilder.add(ModItems.BOILEDEGG,"Boiled Egg");
        translationBuilder.add(ModItems.COPPERBERRY,"Copper Berry");
        translationBuilder.add(ModItems.DIAMONDBERRY,"Diamond Berry");
        translationBuilder.add(ModItems.IRONBERRY,"Iron Berry");
        translationBuilder.add(ModItems.LAPISBERRY,"Lapis Berry");
        translationBuilder.add(ModItems.EMERALDBERRY,"Emerald Berry");
        translationBuilder.add(ModItems.NETHERITEBERRY,"Netherite Berry");
        translationBuilder.add(ModItems.NETHERQUARTZBERRY,"Nether Quartz Berry");
        translationBuilder.add(ModItems.AMETHYSTBERRY,"Amethyst Berry");
        translationBuilder.add(ModItems.COALBERRY,"Coal Berry");
        translationBuilder.add(ModItems.GOLDBERRY,"Gold Berry");
        translationBuilder.add(ModItems.REDSTONEBERRY,"Redstone Berry");
        translationBuilder.add(ModItems.BUTTER,"Butter");
        translationBuilder.add(ModItems.MOLTENSUGAR,"Molten Sugar in a Bucket");
        translationBuilder.add(ModItems.TRUFFLE,"Truffle");
        translationBuilder.add(ModItems.FRIEDEGG,"Fried Egg");
        translationBuilder.add(ModItems.EGGONBREAD,"Egg on Bread");
        translationBuilder.add(ModItems.GARLICBREAD,"Garlic Bread");
        translationBuilder.add(ModItems.GLOWBERRYSMOOTHIE,"Glow Berry Smoothie");
        translationBuilder.add(ModItems.CANDIEDSPIDEREYE,"Candied Spider Eye");
        translationBuilder.add(ModItems.CHILLI,"Chilli");
        translationBuilder.add(ModItems.CHILLISEEDS,"Chilli Seeds");
        translationBuilder.add(ModItems.RUHBARBSEEDS,"Rhubarb Seeds");
        translationBuilder.add(ModItems.ANCIENTSEEDS,"Ancient Seeds");
        translationBuilder.add(ModItems.STRAWBERRY,"Strawberry");
        translationBuilder.add(ModItems.BLUEBERRY,"Blueberry");
        translationBuilder.add(ModItems.WHISKEY,"Whisky");
        translationBuilder.add(ModItems.CUTBREAD,"Cut Bread");
        translationBuilder.add(ModItems.RAWBACON,"Raw Bacon");
        translationBuilder.add(ModItems.COOKEDBACON,"Cooked Bacon");
        translationBuilder.add(ModItems.SPIDEREYESOUP,"Spider Eye Soup");
        translationBuilder.add(ModItems.MASHEDPOTATOES,"Mashed Potatoes");
        translationBuilder.add(ModItems.STUFFEDBELLPEPPER,"Stuffed Bell Pepper");
        translationBuilder.add(ModItems.BUTTEREDPOTATO,"Buttered Potato");
        translationBuilder.add(ModItems.TOMATOSEEDS,"Tomato Seeds");
        translationBuilder.add(ModItems.COFFEEBEAN,"Coffee Beans");
        translationBuilder.add(ModItems.HOPSEEDS,"Hop Seeds");
        translationBuilder.add(ModItems.ONION,"Onion");
        translationBuilder.add(ModItems.RICE,"Rice");
        translationBuilder.add(ModItems.HOPS,"Hops");
        translationBuilder.add(ModItems.GARLIC,"Garlic");
        translationBuilder.add(ModItems.TOMATO,"Tomato");
        translationBuilder.add(ModItems.ANCIENTFRUIT,"Ancient Fruit");
        translationBuilder.add(ModItems.RHUBARB,"Rhubarb");
        translationBuilder.add(ModItems.RAWONIONRING,"Raw Onion Ring");
        translationBuilder.add(ModItems.LETTUCELEAF,"Lettuce Leaf");
        translationBuilder.add(ModItems.ONIONSLICE,"Onion Slice");
        translationBuilder.add(ModItems.FRIEDONIONRING,"Fried Onion Ring");
        translationBuilder.add(ModItems.CUTTOMATO,"Cut Tomato");
        translationBuilder.add(ModItems.TOMATOSOUP,"Tomato Soup");
        translationBuilder.add(ModItems.COFFEE,"Coffee");
        translationBuilder.add(ModItems.CUCUMBER,"Cucumber");
        translationBuilder.add(ModItems.CUCUMBERSLICE,"Cucumber Slice");
        translationBuilder.add(ModItems.PARSLEY,"Parsley");
        translationBuilder.add(ModItems.CUCUMBERSEEDS,"Cucumber Seeds");
        translationBuilder.add(ModItems.LETTUCESEEDS,"Lettuce Seeds");
        translationBuilder.add(ModItems.GRAPESEEDS,"Grape Seeds");
        translationBuilder.add(ModItems.PARSLEYSEEDS,"Parsley Seeds");
        translationBuilder.add(ModItems.BELLPEPPERSEEDS,"Bell Pepper Seeds");
        translationBuilder.add(ModItems.CORNSEEDS,"Corn Seeds");
        translationBuilder.add(ModItems.GRAPES,"Grapes");
        translationBuilder.add(ModItems.LETTUCE,"Lettuce");
        translationBuilder.add(ModItems.APPLEPIE,"Apple Pie");
        translationBuilder.add(ModItems.TOAST,"Toast");
        translationBuilder.add(ModItems.BELLPEPPER,"Bell Pepper");
        translationBuilder.add(ModItems.BELLPEPPERSLICE,"Bell Pepper Slice");
        translationBuilder.add(ModItems.TOAST2,"Toasted Toast");
        translationBuilder.add(ModItems.CARROTCAKE,"Carrot Cake");
        translationBuilder.add(ModItems.APPLECAKE,"Apple Cake");
        translationBuilder.add(ModItems.SWEETBERRYCAKE,"Sweet Berry Cake");
        translationBuilder.add(ModItems.CHORUSCAKE,"Chorus Cake");
        translationBuilder.add(ModItems.MELONSCAKE,"Melon Cake");
        translationBuilder.add(ModItems.BLUEBERRYCAKE,"Blueberry Cake");
        translationBuilder.add(ModItems.STRAWBERRYCAKE,"Strawberry Cake");
        translationBuilder.add(ModItems.GLOWBERRYCAKE,"Glow Berry Cake");
        translationBuilder.add(ModItems.RHUBARBCAKE,"Rhubarb Cake");
        translationBuilder.add(ModItems.CHOCOLATEPIE,"Chocolate Pie");
        translationBuilder.add(ModItems.CHEESE,"Cheese");
        translationBuilder.add(ModItems.CHEESEPIE,"Cheese Pie");
        translationBuilder.add(ModItems.PANCAKES,"Pancakes");
        translationBuilder.add(ModItems.CROISSANT,"Croissant");
        translationBuilder.add(ModItems.DOUGHTNUT,"Donut");
        translationBuilder.add(ModItems.CHOCODONUT,"Chocolate Donut");
        translationBuilder.add(ModItems.APPLEDONUT,"Apple Donut");
        translationBuilder.add(ModItems.BEETDONUT,"Beetroot Donut");
        translationBuilder.add(ModItems.BLUEDONUT,"Blueberry Donut");
        translationBuilder.add(ModItems.CARROTDONUT,"Carrot Donut");
        translationBuilder.add(ModItems.CHORUSDONUT,"Chorus Donut");
        translationBuilder.add(ModItems.MELONDONUT,"Melon Donut");
        translationBuilder.add(ModItems.STRAWDONUT,"Strawberry Donut");
        translationBuilder.add(ModItems.SWEETDONUT,"Sweet Berry Donut");
        translationBuilder.add(ModItems.GLOWDONUT,"Glow Berry Donut");
        translationBuilder.add(ModItems.SALAD,"Salad");
        translationBuilder.add(ModItems.PUMPKINSOUP,"Pumpkin Soup");
        translationBuilder.add(ModItems.WINE,"Wine");
        translationBuilder.add(ModItems.SWEETWINE,"Sweet Wine");
        translationBuilder.add(ModItems.MELONWINE,"Melon Wine");
        translationBuilder.add(ModItems.GLOWWINE,"Glow Berry Wine");
        translationBuilder.add(ModItems.BEETWINE,"Beetroot Wine");



    }

    @Override
    public String getName() {
        return "Adding Names to Yuns Cuisine";
    }
}