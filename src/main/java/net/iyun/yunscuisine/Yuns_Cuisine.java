package net.iyun.yunscuisine;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.iyun.yunscuisine.block.ModBlocks;
import net.iyun.yunscuisine.item.ModItemGroups;
import net.iyun.yunscuisine.item.ModItems;
import net.iyun.yunscuisine.util.ModCustomTrades;
import net.iyun.yunscuisine.util.YunLoottable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Yuns_Cuisine implements ModInitializer {
	public static final String MOD_ID = "yunscuisine";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
        YunLoottable.thefuckingloot();
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

		LOGGER.info("Yuns Cuisine is running and observing the Files");

	}


}