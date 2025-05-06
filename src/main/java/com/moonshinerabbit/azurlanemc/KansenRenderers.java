package com.moonshinerabbit.azurlanemc;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class KansenRenderers {
    public static void initialize() {
        EntityRendererRegistry.register(KansenEntities.KANSEN_0019, Kansen_0019EntityRenderer::new);
        EntityRendererRegistry.register(KansenEntities.KANSEN_0065, Kansen_0065EntityRenderer::new);
        EntityRendererRegistry.register(KansenEntities.KANSEN_0077, Kansen_0077EntityRenderer::new);
        EntityRendererRegistry.register(KansenEntities.KANSEN_0101, Kansen_0101EntityRenderer::new);
        EntityRendererRegistry.register(KansenEntities.KANSEN_0115, Kansen_0115EntityRenderer::new);
        EntityRendererRegistry.register(KansenEntities.KANSEN_0155, Kansen_0155EntityRenderer::new);
        EntityRendererRegistry.register(KansenEntities.KANSEN_0224, Kansen_0224EntityRenderer::new);
        EntityRendererRegistry.register(KansenEntities.KANSEN_0236, Kansen_0236EntityRenderer::new);
    }

    public static class Kansen_0019EntityRenderer extends GeoEntityRenderer<KansenEntities.Kansen_0019Entity> {
        public Kansen_0019EntityRenderer(EntityRendererFactory.Context context){
            super(context, new KansenEntities.Kansen_0019EntityModel());
        }
    }
    public static class Kansen_0065EntityRenderer extends GeoEntityRenderer<KansenEntities.Kansen_0065Entity> {
        public Kansen_0065EntityRenderer(EntityRendererFactory.Context context){
            super(context, new KansenEntities.Kansen_0065EntityModel());
        }
    }
    public static class Kansen_0077EntityRenderer extends GeoEntityRenderer<KansenEntities.Kansen_0077Entity> {
        public Kansen_0077EntityRenderer(EntityRendererFactory.Context context){
            super(context, new KansenEntities.Kansen_0077EntityModel());
        }
    }
    public static class Kansen_0101EntityRenderer extends GeoEntityRenderer<KansenEntities.Kansen_0101Entity> {
        public Kansen_0101EntityRenderer(EntityRendererFactory.Context context){
            super(context, new KansenEntities.Kansen_0101EntityModel());
        }
    }
    public static class Kansen_0115EntityRenderer extends GeoEntityRenderer<KansenEntities.Kansen_0115Entity> {
        public Kansen_0115EntityRenderer(EntityRendererFactory.Context context){
            super(context, new KansenEntities.Kansen_0115EntityModel());
        }
    }
    public static class Kansen_0155EntityRenderer extends GeoEntityRenderer<KansenEntities.Kansen_0155Entity> {
        public Kansen_0155EntityRenderer(EntityRendererFactory.Context context){
            super(context, new KansenEntities.Kansen_0155EntityModel());
        }
    }
    public static class Kansen_0224EntityRenderer extends GeoEntityRenderer<KansenEntities.Kansen_0224Entity> {
        public Kansen_0224EntityRenderer(EntityRendererFactory.Context context){
            super(context, new KansenEntities.Kansen_0224EntityModel());
        }
    }
    public static class Kansen_0236EntityRenderer extends GeoEntityRenderer<KansenEntities.Kansen_0236Entity> {
        public Kansen_0236EntityRenderer(EntityRendererFactory.Context context){
            super(context, new KansenEntities.Kansen_0236EntityModel());
        }
    }
}