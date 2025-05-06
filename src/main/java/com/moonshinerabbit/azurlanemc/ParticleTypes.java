package com.moonshinerabbit.azurlanemc;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ParticleTypes {
    public static final String MOD_ID = "azur_lane_mc";

    public static final SimpleParticleType WISDOM_PARTICLE = FabricParticleTypes.simple();

    public static void initialize(){
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "rigginginit"), WISDOM_PARTICLE);
    }

    public static class WisdomParticle extends BillboardParticle {
        protected WisdomParticle(ClientWorld world, double x, double y, double z,
                                 double velocityX, double velocityY, double velocityZ) {
            super(world, x, y, z, velocityX, velocityY, velocityZ);
            this.maxAge = 100;
            this.scale = 0.1F;
            this.setVelocity(velocityX, velocityY, velocityZ);
        }
        @Override
        protected float getMinU() {return 0.4651162790697674F;}
        @Override
        protected float getMaxU() {return 0.5F;}
        @Override
        protected float getMinV() {return 0.875F;}
        @Override
        protected float getMaxV() {return 0.9375F;}

        @Override
        public void tick() {super.tick();}
        @Override
        public ParticleTextureSheet getType() {
            return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
        }
        public static class Factory implements ParticleFactory<SimpleParticleType> {
            @Override
            public Particle createParticle(SimpleParticleType type, ClientWorld world,
                                           double x, double y, double z,
                                           double velocityX, double velocityY, double velocityZ) {
                return new WisdomParticle(world, x, y, z, velocityX, velocityY, velocityZ);
            }
        }
    }
}