package com.moonshinerabbit.azurlanemc;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class NavalMounts {
    public static final String MOD_ID = "azur_lane_mc";

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, NAVAL_MOUNTS_KEY, NAVAL_MOUNTS);

        ItemGroupEvents.modifyEntriesEvent(NAVAL_MOUNTS_KEY)
                .register(itemGroup -> {
                    itemGroup.add(OLDEN_CANNON_MOUNT);
                    itemGroup.add(AA_GUN_MOUNT);
                    itemGroup.add(DD_GUN_MOUNT);
                    itemGroup.add(CL_GUN_MOUNT);
                    itemGroup.add(CA_GUN_MOUNT);
                    itemGroup.add(CB_GUN_MOUNT);
                    itemGroup.add(BB_GUN_MOUNT);

                    itemGroup.add(SURFTORP_TUBES);
                    itemGroup.add(SUBTORP_TUBES);
                    itemGroup.add(CHARGE_LAUNCHER);
                    itemGroup.add(CRANE);
                    itemGroup.add(HELIPAD);
                    itemGroup.add(MISSILE_LAUNCHER);
                });
    }

    public static final ItemGroup NAVAL_MOUNTS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(NavalMounts.CRANE))
            .displayName(Text.translatable("item_group.azur_lane_mc.naval_mounts")).build();
    public static final RegistryKey<ItemGroup> NAVAL_MOUNTS_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "naval_mounts"));

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
        return registeredItem;
    }

    // <editor-fold desc="gun mounts">
    public static final RegistryKey<Item> OLDEN_CANNON_MOUNT_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "olden_cannon_mount"));
    public static final Item OLDEN_CANNON_MOUNT = register(
            new Item(new Item.Settings()
                    .registryKey(OLDEN_CANNON_MOUNT_KEY)), OLDEN_CANNON_MOUNT_KEY);

    public static final RegistryKey<Item> AA_GUN_MOUNT_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "aa_gun_mount"));
    public static final Item AA_GUN_MOUNT = register(
            new Item(new Item.Settings()
                    .registryKey(AA_GUN_MOUNT_KEY)), AA_GUN_MOUNT_KEY);

    public static final RegistryKey<Item> DD_GUN_MOUNT_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "dd_gun_mount"));
    public static final Item DD_GUN_MOUNT = register(
            new Item(new Item.Settings()
                    .registryKey(DD_GUN_MOUNT_KEY)), DD_GUN_MOUNT_KEY);

    public static final RegistryKey<Item> CL_GUN_MOUNT_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "cl_gun_mount"));
    public static final Item CL_GUN_MOUNT = register(
            new Item(new Item.Settings()
                    .registryKey(CL_GUN_MOUNT_KEY)), CL_GUN_MOUNT_KEY);

    public static final RegistryKey<Item> CA_GUN_MOUNT_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "ca_gun_mount"));
    public static final Item CA_GUN_MOUNT = register(
            new Item(new Item.Settings()
                    .registryKey(CA_GUN_MOUNT_KEY)), CA_GUN_MOUNT_KEY);

    public static final RegistryKey<Item> CB_GUN_MOUNT_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "cb_gun_mount"));
    public static final Item CB_GUN_MOUNT = register(
            new Item(new Item.Settings()
                    .registryKey(CB_GUN_MOUNT_KEY)), CB_GUN_MOUNT_KEY);

    public static final RegistryKey<Item> BB_GUN_MOUNT_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "bb_gun_mount"));
    public static final Item BB_GUN_MOUNT = register(
            new Item(new Item.Settings()
                    .registryKey(BB_GUN_MOUNT_KEY)), BB_GUN_MOUNT_KEY);
    // </editor-fold>

    // <editor-fold desc="torpedo mounts">
    public static final RegistryKey<Item> SURFTORP_TUBES_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "surftorp_tubes"));
    public static final Item SURFTORP_TUBES = register(
            new Item(new Item.Settings()
                    .registryKey(SURFTORP_TUBES_KEY)), SURFTORP_TUBES_KEY);

    public static final RegistryKey<Item> SUBTORP_TUBES_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "subtorp_tubes"));
    public static final Item SUBTORP_TUBES = register(
            new Item(new Item.Settings()
                    .registryKey(SUBTORP_TUBES_KEY)), SUBTORP_TUBES_KEY);
    // </editor-fold>

    // <editor-fold desc="misc mounts">
    public static final RegistryKey<Item> CHARGE_LAUNCHER_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "charge_launcher"));
    public static final Item CHARGE_LAUNCHER = register(
            new Item(new Item.Settings()
                    .registryKey(CHARGE_LAUNCHER_KEY)), CHARGE_LAUNCHER_KEY);

    public static final RegistryKey<Item> CRANE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "crane"));
    public static final Item CRANE = register(
            new Item(new Item.Settings()
                    .registryKey(CRANE_KEY)), CRANE_KEY);

    public static final RegistryKey<Item> HELIPAD_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "helipad"));
    public static final Item HELIPAD = register(
            new Item(new Item.Settings()
                    .registryKey(HELIPAD_KEY)), HELIPAD_KEY);

    public static final RegistryKey<Item> MISSILE_LAUNCHER_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "missile_launcher"));
    public static final Item MISSILE_LAUNCHER = register(
            new Item(new Item.Settings()
                    .registryKey(MISSILE_LAUNCHER_KEY)), MISSILE_LAUNCHER_KEY);
    // </editor-fold>
}