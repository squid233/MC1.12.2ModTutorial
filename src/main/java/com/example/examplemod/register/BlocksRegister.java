package com.example.examplemod.register;

import com.example.examplemod.common.block.ExampleBlock;
import com.sun.istack.internal.NotNull;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class BlocksRegister {
    public static final Block EXAMPLE_BLOCK = new ExampleBlock();

    public BlocksRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    private static Block[] blocks = {
            EXAMPLE_BLOCK
    };

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        for (Block block : blocks) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
            event.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        for (Block block : blocks) {
            Item itemBlock = new ItemBlock(block).setRegistryName(block.getRegistryName());
            ModelLoader.setCustomModelResourceLocation(itemBlock, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
            event.getRegistry().register(itemBlock);
        }
    }
}