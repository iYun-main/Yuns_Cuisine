package net.iyun.goldyheart.util;

import net.iyun.goldyheart.Goldy_Heart;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Goldy_Heart.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> ANC = createTag("anc");
        public static final TagKey<Item> OLD = createTag("old");
        public static final TagKey<Item> SPI = createTag("spi");
        public static final TagKey<Item> SPID = createTag("spid");
        public static final TagKey<Item> BOG = createTag("bog");
        public static final TagKey<Item> JAM = createTag("jams");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Goldy_Heart.MOD_ID, name));
        }
    }
}
