package com.moonshinerabbit.azurlanemc;

import net.fabricmc.fabric.api.client.rendering.v1.HudLayerRegistrationCallback;
import net.fabricmc.fabric.api.client.rendering.v1.IdentifiedLayer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.util.Identifier;

public class AzurLaneUIRenderingEntrypoint {

    public static final String MOD_ID = "azur_lane_mc";

    private static final Identifier FLEET_SCREEN = Identifier.of(MOD_ID, "fleet_screen");

    public static void initialize() {
        // Attach our rendering code to before the chat hud layer. Our layer will render right before the chat.
        // The API will take care of z spacing and automatically add 200 after every layer.
        HudLayerRegistrationCallback.EVENT.register(
                layeredDrawer -> layeredDrawer.attachLayerBefore(
                        IdentifiedLayer.CHAT, FLEET_SCREEN, AzurLaneUIRenderingEntrypoint::render));}

    private static void render(DrawContext context, RenderTickCounter tickCounter) {
//        int color = 0xFFFF0000; // Red
//        int targetColor = 0xFF00FF00; // Green

        // You can use the Util.getMeasuringTimeMs() function to get the current time in milliseconds.
        // Divide by 1000 to get seconds.
//        double currentTime = Util.getMeasuringTimeMs() / 1000.0;

        // "lerp" simply means "linear interpolation", which is a fancy way of saying "blend".
//        float lerpedAmount = MathHelper.abs(MathHelper.sin((float) currentTime));
//        int lerpedColor = ColorHelper.lerp(lerpedAmount, color, targetColor);

        // Draw a square with the lerped color.
        // x1, x2, y1, y2, z, color
//        context.fill(0, 0, 10, 10, 0, lerpedColor);
    }
}