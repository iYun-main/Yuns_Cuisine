package net.iyun.goldyheart.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.iyun.goldyheart.block.ModBlocks;
import net.iyun.goldyheart.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import java.util.List;
import java.util.function.Consumer;


public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> COOKINGONION = List.of(ModItems.RAWONIONRING);
    private static final List<ItemConvertible> BACON_COOKING = List.of(ModItems.RAWBACON);
    private static final List<ItemConvertible> TOAST = List.of(ModItems.TOAST);
    private static final List<ItemConvertible> RAWCHICKENLEG = List.of(ModItems.RAWCHICKENLEG);
    private static final List<ItemConvertible> BOILEDEGG = List.of(Items.EGG);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, COOKINGONION, RecipeCategory.FOOD, ModItems.FRIEDONIONRING, 0.3f, 120, "onionringcooked");
        offerSmelting(exporter, BACON_COOKING, RecipeCategory.FOOD, ModItems.COOKEDBACON, 1f, 120, "cooked_bacon");
        offerSmelting(exporter, TOAST, RecipeCategory.FOOD, ModItems.TOAST2, 1f, 150, "toasted_toast");
        offerSmelting(exporter, BOILEDEGG, RecipeCategory.FOOD, ModItems.BOILEDEGG, 1f, 200, "boiled_egg");
        offerSmelting(exporter, RAWCHICKENLEG, RecipeCategory.FOOD, ModItems.FRIEDCHICKEN, 1f, 120, "chickenleggy");


// Block Craftings
// shit was rewritten twice

// Blocks that cant rly be obtained via Wood so alternative

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModBlocks.FANCY_PLANK,2)
                .input(Blocks.OAK_PLANKS,1)
                .input(Items.STICK,1)
                .criterion(hasItem(Items.STICK), conditionsFromItem(ModBlocks.FANCY_PLANK))
                .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(ModBlocks.FANCY_PLANK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_PLANK)));

// Slab Recipes
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASS_SLAB, Ingredient.ofItems(Blocks.GRASS_BLOCK))
                .criterion(hasItem(Blocks.GRASS_BLOCK),conditionsFromItem(ModBlocks.GRASS_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.GRASS_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRT_SLAB, Ingredient.ofItems(Blocks.DIRT))
                .criterion(hasItem(Blocks.DIRT),conditionsFromItem(ModBlocks.DIRT_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DIRT_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROOTED_DIRT_SLAB, Ingredient.ofItems(Blocks.ROOTED_DIRT))
                .criterion(hasItem(Blocks.ROOTED_DIRT),conditionsFromItem(ModBlocks.ROOTED_DIRT_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ROOTED_DIRT_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COARSE_DIRT_SLAB, Ingredient.ofItems(Blocks.COARSE_DIRT))
                .criterion(hasItem(Blocks.COARSE_DIRT),conditionsFromItem(ModBlocks.COARSE_DIRT_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.COARSE_DIRT_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SOIL_SLAB, Ingredient.ofItems(Blocks.SOUL_SOIL))
                .criterion(hasItem(Blocks.SOUL_SOIL),conditionsFromItem(ModBlocks.SOUL_SOIL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SOUL_SOIL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_SAND_SLAB, Ingredient.ofItems(Blocks.SOUL_SAND))
                .criterion(hasItem(Blocks.SOUL_SAND),conditionsFromItem(ModBlocks.SOUL_SAND_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SOUL_SAND_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_ICE_SLAB, Ingredient.ofItems(Blocks.PACKED_ICE))
                .criterion(hasItem(Blocks.PACKED_ICE),conditionsFromItem(ModBlocks.PACKED_ICE_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.PACKED_ICE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SAND_SLAB, Ingredient.ofItems(Blocks.RED_SAND))
                .criterion(hasItem(Blocks.RED_SAND),conditionsFromItem(ModBlocks.RED_SAND_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.RED_SAND_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAND_SLAB, Ingredient.ofItems(Blocks.SAND))
                .criterion(hasItem(Blocks.SAND),conditionsFromItem(ModBlocks.SAND_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SAND_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAVEL_SLAB, Ingredient.ofItems(Blocks.GRAVEL))
                .criterion(hasItem(Blocks.GRAVEL),conditionsFromItem(ModBlocks.GRAVEL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.GRAVEL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Ingredient.ofItems(Blocks.SMOOTH_BASALT))
                .criterion(hasItem(Blocks.SMOOTH_BASALT),conditionsFromItem(ModBlocks.SMOOTH_BASALT_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SMOOTH_BASALT_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_SLAB, Ingredient.ofItems(Blocks.COPPER_BLOCK))
                .criterion(hasItem(Blocks.COPPER_BLOCK),conditionsFromItem(ModBlocks.COPPER_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.COPPER_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_COPPER_SLAB, Ingredient.ofItems(Blocks.EXPOSED_COPPER))
                .criterion(hasItem(Blocks.EXPOSED_COPPER),conditionsFromItem(ModBlocks.EXPOSED_COPPER_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.EXPOSED_COPPER_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_COPPER_SLAB, Ingredient.ofItems(Blocks.WEATHERED_COPPER))
                .criterion(hasItem(Blocks.WEATHERED_COPPER),conditionsFromItem(ModBlocks.WEATHERED_COPPER_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.WEATHERED_COPPER_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_COPPER_SLAB, Ingredient.ofItems(Blocks.OXIDIZED_COPPER))
                .criterion(hasItem(Blocks.OXIDIZED_COPPER),conditionsFromItem(ModBlocks.OXIDIZED_COPPER_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.OXIDIZED_COPPER_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_SLAB, Ingredient.ofItems(Blocks.WHITE_WOOL))
                .criterion(hasItem(Blocks.WHITE_WOOL),conditionsFromItem(ModBlocks.WHITE_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.WHITE_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_SLAB, Ingredient.ofItems(Blocks.RED_WOOL))
                .criterion(hasItem(Blocks.RED_WOOL),conditionsFromItem(ModBlocks.RED_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.RED_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_SLAB, Ingredient.ofItems(Blocks.BLACK_WOOL))
                .criterion(hasItem(Blocks.BLACK_WOOL),conditionsFromItem(ModBlocks.BLACK_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.BLACK_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_SLAB, Ingredient.ofItems(Blocks.BLUE_WOOL))
                .criterion(hasItem(Blocks.BLUE_WOOL),conditionsFromItem(ModBlocks.BLUE_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.BLUE_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_SLAB, Ingredient.ofItems(Blocks.CYAN_WOOL))
                .criterion(hasItem(Blocks.CYAN_WOOL),conditionsFromItem(ModBlocks.CYAN_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.CYAN_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_SLAB, Ingredient.ofItems(Blocks.YELLOW_WOOL))
                .criterion(hasItem(Blocks.MAGENTA_WOOL),conditionsFromItem(ModBlocks.YELLOW_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.YELLOW_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_SLAB, Ingredient.ofItems(Blocks.MAGENTA_WOOL))
                .criterion(hasItem(Blocks.MAGENTA_WOOL),conditionsFromItem(ModBlocks.MAGENTA_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.MAGENTA_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_SLAB, Ingredient.ofItems(Blocks.GRAY_WOOL))
                .criterion(hasItem(Blocks.GRAY_WOOL),conditionsFromItem(ModBlocks.GRAY_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.GRAY_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_SLAB, Ingredient.ofItems(Blocks.GREEN_WOOL))
                .criterion(hasItem(Blocks.GREEN_WOOL),conditionsFromItem(ModBlocks.GREEN_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.GREEN_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_SLAB, Ingredient.ofItems(Blocks.BROWN_WOOL))
                .criterion(hasItem(Blocks.BROWN_WOOL),conditionsFromItem(ModBlocks.BROWN_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.BROWN_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_SLAB, Ingredient.ofItems(Blocks.ORANGE_WOOL))
                .criterion(hasItem(Blocks.ORANGE_WOOL),conditionsFromItem(ModBlocks.ORANGE_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ORANGE_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_SLAB, Ingredient.ofItems(Blocks.LIME_WOOL))
                .criterion(hasItem(Blocks.LIME_WOOL),conditionsFromItem(ModBlocks.LIME_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.LIME_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_SLAB, Ingredient.ofItems(Blocks.PURPLE_WOOL))
                .criterion(hasItem(Blocks.PURPLE_WOOL),conditionsFromItem(ModBlocks.PURPLE_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.PURPLE_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_SLAB, Ingredient.ofItems(Blocks.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Blocks.LIGHT_BLUE_WOOL),conditionsFromItem(ModBlocks.LIGHT_BLUE_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_SLAB, Ingredient.ofItems(Blocks.LIGHT_GRAY_WOOL))
                .criterion(hasItem(Blocks.LIGHT_GRAY_WOOL),conditionsFromItem(ModBlocks.LIGHT_GRAY_WOOL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_WOOL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSS_SLAB, Ingredient.ofItems(Blocks.MOSS_BLOCK))
                .criterion(hasItem(Blocks.MOSS_BLOCK),conditionsFromItem(ModBlocks.MOSS_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.MOSS_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_BUBBLE_CORAL_SLAB, Ingredient.ofItems(Blocks.DEAD_BUBBLE_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_BUBBLE_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_BUBBLE_CORAL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DEAD_BUBBLE_CORAL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_FIRE_CORAL_SLAB, Ingredient.ofItems(Blocks.DEAD_FIRE_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_FIRE_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_FIRE_CORAL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DEAD_FIRE_CORAL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_HORN_CORAL_SLAB, Ingredient.ofItems(Blocks.DEAD_HORN_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_HORN_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_HORN_CORAL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DEAD_HORN_CORAL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_BRAIN_CORAL_SLAB, Ingredient.ofItems(Blocks.DEAD_BRAIN_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_BRAIN_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_BRAIN_CORAL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DEAD_BRAIN_CORAL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_TUBE_CORAL_SLAB, Ingredient.ofItems(Blocks.DEAD_TUBE_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_TUBE_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_TUBE_CORAL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DEAD_TUBE_CORAL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, Ingredient.ofItems(Blocks.IRON_BLOCK))
                .criterion(hasItem(Blocks.IRON_BLOCK),conditionsFromItem(ModBlocks.IRON_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.IRON_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, Ingredient.ofItems(Blocks.GOLD_BLOCK))
                .criterion(hasItem(Blocks.GOLD_BLOCK),conditionsFromItem(ModBlocks.GOLD_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.GOLD_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB, Ingredient.ofItems(Blocks.AMETHYST_BLOCK))
                .criterion(hasItem(Blocks.AMETHYST_BLOCK),conditionsFromItem(ModBlocks.AMETHYST_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.AMETHYST_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Ingredient.ofItems(Blocks.CALCITE))
                .criterion(hasItem(Blocks.CALCITE),conditionsFromItem(ModBlocks.CALCITE_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.CALCITE_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_SLAB, Ingredient.ofItems(Blocks.TUFF))
                .criterion(hasItem(Blocks.TUFF),conditionsFromItem(ModBlocks.TUFF_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.TUFF_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_SLAB, Ingredient.ofItems(ModBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(ModBlocks.ANCIENT_PLANKS),conditionsFromItem(ModBlocks.ANCIENT_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ANCIENT_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_SLAB, Ingredient.ofItems(ModBlocks.OLD_PLANKS))
                .criterion(hasItem(ModBlocks.OLD_PLANKS),conditionsFromItem(ModBlocks.OLD_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.OLD_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIRAL_SLAB, Ingredient.ofItems(ModBlocks.SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.SPIRAL_PLANKS),conditionsFromItem(ModBlocks.SPIRAL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SPIRAL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SPIRAL_SLAB, Ingredient.ofItems(ModBlocks.DARK_SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_PLANKS),conditionsFromItem(ModBlocks.DARK_SPIRAL_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_WOOD_SLAB, Ingredient.ofItems(ModBlocks.ANCIENT_WOOD))
                .criterion(hasItem(ModBlocks.ANCIENT_WOOD),conditionsFromItem(ModBlocks.ANCIENT_WOOD_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ANCIENT_WOOD_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_WOOD_SLAB_S, Ingredient.ofItems(ModBlocks.STRIPPED_ANCIENT_WOOD))
                .criterion(hasItem(ModBlocks.STRIPPED_ANCIENT_WOOD),conditionsFromItem(ModBlocks.ANCIENT_WOOD_SLAB_S))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ANCIENT_WOOD_SLAB_S)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIRAL_WOOD_SLAB, Ingredient.ofItems(ModBlocks.SPIRAL_WOOD))
                .criterion(hasItem(ModBlocks.SPIRAL_WOOD),conditionsFromItem(ModBlocks.SPIRAL_WOOD_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SPIRAL_WOOD_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIRAL_WOOD_SLAB_S, Ingredient.ofItems(ModBlocks.STRIPPED_SPIRAL_WOOD))
                .criterion(hasItem(ModBlocks.STRIPPED_SPIRAL_WOOD),conditionsFromItem(ModBlocks.SPIRAL_WOOD_SLAB_S))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SPIRAL_WOOD_SLAB_S)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SPIRAL_WOOD_SLAB, Ingredient.ofItems(ModBlocks.DARK_SPIRAL_WOOD))
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_WOOD),conditionsFromItem(ModBlocks.DARK_SPIRAL_WOOD_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_WOOD_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SPIRAL_WOOD_SLAB_S, Ingredient.ofItems(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD))
                .criterion(hasItem(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD),conditionsFromItem(ModBlocks.DARK_SPIRAL_WOOD_SLAB_S))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_WOOD_SLAB_S)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_WOOD_SLAB, Ingredient.ofItems(ModBlocks.OLD_WOOD))
                .criterion(hasItem(ModBlocks.OLD_WOOD),conditionsFromItem(ModBlocks.OLD_WOOD_SLAB))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.OLD_WOOD_SLAB)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_WOOD_SLAB_S, Ingredient.ofItems(ModBlocks.STRIPPED_OLD_WOOD))
                .criterion(hasItem(ModBlocks.STRIPPED_OLD_WOOD),conditionsFromItem(ModBlocks.OLD_WOOD_SLAB_S))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.OLD_WOOD_SLAB_S)));

//Stair Recipe
        createStairsRecipe(ModBlocks.SMOOTH_BASALT_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_BASALT))
                .criterion(hasItem(Blocks.SMOOTH_BASALT),conditionsFromItem(ModBlocks.SMOOTH_BASALT_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SMOOTH_BASALT_STAIRS)));

        createStairsRecipe(ModBlocks.COPPER_STAIRS, Ingredient.ofItems(Blocks.COPPER_BLOCK))
                .criterion(hasItem(Blocks.COPPER_BLOCK),conditionsFromItem(ModBlocks.COPPER_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COPPER_STAIRS)));

        createStairsRecipe(ModBlocks.EXPOSED_COPPER_STAIRS, Ingredient.ofItems(Blocks.EXPOSED_COPPER))
                .criterion(hasItem(Blocks.EXPOSED_COPPER),conditionsFromItem(ModBlocks.EXPOSED_COPPER_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EXPOSED_COPPER_STAIRS)));

        createStairsRecipe(ModBlocks.WEATHERED_COPPER_STAIRS, Ingredient.ofItems(Blocks.WEATHERED_COPPER))
                .criterion(hasItem(Blocks.WEATHERED_COPPER),conditionsFromItem(ModBlocks.WEATHERED_COPPER_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WEATHERED_COPPER_STAIRS)));

        createStairsRecipe(ModBlocks.OXIDIZED_COPPER_STAIRS, Ingredient.ofItems(Blocks.OXIDIZED_COPPER))
                .criterion(hasItem(Blocks.OXIDIZED_COPPER),conditionsFromItem(ModBlocks.OXIDIZED_COPPER_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OXIDIZED_COPPER_STAIRS)));

        createStairsRecipe(ModBlocks.SAND_STAIR, Ingredient.ofItems(Blocks.SAND))
                .criterion(hasItem(Blocks.SAND),conditionsFromItem(ModBlocks.SAND_STAIR))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAND_STAIR)));

        createStairsRecipe(ModBlocks.RED_SAND_STAIR, Ingredient.ofItems(Blocks.RED_SAND))
                .criterion(hasItem(Blocks.RED_SAND),conditionsFromItem(ModBlocks.RED_SAND_STAIR))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_SAND_STAIR)));

        createStairsRecipe(ModBlocks.TUFF_STAIRS, Ingredient.ofItems(Blocks.TUFF))
                .criterion(hasItem(Blocks.TUFF),conditionsFromItem(ModBlocks.TUFF_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TUFF_STAIRS)));

        createStairsRecipe(ModBlocks.AMETHYST_STAIRS, Ingredient.ofItems(Blocks.AMETHYST_BLOCK))
                .criterion(hasItem(Blocks.AMETHYST_BLOCK),conditionsFromItem(ModBlocks.AMETHYST_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AMETHYST_STAIRS)));

        createStairsRecipe(ModBlocks.GOLD_STAIRS, Ingredient.ofItems(Blocks.GOLD_BLOCK))
                .criterion(hasItem(Blocks.GOLD_BLOCK),conditionsFromItem(ModBlocks.GOLD_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GOLD_STAIRS)));

        createStairsRecipe(ModBlocks.IRON_STAIRS, Ingredient.ofItems(Blocks.IRON_BLOCK))
                .criterion(hasItem(Blocks.IRON_BLOCK),conditionsFromItem(ModBlocks.IRON_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IRON_STAIRS)));

        createStairsRecipe(ModBlocks.DEAD_BRAIN_CORAL_STAIRS, Ingredient.ofItems(Blocks.DEAD_BRAIN_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_BRAIN_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_BRAIN_CORAL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEAD_BRAIN_CORAL_STAIRS)));

        createStairsRecipe(ModBlocks.DEAD_FIRE_CORAL_STAIRS, Ingredient.ofItems(Blocks.DEAD_FIRE_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_FIRE_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_FIRE_CORAL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEAD_FIRE_CORAL_STAIRS)));

        createStairsRecipe(ModBlocks.DEAD_BUBBLE_CORAL_STAIRS, Ingredient.ofItems(Blocks.DEAD_BUBBLE_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_BUBBLE_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_BUBBLE_CORAL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEAD_BUBBLE_CORAL_STAIRS)));

        createStairsRecipe(ModBlocks.DEAD_TUBE_CORAL_STAIRS, Ingredient.ofItems(Blocks.DEAD_TUBE_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_TUBE_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_TUBE_CORAL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEAD_TUBE_CORAL_STAIRS)));

        createStairsRecipe(ModBlocks.DEAD_HORN_CORAL_STAIRS, Ingredient.ofItems(Blocks.DEAD_HORN_CORAL_BLOCK))
                .criterion(hasItem(Blocks.DEAD_HORN_CORAL_BLOCK),conditionsFromItem(ModBlocks.DEAD_HORN_CORAL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEAD_HORN_CORAL_STAIRS)));

        createStairsRecipe(ModBlocks.CALCITE_STAIRS, Ingredient.ofItems(Blocks.CALCITE))
                .criterion(hasItem(Blocks.CALCITE),conditionsFromItem(ModBlocks.CALCITE_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CALCITE_STAIRS)));

        createStairsRecipe(ModBlocks.ANCIENT_STAIRS, Ingredient.ofItems(ModBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(ModBlocks.ANCIENT_PLANKS),conditionsFromItem(ModBlocks.ANCIENT_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_STAIRS)));

        createStairsRecipe(ModBlocks.OLD_STAIRS, Ingredient.ofItems(ModBlocks.OLD_PLANKS))
                .criterion(hasItem(ModBlocks.OLD_PLANKS),conditionsFromItem(ModBlocks.OLD_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OLD_STAIRS)));

        createStairsRecipe(ModBlocks.SPIRAL_STAIRS, Ingredient.ofItems(ModBlocks.SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.SPIRAL_PLANKS),conditionsFromItem(ModBlocks.SPIRAL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPIRAL_STAIRS)));

        createStairsRecipe(ModBlocks.DARK_SPIRAL_STAIRS, Ingredient.ofItems(ModBlocks.DARK_SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_PLANKS),conditionsFromItem(ModBlocks.DARK_SPIRAL_STAIRS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_STAIRS)));

//Fence Recipe
        createFenceRecipe(ModBlocks.ANCIENT_FENCE, Ingredient.ofItems(ModBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(ModBlocks.ANCIENT_PLANKS),conditionsFromItem(ModBlocks.ANCIENT_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_FENCE)));

        createFenceRecipe(ModBlocks.FANCY_FENCE, Ingredient.ofItems(ModBlocks.FANCY_PLANK))
                .criterion(hasItem(ModBlocks.FANCY_PLANK),conditionsFromItem(ModBlocks.FANCY_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_FENCE)));

        createFenceRecipe(ModBlocks.OLD_FENCE, Ingredient.ofItems(ModBlocks.OLD_PLANKS))
                .criterion(hasItem(ModBlocks.OLD_PLANKS),conditionsFromItem(ModBlocks.OLD_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OLD_FENCE)));

        createFenceRecipe(ModBlocks.SPIRAL_FENCE, Ingredient.ofItems(ModBlocks.SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.SPIRAL_PLANKS),conditionsFromItem(ModBlocks.SPIRAL_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPIRAL_FENCE)));

        createFenceRecipe(ModBlocks.DARK_SPIRAL_FENCE, Ingredient.ofItems(ModBlocks.DARK_SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_PLANKS),conditionsFromItem(ModBlocks.DARK_SPIRAL_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_FENCE)));

// All wood side recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_WOOD,4)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModBlocks.ANCIENT_LOG)
                .criterion(hasItem(ModBlocks.ANCIENT_LOG), conditionsFromItem(ModBlocks.ANCIENT_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_WOOD,4)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModBlocks.OLD_LOG)
                .criterion(hasItem(ModBlocks.OLD_LOG), conditionsFromItem(ModBlocks.OLD_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OLD_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIRAL_WOOD,4)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModBlocks.SPIRAL_LOG)
                .criterion(hasItem(ModBlocks.SPIRAL_LOG), conditionsFromItem(ModBlocks.SPIRAL_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPIRAL_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SPIRAL_WOOD,4)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModBlocks.DARK_SPIRAL_LOG)
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_LOG), conditionsFromItem(ModBlocks.DARK_SPIRAL_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ANCIENT_WOOD,4)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModBlocks.STRIPPED_ANCIENT_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_ANCIENT_LOG), conditionsFromItem(ModBlocks.STRIPPED_ANCIENT_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_ANCIENT_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_OLD_WOOD,4)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModBlocks.STRIPPED_OLD_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_OLD_LOG), conditionsFromItem(ModBlocks.STRIPPED_OLD_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_OLD_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SPIRAL_WOOD,4)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModBlocks.STRIPPED_SPIRAL_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_SPIRAL_LOG), conditionsFromItem(ModBlocks.STRIPPED_SPIRAL_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_SPIRAL_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARK_SPIRAL_WOOD,4)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModBlocks.STRIPPED_DARK_SPIRAL_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_DARK_SPIRAL_LOG), conditionsFromItem(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD)));

// Fence Gate Recipe

        createFenceGateRecipe(ModBlocks.ANCIENT_FENCE_GATE, Ingredient.ofItems(ModBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(ModBlocks.ANCIENT_FENCE_GATE),conditionsFromItem(ModBlocks.ANCIENT_FENCE_GATE))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ANCIENT_FENCE_GATE)));

        createFenceGateRecipe(ModBlocks.OLD_FENCE_GATE, Ingredient.ofItems(ModBlocks.OLD_PLANKS))
                .criterion(hasItem(ModBlocks.OLD_FENCE_GATE),conditionsFromItem(ModBlocks.OLD_FENCE_GATE))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.OLD_FENCE_GATE)));

        createFenceGateRecipe(ModBlocks.SPIRAL_FENCE_GATE, Ingredient.ofItems(ModBlocks.SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.SPIRAL_FENCE_GATE),conditionsFromItem(ModBlocks.SPIRAL_FENCE_GATE))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SPIRAL_FENCE_GATE)));

        createFenceGateRecipe(ModBlocks.DARK_SPIRAL_FENCE_GATE, Ingredient.ofItems(ModBlocks.DARK_SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_PLANKS),conditionsFromItem(ModBlocks.DARK_SPIRAL_FENCE_GATE))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_FENCE_GATE)));

        createFenceGateRecipe(ModBlocks.FANCY_FENCE_GATE, Ingredient.ofItems(ModBlocks.FANCY_PLANK))
                .criterion(hasItem(ModBlocks.FANCY_PLANK),conditionsFromItem(ModBlocks.FANCY_FENCE_GATE))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.FANCY_FENCE_GATE)));

// Door Recipes
        createDoorRecipe(ModBlocks.ANCIENT_DOOR,Ingredient.ofItems(ModBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(ModBlocks.ANCIENT_PLANKS),conditionsFromItem(ModBlocks.ANCIENT_DOOR))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ANCIENT_PLANKS)));

        createDoorRecipe(ModBlocks.OLD_DOOR,Ingredient.ofItems(ModBlocks.OLD_PLANKS))
                .criterion(hasItem(ModBlocks.OLD_PLANKS),conditionsFromItem(ModBlocks.OLD_DOOR))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.OLD_PLANKS)));

        createDoorRecipe(ModBlocks.SPIRAL_DOOR,Ingredient.ofItems(ModBlocks.SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.SPIRAL_DOOR),conditionsFromItem(ModBlocks.SPIRAL_DOOR))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.SPIRAL_PLANKS)));

        createDoorRecipe(ModBlocks.SPIRAL_DOOR,Ingredient.ofItems(ModBlocks.DARK_SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_DOOR),conditionsFromItem(ModBlocks.DARK_SPIRAL_DOOR))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_PLANKS)));
//Trap Door Recipe
        createTrapdoorRecipe(ModBlocks.ANCIENT_TRAPDOOR,Ingredient.ofItems(ModBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(ModBlocks.ANCIENT_TRAPDOOR), conditionsFromItem(ModBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_TRAPDOOR)));

        createTrapdoorRecipe(ModBlocks.OLD_TRAPDOOR,Ingredient.ofItems(ModBlocks.OLD_PLANKS))
                .criterion(hasItem(ModBlocks.OLD_TRAPDOOR), conditionsFromItem(ModBlocks.OLD_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OLD_TRAPDOOR)));

        createTrapdoorRecipe(ModBlocks.SPIRAL_TRAPDOOR,Ingredient.ofItems(ModBlocks.SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.SPIRAL_TRAPDOOR), conditionsFromItem(ModBlocks.SPIRAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPIRAL_TRAPDOOR)));

        createTrapdoorRecipe(ModBlocks.DARK_SPIRAL_TRAPDOOR,Ingredient.ofItems(ModBlocks.DARK_SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_TRAPDOOR), conditionsFromItem(ModBlocks.DARK_SPIRAL_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_TRAPDOOR)));

// Wall Recipe

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_WOOD_WALL, ModBlocks.ANCIENT_WOOD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_WOOD_WALL_S, ModBlocks.STRIPPED_ANCIENT_WOOD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_WOOD_WALL, ModBlocks.OLD_WOOD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_WOOD_WALL_S, ModBlocks.STRIPPED_OLD_WOOD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIRAL_WOOD_WALL, ModBlocks.SPIRAL_WOOD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIRAL_WOOD_WALL_S, ModBlocks.STRIPPED_SPIRAL_WOOD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SPIRAL_WOOD_WALL, ModBlocks.DARK_SPIRAL_WOOD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SPIRAL_WOOD_WALL_S, ModBlocks.STRIPPED_DARK_SPIRAL_WOOD);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_WALL, ModBlocks.FANCY_PLANK);

// Pressure Plate Recipe

        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_PRESSUREPLATE,Ingredient.ofItems(ModBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(ModBlocks.ANCIENT_PLANKS),conditionsFromItem(ModBlocks.ANCIENT_PRESSUREPLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_PRESSUREPLATE)));

        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_PRESSUREPLATE,Ingredient.ofItems(ModBlocks.OLD_PLANKS))
                .criterion(hasItem(ModBlocks.OLD_PLANKS),conditionsFromItem(ModBlocks.OLD_PRESSUREPLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OLD_PRESSUREPLATE)));

        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIRAL_PRESSUREPLATE,Ingredient.ofItems(ModBlocks.SPIRAL_PRESSUREPLATE))
                .criterion(hasItem(ModBlocks.SPIRAL_PLANKS),conditionsFromItem(ModBlocks.SPIRAL_PRESSUREPLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPIRAL_PRESSUREPLATE)));

        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SPIRAL_PRESSUREPLATE,Ingredient.ofItems(ModBlocks.DARK_SPIRAL_PLANKS))
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_PLANKS),conditionsFromItem(ModBlocks.DARK_SPIRAL_PRESSUREPLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_PRESSUREPLATE)));

        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_PRESSUREPLATE,Ingredient.ofItems(ModBlocks.FANCY_PLANK))
                .criterion(hasItem(ModBlocks.FANCY_PLANK),conditionsFromItem(ModBlocks.FANCY_PRESSUREPLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_PRESSUREPLATE)));


// Button Recipe (currently looking for the simpler version)

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_BUTTON, 1)
                .input(ModBlocks.ANCIENT_PLANKS,1)
                .criterion(hasItem(ModBlocks.ANCIENT_PLANKS), conditionsFromItem(ModBlocks.ANCIENT_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANCIENT_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_BUTTON, 1)
                .input(ModBlocks.OLD_PLANKS,1)
                .criterion(hasItem(ModBlocks.OLD_PLANKS), conditionsFromItem(ModBlocks.OLD_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OLD_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPIRAL_BUTTON, 1)
                .input(ModBlocks.SPIRAL_PLANKS,1)
                .criterion(hasItem(ModBlocks.SPIRAL_PLANKS), conditionsFromItem(ModBlocks.SPIRAL_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPIRAL_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_SPIRAL_BUTTON, 1)
                .input(ModBlocks.DARK_SPIRAL_PLANKS,1)
                .criterion(hasItem(ModBlocks.DARK_SPIRAL_PLANKS), conditionsFromItem(ModBlocks.DARK_SPIRAL_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_SPIRAL_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FANCY_BUTTON, 1)
                .input(ModBlocks.FANCY_PLANK,1)
                .criterion(hasItem(ModBlocks.FANCY_PLANK), conditionsFromItem(ModBlocks.FANCY_BUTTON))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FANCY_BUTTON)));

//Food Crafting
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MARSHMELLOWSTICK, 1)
                .input(ModItems.MARSHMELLOW,1)
                .input(Items.STICK,1)
                .criterion(hasItem(Items.STICK), conditionsFromItem(ModItems.MARSHMELLOWSTICK))
                .criterion(hasItem(ModItems.MARSHMELLOW), conditionsFromItem(ModItems.MARSHMELLOWSTICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MARSHMELLOWSTICK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK, 1)
                .input(ModItems.SLIGHTLYCOOKEDMARSHMELLOW,1)
                .input(Items.STICK,1)
                .criterion(hasItem(Items.STICK), conditionsFromItem(ModItems.SLIGHTLYCOOKEDMARSHMELLOW))
                .criterion(hasItem(ModItems.SLIGHTLYCOOKEDMARSHMELLOW), conditionsFromItem(ModItems.SLIGHTLYCOOKEDMARSHMELLOW))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COOKEDMARSHMELLOWSTICK, 1)
                .input(ModItems.COOKEDMARSHMELLOW,1)
                .input(Items.STICK,1)
                .criterion(hasItem(Items.STICK), conditionsFromItem(ModItems.COOKEDMARSHMELLOWSTICK))
                .criterion(hasItem(ModItems.COOKEDMARSHMELLOW), conditionsFromItem(ModItems.COOKEDMARSHMELLOWSTICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COOKEDMARSHMELLOWSTICK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BURNTMARSHMELLOWSTICK, 1)
                .input(ModItems.BURNTMARSHMELLOW,1)
                .input(Items.STICK,1)
                .criterion(hasItem(Items.STICK), conditionsFromItem(ModItems.BURNTMARSHMELLOW))
                .criterion(hasItem(ModItems.BURNTMARSHMELLOW), conditionsFromItem(ModItems.BURNTMARSHMELLOW))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BURNTMARSHMELLOWSTICK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CUTBREAD,2)
                .input(Items.BREAD,1)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(ModItems.CUTBREAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUTBREAD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CUTTOMATO,2)
                .input(ModItems.TOMATO,1)
                .criterion(hasItem(ModItems.TOMATO), conditionsFromItem(ModItems.CUTTOMATO))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUTTOMATO)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TRUFFLE,2)
                .input(Items.BROWN_MUSHROOM,1)
                .criterion(hasItem(Items.BROWN_MUSHROOM), conditionsFromItem(ModItems.TRUFFLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TRUFFLE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MELTEDBUTTER,1)
                .input(Items.BUCKET,1)
                .input(ModItems.BUTTER,1)
                .criterion(hasItem(Items.BUCKET), conditionsFromItem(ModItems.MELTEDBUTTER))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.MELTEDBUTTER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MELTEDBUTTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CANDIEDSPIDEREYE,2)
                .pattern("TTT")
                .pattern("GGG")
                .pattern("TTT")
                .input('T', Items.SPIDER_EYE)
                .input('G', Items.SUGAR)
                .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(ModItems.CANDIEDSPIDEREYE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CANDIEDSPIDEREYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CANDIEDSPIDEREYE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SPIDEREYESOUP,1)
                .input(Items.BOWL)
                .input(Items.SPIDER_EYE,5)
                .criterion(hasItem(Items.SPIDER_EYE), conditionsFromItem(Items.BOWL))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SPIDEREYESOUP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.EGGONBREAD,1)
                .input(ModItems.FRIEDEGG,1)
                .input(Items.BREAD,1)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(ModItems.FRIEDEGG))
                .criterion(hasItem(ModItems.FRIEDEGG), conditionsFromItem(ModItems.FRIEDEGG))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EGGONBREAD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GARLICBREAD,1)
                .input(ModItems.GARLIC,1)
                .input(ModItems.PARSLEY,1)
                .input(ModItems.CUTBREAD,1)
                .criterion(hasItem(ModItems.CUTBREAD), conditionsFromItem(ModItems.GARLICBREAD))
                .criterion(hasItem(ModItems.GARLIC), conditionsFromItem(ModItems.GARLICBREAD))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.GARLICBREAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GARLICBREAD)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CABBAGEMEATROLL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.NIGIRISUSHI,2)
                .input(Items.COOKED_SALMON,1)
                .input(ModItems.RICE,1)
                .input(ModItems.SALT,1)
                .input(Items.DRIED_KELP,1)
                .criterion(hasItem(Items.DRIED_KELP), conditionsFromItem(ModItems.NIGIRISUSHI))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.NIGIRISUSHI))
                .criterion(hasItem(ModItems.RICE), conditionsFromItem(ModItems.NIGIRISUSHI))
                .criterion(hasItem(Items.COOKED_SALMON), conditionsFromItem(ModItems.NIGIRISUSHI))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NIGIRISUSHI)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.VEGGIEMAKI)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PANCAKES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DUMPLING,3)
                .input(Items.COOKED_BEEF,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.LETTUCELEAF,1)
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(ModItems.DUMPLING))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.DUMPLING))
                .criterion(hasItem(ModItems.LETTUCELEAF), conditionsFromItem(ModItems.DUMPLING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DUMPLING)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.HOTCHOCOLATE,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.SUGAR,1)
                .input(Items.COCOA_BEANS,1)
                .input(ModItems.MARSHMELLOW,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.HOTCHOCOLATE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.HOTCHOCOLATE))
                .criterion(hasItem(ModItems.MARSHMELLOW), conditionsFromItem(ModItems.HOTCHOCOLATE))
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(ModItems.HOTCHOCOLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOTCHOCOLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COFFEE,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.SUGAR,1)
                .input(ModItems.COFFEEBEAN,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.COFFEE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.COFFEE))
                .criterion(hasItem(ModItems.COFFEEBEAN), conditionsFromItem(ModItems.COFFEE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COFFEE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PUMPKINSOUP,1)
                .input(Items.PUMPKIN,1)
                .input(Items.BOWL,1)
                .input(Items.WATER_BUCKET,1)
                .input(ModItems.SALT,1)
                .input(ModItems.PARSLEY,1)
                .input(Items.SUGAR,1)
                .criterion(hasItem(Items.PUMPKIN), conditionsFromItem(ModItems.PUMPKINSOUP))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.PUMPKINSOUP))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(ModItems.PUMPKINSOUP))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.PUMPKINSOUP))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.PUMPKINSOUP))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.PUMPKINSOUP))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PUMPKINSOUP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SWEETBERRYSMOOTHIE,1)
                .input(Items.GLASS_BOTTLE,1)
                .input(Items.SWEET_BERRIES,1)
                .input(Items.SUGAR,1)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.SWEETBERRYSMOOTHIE))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(ModItems.SWEETBERRYSMOOTHIE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.SWEETBERRYSMOOTHIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SWEETBERRYSMOOTHIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GLOWBERRYSMOOTHIE,1)
                .input(Items.GLASS_BOTTLE,1)
                .input(Items.GLOW_BERRIES,1)
                .input(Items.SUGAR,1)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.GLOWBERRYSMOOTHIE))
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(ModItems.GLOWBERRYSMOOTHIE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.GLOWBERRYSMOOTHIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GLOWBERRYSMOOTHIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PUMPKINSMOOTHIE,1)
                .input(Items.GLASS_BOTTLE,1)
                .input(Items.PUMPKIN,1)
                .input(Items.SUGAR,1)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.PUMPKINSMOOTHIE))
                .criterion(hasItem(Items.PUMPKIN), conditionsFromItem(ModItems.PUMPKINSMOOTHIE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.PUMPKINSMOOTHIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PUMPKINSMOOTHIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.WATERMELONSMOOTHIE,1)
                .input(Items.GLASS_BOTTLE,1)
                .input(Items.MELON_SLICE,1)
                .input(Items.SUGAR,1)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.WATERMELONSMOOTHIE))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(ModItems.WATERMELONSMOOTHIE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.WATERMELONSMOOTHIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WATERMELONSMOOTHIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CARROTSMOOTHIE,1)
                .input(Items.GLASS_BOTTLE,1)
                .input(Items.CARROT,1)
                .input(Items.SUGAR,1)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.CARROTSMOOTHIE))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(ModItems.CARROTSMOOTHIE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CARROTSMOOTHIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CARROTSMOOTHIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.APPLESMOOTHIE,1)
                .input(Items.GLASS_BOTTLE,1)
                .input(Items.SUGAR,1)
                .input(Items.APPLE,1)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.APPLESMOOTHIE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.APPLESMOOTHIE))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(ModItems.APPLESMOOTHIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.APPLESMOOTHIE)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STUFFEDMUSHROOM)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STUFFEDBELLPEPPER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.STEAKANDPOTATO,1)
                .input(Items.COOKED_BEEF,1)
                .input(ModItems.PARSLEY,1)
                .input(Items.BOWL,1)
                .input(Items.BAKED_POTATO,1)
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(ModItems.STEAKANDPOTATO))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.STEAKANDPOTATO))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.STEAKANDPOTATO))
                .criterion(hasItem(Items.BAKED_POTATO), conditionsFromItem(ModItems.STEAKANDPOTATO))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEAKANDPOTATO)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOMATOSOUP,1)
                .input(ModItems.CUTTOMATO,2)
                .input(ModItems.PARSLEY,1)
                .input(Items.BOWL,1)
                .input(ModItems.SALT,1)
                .criterion(hasItem(ModItems.CUTTOMATO), conditionsFromItem(ModItems.TOMATOSOUP))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.TOMATOSOUP))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.TOMATOSOUP))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.TOMATOSOUP))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOMATOSOUP)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PIZZA)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RAWONIONRING,4)
                .input(ModItems.ONIONSLICE,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MELTEDBUTTER,1)
                .criterion(hasItem(ModItems.ONIONSLICE),conditionsFromItem(ModItems.RAWONIONRING))
                .criterion(hasItem(ModItems.DOUGH),conditionsFromItem(ModItems.RAWONIONRING))
                .criterion(hasItem(ModItems.MELTEDBUTTER),conditionsFromItem(ModItems.RAWONIONRING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAWONIONRING)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ONIONSLICE,2)
                .input(ModItems.ONION,1)
                .criterion(hasItem(ModItems.ONION),conditionsFromItem(ModItems.ONIONSLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ONIONSLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PIZZASLICE,4)
                .input(ModItems.PIZZA,1)
                .criterion(hasItem(ModItems.PIZZA),conditionsFromItem(ModItems.PIZZASLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PIZZASLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHEESEPIE,1)
                .input(ModItems.CHEESE,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.SALT,1)
                .input(ModItems.MELTEDBUTTER,1)
                .criterion(hasItem(ModItems.CHEESE),conditionsFromItem(ModItems.CHEESEPIE))
                .criterion(hasItem(ModItems.DOUGH),conditionsFromItem(ModItems.CHEESEPIE))
                .criterion(hasItem(ModItems.SALT),conditionsFromItem(ModItems.CHEESEPIE))
                .criterion(hasItem(ModItems.MELTEDBUTTER),conditionsFromItem(ModItems.CHEESEPIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHEESEPIE)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NOODLES)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.APPLEPIE,1)
                .input(Items.APPLE,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MELTEDBUTTER,1)
                .input(Items.SUGAR,1)
                .input(Items.EGG,1)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(ModItems.APPLEPIE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.APPLEPIE))
                .criterion(hasItem(ModItems.MELTEDBUTTER), conditionsFromItem(ModItems.APPLEPIE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.APPLEPIE))
                .criterion(hasItem(Items.EGG), conditionsFromItem(ModItems.APPLEPIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.APPLEPIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHOCOLATEPIE,1)
                .input(Items.COCOA_BEANS,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MELTEDBUTTER,1)
                .input(Items.SUGAR,1)
                .input(Items.EGG,1)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(ModItems.CHOCOLATEPIE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CHOCOLATEPIE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.CHOCOLATEPIE))
                .criterion(hasItem(ModItems.MELTEDBUTTER), conditionsFromItem(ModItems.CHOCOLATEPIE))
                .criterion(hasItem(Items.EGG), conditionsFromItem(ModItems.CHOCOLATEPIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHOCOLATEPIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SALAD,1)
                .input(ModItems.CUCUMBERSLICE,1)
                .input(ModItems.CUTTOMATO,1)
                .input(ModItems.BELLPEPPERSLICE,1)
                .input(ModItems.LETTUCELEAF,1)
                .input(Items.BOWL,1)
                .input(Items.BEETROOT,1)
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(ModItems.LETTUCELEAF), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(ModItems.CUTTOMATO), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(ModItems.CUCUMBERSLICE), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(ModItems.BELLPEPPERSLICE), conditionsFromItem(ModItems.SALAD))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.SALAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALAD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CARROTCAKE,1)
                .input(Items.CARROT,5)
                .input(ModItems.DOUGH,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.CAKE,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.CARROTCAKE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.CARROTCAKE))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(ModItems.CARROTCAKE))
                .criterion(hasItem(Items.CAKE), conditionsFromItem(ModItems.CARROTCAKE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CARROTCAKE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MELONSCAKE,1)
                .input(Items.MELON_SLICE,5)
                .input(ModItems.DOUGH,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.CAKE,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.MELONSCAKE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.MELONSCAKE))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(ModItems.MELONSCAKE))
                .criterion(hasItem(Items.CAKE), conditionsFromItem(ModItems.MELONSCAKE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MELONSCAKE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHORUSCAKE,1)
                .input(Items.CHORUS_FRUIT,5)
                .input(ModItems.DOUGH,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.CAKE,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.CHORUSCAKE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.CHORUSCAKE))
                .criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(ModItems.CHORUSCAKE))
                .criterion(hasItem(Items.CAKE), conditionsFromItem(ModItems.CHORUSCAKE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHORUSCAKE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GLOWBERRYCAKE,1)
                .input(Items.GLOW_BERRIES,5)
                .input(ModItems.DOUGH,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.CAKE,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.GLOWBERRYCAKE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.GLOWBERRYCAKE))
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(ModItems.GLOWBERRYCAKE))
                .criterion(hasItem(Items.CAKE), conditionsFromItem(ModItems.GLOWBERRYCAKE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GLOWBERRYCAKE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SWEETBERRYCAKE,1)
                .input(Items.SWEET_BERRIES,5)
                .input(ModItems.DOUGH,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.CAKE,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.SWEETBERRYCAKE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.SWEETBERRYCAKE))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(ModItems.SWEETBERRYCAKE))
                .criterion(hasItem(Items.CAKE), conditionsFromItem(ModItems.SWEETBERRYCAKE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SWEETBERRYCAKE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.APPLECAKE,1)
                .input(Items.APPLE,5)
                .input(ModItems.DOUGH,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.CAKE,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.APPLECAKE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.APPLECAKE))
                .criterion(hasItem(Items.APPLE), conditionsFromItem(ModItems.APPLECAKE))
                .criterion(hasItem(Items.CAKE), conditionsFromItem(ModItems.APPLECAKE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.APPLECAKE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BEETROOTCAKE,1)
                .input(Items.BEETROOT,5)
                .input(ModItems.DOUGH,2)
                .input(Items.MILK_BUCKET,1)
                .input(Items.CAKE,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.BEETROOTCAKE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.BEETROOTCAKE))
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(ModItems.BEETROOTCAKE))
                .criterion(hasItem(Items.CAKE), conditionsFromItem(ModItems.BEETROOTCAKE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BEETROOTCAKE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BEETCOOKIE,4)
                .input(Items.BEETROOT,2)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MELTEDBUTTER,1)
                .criterion(hasItem(ModItems.MELTEDBUTTER), conditionsFromItem(ModItems.BEETCOOKIE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.BEETCOOKIE))
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(ModItems.BEETCOOKIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BEETCOOKIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GLOWCOOKIE,4)
                .input(Items.GLOW_BERRIES,2)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MELTEDBUTTER,1)
                .criterion(hasItem(ModItems.MELTEDBUTTER), conditionsFromItem(ModItems.GLOWCOOKIE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.GLOWCOOKIE))
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(ModItems.GLOWCOOKIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GLOWCOOKIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHORUSCOOKIE,4)
                .input(Items.CHORUS_FRUIT,2)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MELTEDBUTTER,1)
                .criterion(hasItem(ModItems.MELTEDBUTTER), conditionsFromItem(ModItems.CHORUSCOOKIE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.CHORUSCOOKIE))
                .criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(ModItems.CHORUSCOOKIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHORUSCOOKIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MELONCOOKIE,4)
                .input(Items.MELON_SLICE,2)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MELTEDBUTTER,1)
                .criterion(hasItem(ModItems.MELTEDBUTTER), conditionsFromItem(ModItems.MELONCOOKIE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.MELONCOOKIE))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(ModItems.MELONCOOKIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MELONCOOKIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SWEETCOOKIE,4)
                .input(Items.SWEET_BERRIES,2)
                .input(ModItems.DOUGH,1)
                .input(ModItems.MELTEDBUTTER,1)
                .criterion(hasItem(ModItems.MELTEDBUTTER), conditionsFromItem(ModItems.SWEETCOOKIE))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.SWEETCOOKIE))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(ModItems.SWEETCOOKIE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SWEETCOOKIE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOASTWITHBUTTER,1)
                .input(ModItems.TOAST2,1)
                .input(ModItems.BUTTER,1)
                .criterion(hasItem(ModItems.TOAST2), conditionsFromItem(ModItems.TOASTWITHBUTTER))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.TOASTWITHBUTTER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOASTWITHBUTTER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOASTWITHEGG,1)
                .input(ModItems.TOAST2,1)
                .input(ModItems.FRIEDEGG,1)
                .criterion(hasItem(ModItems.TOAST2), conditionsFromItem(ModItems.TOASTWITHEGG))
                .criterion(hasItem(ModItems.FRIEDEGG), conditionsFromItem(ModItems.TOASTWITHEGG))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOASTWITHEGG)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOASTWITHJAM,1)
                .input(ModItems.TOAST2,1)
                .input(ModItems.SWEETJAM,1)
                .criterion(hasItem(ModItems.TOAST2), conditionsFromItem(ModItems.TOASTWITHJAM))
                .criterion(hasItem(ModItems.SWEETJAM), conditionsFromItem(ModItems.TOASTWITHJAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOASTWITHJAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOASTWITHBACON,1)
                .input(ModItems.TOAST2,1)
                .input(ModItems.COOKEDBACON,1)
                .criterion(hasItem(ModItems.TOAST2), conditionsFromItem(ModItems.TOASTWITHBACON))
                .criterion(hasItem(ModItems.COOKEDBACON), conditionsFromItem(ModItems.TOASTWITHBACON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOASTWITHBACON)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.VEGGIESANDWICH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BELLPEPPERSLICE,2)
                .input(ModItems.BELLPEPPER,1)
                .criterion(hasItem(ModItems.BELLPEPPER), conditionsFromItem(ModItems.BELLPEPPERSLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BELLPEPPERSLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOAST,4)
                .input(ModItems.DOUGH,1)
                .input(ModItems.SALT,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.TOAST))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.TOAST))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOAST)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GRAPESEEDS,1)
                .input(ModItems.GRAPES,1)
                .criterion(hasItem(ModItems.GRAPES), conditionsFromItem(ModItems.GRAPESEEDS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GRAPESEEDS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHILLISEEDS,1)
                .input(ModItems.CHILLI,1)
                .criterion(hasItem(ModItems.CHILLI), conditionsFromItem(ModItems.CHILLISEEDS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHILLISEEDS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BELLPEPPERSEEDS,1)
                .input(ModItems.BELLPEPPERSLICE,1)
                .criterion(hasItem(ModItems.BELLPEPPERSLICE), conditionsFromItem(ModItems.BELLPEPPERSEEDS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BELLPEPPERSEEDS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOMATOSEEDS,1)
                .input(ModItems.CUTTOMATO,1)
                .criterion(hasItem(ModItems.CUTTOMATO), conditionsFromItem(ModItems.TOMATOSEEDS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOMATOSEEDS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.LETTUCELEAF,1)
                .input(ModItems.LETTUCE,1)
                .criterion(hasItem(ModItems.LETTUCE), conditionsFromItem(ModItems.LETTUCELEAF))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LETTUCELEAF)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.LETTUCESEEDS,1)
                .input(ModItems.LETTUCELEAF,1)
                .criterion(hasItem(ModItems.LETTUCELEAF), conditionsFromItem(ModItems.LETTUCESEEDS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LETTUCESEEDS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SALT,3)
                .input(ModItems.BUCKETOFSALT,1)
                .criterion(hasItem(ModItems.BUCKETOFSALT), conditionsFromItem(ModItems.SALT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SALT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUCKETOFPEPPER,1)
                .input(ModItems.SALT,1)
                .input(Items.GUNPOWDER,1)
                .input(Items.BUCKET,1)
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.BUCKETOFPEPPER))
                .criterion(hasItem(Items.BUCKET), conditionsFromItem(ModItems.BUCKETOFPEPPER))
                .criterion(hasItem(Items.GUNPOWDER), conditionsFromItem(ModItems.BUCKETOFPEPPER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BUCKETOFPEPPER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PEPPER,3)
                .input(ModItems.BUCKETOFPEPPER,1)
                .criterion(hasItem(ModItems.BUCKETOFPEPPER), conditionsFromItem(ModItems.PEPPER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PEPPER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RAWBACON,2)
                .input(Items.PORKCHOP,1)
                .criterion(hasItem(Items.PORKCHOP), conditionsFromItem(ModItems.RAWBACON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAWBACON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CUCUMBERSLICE,1)
                .input(ModItems.CUCUMBER,1)
                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBERSLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUCUMBERSLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CUCUMBERSEEDS,1)
                .input(ModItems.CUCUMBERSLICE,1)
                .criterion(hasItem(ModItems.CUCUMBERSLICE), conditionsFromItem(ModItems.CUCUMBERSEEDS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUCUMBERSEEDS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUTTEREDPOTATO,1)
                .input( ModItems.BUTTER,1)
                .input(ModItems.PEPPER,1)
                .input(ModItems.PARSLEY,1)
                .input(Items.BAKED_POTATO,1)
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.BUTTEREDPOTATO))
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.BUTTEREDPOTATO))
                .criterion(hasItem(ModItems.PEPPER), conditionsFromItem(ModItems.BUTTEREDPOTATO))
                .criterion(hasItem(Items.BAKED_POTATO), conditionsFromItem(ModItems.BUTTEREDPOTATO))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BUTTEREDPOTATO)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MASHEDPOTATOES,1)
                .input(ModItems.BUTTEREDPOTATO,1)
                .input(ModItems.PEPPER,1)
                .input(ModItems.SALT,1)
                .input(Items.BOWL,1)
                .criterion(hasItem(ModItems.PEPPER), conditionsFromItem(ModItems.MASHEDPOTATOES))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.MASHEDPOTATOES))
                .criterion(hasItem(ModItems.BUTTEREDPOTATO), conditionsFromItem(ModItems.MASHEDPOTATOES))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(ModItems.MASHEDPOTATOES))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MASHEDPOTATOES)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SPRINGROLL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DOUGHTNUT,1)
                .input(ModItems.MELTEDBUTTER,1)
                .input(ModItems.SALT,1)
                .input(ModItems.DOUGH,1)
                .input(Items.SUGAR,1)
                .input(Items.EGG,1)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.DOUGHTNUT))
                .criterion(hasItem(Items.EGG), conditionsFromItem(ModItems.DOUGHTNUT))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.DOUGHTNUT))
                .criterion(hasItem(ModItems.MELTEDBUTTER), conditionsFromItem(ModItems.DOUGHTNUT))
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.DOUGHTNUT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DOUGHTNUT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHEESE,2)
                .input(Items.MILK_BUCKET,1)
                .input(ModItems.SALT,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.CHEESE))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.CHEESE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHEESE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUTTER,2)
                .input(Items.MILK_BUCKET,1)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.BUTTER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BUTTER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PARSLEYSEEDS,1)
                .input(ModItems.PARSLEY,1)
                .criterion(hasItem(ModItems.PARSLEY), conditionsFromItem(ModItems.PARSLEYSEEDS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PARSLEYSEEDS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CARROTCAKESLICE,8)
                .input(ModItems.CARROTCAKE,1)
                .criterion(hasItem(ModItems.CARROTCAKE), conditionsFromItem(ModItems.CARROTCAKESLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CARROTCAKESLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.APPLECAKESLICE,8)
                .input(ModItems.APPLECAKE,1)
                .criterion(hasItem(ModItems.APPLECAKE), conditionsFromItem(ModItems.APPLECAKESLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.APPLECAKESLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GLOWBERRYCAKESLICE,8)
                .input(ModItems.GLOWBERRYCAKE,1)
                .criterion(hasItem(ModItems.GLOWBERRYCAKE), conditionsFromItem(ModItems.GLOWBERRYCAKESLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GLOWBERRYCAKESLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SWEETBERRYCAKESLICE,8)
                .input(ModItems.SWEETBERRYCAKE,1)
                .criterion(hasItem(ModItems.SWEETBERRYCAKE), conditionsFromItem(ModItems.SWEETBERRYCAKESLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SWEETBERRYCAKESLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BLUEBERRYCAKESLICE,8)
                .input(ModItems.BLUEBERRYCAKE,1)
                .criterion(hasItem(ModItems.BLUEBERRYCAKE), conditionsFromItem(ModItems.BLUEBERRYCAKESLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BLUEBERRYCAKESLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.WATERMELONCAKESLICE,8)
                .input(ModItems.MELONSCAKE,1)
                .criterion(hasItem(ModItems.MELONSCAKE), conditionsFromItem(ModItems.WATERMELONCAKESLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WATERMELONCAKESLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHORUSCAKESLICE,8)
                .input(ModItems.CHORUSCAKE,1)
                .criterion(hasItem(ModItems.CHORUSCAKE), conditionsFromItem(ModItems.CHORUSCAKESLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHORUSCAKESLICE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BEETROOTCAKESLICE,8)
                .input(ModItems.BEETROOTCAKE,1)
                .criterion(hasItem(ModItems.BEETROOTCAKE), conditionsFromItem(ModItems.BEETROOTCAKESLICE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BEETROOTCAKESLICE)));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BEETJAM,2)
                .input(Items.SUGAR,2)
                .input(Items.GLASS_BOTTLE,2)
                .input(Items.BEETROOT,2)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.BEETJAM))
                .criterion(hasItem(Items.BEETROOT), conditionsFromItem(ModItems.BEETJAM))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.BEETJAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BEETJAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MELONJAM,2)
                .input(Items.SUGAR,2)
                .input(Items.GLASS_BOTTLE,2)
                .input(Items.MELON_SLICE,2)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.MELONJAM))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(ModItems.MELONJAM))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.MELONJAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MELONJAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHORUSJAM,2)
                .input(Items.SUGAR,2)
                .input(Items.GLASS_BOTTLE,2)
                .input(Items.CHORUS_FRUIT,2)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CHORUSJAM))
                .criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(ModItems.CHORUSJAM))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.CHORUSJAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHORUSJAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SWEETJAM,2)
                .input(Items.SUGAR,2)
                .input(Items.GLASS_BOTTLE,2)
                .input(Items.SWEET_BERRIES,2)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.SWEETJAM))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(ModItems.SWEETJAM))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.SWEETJAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SWEETJAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GLOWJAM,2)
                .input(Items.SUGAR,2)
                .input(Items.GLASS_BOTTLE,2)
                .input(Items.GLOW_BERRIES,2)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.GLOWJAM))
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(ModItems.GLOWJAM))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.GLOWJAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GLOWJAM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CARROTJAM,2)
                .input(Items.SUGAR,2)
                .input(Items.GLASS_BOTTLE,2)
                .input(Items.CARROT,2)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CARROTJAM))
                .criterion(hasItem(Items.CARROT), conditionsFromItem(ModItems.CARROTJAM))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.CARROTJAM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CARROTJAM)));

// Nation food this should have a fucking config toggle so i dont have to forcefully remove the recipe

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.WHISKEY,1)
                .input(ModItems.GRAPES,4)
                .input(ModItems.SALT,2)
                .input(Items.GLASS_BOTTLE,1)
                .criterion(hasItem(ModItems.GRAPES), conditionsFromItem(ModItems.WHISKEY))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.WHISKEY))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.WHISKEY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WHISKEY)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SPAGHETTI)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOGLINSANDWICH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.WINE,1)
                .input(ModItems.GRAPES,4)
                .input(Items.GLASS_BOTTLE,1)
                .criterion(hasItem(ModItems.GRAPES), conditionsFromItem(ModItems.WINE))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(ModItems.WINE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WINE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CROISSANT,1)
                .input(ModItems.DOUGH,1)
                .input(ModItems.SALT,1)
                .input(ModItems.BUTTER,1)
                .input(Items.SUGAR,1)
                .criterion(hasItem(ModItems.DOUGH), conditionsFromItem(ModItems.CROISSANT))
                .criterion(hasItem(ModItems.SALT), conditionsFromItem(ModItems.CROISSANT))
                .criterion(hasItem(ModItems.BUTTER), conditionsFromItem(ModItems.CROISSANT))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(ModItems.CROISSANT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CROISSANT)));

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
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BURGER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DOUGH,4)
                .input(Items.EGG,2)
                .input(Items.WHEAT,1)
                .input(Items.MILK_BUCKET,1)
                .input(ModItems.MELTEDBUTTER,1)
                .criterion(hasItem(Items.EGG), conditionsFromItem(ModItems.DOUGH))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(ModItems.DOUGH))
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(ModItems.DOUGH))
                .criterion(hasItem(ModItems.MELTEDBUTTER), conditionsFromItem(ModItems.DOUGH))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DOUGH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.RAWCHICKENLEG,2)
                .input(Items.CHICKEN,2)
                .criterion(hasItem(Items.CHICKEN), conditionsFromItem(ModItems.RAWCHICKENLEG))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAWCHICKENLEG)));


    }


}