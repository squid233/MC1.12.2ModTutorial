package com.example.examplemod.common.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCoals extends Item {
    public ItemStack low_coal = new ItemStack(this);
    public ItemStack medium_coal = new ItemStack(this, 1, 1);
    public ItemStack high_coal = new ItemStack(this, 1, 2);
    public ItemStack super_coal = new ItemStack(this, 1, 3);

    public ItemCoals() {
        String fr = ExampleMod.MODID+".";

        this.setHasSubtypes(true);
        this.setRegistryName("coals");

        low_coal.getItem().setUnlocalizedName(fr+"low_coal").setCreativeTab(CreativeTabs.MISC);
        medium_coal.getItem().setUnlocalizedName(fr+"low_coal").setCreativeTab(CreativeTabs.MISC);
        high_coal.getItem().setUnlocalizedName(fr+"low_coal").setCreativeTab(CreativeTabs.MISC);
        super_coal.getItem().setUnlocalizedName(fr+"low_coal").setCreativeTab(CreativeTabs.MISC);
    }
}
