package net.iyun.goldyheart;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.iyun.goldyheart.block.ModBlocks;
import net.iyun.goldyheart.item.ModItemGroups;
import net.iyun.goldyheart.item.ModItems;
import net.iyun.goldyheart.util.ModCustomTrades;
//import net.iyun.goldyheart.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Goldy_Heart implements ModInitializer {
	public static final String MOD_ID = "goldyheart";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		//ModLootTableModifiers.modifyLootTables();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModCustomTrades.registerCustomTrades();

		CompostingChanceRegistry.INSTANCE.add(ModItems.GRAPESEEDS,0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BELLPEPPER,0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RICE,0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GARLIC,0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BELLPEPPERSLICE,0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BELLPEPPERSEEDS,0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ONION,0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.ONIONSLICE,0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUTTOMATO,0.1f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUCUMBERSLICE,0.01f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PARSLEYSEEDS,0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHILLISEEDS,0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TOMATOSEEDS,0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.LETTUCESEEDS,0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUCUMBERSEEDS,0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.LETTUCE,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TOMATO,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CUCUMBER,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.COFFEEBEAN,0.15f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.CHILLI,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PARSLEY,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GRAPES,0.2f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.STRAWBERRY,0.05f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BLUEBERRY,0.05f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.RHUBARB,0.05f);

		StrippableBlockRegistry.register(ModBlocks.WEATHERED_LOG, ModBlocks.STRIPPED_WEATHERED_LOG);
		StrippableBlockRegistry.register(ModBlocks.WEATHERED_WOOD, ModBlocks.STRIPPED_WEATHERED_WOOD);
		StrippableBlockRegistry.register(ModBlocks.ANCIENT_LOG, ModBlocks.STRIPPED_ANCIENT_LOG);
		StrippableBlockRegistry.register(ModBlocks.ANCIENT_WOOD, ModBlocks.STRIPPED_ANCIENT_WOOD);
		StrippableBlockRegistry.register(ModBlocks.DARK_SPIRAL_LOG, ModBlocks.STRIPPED_DARK_SPIRAL_LOG);
		StrippableBlockRegistry.register(ModBlocks.DARK_SPIRAL_WOOD, ModBlocks.STRIPPED_DARK_SPIRAL_WOOD);
		StrippableBlockRegistry.register(ModBlocks.SPIRAL_LOG, ModBlocks.STRIPPED_SPIRAL_LOG);
		StrippableBlockRegistry.register(ModBlocks.SPIRAL_WOOD, ModBlocks.STRIPPED_SPIRAL_WOOD);
		StrippableBlockRegistry.register(ModBlocks.OLD_LOG, ModBlocks.STRIPPED_OLD_LOG);
		StrippableBlockRegistry.register(ModBlocks.OLD_WOOD, ModBlocks.STRIPPED_OLD_WOOD);


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WOOD_SLAB_S,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WOOD_SLAB_S,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WOOD_SLAB_S,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WOOD_SLAB_S,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WOOD_SLAB_S,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WOOD_SLAB_S,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACA_WOOD_SLAB_S,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACA_WOOD_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WOOD_SLAB_S,5,5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FANCY_PLANK,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FANCY_STAIRS,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FANCY_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FANCY_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FANCY_FENCE,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FANCY_FENCE_GATE,5,5);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FANCY_BUTTON,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FANCY_PRESSUREPLATE,5,20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEATHERED_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WEATHERED_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WEATHERED_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEATHERED_PLANK_SLABS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEATHERED_PLANK_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEATHERED_LEAVES,30,60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEATHERED_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WEATHERED_PLANKS,5,20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ANCIENT_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ANCIENT_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_LOG,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_LEAVES,30,60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_WOOD_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_WOOD_WALL_S,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_WOOD_SLAB_S,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_WOOD_SLAB,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_DOOR,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_TRAPDOOR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_FENCE,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_FENCE_GATE,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_BUTTON,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ANCIENT_PRESSUREPLATE,5,20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_OLD_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_OLD_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_LOG,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_LEAVES,30,60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_WOOD_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_WOOD_WALL_S,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_WOOD_SLAB_S,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_WOOD_SLAB,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_DOOR,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_TRAPDOOR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_FENCE,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_FENCE_GATE,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_BUTTON,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OLD_PRESSUREPLATE,5,20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SPIRAL_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SPIRAL_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_LOG,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_LEAVES,30,60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_WOOD_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_WOOD_WALL_S,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_WOOD_SLAB_S,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_WOOD_SLAB,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_DOOR,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_TRAPDOOR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_FENCE,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_FENCE_GATE,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_BUTTON,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPIRAL_PRESSUREPLATE,5,20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DARK_SPIRAL_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DARK_SPIRAL_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_LOG,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_STAIRS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_LEAVES,30,60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_SLAB,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_PLANKS,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_WOOD_WALL,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_WOOD_WALL_S,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_WOOD_SLAB_S,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_WOOD_SLAB,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_DOOR,5,20);
		//FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_TRAPDOOR,5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_FENCE,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_FENCE_GATE,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_BUTTON,5,20);
		//	FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_SPIRAL_PRESSUREPLATE,5,20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_WOOL_SLAB,6,40);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_WOOL_SLAB,6,40);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MOSS_SLAB,4,80);

		LOGGER.info("Goldy Heart is running and observing the Files");

	}


}