package com.lzy.firstmod.item;

import com.lzy.firstmod.FirstMod;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModItems {
    public static final Item GOD_HEART = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder()
            .hunger(10)
                    .saturationModifier(1.2F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100000, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100000, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100000, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100000, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100000, 1), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 100000, 1), 1.0F)
                    .alwaysEdible()
                    .meat()
                    .build())
            .maxCount(1));

    //private static void addItemsToIG(FabricItemGroupBuilder fabricItemGroupEntries){
    //    fabricItemGroupEntries.(What);
    //}
    //private static Item registerItem(String name, Item item){
    //    return
    //}
    public static void registerModItems(){
        Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID,"god_heart"), GOD_HEART);
    }
}
