package net.iyun.yunscuisine.util;

import net.iyun.yunscuisine.Yuns_Cuisine;
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
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Yuns_Cuisine.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> JAM = createTag("jams");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Yuns_Cuisine.MOD_ID, name));
        }
    }
}
