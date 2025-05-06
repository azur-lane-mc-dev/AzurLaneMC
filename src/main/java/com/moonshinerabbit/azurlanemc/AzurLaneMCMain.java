package com.moonshinerabbit.azurlanemc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;


public class AzurLaneMCMain implements ModInitializer {
    public static final ScreenHandlerType<FurnitureStorageScreen.StorageScreenHandler> STORAGE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of("azur_lane_mc", "storage_block"),
                    new ScreenHandlerType<>(FurnitureStorageScreen.StorageScreenHandler::new, FeatureSet.empty()));
    public static final ScreenHandlerType<FurnitureChalkboardScreen.ChalkboardScreenHandler> CHALKBOARD_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of("azur_lane_mc", "chalkboard_block"),
                    new ScreenHandlerType<>(FurnitureChalkboardScreen.ChalkboardScreenHandler::new, FeatureSet.empty()));

    @Override
    public void onInitialize() {
        ParticleTypes.initialize();

        Kansen.initialize();
        KansenEntities.initialize();
        Manjuu.initialize();

        WisdomCubes.initialize();
        WorkbenchMaterials.initialize();
        NavalComponents.initialize();
        NavalMounts.initialize();
        NavalAmmunition.initialize();
        NavalWeapons.initialize();

        AzurLaneFurniture.initialize();

        KansenSounds.initialize();

        CommandRegistrationCallback.EVENT.register((
                dispatcher, registryAccess, environment)
                -> KansenCommands.register(dispatcher));
    }
}