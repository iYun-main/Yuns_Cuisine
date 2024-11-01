package net.iyun.goldyheart.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.iyun.goldyheart.block.ModBlocks;
import net.iyun.goldyheart.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,1,
                factories ->{
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(ModItems.RICE),
                    6,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(ModItems.COFFEEBEAN),
                    20,2,0.45f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,2,
                factories ->{
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 8),
                    new ItemStack(ModItems.CORNSEEDS),
                    99,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 12),
                    new ItemStack(ModItems.ONION),
                    99,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 18),
                    new ItemStack(ModItems.PARSLEYSEEDS),
                    99,2,0.45f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,3,
                factories ->{
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 8),
                    new ItemStack(ModItems.GARLIC),
                    30,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(ModItems.BELLPEPPERSEEDS),
                    99,2,0.45f));
                });


        // TODO FIX THIS
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories ->{
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 10),
                    new ItemStack(ModBlocks.ACA_WOOD_ALLSIDE),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 10),
                    new ItemStack(ModBlocks.ACA_WOOD_ALLSIDE),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 10),
                    new ItemStack(ModBlocks.ACA_WOOD_ALLSIDE),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 10),
                    new ItemStack(ModBlocks.ACA_WOOD_ALLSIDE),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 10),
                    new ItemStack(ModBlocks.ACA_WOOD_ALLSIDE),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(ModItems.STRAWBERRY),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(ModItems.TOMATOSEEDS),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(ModItems.GRAPESEEDS),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(ModItems.CHILLISEEDS),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(ModItems.BELLPEPPERSEEDS),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(ModItems.RUHBARBSEEDS),
                   1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 10),
                    new ItemStack(ModItems.BLUEBERRY),
                    1,2,0.45f));

            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 10),
                    new ItemStack(ModItems.STRAWBERRY),
                    1,2,0.45f));

                    //   factories.add((entity, random) -> new TradeOffer(
                    // new ItemStack(Items.EMERALD, 10),
                    //new ItemStack(ModItems.WORM),
                    //1,2,0.45f));

                    //  factories.add((entity, random) -> new TradeOffer(
                    // new ItemStack(Items.EMERALD, 10),
                    //new ItemStack(ModItems.WORMBOWL),
                    //1,2,0.45f));

                    //  factories.add((entity, random) -> new TradeOffer(
                    //new ItemStack(Items.EMERALD, 10),
                    //new ItemStack(ModItems.CANOFWORMS),
                    //1,2,0.45f));

                });
    }
}
