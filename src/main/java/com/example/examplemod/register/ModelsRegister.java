package com.example.examplemod.register;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModelsRegister {
    public ModelsRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        registerItemsModel(ItemsRegister.BUBBLE);
        registerItemsModel(ItemsRegister.TIEBA);
        registerItemsModel(ItemsRegister.LOW_COAL, 0, "low_coal");
        registerItemsModel(ItemsRegister.MEDIUM_COAL, 1, "medium_coal");
        registerItemsModel(ItemsRegister.HIGH_COAL, 2, "high_coal");
        registerItemsModel(ItemsRegister.SUPER_COAL, 3, "super_coal");

    }

    private void registerItemsModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    private void registerItemsModel(Item item, int metadata, String path) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(path, "inventory"));
    }

}
