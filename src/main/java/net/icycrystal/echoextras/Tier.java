package net.icycrystal.echoextras;

import net.icycrystal.echoextras.item.EchoItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tier {
    public static final ForgeTier ECHO = new ForgeTier(5, 477,39f, 0f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(EchoItems.ECHO_GEM.get()));
}