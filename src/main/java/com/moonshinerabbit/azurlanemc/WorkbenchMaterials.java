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

public class WorkbenchMaterials {
    public static final String MOD_ID = "azur_lane_mc";

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, WORKBENCH_MATERIALS_KEY, WORKBENCH_MATERIALS);

        ItemGroupEvents.modifyEntriesEvent(WORKBENCH_MATERIALS_KEY)
                .register(itemGroup -> {
                    itemGroup.add(BARREL_GAUGER);
                    itemGroup.add(NAVAL_RECORD);
                });
    }

    public static final ItemGroup WORKBENCH_MATERIALS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(WorkbenchMaterials.BARREL_GAUGER))
            .displayName(Text.translatable("item_group.azur_lane_mc.workbench_materials")).build();
    public static final RegistryKey<ItemGroup> WORKBENCH_MATERIALS_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "workbench_materials"));

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
        return registeredItem;
    }

    // <editor-fold desc="workbench creation">
    //barrel gauge, diamond item with durability that facilitates shaping each barrel into the specified caliber
    public static final RegistryKey<Item> BARREL_GAUGER_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "barrel_gauger"));
    public static final Item BARREL_GAUGER = register(
            new Item(new Item.Settings()
                    .registryKey(BARREL_GAUGER_KEY)), BARREL_GAUGER_KEY);

    //naval records, loot item used to research hulls for kansen creation
    public static final RegistryKey<Item> NAVAL_RECORD_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "naval_record"));
    public static final Item NAVAL_RECORD = register(
            new Item(new Item.Settings()
                    .registryKey(NAVAL_RECORD_KEY)), NAVAL_RECORD_KEY);
    // </editor-fold>
}