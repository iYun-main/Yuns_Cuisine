package net.iyun.goldyheart.world.feature.tree;

import net.iyun.goldyheart.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;


public class AncientSaplingGenerator extends SaplingBlock {
    public AncientSaplingGenerator(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.ANC_KEY;
    }
}