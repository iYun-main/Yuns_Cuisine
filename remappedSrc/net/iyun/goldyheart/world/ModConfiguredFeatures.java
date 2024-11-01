package net.iyun.goldyheart.world;

import net.iyun.goldyheart.Goldy_Heart;
import net.iyun.goldyheart.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;


public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> WEATH_KEY = registryKey("weathered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANC_KEY = registryKey("ancient");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_KEY = registryKey("darkspiral");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPIR_KEY = registryKey("spiral");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLDA_KEY = registryKey("olda");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, WEATH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.WEATHERED_LOG),
                new StraightTrunkPlacer(4, 3, 2),

                BlockStateProvider.of(ModBlocks.WEATHERED_LEAVES),

                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),

                new TwoLayersFeatureSize(2, 0, 2)).build());

        register(context, ANC_KEY,Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ANCIENT_LOG),
                new StraightTrunkPlacer(4,3,2),

                BlockStateProvider.of(ModBlocks.ANCIENT_LEAVES),

                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0),3),

                new TwoLayersFeatureSize(2,0,2)).build());

        register(context, DARK_KEY,Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.DARK_SPIRAL_LOG),
                new StraightTrunkPlacer(4,3,2),

                BlockStateProvider.of(ModBlocks.DARK_SPIRAL_LEAVES),

                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0),3),

                new TwoLayersFeatureSize(2,0,2)).build());

        register(context, SPIR_KEY,Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SPIRAL_LOG),
                new StraightTrunkPlacer(4,3,2),

                BlockStateProvider.of(ModBlocks.SPIRAL_LEAVES),

                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0),3),

                new TwoLayersFeatureSize(2,0,2)).build());


        register(context, OLDA_KEY,Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.OLD_LOG),
                new StraightTrunkPlacer(4,3,2),

                BlockStateProvider.of(ModBlocks.OLD_LEAVES),

                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0),3),

                new TwoLayersFeatureSize(2,0,3)).build());
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Goldy_Heart.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }


}
