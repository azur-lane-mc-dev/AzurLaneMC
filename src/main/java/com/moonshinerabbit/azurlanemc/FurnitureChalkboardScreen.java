package com.moonshinerabbit.azurlanemc;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.moonshinerabbit.azurlanemc.AzurLaneMCMain.CHALKBOARD_SCREEN_HANDLER;

public class FurnitureChalkboardScreen {
    public static class ChalkboardScreenHandler extends ScreenHandler {
        private final Inventory inventory;
        public ChalkboardScreenHandler(int syncId, PlayerInventory playerInventory){this(syncId, playerInventory, new SimpleInventory(9));}
        public ChalkboardScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory){
            super(CHALKBOARD_SCREEN_HANDLER, syncId); checkSize(inventory,9);
            this.inventory = inventory;
        }

        @Override public boolean canUse (PlayerEntity player) {return this.inventory.canPlayerUse(player);}
        @Override public ItemStack quickMove(PlayerEntity player, int invSlot) {
            ItemStack newStack = ItemStack.EMPTY; Slot slot = this.slots.get(invSlot);
            if (slot.hasStack()){ ItemStack originalStack = slot.getStack(); newStack = originalStack.copy();
                if (invSlot <this.inventory.size()){
                    if (!this.insertItem(originalStack, this.inventory.size(),this.slots.size(), true)){
                        return ItemStack.EMPTY;
                    }
                } else if (!this.insertItem(originalStack,0,this.inventory.size(),false)){
                    return ItemStack.EMPTY;
                }
                if (originalStack.isEmpty()){ slot.setStack(ItemStack.EMPTY);} else { slot.markDirty();}
            } return newStack;
        }
    }
    public static class ChalkboardScreen extends HandledScreen<ChalkboardScreenHandler>{
        private static final Identifier TEXTURE = Identifier.of("azur_lane_mc", "textures/gui/chalkboard.png");
        private static final Text TITLE = Text.translatable("inventory.azur_lane_mc.furniture");
        private static final int BACKGROUND_WIDTH = 300;
        private static final int BACKGROUND_HEIGHT = 200;

        //ignore warning about title parameter - it is absolutely necessary to keep
        public ChalkboardScreen(ChalkboardScreenHandler handler, PlayerInventory inventory, Text title){
            super(handler, inventory, TITLE);
            this.backgroundWidth = BACKGROUND_WIDTH;
            this.backgroundHeight = BACKGROUND_HEIGHT;
        }

        @Override
        protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY){
            RenderSystem.setShaderColor(1F,1F,1F,1F);
            RenderSystem.setShaderTexture(0, TEXTURE);
            int x = (width - BACKGROUND_WIDTH) / 2;
            int y = (height - BACKGROUND_HEIGHT) / 2;
            context.drawTexture(RenderLayer::getGuiTextured, TEXTURE, x, y, 0, 0,
                    BACKGROUND_WIDTH, BACKGROUND_HEIGHT, 300, 200, 0xFFFFFFFF);
        }
        @Override
        public void render(DrawContext context,int mouseX, int mouseY, float delta){
            renderBackground(context, mouseX, mouseY, delta);
            drawMouseoverTooltip(context, mouseX, mouseY);
        }
        @Override
        protected void init(){super.init(); titleX= (BACKGROUND_WIDTH - textRenderer.getWidth(title)) / 2;}
    }
}