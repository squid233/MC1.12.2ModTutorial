package com.example.examplemod.common.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.client.creativetab.ModCreativeTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBubble extends Item {
    private static String name = "bubble";
    public ItemBubble() {
        this.setRegistryName(name);
        this.setUnlocalizedName(ExampleMod.MODID+"."+name);
        this.setCreativeTab(ModCreativeTabs.EXAMPLE_CREATIVE_TAB);
    }
}
