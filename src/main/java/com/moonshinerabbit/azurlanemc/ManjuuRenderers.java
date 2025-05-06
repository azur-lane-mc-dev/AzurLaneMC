package com.moonshinerabbit.azurlanemc;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ManjuuRenderers {
    public static void initialize() {
        EntityRendererRegistry.register(Manjuu.MANJUU, ManjuuEntityRenderer::new);
    }

    public static class ManjuuEntityRenderer extends GeoEntityRenderer<Manjuu.ManjuuEntity> {
        public ManjuuEntityRenderer(EntityRendererFactory.Context context){
            super(context, new Manjuu.ManjuuModel());
        }
    }
}