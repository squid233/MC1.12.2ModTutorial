package com.example.examplemod.proxy;

import com.example.examplemod.register.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        new ItemsRegister();
    }

    public void init(FMLInitializationEvent event) {

    }

}
