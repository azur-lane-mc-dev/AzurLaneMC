package com.moonshinerabbit.azurlanemc;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class KansenEntities {
    //mod id shortcut
    public static final String MOD_ID = "azur_lane_mc";

    public static void initialize(){
        // register specific attributes for each unique kansen entity
        FabricDefaultAttributeRegistry.register(KANSEN_0019, KansenEntities.Kansen_0019Entity.createLivingAttributes());
        FabricDefaultAttributeRegistry.register(KANSEN_0065, KansenEntities.Kansen_0065Entity.createLivingAttributes());
        FabricDefaultAttributeRegistry.register(KANSEN_0077, KansenEntities.Kansen_0077Entity.createLivingAttributes());
        FabricDefaultAttributeRegistry.register(KANSEN_0101, KansenEntities.Kansen_0101Entity.createLivingAttributes());
        FabricDefaultAttributeRegistry.register(KANSEN_0115, KansenEntities.Kansen_0115Entity.createLivingAttributes());
        FabricDefaultAttributeRegistry.register(KANSEN_0155, KansenEntities.Kansen_0155Entity.createLivingAttributes());
        FabricDefaultAttributeRegistry.register(KANSEN_0224, KansenEntities.Kansen_0224Entity.createLivingAttributes());
        FabricDefaultAttributeRegistry.register(KANSEN_0236, KansenEntities.Kansen_0236Entity.createLivingAttributes());
    }

    //indicate kansen entity registry keys
    public static final RegistryKey<EntityType<?>> KANSEN_0019_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "kansen_0019"));
    public static final RegistryKey<EntityType<?>> KANSEN_0065_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "kansen_0065"));
    public static final RegistryKey<EntityType<?>> KANSEN_0077_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "kansen_0077"));
    public static final RegistryKey<EntityType<?>> KANSEN_0101_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "kansen_0101"));
    public static final RegistryKey<EntityType<?>> KANSEN_0115_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "kansen_0115"));
    public static final RegistryKey<EntityType<?>> KANSEN_0155_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "kansen_0155"));
    public static  final RegistryKey<EntityType<?>> KANSEN_0224_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "kansen_0224"));
    public static final RegistryKey<EntityType<?>> KANSEN_0236_KEY = RegistryKey.of(
            Registries.ENTITY_TYPE.getKey(), Identifier.of(MOD_ID, "kansen_0236"));

    // <editor-fold desc="register:USS Laffey">
    public static final EntityType<Kansen_0019Entity> KANSEN_0019 = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "kansen_0019"),
            EntityType.Builder
                    .create(Kansen_0019Entity::new, SpawnGroup.CREATURE)
                    .dimensions(0.5f, 1.5f)
                    .build(KANSEN_0019_KEY)
    );
    // </editor-fold>
    // <editor-fold desc="register:USS South Dakota">
    public static final EntityType<Kansen_0065Entity> KANSEN_0065 = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "kansen_0065"),
            EntityType.Builder
                    .create(Kansen_0065Entity::new, SpawnGroup.CREATURE)
                    .dimensions(0.5f, 1.75f)
                    .build(KANSEN_0065_KEY)
    );
    // </editor-fold>
    // <editor-fold desc="register:USS Enterprise">
    public static final EntityType<Kansen_0077Entity> KANSEN_0077 = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "kansen_0077"),
            EntityType.Builder
                    .create(Kansen_0077Entity::new, SpawnGroup.CREATURE)
                    .dimensions(0.75f, 1.75f)
                    .build(KANSEN_0077_KEY)
    );
    // </editor-fold>
    // <editor-fold desc="register:HMS Javelin">
    public static final EntityType<Kansen_0101Entity> KANSEN_0101 = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "kansen_0101"),
            EntityType.Builder
                    .create(Kansen_0101Entity::new, SpawnGroup.CREATURE)
                    .dimensions(0.5f, 1.5f)
                    .build(KANSEN_0101_KEY)
    );
    // </editor-fold>
    // <editor-fold desc="register:HMS Belfast">
    public static final EntityType<Kansen_0115Entity> KANSEN_0115 = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "kansen_0115"),
            EntityType.Builder
                    .create(Kansen_0115Entity::new, SpawnGroup.CREATURE)
                    .dimensions(0.5f, 1.75f)
                    .build(KANSEN_0115_KEY)
    );
    // </editor-fold>
    // <editor-fold desc="register:IJN Ayanami">
    public static final EntityType<Kansen_0155Entity> KANSEN_0155 = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "kansen_0155"),
            EntityType.Builder
                    .create(Kansen_0155Entity::new, SpawnGroup.CREATURE)
                    .dimensions(0.5f, 1.5f)
                    .build(KANSEN_0155_KEY)
    );
    // </editor-fold>
    // <editor-fold desc="register:IJN Akagi">
    public static final EntityType<Kansen_0224Entity> KANSEN_0224 = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "kansen_0224"),
            EntityType.Builder
                    .create(Kansen_0224Entity::new, SpawnGroup.CREATURE)
                    .dimensions(0.75f, 1.75f)
                    .build(KANSEN_0224_KEY)
    );
    // </editor-fold>
    // <editor-fold desc="register:KMS Z23">
    public static final EntityType<Kansen_0236Entity> KANSEN_0236 = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(MOD_ID, "kansen_0236"),
            EntityType.Builder
                    .create(Kansen_0236Entity::new, SpawnGroup.CREATURE)
                    .dimensions(0.5f, 1.5f)
                    .build(KANSEN_0236_KEY)
    );
    // </editor-fold>

    // <editor-fold desc="entity:USS Laffey">
    public static class Kansen_0019Entity extends Kansen.KansenEntity {
        public Kansen_0019Entity(EntityType<? extends Kansen.KansenEntity> type, World world) {super(type, world);}
        public static DefaultAttributeContainer.Builder createLivingAttributes(){
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.FOLLOW_RANGE, 24)
                    .add(EntityAttributes.MAX_HEALTH, 20.0)
                    .add(EntityAttributes.MOVEMENT_EFFICIENCY, 1.0)
                    .add(EntityAttributes.MOVEMENT_SPEED, 0.25)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 4);
        }
    }
    public static class Kansen_0019EntityModel extends GeoModel<Kansen_0019Entity> {
        @Override
        public Identifier getModelResource(Kansen_0019Entity animatable, @Nullable GeoRenderer<Kansen_0019Entity> renderer) {
            return Identifier.of("azur_lane_mc", "geo/0019/kansen_0019_default.geo.json");
        }
        @Override
        public Identifier getTextureResource(Kansen_0019Entity animatable, @Nullable GeoRenderer<Kansen_0019Entity> renderer) {
            return Identifier.of("azur_lane_mc", "textures/entity/0019/kansen_0019_default.png");
        }
        @Override
        public Identifier getAnimationResource(Kansen_0019Entity entity) {
            return Identifier.of("azur_lane_mc", "animations/entity/0019.animation.json");
        }
    }
    // </editor-fold>
    // <editor-fold desc="entity:USS South Dakota">
    public static class Kansen_0065Entity extends Kansen.KansenEntity {
        public Kansen_0065Entity(EntityType<? extends Kansen.KansenEntity> type, World world) {super(type, world);}
        public static DefaultAttributeContainer.Builder createLivingAttributes(){
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.FOLLOW_RANGE, 24)
                    .add(EntityAttributes.MAX_HEALTH, 20.0)
                    .add(EntityAttributes.MOVEMENT_EFFICIENCY, 1.0)
                    .add(EntityAttributes.MOVEMENT_SPEED, 0.25)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 4);
        }
    }
    public static class Kansen_0065EntityModel extends GeoModel<Kansen_0065Entity> {
        @Override
        public Identifier getModelResource(Kansen_0065Entity animatable, @Nullable GeoRenderer<Kansen_0065Entity> renderer) {
            return Identifier.of("azur_lane_mc", "geo/0065/kansen_0065_default.geo.json");
        }
        @Override
        public Identifier getTextureResource(Kansen_0065Entity animatable, @Nullable GeoRenderer<Kansen_0065Entity> renderer) {
            return Identifier.of("azur_lane_mc", "textures/entity/0065/kansen_0065_default.png");
        }
        @Override
        public Identifier getAnimationResource(Kansen_0065Entity entity) {
            return Identifier.of("azur_lane_mc", "animations/entity/0065.animation.json");
        }
    }
    // </editor-fold>
    // <editor-fold desc="entity:USS Enterprise">
    public static class Kansen_0077Entity extends Kansen.KansenEntity {
        public Kansen_0077Entity(EntityType<? extends Kansen.KansenEntity> type, World world) {super(type, world);}
        public static DefaultAttributeContainer.Builder createLivingAttributes(){
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.FOLLOW_RANGE, 24)
                    .add(EntityAttributes.MAX_HEALTH, 20.0)
                    .add(EntityAttributes.MOVEMENT_EFFICIENCY, 1.0)
                    .add(EntityAttributes.MOVEMENT_SPEED, 0.25)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 4);
        }
    }
    public static class Kansen_0077EntityModel extends GeoModel<Kansen_0077Entity> {
        @Override
        public Identifier getModelResource(Kansen_0077Entity animatable, @Nullable GeoRenderer<Kansen_0077Entity> renderer) {
            return Identifier.of("azur_lane_mc", "geo/0077/kansen_0077_default.geo.json");
        }
        @Override
        public Identifier getTextureResource(Kansen_0077Entity animatable, @Nullable GeoRenderer<Kansen_0077Entity> renderer) {
            return Identifier.of("azur_lane_mc", "textures/entity/0077/kansen_0077_default.png");
        }
        @Override
        public Identifier getAnimationResource(Kansen_0077Entity entity) {
            return Identifier.of("azur_lane_mc", "animations/entity/0077.animation.json");
        }
    }
    // </editor-fold>
    // <editor-fold desc="entity:HMS Javelin">
    public static class Kansen_0101Entity extends Kansen.KansenEntity {
        public Kansen_0101Entity(EntityType<? extends Kansen.KansenEntity> type, World world) {super(type, world);}
        public static DefaultAttributeContainer.Builder createLivingAttributes(){
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.FOLLOW_RANGE, 24)
                    .add(EntityAttributes.MAX_HEALTH, 20.0)
                    .add(EntityAttributes.MOVEMENT_EFFICIENCY, 1.0)
                    .add(EntityAttributes.MOVEMENT_SPEED, 0.25)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 4);
        }
    }
    public static class Kansen_0101EntityModel extends GeoModel<Kansen_0101Entity> {
        @Override
        public Identifier getModelResource(Kansen_0101Entity animatable, @Nullable GeoRenderer<Kansen_0101Entity> renderer) {
            return Identifier.of("azur_lane_mc", "geo/0101/kansen_0101_default.geo.json");
        }
        @Override
        public Identifier getTextureResource(Kansen_0101Entity animatable, @Nullable GeoRenderer<Kansen_0101Entity> renderer) {
            return Identifier.of("azur_lane_mc", "textures/entity/0101/kansen_0101_default.png");
        }
        @Override
        public Identifier getAnimationResource(Kansen_0101Entity entity) {
            return Identifier.of("azur_lane_mc", "animations/entity/0101.animation.json");
        }
    }
    // </editor-fold>
    // <editor-fold desc="entity:HMS Belfast">
    public static class Kansen_0115Entity extends Kansen.KansenEntity {
        public Kansen_0115Entity(EntityType<? extends Kansen.KansenEntity> type, World world) {super(type, world);}
        public static DefaultAttributeContainer.Builder createLivingAttributes(){
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.FOLLOW_RANGE, 24)
                    .add(EntityAttributes.MAX_HEALTH, 20.0)
                    .add(EntityAttributes.MOVEMENT_EFFICIENCY, 1.0)
                    .add(EntityAttributes.MOVEMENT_SPEED, 0.25)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 4);
        }
    }
    public static class Kansen_0115EntityModel extends GeoModel<Kansen_0115Entity> {
        @Override
        public Identifier getModelResource(Kansen_0115Entity animatable, @Nullable GeoRenderer<Kansen_0115Entity> renderer) {
            return Identifier.of("azur_lane_mc", "geo/0115/kansen_0115_default.geo.json");
        }
        @Override
        public Identifier getTextureResource(Kansen_0115Entity animatable, @Nullable GeoRenderer<Kansen_0115Entity> renderer) {
            return Identifier.of("azur_lane_mc", "textures/entity/0115/kansen_0115_default.png");
        }
        @Override
        public Identifier getAnimationResource(Kansen_0115Entity entity) {
            return Identifier.of("azur_lane_mc", "animations/entity/0115.animation.json");
        }
    }
    // </editor-fold>
    // <editor-fold desc="entity:IJN Ayanami">
    public static class Kansen_0155Entity extends Kansen.KansenEntity {
        public Kansen_0155Entity(EntityType<? extends Kansen.KansenEntity> type, World world) {
            super(type, world);
        }
        public static DefaultAttributeContainer.Builder createLivingAttributes(){
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.FOLLOW_RANGE, 24)
                    .add(EntityAttributes.MAX_HEALTH, 20.0)
                    .add(EntityAttributes.MOVEMENT_EFFICIENCY, 1.0)
                    .add(EntityAttributes.MOVEMENT_SPEED, 0.25)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 4);
        }
    }
    public static class Kansen_0155EntityModel extends GeoModel<Kansen_0155Entity> {
        @Override
        public Identifier getModelResource(Kansen_0155Entity animatable, @Nullable GeoRenderer<Kansen_0155Entity> renderer) {
            return Identifier.of("azur_lane_mc", "geo/0155/kansen_0155_default.geo.json");
        }
        @Override
        public Identifier getTextureResource(Kansen_0155Entity animatable, @Nullable GeoRenderer<Kansen_0155Entity> renderer) {
            return Identifier.of("azur_lane_mc", "textures/entity/0155/kansen_0155_default.png");
        }
        @Override
        public Identifier getAnimationResource(Kansen_0155Entity entity) {
            return Identifier.of("azur_lane_mc", "animations/entity/0155.animation.json");
        }
    }
    // </editor-fold>
    // <editor-fold desc="entity:IJN Akagi">
    public static class Kansen_0224Entity extends Kansen.KansenEntity {
        public Kansen_0224Entity(EntityType<? extends Kansen.KansenEntity> type, World world) {
            super(type, world);
        }
        public static DefaultAttributeContainer.Builder createLivingAttributes(){
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.FOLLOW_RANGE, 24)
                    .add(EntityAttributes.MAX_HEALTH, 20.0)
                    .add(EntityAttributes.MOVEMENT_EFFICIENCY, 1.0)
                    .add(EntityAttributes.MOVEMENT_SPEED, 0.25)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 4);
        }
    }
    public static class Kansen_0224EntityModel extends GeoModel<Kansen_0224Entity> {
        @Override
        public Identifier getModelResource(Kansen_0224Entity animatable, @Nullable GeoRenderer<Kansen_0224Entity> renderer) {
            return Identifier.of("azur_lane_mc", "geo/0224/kansen_0224_default.geo.json");
        }
        @Override
        public Identifier getTextureResource(Kansen_0224Entity animatable, @Nullable GeoRenderer<Kansen_0224Entity> renderer) {
            return Identifier.of("azur_lane_mc", "textures/entity/0224/kansen_0224_default.png");
        }
        @Override
        public Identifier getAnimationResource(Kansen_0224Entity entity) {
            return Identifier.of("azur_lane_mc", "animations/entity/0224.animation.json");
        }
    }
    // </editor-fold>
    // <editor-fold desc="entity:KMS Z23">
    public static class Kansen_0236Entity extends Kansen.KansenEntity {
        public Kansen_0236Entity(EntityType<? extends Kansen.KansenEntity> type, World world) {
            super(type, world);
        }
        public static DefaultAttributeContainer.Builder createLivingAttributes(){
            return LivingEntity.createLivingAttributes()
                    .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3)
                    .add(EntityAttributes.FOLLOW_RANGE, 24)
                    .add(EntityAttributes.MAX_HEALTH, 20.0)
                    .add(EntityAttributes.MOVEMENT_EFFICIENCY, 1.0)
                    .add(EntityAttributes.MOVEMENT_SPEED, 0.25)
                    .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 4);
        }
    }
    public static class Kansen_0236EntityModel extends GeoModel<Kansen_0236Entity> {
        @Override
        public Identifier getModelResource(Kansen_0236Entity animatable, @Nullable GeoRenderer<Kansen_0236Entity> renderer) {
            return Identifier.of("azur_lane_mc", "geo/0236/kansen_0236_default.geo.json");
        }
        @Override
        public Identifier getTextureResource(Kansen_0236Entity animatable, @Nullable GeoRenderer<Kansen_0236Entity> renderer) {
            return Identifier.of("azur_lane_mc", "textures/entity/0236/kansen_0236_default.png");
        }
        @Override
        public Identifier getAnimationResource(Kansen_0236Entity entity) {
            return Identifier.of("azur_lane_mc", "animations/entity/0236.animation.json");
        }
    }
    // </editor-fold>
}