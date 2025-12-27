package net.iyun.yunscuisine.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.iyun.yunscuisine.block.custom.GrapeCropBlock;
import net.iyun.yunscuisine.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class YunLoottable {

    private static final Identifier GRASS_BLOCK_ID = Identifier.of("minecraft", "blocks/short_grass");
    private static final Identifier FISHING_ID =  Identifier.of("minecraft", "gameplay/fishing/fish");

    public static void thefuckingloot() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(GRASS_BLOCK_ID.equals(key.getValue())) {
                LootPool.Builder poolbuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.GRAPESEEDS))
                        .with(ItemEntry.builder(ModItems.CHILLISEEDS))
                        .with(ItemEntry.builder(ModItems.LETTUCESEEDS))
                        .with(ItemEntry.builder(ModItems.BELLPEPPERSEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.1f, 0.3f)).build());
                tableBuilder.pool(poolbuilder.build());
            }

            if(FISHING_ID.equals(key.getValue())) {
                LootPool.Builder poolbuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                            .with(ItemEntry.builder(ModItems.TUNA).weight(5))
                            .with(ItemEntry.builder(ModItems.DRIFTWOOD).weight(5))
                            .with(ItemEntry.builder(ModItems.CLAM).weight(5))
                            .with(ItemEntry.builder(ModItems.HERRING).weight(5))
                            .with(ItemEntry.builder(ModItems.LOBSTER).weight(5))
                            .with(ItemEntry.builder(ModItems.SHRIMP).weight(5))
                            .with(ItemEntry.builder(ModItems.SQUID).weight(5))
                            .with(ItemEntry.builder(ModItems.SEAJELLY).weight(5))
                            .with(ItemEntry.builder(ModItems.KINGCRAB).weight(5))
                            .with(ItemEntry.builder(ModItems.REDSNAP).weight(5))
                            .with(ItemEntry.builder(ModItems.TINCAN).weight(5))
                            .with(ItemEntry.builder(ModItems.WETPAPER).weight(5))
                            .with(ItemEntry.builder(ModItems.WHITEALGAE).weight(5))
                            .with(ItemEntry.builder(ModItems.GREENALGAE).weight(5))
                            .with(ItemEntry.builder(ModItems.OYSTER).weight(5));
                tableBuilder.pool(poolbuilder.build());

            }

        });
    }
}
