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
        translationBuilder.add(ModItems.MARSHMELLOW,"Marshmallow");
        translationBuilder.add(ModItems.MARSHMELLOWSTICK,"Marshmallow on a Stick");
        translationBuilder.add(ModItems.COOKEDMARSHMELLOW,"Cooked Marshmallow");
        translationBuilder.add(ModItems.COOKEDMARSHMELLOWSTICK,"Cooked Marshmallow on a Stick");
        translationBuilder.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOW,"Slightly Cooked Marshmallow");
        translationBuilder.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK,"Slightly Cooked Marshmallow on a Stick");
        translationBuilder.add(ModItems.BURNTMARSHMELLOW,"Burnt Marshmallow");
        translationBuilder.add(ModItems.BURNTMARSHMELLOWSTICK,"Burnt Marshmallow on a Stick");
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
        translationBuilder.add(ModItems.GLOWBERRYSMOOTHIE,"Glowberry Smoothie");
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
        translationBuilder.add(ModItems.GLOWBERRYCAKE,"Glowberry Cake");
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
        translationBuilder.add(ModItems.GLOWDONUT,"Glowberry Donut");
        translationBuilder.add(ModItems.SALAD,"Salad");
        translationBuilder.add(ModItems.PUMPKINSOUP,"Pumpkin Soup");
        translationBuilder.add(ModItems.WINE,"Wine");
        translationBuilder.add(ModItems.SWEETWINE,"Sweet Wine");
        translationBuilder.add(ModItems.MELONWINE,"Melon Wine");
        translationBuilder.add(ModItems.GLOWWINE,"Glowberry Wine");
        translationBuilder.add(ModItems.BEETWINE,"Beetroot Wine");
        translationBuilder.add(ModItems.PUMKINWINE,"Pumpkin Wine");
        translationBuilder.add(ModItems.ANCIENTWINE,"Ancient Fruit Wine");
        translationBuilder.add(ModItems.CHORUSWINE,"Chorus Wine");
        translationBuilder.add(ModItems.RHUBARBWINE,"Rhubarb Wine");
        translationBuilder.add(ModItems.NOODLES,"Noodles");
        translationBuilder.add(ModItems.PIZZA,"Pizza");
        translationBuilder.add(ModItems.PIZZASLICE,"Pizza Slice");
        translationBuilder.add(ModItems.SPAGHETTI,"Spaghetti");
        translationBuilder.add(ModItems.DUMPLING,"Dumpling");
        translationBuilder.add(ModItems.DOUGH,"Dough");
        translationBuilder.add(ModItems.SPRINGROLL,"Spring roll");
        translationBuilder.add(ModItems.STUFFEDMUSHROOM,"Stuffed Mushroom");
        translationBuilder.add(ModItems.HOGLINSANDWICH,"Pork Sandwich");
        translationBuilder.add(ModItems.NIGIRISUSHI,"Nigiri Sushi");
        translationBuilder.add(ModItems.VEGGIEMAKI,"Veggi Maki");
        translationBuilder.add(ModItems.HOTCHOCOLATE,"Hot Chocolate");
        translationBuilder.add(ModItems.CABBAGEMEATROLL,"Cabbage Meat Roll");
        translationBuilder.add(ModItems.BURGER,"Burger");
        translationBuilder.add(ModItems.BEETCOOKIE,"Beetroot Cookie");
        translationBuilder.add(ModItems.CHORUSCOOKIE,"Chorus Cookie");
        translationBuilder.add(ModItems.GLOWCOOKIE,"Glowberry Cookie");
        translationBuilder.add(ModItems.MELONCOOKIE,"Melon Cookie");
        translationBuilder.add(ModItems.SWEETCOOKIE,"Sweet Berry Cookie");
        translationBuilder.add(ModItems.BLUECOOKIE,"Blueberry Cookie");
        translationBuilder.add(ModItems.STRAWCOOKIE,"Strawberry Cookie");
        translationBuilder.add(ModItems.APPLESMOOTHIE,"Apple Smoothie");
        translationBuilder.add(ModItems.CARROTSMOOTHIE,"Carrot Smoothie");
        translationBuilder.add(ModItems.PUMPKINSMOOTHIE,"Pumpkin Smoothie");
        translationBuilder.add(ModItems.SWEETBERRYSMOOTHIE,"Sweet Berry Smoothie");
        translationBuilder.add(ModItems.WATERMELONSMOOTHIE,"Melon Smoothie");
        translationBuilder.add(ModItems.BLUEBERSMOOTHIE,"Blueberry Smoothie");
        translationBuilder.add(ModItems.MAGMASMOOTHIE,"Magma Cream Smoothie");
        translationBuilder.add(ModItems.STRAWBERSMOOTHIE,"Strawberry Smoothie");
        translationBuilder.add(ModItems.RHUBARBSMOOTHIE,"Rhubarb Smoothie");
        translationBuilder.add(ModItems.MELONJAM,"Melon Jam");
        translationBuilder.add(ModItems.APPLEJAM,"Apple Jam");
        translationBuilder.add(ModItems.BLUEBERJAM,"Blueberry Jam");
        translationBuilder.add(ModItems.STRAWJAM,"Strawberry Jam");
        translationBuilder.add(ModItems.CHORUSJAM,"Chorus Jam");
        translationBuilder.add(ModItems.BEETJAM,"Beetroot Jam");
        translationBuilder.add(ModItems.SWEETJAM,"Sweet Berry Jam");
        translationBuilder.add(ModItems.GLOWJAM,"Glowberry Jam");
        translationBuilder.add(ModItems.CARROTJAM,"Carrot Jam");
        translationBuilder.add(ModItems.TOASTWITHBACON,"Bacon Toast");
        translationBuilder.add(ModItems.TOASTWITHBUTTER, "Butter Toast");
        translationBuilder.add(ModItems.TOASTWITHEGG, "Egg on Toast");
        translationBuilder.add(ModItems.TOASTWITHJAM, "Jam Toast");
        translationBuilder.add(ModItems.CARROTCAKESLICE, "Carrot Cake Slice");
        translationBuilder.add(ModItems.CAKESLICE, "Cake Slice");
        translationBuilder.add(ModItems.APPLECAKESLICE, "Apple Cake Slice");
        translationBuilder.add(ModItems.GLOWBERRYCAKESLICE, "Glowberry Cake Slice");
        translationBuilder.add(ModItems.SWEETBERRYCAKESLICE, "Sweet Berry Cake Slice");
        translationBuilder.add(ModItems.BEETROOTCAKESLICE, "Beetroot Cake Slice");
        translationBuilder.add(ModItems.RHUBARBCAKESLICE, "Rhubarb Cake Slice");
        translationBuilder.add(ModItems.BEETROOTCAKE, "Beetroot Cake");
        translationBuilder.add(ModItems.CORN, "Corn");
        translationBuilder.add(ModItems.PEARLSTEW, "Enderpearl Stew");
        translationBuilder.add(ModItems.BUTTERCORN, "Buttered Corn");
        translationBuilder.add(ModItems.POPCORN, "Popcorn");
        translationBuilder.add(ModItems.GRILLEDCORN, "Grilled Corn");
        translationBuilder.add(ModItems.BOILEDSNIFFEGG, "Boiled Sniffer Egg");
        translationBuilder.add(ModItems.SNIFFEROMLETTE, "Sniffer Omelette");
        translationBuilder.add(ModItems.BLAZERODNOODLES, "Blazerod Noodles");
        translationBuilder.add(ModItems.BIGBOWL, "Big Bowl");
        translationBuilder.add(ModItems.CHOCOSTRAWBERRY, "Chocolate Strawberry");
        translationBuilder.add(ModItems.MUFFIN, "Muffin");
        translationBuilder.add(ModItems.APPLEMUFFIN, "Apple Muffin");
        translationBuilder.add(ModItems.BLUEMUFFIN, "Blueberry Muffin");
        translationBuilder.add(ModItems.STRAWMUFFIN, "Strawberry Muffin");
        translationBuilder.add(ModItems.MELONMUFFIN, "Melon Muffin");
        translationBuilder.add(ModItems.GLOWMUFFIN, "Glowberry Muffin");
        translationBuilder.add(ModItems.CARROTMUFFIN, "Carrot Muffin");
        translationBuilder.add(ModItems.SWEETMUFFIN, "Sweet Berry Muffin");
        translationBuilder.add(ModItems.CHOCOMUFFIN, "Chocolate Muffin");
        translationBuilder.add(ModItems.PUMPKINMUFFIN, "Pumpkin Muffin");
        translationBuilder.add(ModItems.RHUBARBMUFFIN, "Rhubarb Muffin");
        translationBuilder.add(ModItems.PICKELS, "Pickles");
        translationBuilder.add(ModItems.PICKELTOMATO, "Pickled Tomatoes");
        translationBuilder.add(ModItems.PICKELSTRAW, "Pickled Strawberry");
        translationBuilder.add(ModItems.PICKELONION, "Pickled Onion");
        translationBuilder.add(ModItems.PICKELCORN, "Pickled Corn");
        translationBuilder.add(ModItems.PICKELCHILLI, "Pickled Chillies");
        translationBuilder.add(ModItems.PICKELCARROT, "Pickled Carrots");
        translationBuilder.add(ModItems.PICKELBLUE, "Pickled Blueberry");
        translationBuilder.add(ModItems.PICKELBELL, "Pickled Bell Pepper");
        translationBuilder.add(ModItems.CANDIED_APPLE, "Candied Apple on a Stick");
        translationBuilder.add(ModItems.CANDIED_BEET, "Candied Beetroot on a Stick");
        translationBuilder.add(ModItems.CANDIED_BLUEBER, "Candied Blueberries on a Stick");
        translationBuilder.add(ModItems.CANDIED_CARROT, "Candied Carrots on a Stick");
        translationBuilder.add(ModItems.CANDIED_GLOWBER, "Candied Glowberry on a Stick");
        translationBuilder.add(ModItems.CANDIED_MELON, "Candied Melon on a Stick");
        translationBuilder.add(ModItems.CANDIED_PUMPKIN, "Candied Pumpkin on a Stick");
        translationBuilder.add(ModItems.CANDIED_STRAWBER, "Candied Strawberry on a Stick");
        translationBuilder.add(ModItems.CANDIED_SWEETBER, "Candied Sweet Berry on a Stick");
        translationBuilder.add(ModItems.ROCK_CANDY_APPLE, "Apple Rock Candy");
        translationBuilder.add(ModItems.ROCK_CANDY_BEET, "Beetroot Rock Candy");
        translationBuilder.add(ModItems.ROCK_CANDY_BLUEBER, "Blueberry Rock Candy");
        translationBuilder.add(ModItems.ROCK_CANDY_CARROT, "Carrot Rock Candy");
        translationBuilder.add(ModItems.ROCK_CANDY_GLOWBER, "Glowberry Rock Candy");
        translationBuilder.add(ModItems.ROCK_CANDY_MELON, "Melon Rock Candy");
        translationBuilder.add(ModItems.ROCK_CANDY_PUMPKIN, "Pumpkin Rock Candy");
        translationBuilder.add(ModItems.ROCK_CANDY_STRAWBER, "Strawberry Rock Candy");
        translationBuilder.add(ModItems.ROCK_CANDY_SWEETBER, "Sweet Berry Rock Candy");
        translationBuilder.add(ModItems.TAFFY, "Taffy");
        translationBuilder.add(ModItems.CANDY_CORN, "Candy Corn");
        translationBuilder.add(ModItems.SANDBREAD, "Sand Bread");
        translationBuilder.add(ModItems.STEAKANDPOTATO, "Steak and Potato");
        translationBuilder.add(ModItems.VEGGIESANDWICH, "Veggie Sandwich");
        translationBuilder.add(ModItems.WATERMELONCAKESLICE, "Melon Cake Slice");
        translationBuilder.add(ModItems.CHORUSCAKESLICE, "Chorus Cake Slice");
        translationBuilder.add(ModItems.STRAWBERRYCAKESLICE, "Strawberry Cake Slice");
        translationBuilder.add(ModItems.BLUEBERRYCAKESLICE, "Blueberry Cake Slice");


    }

    @Override
    public String getName() {
        return "Adding English to Yuns Cuisine";
    }
}