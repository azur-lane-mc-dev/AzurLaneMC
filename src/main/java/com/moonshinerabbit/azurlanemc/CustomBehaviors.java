package com.moonshinerabbit.azurlanemc;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

import java.util.EnumSet;

public class CustomBehaviors {
    public static class AdvancedLookAtTargetGoal extends Goal {
        private final MobEntity mob;
        private Entity target;
        private final float lookDistance;
        private final float probability;
        private final Class<? extends LivingEntity> targetType;

        private int lookTime;

        public AdvancedLookAtTargetGoal(MobEntity mob, Class<? extends LivingEntity> targetType, float lookDistance) {
            this(mob, targetType, lookDistance, 1F);
        }

        public AdvancedLookAtTargetGoal(MobEntity mob, Class<? extends LivingEntity> targetType, float lookDistance, float probability) {
            this.mob = mob;
            this.targetType = targetType;
            this.lookDistance = lookDistance;
            this.probability = probability;
            //this.setControls(EnumSet.of(Control.LOOK));
        }

        @Override
        public boolean canStart() {
            if (this.mob.getRandom().nextFloat() >= this.probability) {return false;}
            if (this.mob.getTarget() != null && this.targetType.isAssignableFrom(this.mob.getTarget().getClass())) {
                this.target = this.mob.getTarget();
                return true;
            }
            return false;
        }

        @Override public boolean shouldContinue() {
            if (this.target == null || !this.target.isAlive()) {return false;}
            if (this.mob.distanceTo(this.target) > (double)(this.lookDistance * this.lookDistance)) {return false;}
            return this.lookTime > 0;
        }

        @Override public void start() {
            this.lookTime = 40 + this.mob.getRandom().nextInt(40);
            if (this.mob instanceof Kansen.KansenEntity kansen) {
                kansen.setAdvancedLookActive(true);
            }
        }
        @Override public void stop() {
            if (this.mob instanceof Kansen.KansenEntity kansen) {
                kansen.setAdvancedLookActive(false);
            }
            this.target = null;
        }
        @Override public void tick() {
            if (this.target == null) return;
            this.lookTime--;
        }
    }
    public static class FollowLeaderGoal extends Goal {
        private final Kansen.KansenEntity entity;
        private PlayerEntity owner;
        private final World world;

        public FollowLeaderGoal(Kansen.KansenEntity entity) {
            this.entity = entity; this.world = entity.getWorld();
            this.setControls(EnumSet.of(Control.MOVE, Control.LOOK));
        }

        @Override public boolean canStart() {
            if (!this.entity.isFollowing || this.entity.ownerUUID == null) {return false;}
            PlayerEntity owner = this.world.getPlayerByUuid(this.entity.ownerUUID);
            if (owner == null) {return false;} this.owner = owner; return true;
        }
        @Override public boolean shouldContinue() {
            if (!this.entity.isFollowing) {return false;} float minDistance = 0;
            return this.owner != null && !this.owner.isSpectator() &&
                    this.entity.squaredDistanceTo(this.owner) > (minDistance * minDistance);
        }

        @Override public void start() {this.entity.getNavigation().stop();}
        @Override public void stop() {this.owner = null; this.entity.getNavigation().stop();}

        @Override public void tick() {
            this.entity.getLookControl().lookAt(this.owner, 10.0F, this.entity.getMaxLookPitchChange());
            float maxDistance = 16;
            if (this.entity.squaredDistanceTo(this.owner) >= (maxDistance * maxDistance)) {
                double speed = 1;
                this.entity.getNavigation().startMovingTo(this.owner, speed);
            }
        }
    }
}