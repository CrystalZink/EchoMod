package net.icycrystal.echoextras.item;

import net.icycrystal.echoextras.EchoExtras;
import net.icycrystal.echoextras.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EchoExtras.MODID);

    public static final RegistryObject<Item> ECHO_GEM = ITEMS.register("echo_gem",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ECHO_BROADSWORD = ITEMS.register("echo_broadsword",
            () -> new SwordItem(ModTiers.ECHO, 9, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ECHO_PICKAXE = ITEMS.register("echo_pickaxe",
            () -> new PickaxeItem(ModTiers.ECHO, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ECHO_BATTLE_AXE = ITEMS.register("echo_battleaxe",
            () -> new AxeItem(ModTiers.ECHO, 11, -3.4f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ECHO_SHOVEL = ITEMS.register("echo_shovel",
            () -> new ShovelItem(ModTiers.ECHO, 3, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ECHO_SCYTHE = ITEMS.register("echo_scythe",
            () -> new HoeItem(ModTiers.ECHO, 5, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
