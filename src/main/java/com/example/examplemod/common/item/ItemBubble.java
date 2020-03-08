package com.example.examplemod.common.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBubble extends Item {
    private static String name = "bubble";
    public ItemBubble() {
        this.setRegistryName(name);
        this.setUnlocalizedName(ExampleMod.MODID+"."+name);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
