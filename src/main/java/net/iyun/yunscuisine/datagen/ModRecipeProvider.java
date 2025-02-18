package net.iyun.yunscuisine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.iyun.yunscuisine.item.ModItems;
import net.iyun.yunscuisine.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> COOKINGONION = List.of(ModItems.RAWONIONRING);
        List<ItemConvertible> BACON_COOKING = List.of(ModItems.RAWBACON);
        List<ItemConvertible> TOAST = List.of(ModItems.TOAST);
        List<ItemConvertible> RAWCHICKENLEG = List.of(ModItems.RAWCHICKENLEG);
        List<ItemConvertible> BOILEDEGG = List.of(Items.EGG);
        List<ItemConvertible> SNIIFERBOILING = List.of(Items.SNIFFER_EGG);

        offerSmelting(exporter, COOKINGONION, RecipeCategory.FOOD, ModItems.FRIEDONIONRING, 0.3f, 120, "onionringcooked");
        offerSmelting(exporter, BACON_COOKING, RecipeCategory.FOOD, ModItems.COOKEDBACON, 1f, 120, "cooked_bacon");
        offerSmelting(exporter, TOAST, RecipeCategory.FOOD, ModItems.TOAST2, 1f, 150, "toasted_toast");
        offerSmelting(exporter, BOILEDEGG, RecipeCategory.FOOD, ModItems.BOILEDEGG, 1f, 200, "boiled_egg");
        offerSmelting(exporter, RAWCHICKENLEG, RecipeCategory.FOOD, ModItems.FRIEDCHICKEN, 1f, 120, "chickenleggy");
        offerSmelting(exporter, SNIIFERBOILING, RecipeCategory.FOOD, ModItems.BOILEDSNIFFEGG, 1f, 120, "sniifering");

//Food Crafting

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CANDIEDSPIDEREYE,2)
                .pattern("TTT")
                .pattern("GGG")
                .pattern("TTT")
                .input('T', Items.SPIDER_EYE)
                .input('G', Items.SUGAR)
                .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(ModItems.CANDIEDSPIDEREYE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CANDIEDSPIDEREYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CANDIEDSPIDEREYE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BIGBOWL,2)
                .pattern("T T")
                .pattern(" G ")
                .input('T', ItemTags.PLANKS)
                .input('G', Items.BOWL)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.BIGBOWL))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.BIGBOWL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RICE_PUD_BIG)
                .pattern("TTT")
                .pattern(" G ")
                .input('T', ModItems.RICE_PUD)
                .input('G', ModItems.BIGBOWL)
                .criterion(hasItem(ModItems.BIGBOWL), conditionsFromItem(ModItems.RICE_PUD_BIG))
                .criterion(hasItem(ModItems.RICE_PUD), conditionsFromItem(ModItems.RICE_PUD_BIG))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.RICE_PUD_BIG)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RICE_PUD)
                .pattern("TVT")
                .pattern(" G ")
                .input('T', ModItems.RICE)
                .input('V', ModItems.BUTTER)
                .input('G', Items.BOWL)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.RICE_PUD))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.RICE_PUD))
                .criterion(hasItem(ModItems.RICE_PUD), conditionsFromItem(ModItems.RICE_PUD))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.RICE_PUD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CANDY_CANE,4)
                .pattern("AA ")
                .pattern(" A ")
                .pattern(" S ")
                .input('S', ModItems.MOLTENSUGAR)
                .input('A', Items.SUGAR)
                .criterion(hasItem(ModItems.MOLTENSUGAR), conditionsFromItem(ModItems.CANDY_CANE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CANDY_CANE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CANDY_CANE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHAMP,1)
                .input(Items.EGG,2)
                .input(Items.GLASS_BOTTLE,1)
                .input(Items.SUGAR,2)
                .criterion(hasItem(Items.EGG), conditionsFromItem(ModItems.CHAMP))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.CHAMP))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CHAMP))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CHAMP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.HONEY_PORL,1)
                .input(ModItems.PARSLEY,1)
                .input(Items.PORKCHOP,1)
                .input(Items.SUGAR,2)
                .input(Items.HONEY_BOTTLE,2)
                .criterion(hasItem(Items.PORKCHOP), conditionsFromItem(ModItems.HONEY_PORL))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.HONEY_PORL))
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(ModItems.HONEY_PORL))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.HONEY_PORL))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.HONEY_PORL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHRIS_PUD,1)
                .input(ModItems.PARSLEY,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MOLTENSUGAR,1)
                .input(Items.SUGAR,1)
                .input(Items.HONEY_BOTTLE,1)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CHRIS_PUD))
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(ModItems.CHRIS_PUD))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.CHRIS_PUD))
                .criterion(hasItem(ModItems.MOLTENSUGAR), conditionsFromItem(ModItems.CHRIS_PUD))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.CHRIS_PUD))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CHRIS_PUD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GIN_BREAD,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MOLTENSUGAR,1)
                .input(Items.SUGAR,1)
                .input(Items.BREAD,1)
                .input(Items.HONEY_BOTTLE,1)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.GIN_BREAD))
                .criterion(hasItem(Items.BREAD), conditionsFromItem(ModItems.GIN_BREAD))
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(ModItems.GIN_BREAD))
                .criterion(hasItem(ModItems.MOLTENSUGAR), conditionsFromItem(ModItems.GIN_BREAD))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.GIN_BREAD))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GIN_BREAD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUTTER_TART,2)
                .input(ModItems.MOLTENSUGAR,1)
                .input(ModItems.BUTTER,2)
                .input(ModItems.DOUGH,2)
                .criterion(hasItem(ModItems.MOLTENSUGAR), conditionsFromItem(ModItems.BUTTER_TART))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.BUTTER_TART))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.BUTTER_TART))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.BUTTER_TART)));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.EGGNOG,1)
                .input(Items.EGG,2)
                .input(Items.GLASS_BOTTLE,1)
                .input(ModItems.CHAMP,1)
                .criterion(hasItem(Items.EGG), conditionsFromItem(ModItems.EGGNOG))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.EGGNOG))
                .criterion(hasItem(ModItems.CHAMP), conditionsFromItem(ModItems.EGGNOG))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.EGGNOG)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.EGGONBREAD,1)
                .input(ModItems.FRIEDEGG,1)
                .input(Items.BREAD,1)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(ModItems.FRIEDEGG))
                .criterion(hasItem(ModItems.FRIEDEGG), conditionsFromItem(ModItems.FRIEDEGG))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.EGGONBREAD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GARLICBREAD,1)
                .input(ModItems.GARLIC,1)
                .input(ModItems.PARSLEY,1)
                .input(ModItems.CUTBREAD,1)
                .criterion(hasItem(ModItems.CUTBREAD), conditionsFromItem(ModItems.GARLICBREAD))
                .criterion(hasItem(ModItems.GARLIC), conditionsFromItem(ModItems.GARLICBREAD))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.GARLICBREAD))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.GARLICBREAD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CABBAGEMEATROLL,2)
                .input(ModItems.LETTUCELEAF,1)
                .input(ModItems.SALT,1)
                .input(ModItems.RICE,1)
                .input(ModItems.ONION,1)
                .input(Items.COOKED_PORKCHOP,1)
                .criterion(hasItem(Items.COOKED_PORKCHOP), conditionsFromItem(ModItems.CABBAGEMEATROLL))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.CABBAGEMEATROLL))
                .criterion(hasItem(ModItems.RICE), conditionsFromItem(ModItems.CABBAGEMEATROLL))
                .criterion(hasItem(ModItems.LETTUCELEAF), conditionsFromItem(ModItems.CABBAGEMEATROLL))
                .criterion(hasItem(ModItems.ONION), conditionsFromItem(ModItems.CABBAGEMEATROLL))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CABBAGEMEATROLL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.POPCORN,1)
                .input(ModItems.SALT,2)
                .input(ModItems.CORN,2)
                .input(Items.BOWL,1)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.POPCORN))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.POPCORN))
                .criterion(hasItem(ModItems.CORN), conditionsFromItem(ModItems.POPCORN))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.POPCORN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.NIGIRISUSHI,2)
                .input(Items.COOKED_SALMON,1)
                .input(ModItems.RICE,1)
                .input(ModItems.SALT,1)
                .input(Items.DRIED_KELP,1)
                .criterion(hasItem(Items.DRIED_KELP), conditionsFromItem(ModItems.NIGIRISUSHI))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.NIGIRISUSHI))
                .criterion(hasItem(ModItems.RICE), conditionsFromItem(ModItems.NIGIRISUSHI))
                .criterion(hasItem(Items.COOKED_SALMON), conditionsFromItem(ModItems.NIGIRISUSHI))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.NIGIRISUSHI)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUTTERCORN,1)
                .input(ModItems.CORN,1)
                .input(ModItems.BUTTER,1)
                .input(Items.STICK,1)
                .criterion(hasItem(Items.STICK), conditionsFromItem(ModItems.BUTTERCORN))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.BUTTERCORN))
                .criterion(hasItem(ModItems.CORN), conditionsFromItem(ModItems.BUTTERCORN))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.BUTTERCORN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.VEGGIEMAKI,3)
                .input(ModItems.CUCUMBERSLICE,1)
                .input(Items.CARROT,1)
                .input(ModItems.ONION,1)
                .input(ModItems.BELLPEPPERSLICE,1)
                .input(ModItems.SALT,1)
                .input(ModItems.RICE,1)
                .input(Items.DRIED_KELP,1)
                .criterion(hasItem(Items.DRIED_KELP), conditionsFromItem(ModItems.VEGGIEMAKI))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(ModItems.VEGGIEMAKI))
                .criterion(hasItem(ModItems.CUCUMBERSLICE), conditionsFromItem(ModItems.VEGGIEMAKI))
                .criterion(hasItem(ModItems.BELLPEPPERSLICE), conditionsFromItem(ModItems.VEGGIEMAKI))
                .criterion(hasItem(ModItems.ONION), conditionsFromItem(ModItems.VEGGIEMAKI))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.VEGGIEMAKI))
                .criterion(hasItem(ModItems.RICE), conditionsFromItem(ModItems.VEGGIEMAKI))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.VEGGIEMAKI)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PANCAKES,4)
                .input(Items.MILK_BUCKET,1)
                .input(Items.EGG,1)
                .input(Items.SUGAR,1)
                .input(ModItems.SALT,1)
                .input(ModItems.DOUGH,1)
                .criterion(hasItem(Items.EGG), conditionsFromItem(ModItems.PANCAKES))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.PANCAKES))
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.PANCAKES))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.PANCAKES))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.PANCAKES))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.PANCAKES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DUMPLING,3)
                .input(Items.COOKED_BEEF,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.LETTUCELEAF,1)
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(ModItems.DUMPLING))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.DUMPLING))
                .criterion(hasItem(ModItems.LETTUCELEAF), conditionsFromItem(ModItems.DUMPLING))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.DUMPLING)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHOCOSTRAWBERRY,1)
                .input(Items.COCOA_BEANS,1)
                .input(ModItems.STRAWBERRY,1)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(ModItems.CHOCOSTRAWBERRY))
                .criterion(hasItem(ModItems.STRAWBERRY), conditionsFromItem(ModItems.CHOCOSTRAWBERRY))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CHOCOSTRAWBERRY)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.HOTCHOCOLATE,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.SUGAR,1)
                .input(Items.COCOA_BEANS,1)
                .input(ModItems.MARSHMELLOW,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.HOTCHOCOLATE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.HOTCHOCOLATE))
                .criterion(hasItem(ModItems.MARSHMELLOW), conditionsFromItem(ModItems.HOTCHOCOLATE))
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(ModItems.HOTCHOCOLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.HOTCHOCOLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COFFEE,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.SUGAR,1)
                .input(ModItems.COFFEEBEAN,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.COFFEE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.COFFEE))
                .criterion(hasItem(ModItems.COFFEEBEAN), conditionsFromItem(ModItems.COFFEE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.COFFEE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.STUFFEDMUSHROOM,1)
                .input(Items.BROWN_MUSHROOM,1)
                .input(ModItems.COOKEDBACON,1)
                .input(ModItems.PARSLEY,1)
                .input(ModItems.BUTTER,1)
                .input(ModItems.CHEESE,1)
                .criterion(hasItem(Items.BROWN_MUSHROOM), conditionsFromItem(ModItems.STUFFEDMUSHROOM))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.STUFFEDMUSHROOM))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.STUFFEDMUSHROOM))
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.STUFFEDMUSHROOM))
                .criterion(hasItem(ModItems.COOKEDBACON), conditionsFromItem(ModItems.STUFFEDMUSHROOM))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.STUFFEDMUSHROOM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.STUFFEDBELLPEPPER,1)
                .input(Items.POTATO,1)
                .input(ModItems.BELLPEPPER,1)
                .input(ModItems.CHEESE,1)
                .input(ModItems.BUTTER,1)
                .input(ModItems.PARSLEY,1)
                .input(ModItems.RICE,1)
                .criterion(hasItem(Items.POTATO), conditionsFromItem(ModItems.STUFFEDBELLPEPPER))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.STUFFEDBELLPEPPER))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.STUFFEDBELLPEPPER))
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.STUFFEDBELLPEPPER))
                .criterion(hasItem(ModItems.RICE), conditionsFromItem(ModItems.STUFFEDBELLPEPPER))
                .criterion(hasItem(ModItems.BELLPEPPER), conditionsFromItem(ModItems.STUFFEDBELLPEPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.STUFFEDBELLPEPPER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.STEAKANDPOTATO,1)
                .input(Items.COOKED_BEEF,1)
                .input(ModItems.PARSLEY,1)
                .input(Items.BOWL,1)
                .input(Items.BAKED_POTATO,1)
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(ModItems.STEAKANDPOTATO))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.STEAKANDPOTATO))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.STEAKANDPOTATO))
                .criterion(hasItem(Items.BAKED_POTATO), conditionsFromItem(ModItems.STEAKANDPOTATO))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.STEAKANDPOTATO)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PIZZA,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.PARSLEY,1)
                .input(ModItems.SALT,1)
                .input(ModItems.CHEESE,1)
                .input(ModItems.TOMATOSOUP,1)
                .input(ModItems.PEPPER,1)
                .input(ModItems.RAWBACON,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.PIZZA))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.PIZZA))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.PIZZA))
                .criterion(hasItem(ModItems.TOMATOSOUP), conditionsFromItem(ModItems.PIZZA))
                .criterion(hasItem(ModItems.PEPPER), conditionsFromItem(ModItems.PIZZA))
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.PIZZA))
                .criterion(hasItem(ModItems.RAWBACON), conditionsFromItem(ModItems.PIZZA))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.PIZZA)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RAWONIONRING,1)
                .input(ModItems.ONIONSLICE,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.SALT,1)
                .criterion(hasItem(ModItems.ONIONSLICE),conditionsFromItem(ModItems.RAWONIONRING))
                .criterion(hasItem(ModItems.DOUGH),conditionsFromItem(ModItems.RAWONIONRING))
                .criterion(hasItem(ModItems.SALT),conditionsFromItem(ModItems.RAWONIONRING))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.RAWONIONRING)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ONIONSLICE,2)
                .input(ModItems.ONION,1)
                .criterion(hasItem(ModItems.ONION),conditionsFromItem(ModItems.ONIONSLICE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.ONIONSLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PIZZASLICE,4)
                .input(ModItems.PIZZA,1)
                .criterion(hasItem(ModItems.PIZZA),conditionsFromItem(ModItems.PIZZASLICE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.PIZZASLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.NOODLES,1)
                .input(ModItems.DOUGH,1)
                .input(Items.BOWL,1)
                .input(ModItems.SALT,1)
                .input(ModItems.CHILLI,1)
                .input(ModItems.PARSLEY,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.NOODLES))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.NOODLES))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.NOODLES))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.NOODLES))
                .criterion(hasItem(ModItems.CHILLI), conditionsFromItem(ModItems.NOODLES))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.NOODLES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SALAD,1)
                .input(ModItems.CUCUMBERSLICE,1)
                .input(ModItems.CUTTOMATO,1)
                .input(ModItems.BELLPEPPERSLICE,1)
                .input(ModItems.LETTUCELEAF,1)
                .input(Items.BOWL,1)
                .input(ModItems.GARLIC,1)
                .criterion(hasItem(ModItems.GARLIC), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(ModItems.LETTUCELEAF), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(ModItems.CUTTOMATO), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(ModItems.CUCUMBERSLICE), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(ModItems.BELLPEPPERSLICE), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.SALAD))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.SALAD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.VEGGIESANDWICH,1)
                .input(ModItems.LETTUCELEAF,1)
                .input(ModItems.TOAST,1)
                .input(ModItems.ONIONSLICE,1)
                .input(ModItems.CHEESE,1)
                .input(Items.BEETROOT,1)
                .input(Items.CARROT,1)
                .input(ModItems.CUTTOMATO,1)
                .input(ModItems.CUCUMBERSLICE,1)
                .criterion(hasItem(ModItems.LETTUCELEAF), conditionsFromItem(ModItems.VEGGIESANDWICH))
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(ModItems.VEGGIESANDWICH))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(ModItems.VEGGIESANDWICH))
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.VEGGIESANDWICH))
                .criterion(hasItem(ModItems.ONIONSLICE), conditionsFromItem(ModItems.VEGGIESANDWICH))
                .criterion(hasItem(ModItems.TOAST), conditionsFromItem(ModItems.VEGGIESANDWICH))
                .criterion(hasItem(ModItems.CUCUMBERSLICE), conditionsFromItem(ModItems.VEGGIESANDWICH))
                .criterion(hasItem(ModItems.CUTTOMATO), conditionsFromItem(ModItems.VEGGIESANDWICH))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.VEGGIESANDWICH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOAST,4)
                .input(ModItems.DOUGH,1)
                .input(ModItems.SALT,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.TOAST))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.TOAST))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.TOAST)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SALT,3)
                .input(ModItems.BUCKETOFSALT,1)
                .criterion(hasItem(ModItems.BUCKETOFSALT), conditionsFromItem(ModItems.SALT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.SALT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUCKETOFPEPPER,1)
                .input(ModItems.SALT,1)
                .input(Items.GUNPOWDER,1)
                .input(Items.BUCKET,1)
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.BUCKETOFPEPPER))
                .criterion(hasItem(Items.BUCKET), conditionsFromItem(ModItems.BUCKETOFPEPPER))
                .criterion(hasItem(Items.GUNPOWDER), conditionsFromItem(ModItems.BUCKETOFPEPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.BUCKETOFPEPPER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PEPPER,3)
                .input(ModItems.BUCKETOFPEPPER,1)
                .criterion(hasItem(ModItems.BUCKETOFPEPPER), conditionsFromItem(ModItems.PEPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.PEPPER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUTTEREDPOTATO,1)
                .input(ModItems.BUTTER,1)
                .input(ModItems.PEPPER,1)
                .input(ModItems.PARSLEY,1)
                .input(Items.BAKED_POTATO,1)
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.BUTTEREDPOTATO))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.BUTTEREDPOTATO))
                .criterion(hasItem(ModItems.PEPPER), conditionsFromItem(ModItems.BUTTEREDPOTATO))
                .criterion(hasItem(Items.BAKED_POTATO), conditionsFromItem(ModItems.BUTTEREDPOTATO))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.BUTTEREDPOTATO)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MASHEDPOTATOES,1)
                .input(ModItems.BUTTEREDPOTATO,1)
                .input(ModItems.PEPPER,1)
                .input(ModItems.SALT,1)
                .input(Items.BOWL,1)
                .criterion(hasItem(ModItems.PEPPER), conditionsFromItem(ModItems.MASHEDPOTATOES))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.MASHEDPOTATOES))
                .criterion(hasItem(ModItems.BUTTEREDPOTATO), conditionsFromItem(ModItems.MASHEDPOTATOES))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.MASHEDPOTATOES))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.MASHEDPOTATOES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SPRINGROLL,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.PEPPER,1)
                .input(ModItems.SALT,1)
                .input(ModItems.CUTTOMATO,1)
                .input(ModItems.CUCUMBERSLICE,1)
                .input(ModItems.BELLPEPPERSLICE,1)
                .input(ModItems.CHILLI,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.SPRINGROLL))
                .criterion(hasItem(ModItems.PEPPER), conditionsFromItem(ModItems.SPRINGROLL))
                .criterion(hasItem(ModItems.CUTTOMATO), conditionsFromItem(ModItems.SPRINGROLL))
                .criterion(hasItem(ModItems.CUCUMBERSLICE), conditionsFromItem(ModItems.SPRINGROLL))
                .criterion(hasItem(ModItems.BELLPEPPERSLICE), conditionsFromItem(ModItems.SPRINGROLL))
                .criterion(hasItem(ModItems.CHILLI), conditionsFromItem(ModItems.SPRINGROLL))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.SPRINGROLL))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.SPRINGROLL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHEESE,2)
                .input(Items.MILK_BUCKET,1)
                .input(ModItems.SALT,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.CHEESE))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.CHEESE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CHEESE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.WHISKEY,1)
                .input(ModItems.HOPS,4)
                .input(ModItems.SALT,2)
                .input(Items.GLASS_BOTTLE,1)
                .criterion(hasItem(ModItems.HOPS), conditionsFromItem(ModItems.WHISKEY))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.WHISKEY))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.WHISKEY))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.WHISKEY)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SPAGHETTI,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.CUTTOMATO,1)
                .input(ModItems.SALT,1)
                .input(ModItems.ONIONSLICE,1)
                .input(ModItems.PARSLEY,1)
                .input(Items.BOWL,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.SPAGHETTI))
                .criterion(hasItem(ModItems.CUTTOMATO), conditionsFromItem(ModItems.SPAGHETTI))
                .criterion(hasItem(ModItems.ONIONSLICE), conditionsFromItem(ModItems.SPAGHETTI))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.SPAGHETTI))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.SPAGHETTI))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.SPAGHETTI))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.SPAGHETTI)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.HOGLINSANDWICH,1)
                .input(ModItems.SALT,1)
                .input(ModItems.CHILLI,1)
                .input(ModItems.CHEESE,1)
                .input(ModItems.CUTTOMATO,1)
                .input(ModItems.CUTBREAD,1)
                .input(ModItems.COOKEDBACON,1)
                .input(ModItems.ONIONSLICE,1)
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.HOGLINSANDWICH))
                .criterion(hasItem(ModItems.CHILLI), conditionsFromItem(ModItems.HOGLINSANDWICH))
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.HOGLINSANDWICH))
                .criterion(hasItem(ModItems.CUTTOMATO), conditionsFromItem(ModItems.HOGLINSANDWICH))
                .criterion(hasItem(ModItems.ONIONSLICE), conditionsFromItem(ModItems.HOGLINSANDWICH))
                .criterion(hasItem(ModItems.CUTBREAD), conditionsFromItem(ModItems.HOGLINSANDWICH))
                .criterion(hasItem(ModItems.COOKEDBACON), conditionsFromItem(ModItems.HOGLINSANDWICH))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.HOGLINSANDWICH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CROISSANT,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.SALT,1)
                .input(ModItems.BUTTER,2)
                .input(Items.SUGAR,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.CROISSANT))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.CROISSANT))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.CROISSANT))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CROISSANT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CROISSANT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BURGER,1)
                .input(ModItems.CUTBREAD,1)
                .input(Items.COOKED_BEEF,1)
                .input(ModItems.CHEESE,1)
                .input(ModItems.CUTTOMATO,1)
                .input(ModItems.FRIEDEGG,1)
                .input(ModItems.CUCUMBERSLICE,1)
                .input(ModItems.ONIONSLICE,1)
                .input(ModItems.LETTUCELEAF,1)
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(ModItems.BURGER))
                .criterion(hasItem(ModItems.CHEESE), conditionsFromItem(ModItems.BURGER))
                .criterion(hasItem(ModItems.LETTUCELEAF), conditionsFromItem(ModItems.BURGER))
                .criterion(hasItem(ModItems.FRIEDEGG), conditionsFromItem(ModItems.BURGER))
                .criterion(hasItem(ModItems.CUTTOMATO), conditionsFromItem(ModItems.BURGER))
                .criterion(hasItem(ModItems.CUCUMBERSLICE), conditionsFromItem(ModItems.BURGER))
                .criterion(hasItem(ModItems.ONIONSLICE), conditionsFromItem(ModItems.BURGER))
                .criterion(hasItem(ModItems.CUTBREAD), conditionsFromItem(ModItems.BURGER))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.BURGER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DOUGH,8)
                .input(Items.EGG,2)
                .input(Items.WHEAT,1)
                .input(Items.SUGAR,2)
                .input(ModItems.BUTTER,1)
                .criterion(hasItem(Items.EGG), conditionsFromItem(ModItems.DOUGH))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(ModItems.DOUGH))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.DOUGH))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.DOUGH))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.DOUGH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DOUGHTNUT,4)
                .input(ModItems.SALT,1)
                .input(Items.SUGAR,1)
                .input(ModItems.BUTTER,1)
                .input(ModItems.DOUGH,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.DOUGHTNUT))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.DOUGHTNUT))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.DOUGHTNUT))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.DOUGHTNUT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.DOUGHTNUT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MUFFIN,4)
                .input(ModItems.SALT,1)
                .input(Items.SUGAR,1)
                .input(Items.MILK_BUCKET)
                .input(ModItems.DOUGH,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.MUFFIN))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.MUFFIN))
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.MUFFIN))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.MUFFIN))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.MUFFIN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SNIFFEROMLETTE,1)
                .input(ModItems.BIGBOWL,1)
                .input(ModItems.BOILEDSNIFFEGG,2)
                .input(ModItems.BOILEDEGG,2)
                .input(ModItems.SALT,1)
                .criterion(hasItem(ModItems.BIGBOWL), conditionsFromItem(ModItems.SNIFFEROMLETTE))
                .criterion(hasItem(ModItems.BOILEDSNIFFEGG), conditionsFromItem(ModItems.SNIFFEROMLETTE))
                .criterion(hasItem(ModItems.BOILEDEGG), conditionsFromItem(ModItems.SNIFFEROMLETTE))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.SNIFFEROMLETTE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.SNIFFEROMLETTE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BLAZERODNOODLES,1)
                .input(Items.BOWL,1)
                .input(Items.BLAZE_ROD,3)
                .input(ModItems.DOUGH,1)
                .input(ModItems.PARSLEY,1)
                .input(ModItems.SALT,1)
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.BLAZERODNOODLES))
                .criterion(hasItem(Items.BLAZE_ROD), conditionsFromItem(ModItems.BLAZERODNOODLES))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.BLAZERODNOODLES))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.BLAZERODNOODLES))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.BLAZERODNOODLES))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.BLAZERODNOODLES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RAWCHICKENLEG,2)
                .input(Items.CHICKEN,2)
                .criterion(hasItem(Items.CHICKEN), conditionsFromItem(ModItems.RAWCHICKENLEG))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.RAWCHICKENLEG)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CANDY_CORN,5)
                .input(Items.SUGAR,3)
                .input(ModItems.CORN)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CANDY_CORN))
                .criterion(hasItem(ModItems.CORN), conditionsFromItem(ModItems.CANDY_CORN))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.CANDY_CORN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TAFFY,6)
                .input(Items.SUGAR,2)
                .input(Items.HONEY_BOTTLE,1)
                .input(ModItems.BUTTER)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.TAFFY))
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(ModItems.TAFFY))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.TAFFY))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.TAFFY)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MOLTENSUGAR,1)
                .input(Items.SUGAR,4)
                .input(Items.BUCKET,1)
                .input(Items.MAGMA_CREAM,1)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.MOLTENSUGAR))
                .criterion(hasItem(Items.BUCKET), conditionsFromItem(ModItems.MOLTENSUGAR))
                .criterion(hasItem(Items.MAGMA_CREAM), conditionsFromItem(ModItems.MOLTENSUGAR))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.MOLTENSUGAR)));

// this is just for me to simply repeating shit
        cakesslice(ModItems.BEETROOTCAKESLICE, ModItems.BEETROOTCAKE, exporter);
        cakesslice(ModItems.CHORUSCAKESLICE, ModItems.CHORUSCAKE, exporter);
        cakesslice(ModItems.SWEETBERRYCAKESLICE, ModItems.SWEETBERRYCAKE, exporter);
        cakesslice(ModItems.APPLECAKESLICE, ModItems.APPLECAKE, exporter);
        cakesslice(ModItems.BLUEBERRYCAKESLICE, ModItems.BLUEBERRYCAKE, exporter);
        cakesslice(ModItems.GLOWBERRYCAKESLICE, ModItems.GLOWBERRYCAKE, exporter);
        cakesslice(ModItems.STRAWBERRYCAKESLICE, ModItems.STRAWBERRYCAKE, exporter);
        cakesslice(ModItems.CARROTCAKESLICE, ModItems.CARROTCAKE, exporter);
        cakesslice(ModItems.WATERMELONCAKESLICE, ModItems.MELONSCAKE, exporter);
        cakesslice(ModItems.CAKESLICE, Items.CAKE, exporter);
        cakesslice(ModItems.RHUBARBCAKESLICE, Items.CAKE, exporter);

        cakes(ModItems.CARROTCAKE, Items.CARROT,exporter);
        cakes(ModItems.BEETROOTCAKE, Items.BEETROOT,exporter);
        cakes(ModItems.CHORUSCAKE, Items.CHORUS_FRUIT,exporter);
        cakes(ModItems.APPLECAKE, Items.APPLE,exporter);
        cakes(ModItems.GLOWBERRYCAKE, Items.GLOW_BERRIES,exporter);
        cakes(ModItems.MELONSCAKE, Items.MELON_SLICE,exporter);
        cakes(ModItems.BLUEBERRYCAKE, ModItems.BLUEBERRY,exporter);
        cakes(ModItems.STRAWBERRYCAKE, ModItems.STRAWBERRY,exporter);
        cakes(ModItems.SWEETBERRYCAKE, Items.SWEET_BERRIES,exporter);
        cakes(ModItems.RHUBARBCAKE, ModItems.RHUBARB,exporter);

        jams(ModItems.CARROTJAM, Items.CARROT,exporter);
        jams(ModItems.GLOWJAM, Items.GLOW_BERRIES,exporter);
        jams(ModItems.SWEETJAM, Items.SWEET_BERRIES,exporter);
        jams(ModItems.BEETJAM, Items.BEETROOT,exporter);
        jams(ModItems.CHORUSJAM, Items.CHORUS_FRUIT,exporter);
        jams(ModItems.MELONJAM, Items.MELON_SLICE,exporter);
        jams(ModItems.STRAWJAM, ModItems.STRAWBERRY,exporter);
        jams(ModItems.BLUEBERJAM, ModItems.BLUEBERRY,exporter);
        jams(ModItems.APPLEJAM, Items.APPLE,exporter);

        cookies(ModItems.SWEETCOOKIE, Items.SWEET_BERRIES, exporter);
        cookies(ModItems.CHORUSCOOKIE, Items.CHORUS_FRUIT, exporter);
        cookies(ModItems.MELONCOOKIE, Items.MELON_SLICE, exporter);
        cookies(ModItems.BEETCOOKIE, Items.BEETROOT, exporter);
        cookies(ModItems.GLOWCOOKIE, Items.GLOW_BERRIES, exporter);
        cookies(ModItems.BLUECOOKIE, ModItems.BLUEBERRY, exporter);
        cookies(ModItems.STRAWCOOKIE, ModItems.STRAWBERRY, exporter);

        smoothies(ModItems.GLOWBERRYSMOOTHIE, Items.GLOW_BERRIES,exporter);
        smoothies(ModItems.SWEETBERRYSMOOTHIE, Items.SWEET_BERRIES,exporter);
        smoothies(ModItems.CARROTSMOOTHIE, Items.CARROT,exporter);
        smoothies(ModItems.WATERMELONSMOOTHIE, Items.MELON_SLICE,exporter);
        smoothies(ModItems.PUMPKINSMOOTHIE, Items.PUMPKIN,exporter);
        smoothies(ModItems.STRAWBERSMOOTHIE, ModItems.STRAWBERRY,exporter);
        smoothies(ModItems.BLUEBERSMOOTHIE, ModItems.BLUEBERRY,exporter);
        smoothies(ModItems.RHUBARBSMOOTHIE, ModItems.RHUBARB,exporter);
        smoothies(ModItems.APPLESMOOTHIE, Items.APPLE,exporter);
        smoothies(ModItems.MAGMASMOOTHIE, Items.MAGMA_CREAM,exporter);

        soups(ModItems.TOMATOSOUP, ModItems.CUTTOMATO,exporter);
        soups(ModItems.PUMPKINSOUP, Items.PUMPKIN,exporter);
        soups(ModItems.SPIDEREYESOUP, ModItems.CANDIEDSPIDEREYE,exporter);

        marshstick(ModItems.MARSHMELLOWSTICK, ModItems.MARSHMELLOW,exporter);
        marshstick(ModItems.COOKEDMARSHMELLOWSTICK, ModItems.COOKEDMARSHMELLOW,exporter);
        marshstick(ModItems.BURNTMARSHMELLOWSTICK, ModItems.BURNTMARSHMELLOW,exporter);
        marshstick(ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK, ModItems.SLIGHTLYCOOKEDMARSHMELLOW,exporter);

        seedsconversion(ModItems.LETTUCESEEDS, ModItems.LETTUCELEAF,exporter);
        seedsconversion(ModItems.ANCIENTSEEDS, ModItems.ANCIENTFRUIT,exporter);
        seedsconversion(ModItems.BELLPEPPERSEEDS, ModItems.BELLPEPPERSLICE,exporter);
        seedsconversion(ModItems.CUCUMBERSEEDS, ModItems.CUCUMBERSLICE,exporter);
        seedsconversion(ModItems.TOMATOSEEDS, ModItems.CUTTOMATO,exporter);
        seedsconversion(ModItems.PARSLEYSEEDS, ModItems.PARSLEY,exporter);
        seedsconversion(ModItems.CHILLISEEDS, ModItems.CHILLI,exporter);
        seedsconversion(ModItems.GRAPESEEDS, ModItems.GRAPES,exporter);
        seedsconversion(ModItems.RUHBARBSEEDS, ModItems.RHUBARB,exporter);
        seedsconversion(ModItems.CORNSEEDS, ModItems.CORN,exporter);

        itemslices(ModItems.BELLPEPPERSLICE, ModItems.BELLPEPPER,exporter);
        itemslices(ModItems.BUTTER, Items.MILK_BUCKET,exporter);
        itemslices(ModItems.RAWBACON, Items.PORKCHOP,exporter);
        itemslices(ModItems.CUCUMBERSLICE, ModItems.CUCUMBER,exporter);
        itemslices(ModItems.LETTUCELEAF, ModItems.LETTUCE,exporter);
        itemslices(ModItems.TRUFFLE, Items.BROWN_MUSHROOM,exporter);
        itemslices(ModItems.CUTTOMATO, ModItems.TOMATO,exporter);
        itemslices(ModItems.CUTBREAD, Items.BREAD,exporter);

        doughnuts(ModItems.APPLEDONUT, ModItems.APPLEJAM, exporter);
        doughnuts(ModItems.BEETDONUT, ModItems.BEETJAM, exporter);
        doughnuts(ModItems.BLUEDONUT, ModItems.BLUEBERJAM, exporter);
        doughnuts(ModItems.STRAWDONUT, ModItems.STRAWJAM, exporter);
        doughnuts(ModItems.CARROTDONUT, ModItems.CARROTJAM, exporter);
        doughnuts(ModItems.CHOCODONUT, Items.COCOA_BEANS, exporter);
        doughnuts(ModItems.CHORUSDONUT, ModItems.CHORUSJAM, exporter);
        doughnuts(ModItems.GLOWDONUT, ModItems.GLOWJAM, exporter);
        doughnuts(ModItems.SWEETDONUT, ModItems.SWEETJAM, exporter);
        doughnuts(ModItems.MELONDONUT, ModItems.MELONJAM, exporter);

        toastevar(ModItems.TOASTWITHBACON, ModItems.COOKEDBACON, exporter);
        toastevar(ModItems.TOASTWITHEGG, ModItems.FRIEDEGG, exporter);
        toastevar(ModItems.TOASTWITHBUTTER, ModItems.BUTTER, exporter);


        muffins(ModItems.MELONMUFFIN, Items.MELON_SLICE,exporter);
        muffins(ModItems.APPLEMUFFIN, Items.APPLE,exporter);
        muffins(ModItems.CARROTMUFFIN, Items.CARROT,exporter);
        muffins(ModItems.CHOCOMUFFIN, Items.COCOA_BEANS,exporter);
        muffins(ModItems.GLOWMUFFIN, Items.GLOW_BERRIES,exporter);
        muffins(ModItems.SWEETMUFFIN, Items.SWEET_BERRIES,exporter);
        muffins(ModItems.PUMPKINMUFFIN, Items.PUMPKIN,exporter);
        muffins(ModItems.STRAWMUFFIN, ModItems.STRAWBERRY,exporter);
        muffins(ModItems.BLUEMUFFIN, ModItems.BLUEBERRY,exporter);
        muffins(ModItems.RHUBARBMUFFIN, ModItems.RHUBARB,exporter);


        pickeljars(ModItems.PICKELS, ModItems.CUCUMBER,exporter);
        pickeljars(ModItems.PICKELBELL, ModItems.BELLPEPPER,exporter);
        pickeljars(ModItems.PICKELBLUE, ModItems.BLUEBERRY,exporter);
        pickeljars(ModItems.PICKELCORN, ModItems.CORN,exporter);
        pickeljars(ModItems.PICKELONION, ModItems.ONION,exporter);
        pickeljars(ModItems.PICKELSTRAW, ModItems.STRAWBERRY,exporter);
        pickeljars(ModItems.PICKELCHILLI, ModItems.CHILLI,exporter);
        pickeljars(ModItems.PICKELTOMATO, ModItems.TOMATO,exporter);
        pickeljars(ModItems.PICKELCARROT, Items.CARROT,exporter);

        pies(ModItems.CHEESEPIE, ModItems.CHEESE,exporter);
        pies(ModItems.APPLEPIE, Items.APPLE,exporter);
        pies(ModItems.CHOCOLATEPIE, Items.COCOA_BEANS,exporter);

        simplebowls(ModItems.PEARLSTEW, Items.ENDER_PEARL,exporter);
        simplebowls(ModItems.GRILLEDCORN, ModItems.CORN,exporter);

        toastjam(ModItems.TOASTWITHJAM, ModItems.TOAST2,exporter);

        stairs(Blocks.STONE_STAIRS, Blocks.STONE, exporter);
        stairs(Blocks.PURPUR_STAIRS, Blocks.PURPUR_BLOCK, exporter);
        stairs(Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, exporter);
        stairs(Blocks.END_STONE_BRICK_STAIRS, Blocks.END_STONE_BRICKS, exporter);
        stairs(Blocks.SANDSTONE_STAIRS, Blocks.SANDSTONE, exporter);
        stairs(Blocks.RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE, exporter);
        stairs(Blocks.SMOOTH_SANDSTONE_STAIRS, Blocks.SMOOTH_SANDSTONE, exporter);
        stairs(Blocks.PRISMARINE_STAIRS, Blocks.PRISMARINE, exporter);
        stairs(Blocks.BLACKSTONE_STAIRS, Blocks.BLACKSTONE, exporter);
        stairs(Blocks.NETHER_BRICK_STAIRS, Blocks.NETHER_BRICKS, exporter);
        stairs(Blocks.PRISMARINE_BRICK_STAIRS, Blocks.PRISMARINE_BRICKS, exporter);
        stairs(Blocks.MUD_BRICK_STAIRS, Blocks.MUD_BRICKS, exporter);
        stairs(Blocks.BRICK_STAIRS, Blocks.BRICKS, exporter);
        stairs(Blocks.DEEPSLATE_TILE_STAIRS, Blocks.DEEPSLATE_TILES, exporter);
        stairs(Blocks.POLISHED_DEEPSLATE_STAIRS, Blocks.POLISHED_DEEPSLATE, exporter);
        stairs(Blocks.COBBLED_DEEPSLATE_STAIRS, Blocks.COBBLED_DEEPSLATE, exporter);
        stairs(Blocks.ANDESITE_STAIRS, Blocks.ANDESITE, exporter);
        stairs(Blocks.OAK_STAIRS, Blocks.OAK_PLANKS, exporter);
        stairs(Blocks.DARK_OAK_STAIRS, Blocks.DARK_OAK_PLANKS, exporter);
        stairs(Blocks.BIRCH_STAIRS, Blocks.BIRCH_PLANKS, exporter);
        stairs(Blocks.SPRUCE_STAIRS, Blocks.SPRUCE_PLANKS, exporter);
        stairs(Blocks.JUNGLE_STAIRS, Blocks.JUNGLE_PLANKS, exporter);
        stairs(Blocks.ACACIA_STAIRS, Blocks.ACACIA_PLANKS, exporter);
        stairs(Blocks.MANGROVE_STAIRS, Blocks.MANGROVE_PLANKS, exporter);
        stairs(Blocks.CHERRY_STAIRS, Blocks.CHERRY_PLANKS, exporter);
        stairs(Blocks.BAMBOO_MOSAIC_STAIRS, Blocks.BAMBOO_MOSAIC_STAIRS, exporter);
        stairs(Blocks.BAMBOO_STAIRS, Blocks.BAMBOO_PLANKS, exporter);
        stairs(Blocks.CRIMSON_STAIRS, Blocks.CRIMSON_PLANKS, exporter);
        stairs(Blocks.WARPED_STAIRS, Blocks.WARPED_PLANKS, exporter);


        wines(ModItems.BEETWINE, Items.BEETROOT,exporter);
        wines(ModItems.CHORUSWINE, Items.CHORUS_FRUIT,exporter);
        wines(ModItems.MELONWINE, Items.MELON_SLICE,exporter);
        wines(ModItems.SWEETWINE, Items.SWEET_BERRIES,exporter);
        wines(ModItems.GLOWWINE, Items.GLOW_BERRIES,exporter);
        wines(ModItems.WINE, ModItems.GRAPES,exporter);
        wines(ModItems.ANCIENTWINE, ModItems.ANCIENTFRUIT,exporter);
        wines(ModItems.PUMKINWINE, Items.PUMPKIN,exporter);
        wines(ModItems.RHUBARBWINE, ModItems.RHUBARB,exporter);

        oreberries(ModItems.AMETHYSTBERRY, Items.AMETHYST_SHARD,exporter);
        oreberries(ModItems.COALBERRY, Items.COAL_BLOCK,exporter);
        oreberries(ModItems.DIAMONDBERRY, Items.DIAMOND,exporter);
        oreberries(ModItems.COPPERBERRY, Items.COPPER_BLOCK,exporter);
        oreberries2(ModItems.NETHERITEBERRY, Items.NETHERITE_SCRAP,exporter);
        oreberries(ModItems.NETHERQUARTZBERRY, Items.QUARTZ_BLOCK,exporter);
        oreberries(ModItems.LAPISBERRY, Items.LAPIS_BLOCK,exporter);
        oreberries(ModItems.EMERALDBERRY, Items.EMERALD_BLOCK,exporter);
        oreberries(ModItems.IRONBERRY, Items.IRON_BLOCK,exporter);
        oreberries(ModItems.GOLDBERRY, Items.GOLD_BLOCK,exporter);
        oreberries(ModItems.REDSTONEBERRY, Items.REDSTONE_BLOCK,exporter);


        candieditems(ModItems.CANDIED_APPLE, Items.APPLE,exporter);
        candieditems(ModItems.CANDIED_BEET, Items.BEETROOT,exporter);
        candieditems(ModItems.CANDIED_BLUEBER, ModItems.BLUEBERRY,exporter);
        candieditems(ModItems.CANDIED_CARROT, Items.CARROT,exporter);
        candieditems(ModItems.CANDIED_GLOWBER, Items.GLOW_BERRIES,exporter);
        candieditems(ModItems.CANDIED_MELON, Items.MELON_SLICE,exporter);
        candieditems(ModItems.CANDIED_PUMPKIN, Items.PUMPKIN,exporter);
        candieditems(ModItems.CANDIED_STRAWBER, ModItems.STRAWBERRY,exporter);
        candieditems(ModItems.CANDIED_SWEETBER, Items.SWEET_BERRIES,exporter);

        rockcandy(ModItems.ROCK_CANDY_APPLE, Items.APPLE,exporter);
        rockcandy(ModItems.ROCK_CANDY_BEET, Items.BEETROOT,exporter);
        rockcandy(ModItems.ROCK_CANDY_BLUEBER, ModItems.BLUEBERRY,exporter);
        rockcandy(ModItems.ROCK_CANDY_CARROT, Items.CARROT,exporter);
        rockcandy(ModItems.ROCK_CANDY_GLOWBER, Items.GLOW_BERRIES,exporter);
        rockcandy(ModItems.ROCK_CANDY_MELON, Items.MELON_SLICE,exporter);
        rockcandy(ModItems.ROCK_CANDY_PUMPKIN, Items.PUMPKIN,exporter);
        rockcandy(ModItems.ROCK_CANDY_STRAWBER, ModItems.STRAWBERRY,exporter);
        rockcandy(ModItems.ROCK_CANDY_SWEETBER, Items.SWEET_BERRIES,exporter);
    }


    private void cakesslice(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output,8)
                .input(itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter,Identifier.of(getRecipeName(output)));

    }

    private void jams(ItemConvertible output, ItemConvertible itemConvertible,RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output,1)
                .input(itemConvertible,2)
                .input(Items.GLASS_BOTTLE,1)
                .input(Items.SUGAR,2)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void toastjam(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output,1)
                .input(ModTags.Items.JAM)
                .input(itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void pickeljars(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output,1)
                .input(itemConvertible,2)
                .input(Items.GLASS_BOTTLE,1)
                .input(ModItems.SALT,2)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void wines(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output,1)
                .input(itemConvertible,4)
                .input(Items.GLASS_BOTTLE,1)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void doughnuts(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(itemConvertible,1)
                .input(ModItems.DOUGHTNUT,1)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void muffins(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(itemConvertible,2)
                .input(ModItems.MUFFIN,1)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void soups(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(itemConvertible,3)
                .input(Items.BOWL,1)
                .input(ModItems.PARSLEY,1)
                .input(ModItems.SALT,1)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void marshstick(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(itemConvertible,1)
                .input(Items.STICK,1)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void seedsconversion(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .input(itemConvertible,1)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void pies(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(itemConvertible,1)
                .input(Items.SUGAR,1)
                .input(Items.EGG,1)
                .input(ModItems.DOUGH,1)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void itemslices(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output,2)
                .input(itemConvertible,1)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void toastevar(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output,1)
                .input(ModItems.TOAST2)
                .input(itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void smoothies(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(itemConvertible,4)
                .input(Items.GLASS_BOTTLE)
                .input(Items.SUGAR,2)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void oreberries(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .pattern("WWW")
                .pattern("WXW")
                .pattern("WWW")
                .input('X',Items.SWEET_BERRIES)
                .input('W',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void candieditems(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .pattern(" W ")
                .pattern("WXW")
                .pattern("SW ")
                .input('W',Items.SUGAR)
                .input('S',Items.STICK)
                .input('X',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void rockcandy(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)

                .pattern("AXA")
                .pattern("SW ")
                .input('A',Items.SUGAR)
                .input('W',ModItems.MOLTENSUGAR)
                .input('S',Items.STICK)
                .input('X',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void oreberries2(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .pattern("WXW")
                .input('X',Items.SWEET_BERRIES)
                .input('W',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void cookies(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .pattern("WXW")
                .input('W',ModItems.DOUGH)
                .input('X',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

    private void stairs(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .pattern("X ")
                .pattern("XX")
                .input('X',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter,Identifier.of(getRecipeName(output)));

    }

    private void simplebowls(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .input(Items.BOWL)
                .input(ModItems.SALT)
                .input(ModItems.PEPPER)
                .input(itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter,Identifier.of(getRecipeName(output)));

    }

    private void cakes(ItemConvertible output, ItemConvertible itemConvertible, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, output)
                .pattern("XXX")
                .pattern("SES")
                .pattern("HHH")
                .input('X',Items.MILK_BUCKET)
                .input('S',Items.SUGAR)
                .input('E',Items.EGG)
                .input('H',itemConvertible)
                .criterion(FabricRecipeProvider.hasItem(itemConvertible), FabricRecipeProvider.conditionsFromItem(itemConvertible))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));

    }

}