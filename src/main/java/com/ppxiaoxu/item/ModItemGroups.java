package com.ppxiaoxu.item;

import com.ppxiaoxu.Ppxiaoxumod;
import com.ppxiaoxu.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> PPXIAOXU_GROUP = register("ppxiaoxu_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(Ppxiaoxumod.MOD_ID , id));
    }

    public static void registerModItemGroups() {
        Ppxiaoxumod.LOGGER.info("Registering Item Groups");
        Registry.register(Registries.ITEM_GROUP , PPXIAOXU_GROUP , ItemGroup.create(ItemGroup.Row.TOP , 7)
                .displayName(Text.translatable("itemGroup.ppxiaoxumod.ppxiaoxu_mod"))
                .icon(() -> new ItemStack(ModItems.ICE_ETHER))
                .entries((displayContext, entries) -> {
                   entries.add(ModItems.ICE_ETHER);
                   entries.add(ModItems.RAW_ICE_ETHER);
                   entries.add(ModItems.CARDBOARD);
                   entries.add(ModItems.My_PHOTO);
                   entries.add(Blocks.BRICKS);
                   entries.add(Items.DIAMOND);
                   entries.add(ModBlocks.ICE_ETHER_BLOCK);
                   entries.add(ModBlocks.ICE_ETHER_ORE);
                   entries.add(ModBlocks.RAW_ICE_ETHER_BLOCK);
                }).build());
    }

}
