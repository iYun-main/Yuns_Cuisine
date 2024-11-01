package net.iyun.goldyheart.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;


public class CoffeeItem extends Item {
    public CoffeeItem(net.minecraft.item.Item.Settings settings) {
        super(settings);
    }


    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

}
