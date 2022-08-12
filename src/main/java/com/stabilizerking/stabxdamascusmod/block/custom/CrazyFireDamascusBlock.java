package com.stabilizerking.stabxdamascusmod.block.custom;

import com.stabilizerking.stabxdamascusmod.item.custom.DamascusFireStone;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class CrazyFireDamascusBlock extends Block {
    public CrazyFireDamascusBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType onBlockActivated(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_,
                                             Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if (!p_225533_2_.isRemote()) {
            if (p_225533_5_ == Hand.MAIN_HAND) {
                System.out.println("I right clicked Damascus fire stone block! I am the King.Calling for main hand");
            }

            if (p_225533_5_ == Hand.OFF_HAND) {
                System.out.println("I right clicked Damascus fire stone block! I am the King.GOING for ,my Off hand");
            }

        }
        return super.onBlockActivated(p_225533_1_, p_225533_2_, p_225533_3_, p_225533_4_, p_225533_5_, p_225533_6_);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onBlockClicked(BlockState p_196270_1_, World p_196270_2_, BlockPos p_196270_3_, PlayerEntity p_196270_4_) {
        if (!p_196270_2_.isRemote()) {
            System.out.println("I left clicked the sussy Micheal Jackson Damascus Stone ");
        }
    }

    @Override
    public void onEntityWalk(World p_176199_1_, BlockPos p_176199_2_, Entity p_176199_3_) {
        DamascusFireStone.lightEntityonFire(p_176199_3_, 5);
        super.onEntityWalk(p_176199_1_, p_176199_2_, p_176199_3_);
    }
}