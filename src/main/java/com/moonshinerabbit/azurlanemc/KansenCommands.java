package com.moonshinerabbit.azurlanemc;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class KansenCommands {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher){
        dispatcher.register(
                CommandManager.literal("spawnKansen")
                        .requires(source -> source.hasPermissionLevel(2))
                        .executes(KansenCommands::spawnKansenEntity)
        );
    }

    private static int spawnKansenEntity(CommandContext<ServerCommandSource> context){
        try {
            ServerPlayerEntity player = context.getSource().getPlayer();
            World world = context.getSource().getWorld();
            BlockPos pos = player.getBlockPos();

            ItemStack heldStack = player.getMainHandStack();
            Item heldItem = heldStack.getItem();

            // Determine which entity variant to create based on the held item.
            EntityType<? extends Kansen.KansenEntity> chosenType;
            if (heldItem == Items.REDSTONE) {
                chosenType = KansenEntities.KANSEN_0019; // For example, Entity variant "A"
            } else if (heldItem == Items.GLOWSTONE_DUST) {
                chosenType = KansenEntities.KANSEN_0236; // For example, variant "B"
            } else if (heldItem == Items.LAPIS_LAZULI) {
                chosenType = KansenEntities.KANSEN_0101; // For example, variant "C"
            } else {
                chosenType = null;   // default variant
                player.sendMessage(Text.literal("Spawning failed"));
            }

            // Instantiate the kansen entity with the chosen type.
            Kansen.KansenEntity kansen = new Kansen.KansenEntity(chosenType, world);
            kansen.setOwnerUUID(player.getUuid());
            kansen.refreshPositionAndAngles(
                    pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5,
                    player.getYaw(), player.getPitch()
            );

            world.spawnEntity(kansen);

            player.sendMessage(Text.literal("Spawned KansenEntity with you as owner"), false);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}