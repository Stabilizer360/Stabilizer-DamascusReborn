package com.stabilizerking.stabxdamascusmod.item;

import com.stabilizerking.stabxdamascusmod.StabxDamascusMod;
import com.stabilizerking.stabxdamascusmod.item.custom.DamascusFireStone;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StabxDamascusMod.MOD_ID);


    public static final RegistryObject<Item> DAMASCUS_INGOT = ITEMS.register("damascus_ingot",
            ()-> new Item(new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));

    public static final RegistryObject<Item> DAMASCUS_FIRE_STONE = ITEMS.register("damascus_fire_stone",
            ()-> new DamascusFireStone(new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> BROKEN_DAMASCUS_INGOT = ITEMS.register("broken_damascus_ingot",
            ()-> new Item(new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));

    public static final RegistryObject<Item> DAMASCUS_SHARPEST_SWORD = ITEMS.register("damascus_sharpest_sword",
            ()-> new SwordItem(ModItemTier.DAMASCUS_INGOT,12,2f,
                   new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));


    public static final RegistryObject<Item> DAMASCUS_PICKAXE = ITEMS.register("damascus_pickaxe",
            ()-> new PickaxeItem(ModItemTier.DAMASCUS_INGOT,1,3f,
                    new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));

    public static final RegistryObject<Item> DAMASCUS_SHOVEL = ITEMS.register("damascus_shovel",
            ()-> new ShovelItem(ModItemTier.DAMASCUS_INGOT,2,2f,
                    new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));


    public static final RegistryObject<Item> DAMASCUS_HEAVY_OP_AXE = ITEMS.register("damascus_heavy_op_axe",
            ()-> new AxeItem(ModItemTier.DAMASCUS_INGOT,15,0.9f,
                    new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));


    public static final RegistryObject<Item> DAMASCUS_HOE = ITEMS.register("damascus_hoe",
            ()-> new HoeItem(ModItemTier.DAMASCUS_INGOT,3,2f,
                    new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));


    public static final RegistryObject<Item> DAMASCUS_BOOTS = ITEMS.register("damascus_boots",
            ()-> new ArmorItem(ModArmorMaterial.DAMASCUS, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));


    public static final RegistryObject<Item> DAMASCUS_CHESTPLATE = ITEMS.register("damascus_chestplate",
            ()-> new ArmorItem(ModArmorMaterial.DAMASCUS, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));


    public static final RegistryObject<Item> DAMASCUS_LEGGINGS = ITEMS.register("damascus_leggings",
            ()-> new ArmorItem(ModArmorMaterial.DAMASCUS, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));


    public static final RegistryObject<Item> DAMASCUS_HELMET = ITEMS.register("damascus_helmet",
            ()-> new ArmorItem(ModArmorMaterial.DAMASCUS, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}