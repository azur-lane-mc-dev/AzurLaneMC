package com.moonshinerabbit.azurlanemc;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.brain.*;
import net.minecraft.entity.ai.brain.task.MoveToTargetTask;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.tslat.smartbrainlib.api.SmartBrainOwner;
import net.tslat.smartbrainlib.api.core.BrainActivityGroup;
import net.tslat.smartbrainlib.api.core.SmartBrainProvider;
import net.tslat.smartbrainlib.api.core.behaviour.FirstApplicableBehaviour;
import net.tslat.smartbrainlib.api.core.behaviour.OneRandomBehaviour;
import net.tslat.smartbrainlib.api.core.behaviour.custom.look.LookAtTarget;
import net.tslat.smartbrainlib.api.core.behaviour.custom.misc.Idle;
import net.tslat.smartbrainlib.api.core.behaviour.custom.path.SetRandomSwimTarget;
import net.tslat.smartbrainlib.api.core.behaviour.custom.path.SetRandomWalkTarget;
import net.tslat.smartbrainlib.api.core.behaviour.custom.target.SetRandomLookTarget;
import net.tslat.smartbrainlib.api.core.behaviour.custom.target.TargetOrRetaliate;
import net.tslat.smartbrainlib.api.core.sensor.ExtendedSensor;
import net.tslat.smartbrainlib.api.core.sensor.custom.IncomingProjectilesSensor;
import net.tslat.smartbrainlib.api.core.sensor.custom.NearbyBlocksSensor;
import net.tslat.smartbrainlib.api.core.sensor.custom.NearbyItemsSensor;
import net.tslat.smartbrainlib.api.core.sensor.vanilla.*;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;

public class Manjuu {
    //mod id shortcut
    public static final String MOD_ID = "azur_lane_mc";

    //indicate entity registry keys
    public static final RegistryKey<EntityType<?>> MANJUU_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "manjuu"));
    public static final EntityType<ManjuuEntity> MANJUU = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "manjuu"),
            EntityType.Builder
                    .create(ManjuuEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.25f, 0.5f)
                    .build(MANJUU_KEY)
    );

    public static void initialize() {
        FabricDefaultAttributeRegistry.register(MANJUU, ManjuuEntity.createLivingAttributes());
    }

    public static class ManjuuEntity extends PathAwareEntity implements GeoEntity, SmartBrainOwner<ManjuuEntity> {
        public ManjuuEntity(EntityType<? extends ManjuuEntity> type, World world) {super(type, world);}

        @Override
        public void checkDespawn() {}

        //animation cache
        protected static final RawAnimation WALK = RawAnimation.begin().thenLoop("waddle");
        protected static final RawAnimation SLEEP = RawAnimation.begin().thenPlayAndHold("sleeping");
        protected static final RawAnimation SPRINT = RawAnimation.begin().thenLoop("sprint");
        protected static final RawAnimation BREEZE = RawAnimation.begin().thenLoop("breeze");
        protected static final RawAnimation BLINK = RawAnimation.begin().thenLoop("blink");
        protected static final RawAnimation FLUTTER = RawAnimation.begin().thenPlayAndHold("flutter");
        protected static final RawAnimation DOZE = RawAnimation.begin().thenPlayAndHold("dozing");
        private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

        World world = this.getWorld();
        BlockPos position = this.getBlockPos();
        public int currentLight (Entity entity) {
            if(entity.getWorld().getLightLevel(LightType.SKY,entity.getBlockPos())>8)
            {return entity.getWorld().getLightLevel(LightType.SKY, entity.getBlockPos());}
            else return entity.getWorld().getLightLevel(LightType.BLOCK, entity.getBlockPos());
        }

        // <editor-fold desc="Smart Brain">
        @Override
        protected Brain.Profile<?> createBrainProfile() {return new SmartBrainProvider<>(this);}

        @Override
        protected void mobTick(ServerWorld world) {super.mobTick(world);tickBrain(this);}

        //get sensors
        public List<ExtendedSensor<ManjuuEntity>> getSensors() {
            return ObjectArrayList.of(
                    new HurtBySensor<>(),
                    new IncomingProjectilesSensor<>(),
                    new InWaterSensor<>(),
                    new NearbyLivingEntitySensor<>(),
                    new NearbyPlayersSensor<>(),
                    new NearbyBlocksSensor<>(),
                    new NearbyHostileSensor<>(),
                    new NearbyItemsSensor<>(),
                    new NearestHomeSensor<>()
            );
        }

        //create activities
        public BrainActivityGroup<ManjuuEntity> getCoreTasks() {
            return BrainActivityGroup.coreTasks(
                    new LookAtTarget<>(),
                    new MoveToTargetTask()
            );
        }

        @SuppressWarnings("unchecked")
        public BrainActivityGroup<ManjuuEntity> getIdleTasks() {
            return BrainActivityGroup.idleTasks(
                    new FirstApplicableBehaviour<ManjuuEntity>(     // Run only one of the below behaviours, trying each one in order. Include the generic type because JavaC is silly
                            new TargetOrRetaliate<>(),              // Set the attack target and walk target based on nearby entities
                            new SetRandomLookTarget<>()             // Set a random look target
                    ),
                    new OneRandomBehaviour<>(                       // Run a random task from the below options
                            new SetRandomWalkTarget<>(),            // Set a random walk target to a nearby position
                            new SetRandomSwimTarget<>(),            // Set a random swim target to a nearby position
                            new Idle<>().runFor(entity -> entity.getRandom().nextInt(500))
                    )
            );
        }

        public BrainActivityGroup<ManjuuEntity> getFightTasks() {
            return BrainActivityGroup.fightTasks(
            );
        }
        // </editor-fold>

        //animation bundles
        @Override
        public void registerControllers(final AnimatableManager.ControllerRegistrar controllers) {
            controllers.add(new AnimationController<>(this, "Motion", 5, this::moveController));
            controllers.add(new AnimationController<>(this, "Face", 2, this::faceController));
            controllers.add(new AnimationController<>(this, "Environment", 5, this::envController));
            controllers.add(new AnimationController<>(this, "Sleep", 5, this::sleepController));
        }

        protected <E extends ManjuuEntity> PlayState moveController(final AnimationState<E> event) {
            if (forwardSpeed > 0.2 || getMovementSpeed() > 0.2) {
                return event.setAndContinue(SPRINT);
            } else if (!(this.isOnGround())) {
                return event.setAndContinue(FLUTTER);
            } else if (forwardSpeed > 0 || getMovementSpeed() > 0 || event.isMoving()){
                return event.setAndContinue(WALK);
            } else return PlayState.STOP;
        }

        protected <E extends ManjuuEntity> PlayState faceController(final AnimationState<E> event) {
            return event.setAndContinue(BLINK);
        }

        protected <E extends ManjuuEntity> PlayState envController(final AnimationState<E> event) {
            if (world.isSkyVisible(position)){
                return event.setAndContinue(BREEZE);
            } else return PlayState.STOP;
        }

        protected <E extends ManjuuEntity> PlayState sleepController(final AnimationState<E> event) {
            if ((currentLight(this)<2)&&!(getMovementSpeed() > 0 || forwardSpeed > 0 || event.isMoving())) {
                return event.setAndContinue(SLEEP);
            } else if ((currentLight(this) < 8)&&!(getMovementSpeed() > 0 || forwardSpeed > 0 || event.isMoving())) {
                return event.setAndContinue(DOZE);
            } else return PlayState.STOP;
        }

        @Override
        public AnimatableInstanceCache getAnimatableInstanceCache() {
            return this.geoCache;
        }

        public static DefaultAttributeContainer.Builder createLivingAttributes() {
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.MAX_HEALTH, 10.0)
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.MOVEMENT_SPEED, 0.25)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 0.75)
                    .add(EntityAttributes.FOLLOW_RANGE, 24);
        }
    }

    public static class ManjuuModel extends GeoModel<ManjuuEntity> {
        @Override
        public Identifier getModelResource(ManjuuEntity animatable, @Nullable GeoRenderer<ManjuuEntity> renderer) {
            return Identifier.of("azur_lane_mc", "geo/manjuu/manjuu.geo.json");
        }
        @Override
        public Identifier getTextureResource(ManjuuEntity animatable, @Nullable GeoRenderer<ManjuuEntity> renderer) {
            return Identifier.of("azur_lane_mc", "textures/entity/manjuu/manjuu.png");
        }
        @Override
        public Identifier getAnimationResource(ManjuuEntity entity) {
            return Identifier.of("azur_lane_mc", "animations/entity/manjuu.animation.json");
        }
    }
}