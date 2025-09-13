package com.ppxiaoxu.item;

import com.ppxiaoxu.Ppxiaoxumod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    //注册物品
    public static final Item ICE_ETHER = registerItems("ice_ether", new Item(new Item.Settings()));
    public static final Item RAW_ICE_ETHER = registerItems("raw_ice_ether", new Item(new Item.Settings()));
    public static final Item CARDBOARD = registerItems("material/cardboard", new Item(new Item.Settings()));
    public static final Item My_Photo = registerItems("my_photo", new Item(new Item.Settings()));

    public static Item registerItems(String id , Item item){
        return Registry.register(Registries.ITEM , RegistryKey.of(Registries.ITEM.getKey() , new Identifier(Ppxiaoxumod.MOD_ID , id)), item);
    }

    public static Item register(String id, Item item) {
        return register(new Identifier(Ppxiaoxumod.MOD_ID , id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }


    public static void registerModItems(){

    }
}
