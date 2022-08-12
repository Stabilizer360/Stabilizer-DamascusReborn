package com.stabilizerking.stabxdamascusmod.item;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup STABXDAMASCUS_GROUP = new ItemGroup("StabXDamascusModTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.DAMASCUS_INGOT.get());
        }
    };

}