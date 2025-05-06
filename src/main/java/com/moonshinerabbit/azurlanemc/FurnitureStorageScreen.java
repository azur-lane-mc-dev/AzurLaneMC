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

import static com.moonshinerabbit.azurlanemc.AzurLaneMCMain.STORAGE_SCREEN_HANDLER;

public class FurnitureStorageScreen {
    public static class StorageScreenHandler extends ScreenHandler {
        private final Inventory inventory;

        public StorageScreenHandler(int syncId, PlayerInventory playerInventory){
            this(syncId, playerInventory, new SimpleInventory(9));
        }
        public StorageScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory){
            super(STORAGE_SCREEN_HANDLER, syncId);
            checkSize(inventory,9);
            this.inventory = inventory;
            inventory.onOpen(playerInventory.player);

            int m;
            int l;
            for (m=0;m<3;++m){
                for(l=0;l<3;++l){
                    this.addSlot(new Slot(inventory, l+m*3,62+l*18,17+m*18));
                }
            }
            for (m=0;m<3;++m){
                for (l=0;l<9;++l){
                    this.addSlot(new Slot(playerInventory, l+m*9+9,8+l*18,84+m*18));
                }
            }
            for (m=0;m<9;++m){
                this.addSlot(new Slot(playerInventory, m,8+m*18,142));
            }
        }

        @Override
        public boolean canUse (PlayerEntity player) {
            return this.inventory.canPlayerUse(player);
        }
        @Override
        public ItemStack quickMove(PlayerEntity player, int invSlot) {
            ItemStack newStack = ItemStack.EMPTY;
            Slot slot = this.slots.get(invSlot);

            if (slot.hasStack()){
                ItemStack originalStack = slot.getStack();
                newStack = originalStack.copy();

                if (invSlot <this.inventory.size()){
                    if (!this.insertItem(originalStack, this.inventory.size(),this.slots.size(), true)){
                        return ItemStack.EMPTY;
                    }
                } else if (!this.insertItem(originalStack,0,this.inventory.size(),false)){
                    return ItemStack.EMPTY;
                }

                if (originalStack.isEmpty()){
                    slot.setStack(ItemStack.EMPTY);
                } else { slot.markDirty();}
            }
            return newStack;
        }
    }
    public static class StorageScreen extends HandledScreen<StorageScreenHandler>{
        private static final Identifier TEXTURE = Identifier.ofVanilla("textures/gui/container/dispenser.png");
        private static final Text TITLE = Text.translatable("inventory.azur_lane_mc.furniture");
        //ignore warning about title parameter - it is absolutely necessary to keep
        public StorageScreen(StorageScreenHandler handler, PlayerInventory inventory, Text title){
            super(handler, inventory, TITLE);
        }


        @Override
        protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY){
            RenderSystem.setShaderColor(1F,1F,1F,1F);
            RenderSystem.setShaderTexture(0, TEXTURE);
            int x = (width - backgroundWidth) / 2;
            int y = (height - backgroundHeight) / 2;
            context.drawTexture(RenderLayer::getGuiTextured, TEXTURE, x, y, 0, 0,
                    backgroundWidth, backgroundHeight, 256, 256, 0xFFFFFFFF);
        }
        @Override
        public void render(DrawContext context,int mouseX, int mouseY, float delta){
            renderBackground(context, mouseX, mouseY, delta);
            super.render(context, mouseX, mouseY, delta);
            drawMouseoverTooltip(context, mouseX, mouseY);
        }
        @Override
        protected void init(){
            super.init();
            titleX= (backgroundWidth - textRenderer.getWidth(title)) / 2;
        }
    }
}
