package com.moonshinerabbit.azurlanemc;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

import static com.moonshinerabbit.azurlanemc.AzurLaneMCMain.*;

public class AzurLaneMCClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //(G)UI & Screens
        AzurLaneUIRenderingEntrypoint.initialize();
        HandledScreens.register(STORAGE_SCREEN_HANDLER, FurnitureStorageScreen.StorageScreen::new);
        HandledScreens.register(CHALKBOARD_SCREEN_HANDLER, FurnitureChalkboardScreen.ChalkboardScreen::new);

        //Entity Rendering
        KansenRenderers.initialize();
        ManjuuRenderers.initialize();

        //Furniture Rendering
        BlockRenderLayerMap.INSTANCE.putBlock(AzurLaneFurniture.SET001_BROKENDININGSET, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AzurLaneFurniture.SET001_BROKENSCREEN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AzurLaneFurniture.SET001_BROKENTV, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AzurLaneFurniture.SET001_BROKENWASHBASIN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AzurLaneFurniture.SET001_BROKENWINDOW, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AzurLaneFurniture.SET001_CARDBOARDBOX, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AzurLaneFurniture.SET001_FRAGILEDOOR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AzurLaneFurniture.SET001_KEROSENELAMP, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AzurLaneFurniture.SET001_TATTEREDMAT, RenderLayer.getTranslucent());

        //Item Rendering
        //ItemRenderer.INSTANCE.putItem(WisdomCubes.WISDOM_CUBE_EMPTY, RenderLayer.getTranslucent());

        //Particle Rendering
        ParticleFactoryRegistry.getInstance().register(ParticleTypes.WISDOM_PARTICLE,
                new ParticleTypes.WisdomParticle.Factory());
    }
}