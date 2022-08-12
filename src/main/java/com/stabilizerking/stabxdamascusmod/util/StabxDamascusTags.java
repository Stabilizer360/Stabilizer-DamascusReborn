package com.stabilizerking.stabxdamascusmod.util;

import com.stabilizerking.stabxdamascusmod.StabxDamascusMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class StabxDamascusTags {

    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> DAMASCUS_FIRE_STONE_CLICKABLE_BLOCKS =
                createTag("damascus_fire_stone_clickable_blocks");
       private static Tags.IOptionalNamedTag<Block> createTag(String name) {
           return BlockTags.createOptional(new ResourceLocation(StabxDamascusMod.MOD_ID, name));
       }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }
    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> DAMASCUS_INGOT = createForgeTag("ingots/damascus_ingot");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(StabxDamascusMod.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
