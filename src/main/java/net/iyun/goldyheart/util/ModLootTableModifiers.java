package net.iyun.goldyheart.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.iyun.goldyheart.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;


public class ModLootTableModifiers {
        private static final Identifier GRASS_ID =
                new Identifier("minecraft","blocks/grass");

    //  private static final Identifier ZOMBIE_ID =
    //     new Identifier("minecraft","entities/zombie");

    //   private static final Identifier HUSK_ID =
    //      new Identifier("minecraft","entities/husk");

    // private static final Identifier ZOMBIEVIL_ID =
    //      new Identifier("minecraft","entities/zombie_villager");

    public static void modifyLootTables() {
        //   LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
        //  if(ZOMBIE_ID.equals(id))
        //     {
        //    LootPool.Builder poolBuilder2 = LootPool.builder()
        //            .rolls(ConstantLootNumberProvider.create(1))
        //            .with(ItemEntry.builder(ModItems.RICE))
        //           .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.125f,0.4f)).build());

        //   tableBuilder.pool(poolBuilder2.build());
        //   }
        // });

        //  LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
        //       if(HUSK_ID.equals(id))
        //  {
        //      LootPool.Builder poolBuilder3 = LootPool.builder()
        //              .rolls(ConstantLootNumberProvider.create(1))
        //              .with(ItemEntry.builder(ModItems.PARSLEYSEEDS))
        //              .with(ItemEntry.builder(ModItems.TOMATOSEEDS))
        //              .with(ItemEntry.builder(ModItems.GRAPESEEDS))
        //              .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.025f,0.25f)).build());
        //
        //      tableBuilder.pool(poolBuilder3.build());
        //  }
        //});

        // LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
        //  if(ZOMBIEVIL_ID.equals(id))
        //  {
        //      LootPool.Builder poolBuilder4 = LootPool.builder()
        //              .rolls(ConstantLootNumberProvider.create(1))
        //              .with(ItemEntry.builder(ModItems.PARSLEYSEEDS))
        //              .with(ItemEntry.builder(ModItems.TOMATOSEEDS))
        //              .with(ItemEntry.builder(ModItems.GRAPESEEDS))
        //              .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.025f,0.25f)).build());
        //
        //      tableBuilder.pool(poolBuilder4.build());
        //    }
        //});



        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
         if(GRASS_ID.equals(id))
          {
             LootPool.Builder poolBuilder = LootPool.builder()
             .rolls(ConstantLootNumberProvider.create(1))
             .with(ItemEntry.builder(ModItems.GRAPESEEDS))
             .with(ItemEntry.builder(ModItems.CHILLISEEDS))
             .with(ItemEntry.builder(ModItems.LETTUCESEEDS))
             .with(ItemEntry.builder(ModItems.BELLPEPPERSEEDS))
             .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.01f, 0.5f)).build());
         tableBuilder.pool(poolBuilder.build());
         }


        });
    }
}
