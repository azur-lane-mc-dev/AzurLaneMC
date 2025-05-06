package com.moonshinerabbit.azurlanemc;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class KansenSounds {
    private KansenSounds()  {}
    public static final String MOD_ID = "azur_lane_mc";

    public static final SoundEvent AKAGI_BREATH = registerSound("akagi_breath");
    public static final SoundEvent AYANAMI_BREATH = registerSound("ayanami_breath");
    public static final SoundEvent ENTERPRISE_BREATH = registerSound("enterprise_breath");
    public static final SoundEvent JAVELIN_BREATH = registerSound("javelin_breath");
    public static final SoundEvent LAFFEY_BREATH = registerSound("laffey_breath");
    public static final SoundEvent Z23_BREATH = registerSound("z23_breath");

    private static SoundEvent registerSound(String id) {
        Identifier identifier = Identifier.of(MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
    public static void initialize() {}
}
