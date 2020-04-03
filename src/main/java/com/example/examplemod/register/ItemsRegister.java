package com.example.examplemod.register;

import com.example.examplemod.common.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemsRegister {
    public static final Item BUBBLE = new ItemBubble();
    public static final Item TIEBA = new ItemFoodTieba();
    public static final Item LOW_COAL = new ItemCoals().low_coal.getItem();
    public static final Item MEDIUM_COAL = new ItemCoals().medium_coal.getItem();
    public static final Item HIGH_COAL = new ItemCoals().high_coal.getItem();
    public static final Item SUPER_COAL = new ItemCoals().super_coal.getItem();

    public ItemsRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                BUBBLE,
                TIEBA,
                LOW_COAL, MEDIUM_COAL, HIGH_COAL, SUPER_COAL
        );
    }

}
