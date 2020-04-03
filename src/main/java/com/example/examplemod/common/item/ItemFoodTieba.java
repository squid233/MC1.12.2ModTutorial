package com.example.examplemod.common.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

public class ItemFoodTieba extends ItemFood {
    public ItemFoodTieba() {
        super(20, 1.0f, true);
        String name = "tieba";
        this.setRegistryName(name).setUnlocalizedName(ExampleMod.MODID+"."+name).setCreativeTab(CreativeTabs.FOOD);
        this.setAlwaysEdible();
    }

    @ParametersAreNonnullByDefault
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000000, 255)); // 速度
            player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 1000000, 255)); // 急迫
            player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000000, 255)); // 力量
            player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1000000, 255)); // 瞬间治疗
            player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1000000, 127)); // 跳跃提升
            player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1000000, 255)); // 生命恢复
            player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000000, 9)); // 抗性提升
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 1000000, 255)); // 防火
            player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 1000000, 255)); // 水下呼吸
            player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 1000000, 255)); // 隐身
            player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1000000)); // 夜视
            player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 1000000, 4)); // 生命提升
            player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1000000, 9)); // 伤害吸收
            player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 1000000, 255)); // 饱和
        }
        super.onFoodEaten(stack, worldIn, player);
    }
}
