package net.icycrystal.echoextras;

import net.icycrystal.echoextras.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ECHO = new ForgeTier(5, 477,43f, 0f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ECHO_GEM.get()));
}