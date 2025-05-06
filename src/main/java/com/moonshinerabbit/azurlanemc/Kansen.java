package com.moonshinerabbit.azurlanemc;

import com.moonshinerabbit.azurlanemc.CustomBehaviors.*;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.UUID;

public class Kansen {
    //mod id shortcut
    public static final String MOD_ID = "azur_lane_mc";

    //indicate kansen entity registry keys
    public static final RegistryKey<EntityType<?>> KANSEN_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "kansen"));
    public static final EntityType<KansenEntity> KANSEN = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "kansen"),
            EntityType.Builder
                    .create(KansenEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 2f)
                    .build(KANSEN_KEY)
    );

    public static void initialize() {
        FabricDefaultAttributeRegistry.register(KANSEN, KansenEntity.createLivingAttributes());
    }

    public static class KansenEntity extends PathAwareEntity implements GeoEntity {
            UUID ownerUUID;
            boolean isFollowing = false;
            private boolean advancedLookActive;

            public KansenEntity(EntityType<? extends Kansen.KansenEntity> type, World world) {
                super(type, world);
            }
        @Override public void checkDespawn() {}

        public void setOwnerUUID(UUID ownerUUID){this.ownerUUID = ownerUUID;}
        @Override public void writeCustomDataToNbt(NbtCompound tag) {
            super.writeCustomDataToNbt(tag);
            if (this.ownerUUID != null) {tag.putUuid("OwnerUUID", this.ownerUUID);}
            tag.putBoolean("Following", this.isFollowing);
        }
        @Override public void readCustomDataFromNbt(NbtCompound tag) {
            super.readCustomDataFromNbt(tag);
            if (tag.contains("OwnerUUID")) {this.ownerUUID = tag.getUuid("OwnerUUID");}
            this.isFollowing = tag.getBoolean("Following");
        }

        public void setAdvancedLookActive(boolean active) { this.advancedLookActive = active; }

        @Override
        public ActionResult interactMob(PlayerEntity player, Hand hand) {
            ItemStack heldItem = player.getStackInHand(hand);
            String entityName = (this.getDisplayName() != null) ?
                    this.getDisplayName().getString() : "Entity";
            String playerName = (player.getDisplayName() != null) ?
                    player.getDisplayName().getString() : "Player";
            if (heldItem.getItem() == Items.STICK) {
                if (this.ownerUUID != null && this.ownerUUID.equals(player.getUuid())) {
                    this.isFollowing = !this.isFollowing;

                    if (this.isFollowing) {player.sendMessage(
                                Text.literal(entityName + " is now following " + playerName), false);
                    } else {player.sendMessage(
                                Text.literal(entityName + " has stopped following " + playerName), false);
                    } return ActionResult.SUCCESS;
                } else {player.sendMessage(
                            Text.literal("Interaction failed between "+ entityName + " and "+ playerName), false);
                    return ActionResult.FAIL;
                }
            }
            return super.interactMob(player, hand);
        }

        protected void initGoals() {
            this.goalSelector.add(1, new FollowLeaderGoal(this));
            this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 8F, 1F));
            //this.goalSelector.add(2, new AdvancedLookAtTargetGoal(this, LivingEntity.class, 8F));

            // Combat goals
            this.targetSelector.add(1, new ActiveTargetGoal<>(this, KansenEntity.class, false));
            this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, false));
            this.targetSelector.add(3, new ActiveTargetGoal<>(this, VillagerEntity.class, false));
            this.targetSelector.add(4, new ActiveTargetGoal<>(this, MobEntity.class, false));
        }

        public String getVisionVector(){
            if (this.getTarget() == null) {return "none";}
            //if (!advancedLookActive){return "none";}

            double dx = getTarget().getX() - this.getX();
            double dz = getTarget().getZ() - this.getZ();
            double targetAngleRad = Math.atan2(dz, dx);
            double targetAngleDeg = Math.toDegrees(targetAngleRad);
            double currentAngle = this.getYaw();

            double angleDiff = targetAngleDeg - currentAngle;
            angleDiff = ((angleDiff + 180) % 360 + 360) % 360 - 180;

            if (angleDiff >= -25 && angleDiff < 0) {
                return "glance_left";
            } else if (angleDiff >= 0 && angleDiff <= 25) {
                return "glance_right";
            } else {
                return "none";
            }
        }

        //animation cache
        protected static final RawAnimation BREATHE = RawAnimation.begin().thenLoop("breathe");
        protected static final RawAnimation WALK = RawAnimation.begin().thenLoop("walk");
        protected static final RawAnimation SWIM = RawAnimation.begin().thenPlayAndHold("on_surface");
        protected static final RawAnimation SPRINT = RawAnimation.begin().thenLoop("sprint");
        protected static final RawAnimation BREEZE = RawAnimation.begin().thenLoop("breeze");
        protected static final RawAnimation LOOKAROUND = RawAnimation.begin().thenPlay("lookaround");
        protected static final RawAnimation BLINK = RawAnimation.begin().thenLoop("doubleblink");
        protected static final RawAnimation SANS_DEFAULT = RawAnimation.begin().thenPlayAndHold("suppress_default");
        protected static final RawAnimation RAINING = RawAnimation.begin().thenPlayAndHold("raining");
        protected static final RawAnimation SNOWING = RawAnimation.begin().thenPlayAndHold("snowing");
        protected static final RawAnimation LIGHT_0 = RawAnimation.begin().thenPlayAndHold("light_0");
        protected static final RawAnimation LIGHT_2 = RawAnimation.begin().thenPlayAndHold("light_2");
        protected static final RawAnimation LIGHT_4 = RawAnimation.begin().thenPlayAndHold("light_4");
        protected static final RawAnimation LIGHT_6 = RawAnimation.begin().thenPlayAndHold("light_6");
        protected static final RawAnimation LIGHT_8 = RawAnimation.begin().thenPlayAndHold("light_8");
        protected static final RawAnimation SANS_RIGGING = RawAnimation.begin().thenPlayAndHold("suppress_equipment");
        protected static final RawAnimation RIGGING_INIT = RawAnimation.begin().thenPlay("rigging_initialize");
        protected static final RawAnimation SWIMWEAR = RawAnimation.begin().thenPlayAndHold("swimwear");
        private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

        World world = this.getWorld();
        BlockPos position = this.getBlockPos(); // Entity's current position
        Biome currentBiome = world.getBiome(position).value();
        public int currentLight(Entity entity) {
            int blockLightLevel = entity.getWorld().getLightLevel(LightType.BLOCK, entity.getBlockPos());
            int skyLightLevel = entity.getWorld().getLightLevel(LightType.SKY, entity.getBlockPos());

            if (entity.getWorld().isSkyVisible(entity.getBlockPos())) { // Check if the entity can see the sky
                return Math.max(skyLightLevel, blockLightLevel);        // Return the maximum light level
            } else {
                return blockLightLevel;                                // Return block light level only
            }
        }

        //animation bundles
        @Override
        public void registerControllers(final AnimatableManager.ControllerRegistrar controllers) {
            controllers.add(new AnimationController<>(this, "Motion", 5, this::moveController));
            controllers.add(new AnimationController<>(this, "Face", 5, this::faceController));
            controllers.add(new AnimationController<>(this, "Environment", 5, this::envController));
            controllers.add(new AnimationController<>(this, "Clothing", 0, this::clothingController));
            controllers.add(new AnimationController<>(this, "Pupils", 20, this::pupilController));
            controllers.add(new AnimationController<>(this, "Rigging", 10, this::riggingController)
                    //handler for wisdom cube effect -- https://github.com/bernie-g/geckolib/wiki/Keyframe-Triggers-(Geckolib4)
                    //example with Sound handler -- https://github.com/bernie-g/geckolib-examples/blob/a5ba89653632322c0acba20b3d75895bd11dae13/common/src/main/java/com/example/examplemod/item/JackInTheBoxItem.java#L66
                    .setParticleKeyframeHandler(event -> {
                                System.out.println("Particle Keyframe hit at: " + event.getKeyframeData());
                                this.getWorld().addParticle(ParticleTypes.WISDOM_PARTICLE,
                                        this.getX(), this.getY(), this.getZ(),
                                        this.getVelocity().x, this.getVelocity().y, this.getVelocity().z
                                );
                            })
            );
            controllers.add(new AnimationController<>(this, "Look", 10, this::visionController));
        }

        protected <E extends KansenEntity> PlayState visionController(final AnimationState<E> event) {
            String visionVector = this.getVisionVector();
            System.out.println("Vision Vector: " + visionVector);
            if ("glance_left".equals(visionVector)) {
                return event.setAndContinue(SPRINT);
            } else if ("glance_right".equals(visionVector)) {
                return event.setAndContinue(WALK);
            }
            return PlayState.STOP;
        }

        protected <E extends KansenEntity> PlayState moveController(final AnimationState<E> event) {
            if (isSwimming()) {
                return event.setAndContinue(SWIM);
            } else if (forwardSpeed > 0.2 || getMovementSpeed() > 0.2) {
                return event.setAndContinue(SPRINT);
            } else if (forwardSpeed > 0 || getMovementSpeed() > 0 || event.isMoving()) {
                return event.setAndContinue(WALK);
            } else {
                return event.setAndContinue(BREATHE);
            }
        }
        protected <E extends KansenEntity> PlayState faceController(final AnimationState<E> event) {
            return event.setAndContinue(BLINK);
        }
        protected <E extends KansenEntity> PlayState pupilController(final AnimationState<E> event) {
            if (currentLight(this) == 0) {
                    return event.setAndContinue(LIGHT_0);
                } else if (currentLight(this) < 3) {
                    return event.setAndContinue(LIGHT_2);
                } else if (currentLight(this) < 5) {
                    return event.setAndContinue(LIGHT_4);
                } else if (currentLight(this) < 7) {
                    return event.setAndContinue(LIGHT_6);
                } else if (currentLight(this) < 9) {
                    return event.setAndContinue(LIGHT_8);
                } else {
                    return PlayState.STOP;
                }
        }
        protected <E extends KansenEntity> PlayState envController(final AnimationState<E> event) {
            if (getMovementSpeed() > 0 || forwardSpeed > 0 || event.isMoving()) {
                return event.setAndContinue(LOOKAROUND);
            } else if (this.getWorld().isSkyVisible(this.getBlockPos())) { // Check if the entity can see the sky
                return event.setAndContinue(BREEZE);
            }
            else return PlayState.STOP;
        }
        protected <E extends KansenEntity> PlayState clothingController(final AnimationState<E> event) {
            //switch to swim wear
            if (isTouchingWater()) {
                return event.setAndContinue(SWIMWEAR);
            }
            //switch to sleep wear
            else if (isSleeping()) {
                return event.setAndContinue(SANS_DEFAULT);
            }
            //switch to snow wear
            else if ((world.isRaining()) && (currentBiome.isCold(position, 0))) {
                return event.setAndContinue(SNOWING);
            }
            //switch to rainwear
            else if (world.isRaining()) {
                return event.setAndContinue(RAINING);
            }
            //otherwise default/neutral wear
            else {
                return PlayState.STOP;
            }
        }
        protected <E extends KansenEntity> PlayState riggingController(final AnimationState<E> event){
            if (isLeashed()) {
                return event.setAndContinue(RIGGING_INIT);
            }
            else if (!(isLeashed())){
                return event.setAndContinue(SANS_RIGGING);
            }
            else return PlayState.STOP;
        }

        @Override
        public AnimatableInstanceCache getAnimatableInstanceCache() {
            return this.geoCache;
        }

        public static DefaultAttributeContainer.Builder createLivingAttributes() {
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.MAX_HEALTH, 1.0)
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.MOVEMENT_SPEED, 1)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 0.75)
                    .add(EntityAttributes.FOLLOW_RANGE, 24);
        }
    }
}