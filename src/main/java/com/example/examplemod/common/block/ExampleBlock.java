package com.example.examplemod.common.block;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class ExampleBlock extends Block {
    public ExampleBlock() {
        super(Material.GROUND, MapColor.DIRT);
        String name = "example_block";
        this.setRegistryName(name).setUnlocalizedName(ExampleMod.MODID+"."+name).setCreativeTab(CreativeTabs.MISC).setHardness(0.5f).setResistance(10);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
