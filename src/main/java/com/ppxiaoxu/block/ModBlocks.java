package com.ppxiaoxu.block;

import com.ppxiaoxu.Ppxiaoxumod;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ICE_ETHER_BLOCK = register("ice_ether_block", new Block(AbstractBlock.Settings.create().strength(3.0f , 3.0f)));
    public static final Block ICE_ETHER_ORE = register("ice_ether_ore", new Block(AbstractBlock.Settings.create().strength(4.5f , 6.0f)));
    public static final Block RAW_ICE_ETHER_BLOCK = register("raw_ice_ether_block", new Block(AbstractBlock.Settings.create().strength(3.0f , 3.0f)));


    public static void registerBlockItems(String id , Block block){
        BlockItem item = Registry.register(Registries.ITEM, Identifier.of(Ppxiaoxumod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Ppxiaoxumod.MOD_ID , id), block);
    }

    public static void registerModBlocks() {
       Ppxiaoxumod.LOGGER.info("Registering ModBlocks for " + Ppxiaoxumod.MOD_ID);
    }

}
