package net.iyun.goldyheart.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.iyun.goldyheart.block.ModBlocks;
import net.iyun.goldyheart.block.custom.*;
import net.iyun.goldyheart.item.ModItems;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.STRAWBER_BUSH);
        addDrop(ModBlocks.BLUEBER_BUSH);
        addDrop(ModBlocks.OLD_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_OLD_ROSE);
        addDrop(ModBlocks.TINY_LILLY);
        addDrop(ModBlocks.ASTROPHYLLIA);
        addPottedPlantDrops(ModBlocks.POTTED_TINY_LILLY);
        addPottedPlantDrops(ModBlocks.POTTED_ASTROPHYLLIA);

        BlockStatePropertyLootCondition.Builder builder1 = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create().exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(ModBlocks.TOMATO_CROP, this.cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATOSEEDS, builder1));

        BlockStatePropertyLootCondition.Builder builder8 = BlockStatePropertyLootCondition.builder(ModBlocks.COFFEE_CROP).properties(StatePredicate.Builder.create().exactMatch(CoffeeCropBlock.AGE, 5));
        addDrop(ModBlocks.COFFEE_CROP, this.cropDrops(ModBlocks.COFFEE_CROP, ModItems.COFFEEBEAN, ModItems.COFFEEBEAN, builder8));

        BlockStatePropertyLootCondition.Builder builder4 = BlockStatePropertyLootCondition.builder(ModBlocks.CUCUMBER_CROP).properties(StatePredicate.Builder.create().exactMatch(CucumberCropBlock.AGE, 5));
        addDrop(ModBlocks.CUCUMBER_CROP, this.cropDrops(ModBlocks.CUCUMBER_CROP, ModItems.CUCUMBER, ModItems.CUCUMBERSEEDS, builder4));

        BlockStatePropertyLootCondition.Builder builder11 = BlockStatePropertyLootCondition.builder(ModBlocks.LETTUCE_CROP).properties(StatePredicate.Builder.create().exactMatch(LettuceCropBlock.AGE, 7));
        addDrop(ModBlocks.LETTUCE_CROP, this.cropDrops(ModBlocks.LETTUCE_CROP, ModItems.LETTUCE, ModItems.LETTUCESEEDS, builder11));

        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.ONION_CROP).properties(StatePredicate.Builder.create().exactMatch(OnionCropBlock.AGE, 5));
        addDrop(ModBlocks.ONION_CROP, this.cropDrops(ModBlocks.ONION_CROP, ModItems.ONION, ModItems.ONION,builder3));

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.GRAPE_CROP).properties(StatePredicate.Builder.create().exactMatch(GrapeCropBlock.AGE, 7));
        addDrop(ModBlocks.GRAPE_CROP, this.cropDrops(ModBlocks.GRAPE_CROP, ModItems.GRAPES, ModItems.GRAPESEEDS,builder2));

        BlockStatePropertyLootCondition.Builder builder14 = BlockStatePropertyLootCondition.builder(ModBlocks.HOP_CROP).properties(StatePredicate.Builder.create().exactMatch(HopsCropBlock.AGE, 4));
        addDrop(ModBlocks.HOP_CROP, this.cropDrops(ModBlocks.HOP_CROP, ModItems.HOPS, ModItems.HOPSEEDS,builder14));

        BlockStatePropertyLootCondition.Builder builder5 = BlockStatePropertyLootCondition.builder(ModBlocks.CHILLI_CROP).properties(StatePredicate.Builder.create().exactMatch(ChilliCropBlock.AGE, 7));
        addDrop(ModBlocks.CHILLI_CROP, this.cropDrops(ModBlocks.CHILLI_CROP, ModItems.CHILLI, ModItems.CHILLISEEDS,builder5));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.PARSLEY_CROP).properties(StatePredicate.Builder.create().exactMatch(ParsleyCropBlock.AGE, 3));
        addDrop(ModBlocks.PARSLEY_CROP, this.cropDrops(ModBlocks.PARSLEY_CROP, ModItems.PARSLEY, ModItems.PARSLEYSEEDS,builder));

        BlockStatePropertyLootCondition.Builder builder6 = BlockStatePropertyLootCondition.builder(ModBlocks.BELLPEPPER_CROP).properties(StatePredicate.Builder.create().exactMatch(BellCropBlock.AGE, 5));
        addDrop(ModBlocks.BELLPEPPER_CROP, this.cropDrops(ModBlocks.BELLPEPPER_CROP, ModItems.BELLPEPPER, ModItems.BELLPEPPERSEEDS,builder6));

        BlockStatePropertyLootCondition.Builder builder7 = BlockStatePropertyLootCondition.builder(ModBlocks.GARLIC_CROP).properties(StatePredicate.Builder.create().exactMatch(GarlicCropBlock.AGE, 3));
        addDrop(ModBlocks.GARLIC_CROP, this.cropDrops(ModBlocks.GARLIC_CROP, ModItems.GARLIC, ModItems.GARLIC,builder7));

        BlockStatePropertyLootCondition.Builder builder9 = BlockStatePropertyLootCondition.builder(ModBlocks.RICE_CROP).properties(StatePredicate.Builder.create().exactMatch(RiceCropBlock.AGE, 7));
        addDrop(ModBlocks.RICE_CROP, this.cropDrops(ModBlocks.RICE_CROP, ModItems.RICE, ModItems.RICE,builder9));

        BlockStatePropertyLootCondition.Builder builder10 = BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create().exactMatch(CornCropBlock.AGE, 7));
        addDrop(ModBlocks.CORN_CROP, this.cropDrops(ModBlocks.CORN_CROP, ModItems.CORN, ModItems.CORNSEEDS,builder10));

       BlockStatePropertyLootCondition.Builder builder12 = BlockStatePropertyLootCondition.builder(ModBlocks.RUHBARB_CROP).properties(StatePredicate.Builder.create().exactMatch(RuhbarbCropBlock.AGE, 7));
        addDrop(ModBlocks.RUHBARB_CROP, this.cropDrops(ModBlocks.RUHBARB_CROP, ModItems.RHUBARB, ModItems.RUHBARBSEEDS,builder12));

        BlockStatePropertyLootCondition.Builder builder13 = BlockStatePropertyLootCondition.builder(ModBlocks.ANCIENT_CROP).properties(StatePredicate.Builder.create().exactMatch(AncientCropBlock.AGE, 7));
        addDrop(ModBlocks.ANCIENT_CROP, this.cropDrops(ModBlocks.ANCIENT_CROP, ModItems.ANCIENTFRUIT, Items.AIR,builder13));
    }
}
