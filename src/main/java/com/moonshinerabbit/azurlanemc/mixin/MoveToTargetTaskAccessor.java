package com.moonshinerabbit.azurlanemc.mixin;

import net.minecraft.entity.ai.brain.WalkTarget;
import net.minecraft.entity.ai.brain.task.MoveToTargetTask;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(MoveToTargetTask.class)
public class MoveToTargetTaskAccessor{
    @Invoker("isTargetSpectator")
    public static boolean invokeIsTargetSpectator(WalkTarget target){
        throw new AssertionError("Mixin injection failed");
    }
}