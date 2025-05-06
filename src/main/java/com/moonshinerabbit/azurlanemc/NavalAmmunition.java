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

public class NavalAmmunition {
    public static final String MOD_ID = "azur_lane_mc";

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, NAVAL_AMMUNITION_KEY, NAVAL_AMMUNITION);

        ItemGroupEvents.modifyEntriesEvent(NAVAL_AMMUNITION_KEY)
                .register(itemGroup -> {
                    itemGroup.add(LB100_BOMB);
                    itemGroup.add(LB500_BOMB);
                    itemGroup.add(LB800_BOMB);
                    itemGroup.add(LB1000_BOMB);
                    itemGroup.add(LB1600_BOMB);
                    itemGroup.add(LB2000_BOMB);
                    itemGroup.add(MM400_AVITORPEDO);
                    itemGroup.add(MM450_AVITORPEDO);
                    itemGroup.add(MM500_AVITORPEDO);
                    itemGroup.add(MM569_AVITORPEDO);
                    itemGroup.add(DEPTHCHARGE_AVI);
                    itemGroup.add(MM7P5_SHELL); // AVI
                    itemGroup.add(MM7P7_SHELL); // AVI
                    itemGroup.add(MM7P92_SHELL); // AVI
                    itemGroup.add(MM13_SHELL); // AVI
                    itemGroup.add(MM23_SHELL); // AVI
                    itemGroup.add(RP3_ROCKET);
                    itemGroup.add(HVAR_ROCKET);
                    itemGroup.add(WFRGR21_ROCKET);
                    itemGroup.add(BR21_ROCKET);
                    itemGroup.add(S21_ROCKET);
                    itemGroup.add(TINYTIM_ROCKET);

                    itemGroup.add(LB12_CANNONBALL); // 100/80/40
                    itemGroup.add(LB24_CANNONBALL); // 100/80/60
                    itemGroup.add(LB36_CANNONBALL); // 140/110/90
                    itemGroup.add(SY1_MISSILE);
                    itemGroup.add(SY1A_MISSILE);
                    itemGroup.add(DEPTHCHARGE);
                    itemGroup.add(IMPROVEDCHARGE);
                    itemGroup.add(HEDGEHOG_MORTAR);

                    itemGroup.add(MM533_SURFTORP);
                    itemGroup.add(MM533_MAG_SURFTORP);
                    itemGroup.add(MM533_MAGIMPROV_SURFTORP);
                    itemGroup.add(MM533_MK9_SURFTORP);
                    itemGroup.add(MM533_MK17_SURFTORP);
                    itemGroup.add(MM533_MK35CONSEC_SURFTORP);
                    itemGroup.add(MM550_SURFTORP);
                    itemGroup.add(MM550_MOD_SURFTORP);
                    itemGroup.add(MM550_MODIMPROV_SURFTORP);
                    itemGroup.add(MM610_SURFTORP);
                    itemGroup.add(MM610_KAI_SURFTORP);
                    itemGroup.add(G7A_SUBTORP);
                    itemGroup.add(G7E_SUBTORP);
                    itemGroup.add(MK8_SUBTORP);
                    itemGroup.add(MK12_SUBTORP);
                    itemGroup.add(MK14_SUBTORP);
                    itemGroup.add(MK16_SUBTORP);
                    itemGroup.add(MK18_SUBTORP);
                    itemGroup.add(MK20S_BIDDER_SUBTORP);
                    itemGroup.add(MK28_SUBTORP);
                    itemGroup.add(MM550_24V_SUBTORP);
                    itemGroup.add(SI270_SUBTORP);
                    itemGroup.add(TYPE92_SUBTORP);
                    itemGroup.add(TYPE92_KAI_SUBTORP);
                    itemGroup.add(TYPE95_KAIOXY_SUBTORP);
                    itemGroup.add(TYPE95_OXY_SUBTORP);
                    itemGroup.add(TYPE96_SUBTORP);

                    itemGroup.add(MM12P7_SHELL); // AA && AVI
                    itemGroup.add(MM13P2_SHELL); // AA
                    itemGroup.add(MM20_SHELL); // AA && AVI
                    itemGroup.add(MM25_SHELL); // AA
                    itemGroup.add(MM28_SHELL); // AA
                    itemGroup.add(MM30_SHELL); // AA && AVI
                    itemGroup.add(MM37_SHELL); // AA
                    itemGroup.add(MM40_SHELL); // AA
                    itemGroup.add(MM55_SHELL); // AA
                    itemGroup.add(MM57_SHELL); // AA
                    itemGroup.add(MM65_SHELL); // AA
                    itemGroup.add(MM76_SHELL); // AA
                    itemGroup.add(MM80_SHELL); // AA
                    itemGroup.add(MM88_SHELL); // AA
                    itemGroup.add(MM90_SHELL); // AA
                    itemGroup.add(MM105_SHELL); // AA
                    itemGroup.add(MM134_SHELL); // AA
                    itemGroup.add(MM76_ADVANCE_SHELL); // 100/60/20
                    itemGroup.add(MM100_SHELL); // 100/50/20 && AA
                    itemGroup.add(MM100_HE_SHELL); // 120/60/60
                    itemGroup.add(MM102_SHELL); // 100/50/20 && AA
                    itemGroup.add(MM102_ADVANCE_SHELL); // 100/60/20
                    itemGroup.add(MM113_SHELL); // 100/50/20 && AA
                    itemGroup.add(MM114_SHELL); // 100/50/20
                    itemGroup.add(MM120_SHELL); // 100/50/20 && AA
                    itemGroup.add(MM120_HE_SHELL); // 120/60/60
                    itemGroup.add(MM127_SHELL); // 100/50/20 && AA
                    itemGroup.add(MM127_AP_SHELL); // 90/70/40
                    itemGroup.add(MM127_HE_SHELL); // 120/60/60
                    itemGroup.add(MM128_AP_SHELL); // 90/70/40
                    itemGroup.add(MM130_SHELL); // 100/50/20
                    itemGroup.add(MM130_IMPROV_SHELL); // 100/55/25
                    itemGroup.add(MM130_HE_SHELL); // 120/60/60
                    itemGroup.add(MM134_AP_SHELL); // 90/70/40
                    itemGroup.add(MM135_SAP_SHELL); // 95/95/25
                    itemGroup.add(MM137_APIMPROV_SHELL); // 110/75/40
                    itemGroup.add(MM138P6_SHELL); // 100/50/20
                    itemGroup.add(MM138P6_APSUPER_SHELL); //115/90/55
                    itemGroup.add(MM138P6_HE_SHELL); // 120/60/60

                    itemGroup.add(MM140_HE_SHELL); // 145/105/70
                    itemGroup.add(MM150_SHELL); // 100/75/40
                    itemGroup.add(MM150_AP_SHELL); // 100/80/60
                    itemGroup.add(MM150_APALT_SHELL); // 100/95/55
                    itemGroup.add(MM150_HEIMPROV_SHELL); // 150/105/70
                    itemGroup.add(MM152_SHELL); // 100/75/40
                    itemGroup.add(MM152_AP_SHELL); // 100/80/60
                    itemGroup.add(MM152_APIMPROV_SHELL); // 100/100/60
                    itemGroup.add(MM152_APSUPER_SHELL); // 110/90/70
                    itemGroup.add(MM152_HE_SHELL); // 145/105/70
                    itemGroup.add(MM152_HESUPER_SHELL); // 145/110/75
                    itemGroup.add(MM152_HEWEAK_SHELL); // 140/105/70
                    itemGroup.add(MM152_SAP_SHELL); // 65/125/65
                    itemGroup.add(MM155_SHELL); // 100/75/40
                    itemGroup.add(MM155_HE_SHELL); // 145/105/70
                    itemGroup.add(MM155_HEIMPROV_SHELL); // 150/105/70
                    itemGroup.add(MM180_APBOOSTED_SHELL); // 115/85/65
                    itemGroup.add(MM203_SHELL); // 100/90/50
                    itemGroup.add(MM203_AP_SHELL); // 75/110/75
                    itemGroup.add(MM203_APADVANCE_SHELL); // 80/115/75
                    itemGroup.add(MM203_APIMPROV_SHELL); // 75/110/85
                    itemGroup.add(MM203_APSUPER_SHELL); // 85/120/85
                    itemGroup.add(MM203_HE_SHELL); // 135/95/70
                    itemGroup.add(MM203_HEPLUS_SHELL); // 140/95/70
                    itemGroup.add(MM203_HEIMPROV_SHELL); // 140/100/70
                    itemGroup.add(MM203_SAP_SHELL); // 65/125/65
                    itemGroup.add(MM234_IMPROV_SHELL); // 115/115/95
                    itemGroup.add(MM234_ADVANCE_SHELL); // 115/110/90
                    itemGroup.add(MM240_APBOOSTED_SHELL); // 65/110/95
                    itemGroup.add(MM254_APALT_SHELL); // 70/110/90

                    itemGroup.add(MM283_SHELL); // 70/100/90
                    itemGroup.add(MM283_AP_SHELL); // 75/110/75
                    itemGroup.add(MM305_SHELL); // 70/100/90
                    itemGroup.add(MM305_APBOOSTED_SHELL); // 70/115/80
                    itemGroup.add(MM305_APIMPROV_SHELL); // 75/115/75
                    itemGroup.add(MM305_APSUPER_SHELL); // 60/120/100
                    itemGroup.add(MM305_HE_SHELL); // 140/110/90
                    itemGroup.add(MM310_HE_SHELL); // 135/100/75
                    itemGroup.add(MM320_AP_SHELL); // 45/130/110
                    itemGroup.add(MM330_APALT_SHELL); // 55/110/90
                    itemGroup.add(MM330_AP_SHELL); // 45/130/110
                    itemGroup.add(MM340_SHELL); // 70/100/90
                    itemGroup.add(MM356_HE_SHELL); // 140/110/90
                    itemGroup.add(MM380_AP_SHELL); // 45/130/110
                    itemGroup.add(MM380_APSUPER_SHELL); // 40/140/115
                    itemGroup.add(MM380_HE_SHELL); // 140/110/90
                    itemGroup.add(MM381_AP_SHELL); // 45/130/110
                    itemGroup.add(MM381_APBOOSTED_SHELL); // 40/135/115
                    itemGroup.add(MM381_HE_SHELL); // 140/110/90
                    itemGroup.add(MM406_SHELL); // 70/100/90
                    itemGroup.add(MM406_AP_SHELL); // 45/130/110
                    itemGroup.add(MM406_APADVANCE_SHELL); // 45/130/115
                    itemGroup.add(MM406_APALT_SHELL); // 40/145/110
                    itemGroup.add(MM406_APHYPER_SHELL); // 40/140/120
                    itemGroup.add(MM406_APMOD_SHELL); // 40/140/115
                    itemGroup.add(MM406_HE_SHELL); // 140/110/90
                    itemGroup.add(MM406_SAP_SHELL); // 100/150/50
                    itemGroup.add(MM406_SAPSUPER_SHELL); // 100/160/50
                    itemGroup.add(MM410_AP_SHELL); // 45/130/110
                    itemGroup.add(MM410_APKAI_SHELL); // 40/130/130
                    itemGroup.add(MM410_HE_SHELL); // 140/110/90
                    itemGroup.add(MM410_SCATTER_SHELL); // 140/110/90
                    itemGroup.add(MM457_APSUPERIOR_SHELL); // 55/145/125
                    itemGroup.add(MM460_APSUPREME_SHELL); // 55/140/135
                });
    }

    public static final ItemGroup NAVAL_AMMUNITION = FabricItemGroup.builder()
            .icon(() -> new ItemStack(NavalAmmunition.MM283_SHELL))
            .displayName(Text.translatable("item_group.azur_lane_mc.naval_ammunition")).build();
    public static final RegistryKey<ItemGroup> NAVAL_AMMUNITION_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "naval_ammunition"));

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
        return registeredItem;
    }

    // <editor-fold desc="aviation ordinance">
    public static final RegistryKey<Item> LB100_BOMB_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb100_bomb"));
    public static final Item LB100_BOMB = register(
            new Item(new Item.Settings()
                    .registryKey(LB100_BOMB_KEY)), LB100_BOMB_KEY);

    public static final RegistryKey<Item> LB500_BOMB_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb500_bomb"));
    public static final Item LB500_BOMB = register(
            new Item(new Item.Settings()
                    .registryKey(LB500_BOMB_KEY)), LB500_BOMB_KEY);

    public static final RegistryKey<Item> LB800_BOMB_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb800_bomb"));
    public static final Item LB800_BOMB = register(
            new Item(new Item.Settings()
                    .registryKey(LB800_BOMB_KEY)), LB800_BOMB_KEY);

    public static final RegistryKey<Item> LB1000_BOMB_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb1000_bomb"));
    public static final Item LB1000_BOMB = register(
            new Item(new Item.Settings()
                    .registryKey(LB1000_BOMB_KEY)), LB1000_BOMB_KEY);

    public static final RegistryKey<Item> LB1600_BOMB_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb1600_bomb"));
    public static final Item LB1600_BOMB = register(
            new Item(new Item.Settings()
                    .registryKey(LB1600_BOMB_KEY)), LB1600_BOMB_KEY);

    public static final RegistryKey<Item> LB2000_BOMB_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb2000_bomb"));
    public static final Item LB2000_BOMB = register(
            new Item(new Item.Settings()
                    .registryKey(LB2000_BOMB_KEY)), LB2000_BOMB_KEY);

    public static final RegistryKey<Item> MM400_AVITORPEDO_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm400_avitorpedo"));
    public static final Item MM400_AVITORPEDO = register(
            new Item(new Item.Settings()
                    .registryKey(MM400_AVITORPEDO_KEY)), MM400_AVITORPEDO_KEY);

    public static final RegistryKey<Item> MM450_AVITORPEDO_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm450_avitorpedo"));
    public static final Item MM450_AVITORPEDO = register(
            new Item(new Item.Settings()
                    .registryKey(MM450_AVITORPEDO_KEY)), MM450_AVITORPEDO_KEY);

    public static final RegistryKey<Item> MM500_AVITORPEDO_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm500_avitorpedo"));
    public static final Item MM500_AVITORPEDO = register(
            new Item(new Item.Settings()
                    .registryKey(MM500_AVITORPEDO_KEY)), MM500_AVITORPEDO_KEY);

    public static final RegistryKey<Item> MM569_AVITORPEDO_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm569_avitorpedo"));
    public static final Item MM569_AVITORPEDO = register(
            new Item(new Item.Settings()
                    .registryKey(MM569_AVITORPEDO_KEY)), MM569_AVITORPEDO_KEY);

    public static final RegistryKey<Item> DEPTHCHARGE_AVI_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "depthcharge_avi"));
    public static final Item DEPTHCHARGE_AVI = register(
            new Item(new Item.Settings()
                    .registryKey(DEPTHCHARGE_AVI_KEY)), DEPTHCHARGE_AVI_KEY);

    public static final RegistryKey<Item> MM7P5_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm7p5_shell"));
    public static final Item MM7P5_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM7P5_SHELL_KEY)), MM7P5_SHELL_KEY);

    public static final RegistryKey<Item> MM7P7_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm7p7_shell"));
    public static final Item MM7P7_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM7P7_SHELL_KEY)), MM7P7_SHELL_KEY);

    public static final RegistryKey<Item> MM7P92_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm7p92_shell"));
    public static final Item MM7P92_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM7P92_SHELL_KEY)), MM7P92_SHELL_KEY);

    public static final RegistryKey<Item> MM13_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm13_shell"));
    public static final Item MM13_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM13_SHELL_KEY)), MM13_SHELL_KEY);

    public static final RegistryKey<Item> MM23_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm23_shell"));
    public static final Item MM23_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM23_SHELL_KEY)), MM23_SHELL_KEY);

    public static final RegistryKey<Item> RP3_ROCKET_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "rp3_rocket"));
    public static final Item RP3_ROCKET = register(
            new Item(new Item.Settings()
                    .registryKey(RP3_ROCKET_KEY)), RP3_ROCKET_KEY);

    public static final RegistryKey<Item> HVAR_ROCKET_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "hvar_rocket"));
    public static final Item HVAR_ROCKET = register(
            new Item(new Item.Settings()
                    .registryKey(HVAR_ROCKET_KEY)), HVAR_ROCKET_KEY);

    public static final RegistryKey<Item> WFRGR21_ROCKET_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "wfrgr21_rocket"));
    public static final Item WFRGR21_ROCKET = register(
            new Item(new Item.Settings()
                    .registryKey(WFRGR21_ROCKET_KEY)), WFRGR21_ROCKET_KEY);

    public static final RegistryKey<Item> BR21_ROCKET_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "br21_rocket"));
    public static final Item BR21_ROCKET = register(
            new Item(new Item.Settings()
                    .registryKey(BR21_ROCKET_KEY)), BR21_ROCKET_KEY);

    public static final RegistryKey<Item> S21_ROCKET_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "s21_rocket"));
    public static final Item S21_ROCKET = register(
            new Item(new Item.Settings()
                    .registryKey(S21_ROCKET_KEY)), S21_ROCKET_KEY);

    public static final RegistryKey<Item> TINYTIM_ROCKET_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "tinytim_rocket"));
    public static final Item TINYTIM_ROCKET = register(
            new Item(new Item.Settings()
                    .registryKey(TINYTIM_ROCKET_KEY)), TINYTIM_ROCKET_KEY);
    // </editor-fold>

    // <editor-fold desc="torpedoes">
    public static final RegistryKey<Item> MM533_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm533_surftorp"));
    public static final Item MM533_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM533_SURFTORP_KEY)), MM533_SURFTORP_KEY);

    public static final RegistryKey<Item> MM533_MAG_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm533_mag_surftorp"));
    public static final Item MM533_MAG_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM533_MAG_SURFTORP_KEY)), MM533_MAG_SURFTORP_KEY);

    public static final RegistryKey<Item> MM533_MAGIMPROV_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm533_magimprov_surftorp"));
    public static final Item MM533_MAGIMPROV_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM533_MAGIMPROV_SURFTORP_KEY)), MM533_MAGIMPROV_SURFTORP_KEY);

    public static final RegistryKey<Item> MM533_MK9_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm533_mk9_surftorp"));
    public static final Item MM533_MK9_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM533_MK9_SURFTORP_KEY)), MM533_MK9_SURFTORP_KEY);

    public static final RegistryKey<Item> MM533_MK17_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm533_mk17_surftorp"));
    public static final Item MM533_MK17_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM533_MK17_SURFTORP_KEY)), MM533_MK17_SURFTORP_KEY);

    public static final RegistryKey<Item> MM533_MK35CONSEC_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm533_mk35consec_surftorp"));
    public static final Item MM533_MK35CONSEC_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM533_MK35CONSEC_SURFTORP_KEY)), MM533_MK35CONSEC_SURFTORP_KEY);

    public static final RegistryKey<Item> MM550_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm550_surftorp"));
    public static final Item MM550_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM550_SURFTORP_KEY)), MM550_SURFTORP_KEY);

    public static final RegistryKey<Item> MM550_MOD_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm550_mod_surftorp"));
    public static final Item MM550_MOD_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM550_MOD_SURFTORP_KEY)), MM550_MOD_SURFTORP_KEY);

    public static final RegistryKey<Item> MM550_MODIMPROV_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm550_modimprov_surftorp"));
    public static final Item MM550_MODIMPROV_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM550_MODIMPROV_SURFTORP_KEY)), MM550_MODIMPROV_SURFTORP_KEY);

    public static final RegistryKey<Item> MM610_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm610_surftorp"));
    public static final Item MM610_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM610_SURFTORP_KEY)), MM610_SURFTORP_KEY);

    public static final RegistryKey<Item> MM610_KAI_SURFTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm610_kai_surftorp"));
    public static final Item MM610_KAI_SURFTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM610_KAI_SURFTORP_KEY)), MM610_KAI_SURFTORP_KEY);

    public static final RegistryKey<Item> G7A_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "g7a_subtorp"));
    public static final Item G7A_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(G7A_SUBTORP_KEY)), G7A_SUBTORP_KEY);

    public static final RegistryKey<Item> G7E_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "g7e_subtorp"));
    public static final Item G7E_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(G7E_SUBTORP_KEY)), G7E_SUBTORP_KEY);

    public static final RegistryKey<Item> MK8_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mk8_subtorp"));
    public static final Item MK8_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MK8_SUBTORP_KEY)), MK8_SUBTORP_KEY);

    public static final RegistryKey<Item> MK12_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mk12_subtorp"));
    public static final Item MK12_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MK12_SUBTORP_KEY)), MK12_SUBTORP_KEY);

    public static final RegistryKey<Item> MK14_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mk14_subtorp"));
    public static final Item MK14_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MK14_SUBTORP_KEY)), MK14_SUBTORP_KEY);

    public static final RegistryKey<Item> MK16_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mk16_subtorp"));
    public static final Item MK16_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MK16_SUBTORP_KEY)), MK16_SUBTORP_KEY);

    public static final RegistryKey<Item> MK18_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mk18_subtorp"));
    public static final Item MK18_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MK18_SUBTORP_KEY)), MK18_SUBTORP_KEY);

    public static final RegistryKey<Item> MK20S_BIDDER_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mk20s_bidder_subtorp"));
    public static final Item MK20S_BIDDER_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MK20S_BIDDER_SUBTORP_KEY)), MK20S_BIDDER_SUBTORP_KEY);

    public static final RegistryKey<Item> MK28_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mk28_subtorp"));
    public static final Item MK28_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MK28_SUBTORP_KEY)), MK28_SUBTORP_KEY);

    public static final RegistryKey<Item> MM550_24V_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm550_24v_subtorp"));
    public static final Item MM550_24V_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(MM550_24V_SUBTORP_KEY)), MM550_24V_SUBTORP_KEY);

    public static final RegistryKey<Item> SI270_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "si270_subtorp"));
    public static final Item SI270_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(SI270_SUBTORP_KEY)), SI270_SUBTORP_KEY);

    public static final RegistryKey<Item> TYPE92_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "type92_subtorp"));
    public static final Item TYPE92_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(TYPE92_SUBTORP_KEY)), TYPE92_SUBTORP_KEY);

    public static final RegistryKey<Item> TYPE92_KAI_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "type92_kai_subtorp"));
    public static final Item TYPE92_KAI_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(TYPE92_KAI_SUBTORP_KEY)), TYPE92_KAI_SUBTORP_KEY);

    public static final RegistryKey<Item> TYPE95_KAIOXY_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "type95_kaioxy_subtorp"));
    public static final Item TYPE95_KAIOXY_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(TYPE95_KAIOXY_SUBTORP_KEY)), TYPE95_KAIOXY_SUBTORP_KEY);

    public static final RegistryKey<Item> TYPE95_OXY_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "type95_oxy_subtorp"));
    public static final Item TYPE95_OXY_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(TYPE95_OXY_SUBTORP_KEY)), TYPE95_OXY_SUBTORP_KEY);

    public static final RegistryKey<Item> TYPE96_SUBTORP_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "type96_subtorp"));
    public static final Item TYPE96_SUBTORP = register(
            new Item(new Item.Settings()
                    .registryKey(TYPE96_SUBTORP_KEY)), TYPE96_SUBTORP_KEY);
    // </editor-fold>

    // <editor-fold desc="small-cal naval shells (<140mm)">
    public static final RegistryKey<Item> MM12P7_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm12p7_shell"));
    public static final Item MM12P7_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM12P7_SHELL_KEY)), MM12P7_SHELL_KEY);

    public static final RegistryKey<Item> MM13P2_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm13p2_shell"));
    public static final Item MM13P2_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM13P2_SHELL_KEY)), MM13P2_SHELL_KEY);

    public static final RegistryKey<Item> MM20_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm20_shell"));
    public static final Item MM20_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM20_SHELL_KEY)), MM20_SHELL_KEY);

    public static final RegistryKey<Item> MM25_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm25_shell"));
    public static final Item MM25_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM25_SHELL_KEY)), MM25_SHELL_KEY);

    public static final RegistryKey<Item> MM28_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm28_shell"));
    public static final Item MM28_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM28_SHELL_KEY)), MM28_SHELL_KEY);

    public static final RegistryKey<Item> MM30_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm30_shell"));
    public static final Item MM30_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM30_SHELL_KEY)), MM30_SHELL_KEY);

    public static final RegistryKey<Item> MM37_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_shell"));
    public static final Item MM37_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_SHELL_KEY)), MM37_SHELL_KEY);

    public static final RegistryKey<Item> MM40_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_shell"));
    public static final Item MM40_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_SHELL_KEY)), MM40_SHELL_KEY);

    public static final RegistryKey<Item> MM55_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm55_shell"));
    public static final Item MM55_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM55_SHELL_KEY)), MM55_SHELL_KEY);

    public static final RegistryKey<Item> MM57_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm57_shell"));
    public static final Item MM57_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM57_SHELL_KEY)), MM57_SHELL_KEY);

    public static final RegistryKey<Item> MM65_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm65_shell"));
    public static final Item MM65_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM65_SHELL_KEY)), MM65_SHELL_KEY);

    public static final RegistryKey<Item> MM76_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm76_shell"));
    public static final Item MM76_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM76_SHELL_KEY)), MM76_SHELL_KEY);

    public static final RegistryKey<Item> MM80_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm80_shell"));
    public static final Item MM80_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM80_SHELL_KEY)), MM80_SHELL_KEY);

    public static final RegistryKey<Item> MM88_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm88_shell"));
    public static final Item MM88_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM88_SHELL_KEY)), MM88_SHELL_KEY);

    public static final RegistryKey<Item> MM90_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm90_shell"));
    public static final Item MM90_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM90_SHELL_KEY)), MM90_SHELL_KEY);

    public static final RegistryKey<Item> MM105_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm105_shell"));
    public static final Item MM105_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM105_SHELL_KEY)), MM105_SHELL_KEY);

    public static final RegistryKey<Item> MM134_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm134_shell"));
    public static final Item MM134_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM134_SHELL_KEY)), MM134_SHELL_KEY);

    public static final RegistryKey<Item> MM76_ADVANCE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm76_advance_shell"));
    public static final Item MM76_ADVANCE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM76_ADVANCE_SHELL_KEY)), MM76_ADVANCE_SHELL_KEY);

    public static final RegistryKey<Item> MM100_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_shell"));
    public static final Item MM100_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_SHELL_KEY)), MM100_SHELL_KEY);

    public static final RegistryKey<Item> MM100_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_he_shell"));
    public static final Item MM100_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_HE_SHELL_KEY)), MM100_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM102_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm102_shell"));
    public static final Item MM102_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM102_SHELL_KEY)), MM102_SHELL_KEY);

    public static final RegistryKey<Item> MM102_ADVANCE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm102_advance_shell"));
    public static final Item MM102_ADVANCE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM102_ADVANCE_SHELL_KEY)), MM102_ADVANCE_SHELL_KEY);

    public static final RegistryKey<Item> MM113_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm113_shell"));
    public static final Item MM113_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM113_SHELL_KEY)), MM113_SHELL_KEY);

    public static final RegistryKey<Item> MM114_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm114_shell"));
    public static final Item MM114_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM114_SHELL_KEY)), MM114_SHELL_KEY);

    public static final RegistryKey<Item> MM120_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_shell"));
    public static final Item MM120_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_SHELL_KEY)), MM120_SHELL_KEY);

    public static final RegistryKey<Item> MM120_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_he_shell"));
    public static final Item MM120_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_HE_SHELL_KEY)), MM120_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM127_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_shell"));
    public static final Item MM127_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_SHELL_KEY)), MM127_SHELL_KEY);

    public static final RegistryKey<Item> MM127_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_ap_shell"));
    public static final Item MM127_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_AP_SHELL_KEY)), MM127_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM127_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_he_shell"));
    public static final Item MM127_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_HE_SHELL_KEY)), MM127_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM128_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm128_ap_shell"));
    public static final Item MM128_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM128_AP_SHELL_KEY)), MM128_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM130_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_shell"));
    public static final Item MM130_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_SHELL_KEY)), MM130_SHELL_KEY);

    public static final RegistryKey<Item> MM130_IMPROV_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_improv_shell"));
    public static final Item MM130_IMPROV_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_IMPROV_SHELL_KEY)), MM130_IMPROV_SHELL_KEY);

    public static final RegistryKey<Item> MM130_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_he_shell"));
    public static final Item MM130_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_HE_SHELL_KEY)), MM130_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM134_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm134_ap_shell"));
    public static final Item MM134_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM134_AP_SHELL_KEY)), MM134_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM135_SAP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm135_sap_shell"));
    public static final Item MM135_SAP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM135_SAP_SHELL_KEY)), MM135_SAP_SHELL_KEY);

    public static final RegistryKey<Item> MM137_APIMPROV_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm137_apimprov_shell"));
    public static final Item MM137_APIMPROV_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM137_APIMPROV_SHELL_KEY)), MM137_APIMPROV_SHELL_KEY);

    public static final RegistryKey<Item> MM138P6_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm138p6_shell"));
    public static final Item MM138P6_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM138P6_SHELL_KEY)), MM138P6_SHELL_KEY);

    public static final RegistryKey<Item> MM138P6_APSUPER_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm138p6_apsuper_shell"));
    public static final Item MM138P6_APSUPER_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM138P6_APSUPER_SHELL_KEY)), MM138P6_APSUPER_SHELL_KEY);

    public static final RegistryKey<Item> MM138P6_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm138p6_he_shell"));
    public static final Item MM138P6_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM138P6_HE_SHELL_KEY)), MM138P6_HE_SHELL_KEY);
    // </editor-fold>

    // <editor-fold desc="mid-cal naval shells (140mm thru 254mm)">
    public static final RegistryKey<Item> MM140_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm140_he_shell"));
    public static final Item MM140_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM140_HE_SHELL_KEY)), MM140_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM150_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm150_shell"));
    public static final Item MM150_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM150_SHELL_KEY)), MM150_SHELL_KEY);

    public static final RegistryKey<Item> MM150_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm150_ap_shell"));
    public static final Item MM150_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM150_AP_SHELL_KEY)), MM150_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM150_APALT_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm150_apalt_shell"));
    public static final Item MM150_APALT_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM150_APALT_SHELL_KEY)), MM150_APALT_SHELL_KEY);

    public static final RegistryKey<Item> MM150_HEIMPROV_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm150_heimprov_shell"));
    public static final Item MM150_HEIMPROV_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM150_HEIMPROV_SHELL_KEY)), MM150_HEIMPROV_SHELL_KEY);

    public static final RegistryKey<Item> MM152_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm152_shell"));
    public static final Item MM152_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM152_SHELL_KEY)), MM152_SHELL_KEY);

    public static final RegistryKey<Item> MM152_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm152_ap_shell"));
    public static final Item MM152_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM152_AP_SHELL_KEY)), MM152_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM152_APIMPROV_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm152_apimprov_shell"));
    public static final Item MM152_APIMPROV_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM152_APIMPROV_SHELL_KEY)), MM152_APIMPROV_SHELL_KEY);

    public static final RegistryKey<Item> MM152_APSUPER_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm152_apsuper_shell"));
    public static final Item MM152_APSUPER_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM152_APSUPER_SHELL_KEY)), MM152_APSUPER_SHELL_KEY);

    public static final RegistryKey<Item> MM152_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm152_he_shell"));
    public static final Item MM152_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM152_HE_SHELL_KEY)), MM152_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM152_HESUPER_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm152_hesuper_shell"));
    public static final Item MM152_HESUPER_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM152_HESUPER_SHELL_KEY)), MM152_HESUPER_SHELL_KEY);

    public static final RegistryKey<Item> MM152_HEWEAK_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm152_heweak_shell"));
    public static final Item MM152_HEWEAK_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM152_HEWEAK_SHELL_KEY)), MM152_HEWEAK_SHELL_KEY);

    public static final RegistryKey<Item> MM152_SAP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm152_sap_shell"));
    public static final Item MM152_SAP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM152_SAP_SHELL_KEY)), MM152_SAP_SHELL_KEY);

    public static final RegistryKey<Item> MM155_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm155_shell"));
    public static final Item MM155_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM155_SHELL_KEY)), MM155_SHELL_KEY);

    public static final RegistryKey<Item> MM155_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm155_he_shell"));
    public static final Item MM155_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM155_HE_SHELL_KEY)), MM155_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM155_HEIMPROV_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm155_heimprov_shell"));
    public static final Item MM155_HEIMPROV_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM155_HEIMPROV_SHELL_KEY)), MM155_HEIMPROV_SHELL_KEY);

    public static final RegistryKey<Item> MM155_APBOOSTED_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm155_apboosted_shell"));
    public static final Item MM180_APBOOSTED_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM155_APBOOSTED_SHELL_KEY)), MM155_APBOOSTED_SHELL_KEY);

    public static final RegistryKey<Item> MM203_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_shell"));
    public static final Item MM203_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_SHELL_KEY)), MM203_SHELL_KEY);

    public static final RegistryKey<Item> MM203_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_ap_shell"));
    public static final Item MM203_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_AP_SHELL_KEY)), MM203_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM203_APADVANCE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_apadvance_shell"));
    public static final Item MM203_APADVANCE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_APADVANCE_SHELL_KEY)), MM203_APADVANCE_SHELL_KEY);

    public static final RegistryKey<Item> MM203_APIMPROV_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_apimprov_shell"));
    public static final Item MM203_APIMPROV_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_APIMPROV_SHELL_KEY)), MM203_APIMPROV_SHELL_KEY);

    public static final RegistryKey<Item> MM203_APSUPER_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_apsuper_shell"));
    public static final Item MM203_APSUPER_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_APSUPER_SHELL_KEY)), MM203_APSUPER_SHELL_KEY);

    public static final RegistryKey<Item> MM203_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_he_shell"));
    public static final Item MM203_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_HE_SHELL_KEY)), MM203_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM203_HEPLUS_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_heplus_shell"));
    public static final Item MM203_HEPLUS_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_HEPLUS_SHELL_KEY)), MM203_HEPLUS_SHELL_KEY);

    public static final RegistryKey<Item> MM203_HEIMPROV_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_heimprov_shell"));
    public static final Item MM203_HEIMPROV_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_HEIMPROV_SHELL_KEY)), MM203_HEIMPROV_SHELL_KEY);

    public static final RegistryKey<Item> MM203_SAP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_sap_shell"));
    public static final Item MM203_SAP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_SAP_SHELL_KEY)), MM203_SAP_SHELL_KEY);

    public static final RegistryKey<Item> MM234_IMPROV_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm234_improv_shell"));
    public static final Item MM234_IMPROV_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM234_IMPROV_SHELL_KEY)), MM234_IMPROV_SHELL_KEY);

    public static final RegistryKey<Item> MM234_ADVANCE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm234_advance_shell"));
    public static final Item MM234_ADVANCE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM234_ADVANCE_SHELL_KEY)), MM234_ADVANCE_SHELL_KEY);

    public static final RegistryKey<Item> MM240_APBOOSTED_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm240_apboosted_shell"));
    public static final Item MM240_APBOOSTED_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM240_APBOOSTED_SHELL_KEY)), MM240_APBOOSTED_SHELL_KEY);

    public static final RegistryKey<Item> MM254_APALT_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm254_apalt_shell"));
    public static final Item MM254_APALT_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM254_APALT_SHELL_KEY)), MM254_APALT_SHELL_KEY);
    // </editor-fold>

    // <editor-fold desc="large-cal naval shells (>270mm)">
    public static final RegistryKey<Item> MM283_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm283_shell"));
    public static final Item MM283_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM283_SHELL_KEY)), MM283_SHELL_KEY);

    public static final RegistryKey<Item> MM283_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm283_ap_shell"));
    public static final Item MM283_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM283_AP_SHELL_KEY)), MM283_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM305_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm305_shell"));
    public static final Item MM305_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM305_SHELL_KEY)), MM305_SHELL_KEY);

    public static final RegistryKey<Item> MM305_APBOOSTED_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm305_apboosted_shell"));
    public static final Item MM305_APBOOSTED_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM305_APBOOSTED_SHELL_KEY)), MM305_APBOOSTED_SHELL_KEY);

    public static final RegistryKey<Item> MM305_APIMPROV_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm305_apimprov_shell"));
    public static final Item MM305_APIMPROV_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM305_APIMPROV_SHELL_KEY)), MM305_APIMPROV_SHELL_KEY);

    public static final RegistryKey<Item> MM305_APSUPER_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm305_apsuper_shell"));
    public static final Item MM305_APSUPER_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM305_APSUPER_SHELL_KEY)), MM305_APSUPER_SHELL_KEY);

    public static final RegistryKey<Item> MM305_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm305_he_shell"));
    public static final Item MM305_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM305_HE_SHELL_KEY)), MM305_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM310_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm310_he_shell"));
    public static final Item MM310_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM310_HE_SHELL_KEY)), MM310_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM320_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm320_ap_shell"));
    public static final Item MM320_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM320_AP_SHELL_KEY)), MM320_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM330_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm330_ap_shell"));
    public static final Item MM330_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM330_AP_SHELL_KEY)), MM330_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM330_APALT_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm330_apalt_shell"));
    public static final Item MM330_APALT_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM330_APALT_SHELL_KEY)), MM330_APALT_SHELL_KEY);

    public static final RegistryKey<Item> MM340_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm340_shell"));
    public static final Item MM340_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM340_SHELL_KEY)), MM340_SHELL_KEY);

    public static final RegistryKey<Item> MM356_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm356_he_shell"));
    public static final Item MM356_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM356_HE_SHELL_KEY)), MM356_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM380_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm380_ap_shell"));
    public static final Item MM380_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM380_AP_SHELL_KEY)), MM380_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM380_APSUPER_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm380_apsuper_shell"));
    public static final Item MM380_APSUPER_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM380_APSUPER_SHELL_KEY)), MM380_APSUPER_SHELL_KEY);

    public static final RegistryKey<Item> MM380_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm380_he_shell"));
    public static final Item MM380_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM380_HE_SHELL_KEY)), MM380_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM381_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm381_ap_shell"));
    public static final Item MM381_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM381_AP_SHELL_KEY)), MM381_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM381_APBOOSTED_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm381_apboosted_shell"));
    public static final Item MM381_APBOOSTED_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM381_APBOOSTED_SHELL_KEY)), MM381_APBOOSTED_SHELL_KEY);

    public static final RegistryKey<Item> MM381_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm381_he_shell"));
    public static final Item MM381_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM381_HE_SHELL_KEY)), MM381_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM406_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_shell"));
    public static final Item MM406_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_SHELL_KEY)), MM406_SHELL_KEY);

    public static final RegistryKey<Item> MM406_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_ap_shell"));
    public static final Item MM406_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_AP_SHELL_KEY)), MM406_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM406_APADVANCE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_apadvance_shell"));
    public static final Item MM406_APADVANCE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_APADVANCE_SHELL_KEY)), MM406_APADVANCE_SHELL_KEY);

    public static final RegistryKey<Item> MM406_APALT_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_apalt_shell"));
    public static final Item MM406_APALT_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_APALT_SHELL_KEY)), MM406_APALT_SHELL_KEY);

    public static final RegistryKey<Item> MM406_APHYPER_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_aphyper_shell"));
    public static final Item MM406_APHYPER_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_APHYPER_SHELL_KEY)), MM406_APHYPER_SHELL_KEY);

    public static final RegistryKey<Item> MM406_APMOD_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_apmod_shell"));
    public static final Item MM406_APMOD_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_APMOD_SHELL_KEY)), MM406_APMOD_SHELL_KEY);

    public static final RegistryKey<Item> MM406_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_he_shell"));
    public static final Item MM406_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_HE_SHELL_KEY)), MM406_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM406_SAP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_sap_shell"));
    public static final Item MM406_SAP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_SAP_SHELL_KEY)), MM406_SAP_SHELL_KEY);

    public static final RegistryKey<Item> MM406_SAPSUPER_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_sapsuper_shell"));
    public static final Item MM406_SAPSUPER_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_SAPSUPER_SHELL_KEY)), MM406_SAPSUPER_SHELL_KEY);

    public static final RegistryKey<Item> MM410_AP_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm410_ap_shell"));
    public static final Item MM410_AP_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM410_AP_SHELL_KEY)), MM410_AP_SHELL_KEY);

    public static final RegistryKey<Item> MM410_APKAI_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm410_apkai_shell"));
    public static final Item MM410_APKAI_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM410_APKAI_SHELL_KEY)), MM410_APKAI_SHELL_KEY);

    public static final RegistryKey<Item> MM410_HE_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm410_he_shell"));
    public static final Item MM410_HE_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM410_HE_SHELL_KEY)), MM410_HE_SHELL_KEY);

    public static final RegistryKey<Item> MM410_SCATTER_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm410_scatter_shell"));
    public static final Item MM410_SCATTER_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM410_SCATTER_SHELL_KEY)), MM410_SCATTER_SHELL_KEY);

    public static final RegistryKey<Item> MM457_APSUPERIOR_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm457_apsuperior_shell"));
    public static final Item MM457_APSUPERIOR_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM457_APSUPERIOR_SHELL_KEY)), MM457_APSUPERIOR_SHELL_KEY);

    public static final RegistryKey<Item> MM460_APSUPREME_SHELL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm460_apsupreme_shell"));
    public static final Item MM460_APSUPREME_SHELL = register(
            new Item(new Item.Settings()
                    .registryKey(MM460_APSUPREME_SHELL_KEY)), MM460_APSUPREME_SHELL_KEY);
    // </editor-fold>

    // <editor-fold desc="miscellaneous ammo">
    public static final RegistryKey<Item> LB12_CANNONBALL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb12_cannonball"));
    public static final Item LB12_CANNONBALL = register(
            new Item(new Item.Settings()
                    .registryKey(LB12_CANNONBALL_KEY)), LB12_CANNONBALL_KEY);

    public static final RegistryKey<Item> LB24_CANNONBALL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb24_cannonball"));
    public static final Item LB24_CANNONBALL = register(
            new Item(new Item.Settings()
                    .registryKey(LB24_CANNONBALL_KEY)), LB24_CANNONBALL_KEY);

    public static final RegistryKey<Item> LB36_CANNONBALL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb36_cannonball"));
    public static final Item LB36_CANNONBALL = register(
            new Item(new Item.Settings()
                    .registryKey(LB36_CANNONBALL_KEY)), LB36_CANNONBALL_KEY);

    public static final RegistryKey<Item> SY1_MISSILE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "sy1_missile"));
    public static final Item SY1_MISSILE = register(
            new Item(new Item.Settings()
                    .registryKey(SY1_MISSILE_KEY)), SY1_MISSILE_KEY);

    public static final RegistryKey<Item> SY1A_MISSILE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "sy1a_missile"));
    public static final Item SY1A_MISSILE = register(
            new Item(new Item.Settings()
                    .registryKey(SY1A_MISSILE_KEY)), SY1A_MISSILE_KEY);

    public static final RegistryKey<Item> DEPTHCHARGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "depthcharge"));
    public static final Item DEPTHCHARGE = register(
            new Item(new Item.Settings()
                    .registryKey(DEPTHCHARGE_KEY)), DEPTHCHARGE_KEY);

    public static final RegistryKey<Item> IMPROVEDCHARGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "improvedcharge"));
    public static final Item IMPROVEDCHARGE = register(
            new Item(new Item.Settings()
                    .registryKey(IMPROVEDCHARGE_KEY)), IMPROVEDCHARGE_KEY);

    public static final RegistryKey<Item> HEDGEHOG_MORTAR_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "hedgehog_mortar"));
    public static final Item HEDGEHOG_MORTAR = register(
            new Item(new Item.Settings()
                    .registryKey(HEDGEHOG_MORTAR_KEY)), HEDGEHOG_MORTAR_KEY);
    // </editor-fold>
}