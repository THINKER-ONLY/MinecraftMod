package com.lzy.firstmod.item;

import com.lzy.firstmod.FirstMod;
import com.lzy.firstmod.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static void registerModItemGroup(){
        System.out.println("注册物品组: " + EAYABLE_GOD);
    }

    public static final ItemGroup EAYABLE_GOD = FabricItemGroupBuilder.create(
                    new Identifier(FirstMod.MOD_ID,"eatable_god"))
            .icon(()-> new ItemStack(ModItems.HEAVY_GOD_HEART))
            .appendItems(itemStacks -> {
                itemStacks.add(new ItemStack(ModItems.GOD_HEART));
                itemStacks.add(new ItemStack(ModItems.HEAVY_GOD_HEART));
                itemStacks.add(new ItemStack(ModBlocks.XIRANG));
                itemStacks.add(new ItemStack(ModItems.GOD_BONE));
            })
            .build();
}
