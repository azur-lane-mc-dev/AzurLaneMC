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

public class WisdomCubes {
    public static final String MOD_ID = "azur_lane_mc";

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, WISDOM_CUBES_GROUP_KEY, WISDOM_CUBES_GROUP);

        ItemGroupEvents.modifyEntriesEvent(WISDOM_CUBES_GROUP_KEY)
                .register(itemGroup -> {
                    itemGroup.add(WISDOM_CUBE_EMPTY);
                });
    }

    public static final ItemGroup WISDOM_CUBES_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(WisdomCubes.WISDOM_CUBE_EMPTY))
            .displayName(Text.translatable("item_group.azur_lane_mc.wisdom_cubes")).build();
    public static final RegistryKey<ItemGroup> WISDOM_CUBES_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "wisdom_cubes"));

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
        return registeredItem;
    }

    //empty Wisdom Cube item
    public static final RegistryKey<Item> WISDOM_CUBE_EMPTY_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "wisdom_cube_empty"));
    public static final Item WISDOM_CUBE_EMPTY = register(
            new Item(new Item.Settings().maxCount(16)
                    .registryKey(WISDOM_CUBE_EMPTY_KEY)), WISDOM_CUBE_EMPTY_KEY);
}