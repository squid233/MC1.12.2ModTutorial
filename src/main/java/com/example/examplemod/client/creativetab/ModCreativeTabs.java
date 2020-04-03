package com.example.examplemod.client.creativetab;

import com.example.examplemod.register.ItemsRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.*;

public class ModCreativeTabs {
    public static final CreativeTabs EXAMPLE_CREATIVE_TAB = new CreativeTabs("exampleCT") {
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemsRegister.BUBBLE);
        }
    };
}
