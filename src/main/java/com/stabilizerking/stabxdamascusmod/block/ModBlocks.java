package com.stabilizerking.stabxdamascusmod.block;

import com.stabilizerking.stabxdamascusmod.StabxDamascusMod;
import com.stabilizerking.stabxdamascusmod.block.custom.CrazyFireDamascusBlock;
import com.stabilizerking.stabxdamascusmod.item.ModItemGroup;
import com.stabilizerking.stabxdamascusmod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, StabxDamascusMod.MOD_ID);


    public static final RegistryObject<Block> ADVANCED_DAMASCUS_ORE = registerBlock("advanced_damascus_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(35f,4000f)));

    public static final RegistryObject<Block> INSANE_DAMASCUS_BLOCK = registerBlock("insane_damascus_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(50f,5000)));

    public static final RegistryObject<Block> CRAZY_FIRE_DAMASCUS_BLOCK = registerBlock("crazy_fire_damascus_block",
            () -> new CrazyFireDamascusBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(34f,6000f)));


    public static final RegistryObject<Block> INSANE_DAMASCUS_STAIRS = registerBlock("insane_damascus_stairs",
            () -> new StairsBlock(() -> INSANE_DAMASCUS_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.IRON).harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(16f,2000f)));


    public static final RegistryObject<Block> INSANE_DAMASCUS_FENCE = registerBlock("insane_damascus_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(34f,6000f)));


    public static final RegistryObject<Block> INSANE_DAMASCUS_FENCE_GATE = registerBlock("insane_damascus_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(14f,1000f)));


    public static final RegistryObject<Block> INSANE_DAMASCUS_SLAB = registerBlock("insane_damascus_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(25f,3000f)));


    public static final RegistryObject<Block> INSANE_DAMASCUS_BUTTON = registerBlock("insane_damascus_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(25f,3000f).doesNotBlockMovement()));

    public static final RegistryObject<Block> INSANE_DAMASCUS_PRESSURE_PLATE = registerBlock("insane_damascus_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool().hardnessAndResistance(25f,3000f)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.STABXDAMASCUS_GROUP)));
    }

    public  static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
