package net.icycrystal.echoextras.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.icycrystal.echoextras.EchoExtras;
import net.icycrystal.echoextras.block.EchoBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, EchoExtras.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> ECHO_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, EchoBlocks.ECHO_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ECHO_ORE = CONFIGURED_FEATURES.register("echo_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ECHO_ORES.get(),6)));

    public static void register(IEventBus eventBus) {CONFIGURED_FEATURES.register(eventBus);
    }
}
