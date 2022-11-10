package net.icycrystal.echoextras.item;

import net.icycrystal.echoextras.EchoExtras;
import net.icycrystal.echoextras.Tier;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EchoItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EchoExtras.MODID);

    public static final RegistryObject<Item> ECHO_GEM = ITEMS.register("echo_gem",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ECHO_SWORD = ITEMS.register("echo_sword",
            () -> new SwordItem(Tier.ECHO, 7, -2.6f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ECHO_PICKAXE = ITEMS.register("echo_pickaxe",
            () -> new PickaxeItem(Tier.ECHO, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ECHO_AXE = ITEMS.register("echo_axe",
            () -> new AxeItem(Tier.ECHO, 9, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ECHO_SHOVEL = ITEMS.register("echo_shovel",
            () -> new ShovelItem(Tier.ECHO, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ECHO_HOE = ITEMS.register("echo_hoe",
            () -> new HoeItem(Tier.ECHO, 0, 0f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
