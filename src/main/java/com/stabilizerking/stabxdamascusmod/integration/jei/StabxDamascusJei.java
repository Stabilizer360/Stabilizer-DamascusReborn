package com.stabilizerking.stabxdamascusmod.integration.jei;

import com.stabilizerking.stabxdamascusmod.StabxDamascusMod;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import net.minecraft.util.ResourceLocation;

@JeiPlugin
public class StabxDamascusJei  implements IModPlugin {


    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(StabxDamascusMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IModPlugin.super.registerCategories(registration);
    }
}