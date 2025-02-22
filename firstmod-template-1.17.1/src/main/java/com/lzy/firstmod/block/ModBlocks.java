package com.lzy.firstmod.block;

import com.lzy.firstmod.FirstMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block XIRANG = new Block(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL));

    public static void registerModBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(FirstMod.MOD_ID, "xirang"),XIRANG);
        Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, "xirang"),new BlockItem(XIRANG, new Item.Settings()));

    }
}
