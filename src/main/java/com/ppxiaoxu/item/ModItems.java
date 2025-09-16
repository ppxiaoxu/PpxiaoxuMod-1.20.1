package com.ppxiaoxu.item;

import com.ppxiaoxu.Ppxiaoxumod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    //注册物品
    public static final Item ICE_ETHER = registerItems("ice_ether", new Item(new Item.Settings()));
    public static final Item RAW_ICE_ETHER = registerItems("raw_ice_ether", new Item(new Item.Settings()));
    public static final Item CARDBOARD = registerItems("material/cardboard", new Item(new Item.Settings()));
    public static final Item My_PHOTO = registerItems("my_photo", new Item(new Item.Settings()));

    public static Item registerItems(String id , Item item){
        return Registry.register(Registries.ITEM , RegistryKey.of(Registries.ITEM.getKey() , new Identifier(Ppxiaoxumod.MOD_ID , id)), item);
    }

    //将注册物品添加到物品栏
    private static void addItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ICE_ETHER);
        fabricItemGroupEntries.add(RAW_ICE_ETHER);
        fabricItemGroupEntries.add(CARDBOARD);
        fabricItemGroupEntries.add(My_PHOTO);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup);
        Ppxiaoxumod.LOGGER.info("Registering ModItems for " + Ppxiaoxumod.MOD_ID);

    }
}
