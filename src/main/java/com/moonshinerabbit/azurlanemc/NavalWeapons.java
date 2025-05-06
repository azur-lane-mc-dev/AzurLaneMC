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

public class NavalWeapons {
    public static final String MOD_ID = "azur_lane_mc";

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, NAVAL_WEAPONS_KEY, NAVAL_WEAPONS);

        ItemGroupEvents.modifyEntriesEvent(NAVAL_WEAPONS_KEY)
                .register(itemGroup -> {
                    // <editor-fold desc="anti-air guns">
                    itemGroup.add(MM12P7_SOLO_BROWNING_AAGUN);
                    itemGroup.add(MM13P2_TWIN_BREDA_AAGUN);
                    itemGroup.add(MM20_TWIN_BREDA_AAGUN);
                    itemGroup.add(MM20_QUAD_FLAK_AAGUN);
                    itemGroup.add(MM20_SOLO_OER_AAGUN);
                    itemGroup.add(MM20_TWIN_OER_AAGUN);
                    itemGroup.add(MM20_SOLO_OERMK2_AAGUN);
                    itemGroup.add(MM20_TWIN_OERMK5_AAGUN);
                    itemGroup.add(MM20_QUAD_OERMK15_AAGUN);
                    itemGroup.add(MM25_SOLO_TYPE96_AAGUN);
                    itemGroup.add(MM25_TWIN_TYPE96_AAGUN);
                    itemGroup.add(MM25_TRI_TYPE96_AAGUN);
                    itemGroup.add(MM25_TRI_TYPE96BLAST_AAGUN);
                    itemGroup.add(MM28_QUAD_CHICAGO_AAGUN);
                    itemGroup.add(MM30_QUAD_PROTO_AAGUN);
                    itemGroup.add(MM37_SOLO_70K_AAGUN);
                    itemGroup.add(MM37_SOLO_FLAKM42_AAGUN);
                    itemGroup.add(MM37_TWIN_FLAKM43_AAGUN);
                    itemGroup.add(MM37_SOLO_MLE1925_AAGUN);
                    itemGroup.add(MM37_TWIN_MLE1933_AAGUN);
                    itemGroup.add(MM37_TWIN_MLE1936ACAD_AAGUN);
                    itemGroup.add(MM37_TWIN_MOD1932_AAGUN);
                    itemGroup.add(MM37_TWIN_SKC30_AAGUN);
                    itemGroup.add(MM40_TWIN_BOFORS_AAGUN);
                    itemGroup.add(MM40_TWIN_BOFORSHAZEMEYER_AAGUN);
                    itemGroup.add(MM40_TWIN_BOFORSRPMK1_AAGUN);
                    itemGroup.add(MM40_TWIN_BOFORSSTAAG_AAGUN);
                    itemGroup.add(MM40_TWIN_BOFORSTYPE5_AAGUN);
                    itemGroup.add(MM40_HEX_BOFORS_AAGUN);
                    itemGroup.add(MM40_QUAD_BOFORSMK2_AAGUN);
                    itemGroup.add(MM40_SOLO_FLAK28_AAGUN);
                    itemGroup.add(MM40_TWIN_POMPOM_AAGUN);
                    itemGroup.add(MM40_QUAD_POMPOM_AAGUN);
                    itemGroup.add(MM40_OCT_POMPOM_AAGUN);
                    itemGroup.add(MM40_TWIN_VICKERSTYPE91_AAGUN);
                    itemGroup.add(MM55_SOLO_GERAT58PROTO_AAGUN);
                    itemGroup.add(MM57_TWIN_BOFORSMLE1951_AAGUN);
                    itemGroup.add(MM65_SOLO_MOD1939_AAGUN);
                    itemGroup.add(MM76_SOLO_3RDYEAR_AAGUN);
                    itemGroup.add(MM76_SOLO_MK22_AAGUN);
                    itemGroup.add(MM76_SOLO_MK26_AAGUN);
                    itemGroup.add(MM76_TWIN_MK27_AAGUN);
                    itemGroup.add(MM76_TWIN_MK37RF_AAGUN);
                    itemGroup.add(MM80_SOLO_TYPE98_AAGUN);
                    itemGroup.add(MM80_TWIN_TYPE98_AAGUN);
                    itemGroup.add(MM88_TWIN_SKC32_AAGUN);
                    itemGroup.add(MM90_SOLO_MOD1939_AAGUN);
                    itemGroup.add(MM90_TWIN_MOD1939PROTO_AAGUN);
                    itemGroup.add(MM100_TWIN_B54_AAGUN);
                    itemGroup.add(MM100_TWIN_MZ14_AAGUN);
                    itemGroup.add(MM100_TWIN_SM51S_AAGUN);
                    itemGroup.add(MM100_TWIN_MLE1931_AAGUN);
                    itemGroup.add(MM100_TWIN_TYPE98_AAGUN);
                    itemGroup.add(MM102_SOLO_QFMK5_AAGUN);
                    itemGroup.add(MM105_TWIN_SKC33_AAGUN);
                    itemGroup.add(MM105_TWIN_SKC33NA_AAGUN);
                    itemGroup.add(MM105_TWIN_SKC33NATIMEFUZE_AAGUN);
                    itemGroup.add(MM113_TWIN_QFMK1_AAGUN);
                    itemGroup.add(MM120_SOLO_QFMK8_AAGUN);
                    itemGroup.add(MM127_TWIN_MK38TIMEFUZE_AAGUN);
                    itemGroup.add(MM127_TWIN_TYPE89_AAGUN);
                    itemGroup.add(MM127_TWIN_TYPE89A1MOD2_AAGUN);
                    itemGroup.add(MM127_TWIN_TYPE89A1MOD2TIMEFUZE_AAGUN);
                    itemGroup.add(MM134_TWIN_QFMK1_AAGUN);
                    itemGroup.add(MM134_TWIN_TIMEFUZE_AAGUN);
                    // </editor-fold>
                    // <editor-fold desc="cannons">
                    itemGroup.add(LB12_CANNON);
                    itemGroup.add(LB24_CANNON);
                    // </editor-fold>
                    // <editor-fold desc="destroyer guns">
                    itemGroup.add(MM76_SOLO_DDGUN);
                    itemGroup.add(MM100_SOLO_TYPE88_DDGUN);
                    itemGroup.add(MM100_TWIN_TYPE98_DDGUN);
                    itemGroup.add(MM100_TWIN_TYPE98KAI_DDGUN);
                    itemGroup.add(MM102_SOLO_QFMK5_DDGUN);
                    itemGroup.add(MM102_TRI_QFMK9_DDGUN);
                    itemGroup.add(MM102_TWIN_QFMK16_DDGUN);
                    itemGroup.add(MM102_TWIN_QFMK16STAR_DDGUN);
                    itemGroup.add(MM113_SOLO_QFMK4_DDGUN);
                    itemGroup.add(MM114_TWIN_QFMK4_DDGUN);
                    itemGroup.add(MM120_TWIN_DDGUN);
                    itemGroup.add(MM120_SOLO_10THYEAR_DDGUN);
                    itemGroup.add(MM120_SOLO_11THYEAR_DDGUN);
                    itemGroup.add(MM120_TWIN_MOD1926_DDGUN);
                    itemGroup.add(MM120_TWIN_MOD1933_DDGUN);
                    itemGroup.add(MM120_TWIN_MOD1936_DDGUN);
                    itemGroup.add(MM120_SOLO_QFMK9_DDGUN);
                    itemGroup.add(MM120_TWIN_QFMK11_DDGUN);
                    itemGroup.add(MM120_TWIN_QFMK12_DDGUN);
                    itemGroup.add(MM120_SOLO_TYPE3_DDGUN);
                    itemGroup.add(MM127_TWIN_KM40_DDGUN);
                    itemGroup.add(MM127_SOLO_MK21_DDGUN);
                    itemGroup.add(MM127_SOLO_MK30_DDGUN);
                    itemGroup.add(MM127_TWIN_MK32_DDGUN);
                    itemGroup.add(MM127_TWIN_MK38_DDGUN);
                    itemGroup.add(MM127_SOLO_SKC34_DDGUN);
                    itemGroup.add(MM127_TWIN_TYPE3_DDGUN);
                    itemGroup.add(MM127_SOLO_TYPE3MODB_DDGUN);
                    itemGroup.add(MM127_TWIN_TYPE3MODB_DDGUN);
                    itemGroup.add(MM128_TWIN_SKC41_DDGUN);
                    itemGroup.add(MM128_TWIN_45SKC41_DDGUN);
                    itemGroup.add(MM130_SOLO_B13PATTERN1936_DDGUN);
                    itemGroup.add(MM130_TWIN_B2LM_DDGUN);
                    itemGroup.add(MM130_SOLO_MLE1924_DDGUN);
                    itemGroup.add(MM130_QUAD_MLE1932_DDGUN);
                    itemGroup.add(MM130_TWIN_MLE1935_DDGUN);
                    itemGroup.add(MM130_TWIN_MOD1936PROTO_DDGUN);
                    itemGroup.add(MM134_TWIN_QFMK2_DDGUN);
                    itemGroup.add(MM135_TWIN_MOD1938_DDGUN);
                    itemGroup.add(MM137_TWIN_MK1PROTO_DDGUN);
                    itemGroup.add(MM138P6_SOLO_MLE1923_DDGUN);
                    itemGroup.add(MM138P6_SOLO_MLE1927_DDGUN);
                    itemGroup.add(MM138P6_SOLO_MLE1929_DDGUN);
                    itemGroup.add(MM138P6_TWIN_MLE1934_DDGUN);
                    // </editor-fold>
                    // <editor-fold desc="light cruiser guns">
                    // </editor-fold>
                    // <editor-fold desc="heavy cruiser guns">
                    // </editor-fold>
                    // <editor-fold desc="large cruiser guns">
                    // </editor-fold>
                    // <editor-fold desc="battleship guns">
                    // </editor-fold>
                    // <editor-fold desc="airplanes">
                    // </editor-fold>
                    // <editor-fold desc="auxiliaries">
                    // </editor-fold>
                    // <editor-fold desc="cargo">
                    // </editor-fold>
                    // <editor-fold desc="augments">
                    // </editor-fold>
                });
    }

    public static final ItemGroup NAVAL_WEAPONS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(NavalWeapons.MM40_OCT_POMPOM_AAGUN))
            .displayName(Text.translatable("item_group.azur_lane_mc.naval_weapons")).build();
    public static final RegistryKey<ItemGroup> NAVAL_WEAPONS_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "naval_weapons"));

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
        return registeredItem;
    }

    // <editor-fold desc="anti-air guns">
    public static final RegistryKey<Item> MM12P7_SOLO_BROWNING_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm12p7_solo_browning_aagun"));
    public static final Item MM12P7_SOLO_BROWNING_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM12P7_SOLO_BROWNING_AAGUN_KEY)), MM12P7_SOLO_BROWNING_AAGUN_KEY);

    public static final RegistryKey<Item> MM13P2_TWIN_BREDA_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm13p2_twin_breda_aagun"));
    public static final Item MM13P2_TWIN_BREDA_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM13P2_TWIN_BREDA_AAGUN_KEY)), MM13P2_TWIN_BREDA_AAGUN_KEY);

    public static final RegistryKey<Item> MM20_TWIN_BREDA_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm20_twin_breda_aagun"));
    public static final Item MM20_TWIN_BREDA_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM20_TWIN_BREDA_AAGUN_KEY)), MM20_TWIN_BREDA_AAGUN_KEY);

    public static final RegistryKey<Item> MM20_QUAD_FLAK_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm20_quad_flak_aagun"));
    public static final Item MM20_QUAD_FLAK_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM20_QUAD_FLAK_AAGUN_KEY)), MM20_QUAD_FLAK_AAGUN_KEY);

    public static final RegistryKey<Item> MM20_SOLO_OER_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm20_solo_oer_aagun"));
    public static final Item MM20_SOLO_OER_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM20_SOLO_OER_AAGUN_KEY)), MM20_SOLO_OER_AAGUN_KEY);
    public static final RegistryKey<Item> MM20_TWIN_OER_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm20_twin_oer_aagun"));
    public static final Item MM20_TWIN_OER_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM20_TWIN_OER_AAGUN_KEY)), MM20_TWIN_OER_AAGUN_KEY);
    public static final RegistryKey<Item> MM20_SOLO_OERMK2_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm20_solo_oermk2_aagun"));
    public static final Item MM20_SOLO_OERMK2_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM20_SOLO_OERMK2_AAGUN_KEY)), MM20_SOLO_OERMK2_AAGUN_KEY);
    public static final RegistryKey<Item> MM20_TWIN_OERMK5_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm20_twin_oermk5_aagun"));
    public static final Item MM20_TWIN_OERMK5_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM20_TWIN_OERMK5_AAGUN_KEY)), MM20_TWIN_OERMK5_AAGUN_KEY);
    public static final RegistryKey<Item> MM20_QUAD_OERMK15_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm20_quad_oermk15_aagun"));
    public static final Item MM20_QUAD_OERMK15_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM20_QUAD_OERMK15_AAGUN_KEY)), MM20_QUAD_OERMK15_AAGUN_KEY);

    public static final RegistryKey<Item> MM25_SOLO_TYPE96_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm25_solo_type96_aagun"));
    public static final Item MM25_SOLO_TYPE96_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM25_SOLO_TYPE96_AAGUN_KEY)), MM25_SOLO_TYPE96_AAGUN_KEY);
    public static final RegistryKey<Item> MM25_TWIN_TYPE96_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm25_twin_type96_aagun"));
    public static final Item MM25_TWIN_TYPE96_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM25_TWIN_TYPE96_AAGUN_KEY)), MM25_TWIN_TYPE96_AAGUN_KEY);
    public static final RegistryKey<Item> MM25_TRI_TYPE96_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm25_tri_type96_aagun"));
    public static final Item MM25_TRI_TYPE96_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM25_TRI_TYPE96_AAGUN_KEY)), MM25_TRI_TYPE96_AAGUN_KEY);
    public static final RegistryKey<Item> MM25_TRI_TYPE96BLAST_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm25_tri_type96blast_aagun"));
    public static final Item MM25_TRI_TYPE96BLAST_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM25_TRI_TYPE96BLAST_AAGUN_KEY)), MM25_TRI_TYPE96BLAST_AAGUN_KEY);

    public static final RegistryKey<Item> MM28_QUAD_CHICAGO_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm28_quad_chicago_aagun"));
    public static final Item MM28_QUAD_CHICAGO_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM28_QUAD_CHICAGO_AAGUN_KEY)), MM28_QUAD_CHICAGO_AAGUN_KEY);

    public static final RegistryKey<Item> MM30_QUAD_PROTO_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm30_quad_proto_aagun"));
    public static final Item MM30_QUAD_PROTO_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM30_QUAD_PROTO_AAGUN_KEY)), MM30_QUAD_PROTO_AAGUN_KEY);

    public static final RegistryKey<Item> MM37_SOLO_70K_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_solo_70k_aagun"));
    public static final Item MM37_SOLO_70K_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_SOLO_70K_AAGUN_KEY)), MM37_SOLO_70K_AAGUN_KEY);

    public static final RegistryKey<Item> MM37_SOLO_FLAKM42_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_solo_flakm42_aagun"));
    public static final Item MM37_SOLO_FLAKM42_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_SOLO_FLAKM42_AAGUN_KEY)), MM37_SOLO_FLAKM42_AAGUN_KEY);
    public static final RegistryKey<Item> MM37_TWIN_FLAKM43_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_twin_flakm43_aagun"));
    public static final Item MM37_TWIN_FLAKM43_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_TWIN_FLAKM43_AAGUN_KEY)), MM37_TWIN_FLAKM43_AAGUN_KEY);

    public static final RegistryKey<Item> MM37_SOLO_MLE1925_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_solo_mle1925_aagun"));
    public static final Item MM37_SOLO_MLE1925_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_SOLO_MLE1925_AAGUN_KEY)), MM37_SOLO_MLE1925_AAGUN_KEY);
    public static final RegistryKey<Item> MM37_TWIN_MLE1933_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_twin_mle1933_aagun"));
    public static final Item MM37_TWIN_MLE1933_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_TWIN_MLE1933_AAGUN_KEY)), MM37_TWIN_MLE1933_AAGUN_KEY);
    public static final RegistryKey<Item> MM37_TWIN_MLE1936ACAD_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_twin_mle1936acad_aagun"));
    public static final Item MM37_TWIN_MLE1936ACAD_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_TWIN_MLE1936ACAD_AAGUN_KEY)), MM37_TWIN_MLE1936ACAD_AAGUN_KEY);

    public static final RegistryKey<Item> MM37_TWIN_MOD1932_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_twin_mod1932_aagun"));
    public static final Item MM37_TWIN_MOD1932_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_TWIN_MOD1932_AAGUN_KEY)), MM37_TWIN_MOD1932_AAGUN_KEY);

    public static final RegistryKey<Item> MM37_TWIN_SKC30_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_twin_skc30_aagun"));
    public static final Item MM37_TWIN_SKC30_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_TWIN_SKC30_AAGUN_KEY)), MM37_TWIN_SKC30_AAGUN_KEY);

    public static final RegistryKey<Item> MM40_TWIN_BOFORS_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_twin_bofors_aagun"));
    public static final Item MM40_TWIN_BOFORS_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_TWIN_BOFORS_AAGUN_KEY)), MM40_TWIN_BOFORS_AAGUN_KEY);
    public static final RegistryKey<Item> MM40_TWIN_BOFORSHAZEMEYER_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_twin_boforshazemeyer_aagun"));
    public static final Item MM40_TWIN_BOFORSHAZEMEYER_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_TWIN_BOFORSHAZEMEYER_AAGUN_KEY)), MM40_TWIN_BOFORSHAZEMEYER_AAGUN_KEY);
    public static final RegistryKey<Item> MM40_TWIN_BOFORSRPMK1_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_twin_boforsrpmk1_aagun"));
    public static final Item MM40_TWIN_BOFORSRPMK1_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_TWIN_BOFORSRPMK1_AAGUN_KEY)), MM40_TWIN_BOFORSRPMK1_AAGUN_KEY);
    public static final RegistryKey<Item> MM40_TWIN_BOFORSSTAAG_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_twin_boforsstaag_aagun"));
    public static final Item MM40_TWIN_BOFORSSTAAG_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_TWIN_BOFORSSTAAG_AAGUN_KEY)), MM40_TWIN_BOFORSSTAAG_AAGUN_KEY);
    public static final RegistryKey<Item> MM40_TWIN_BOFORSTYPE5_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_twin_boforstype5_aagun"));
    public static final Item MM40_TWIN_BOFORSTYPE5_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_TWIN_BOFORSTYPE5_AAGUN_KEY)), MM40_TWIN_BOFORSTYPE5_AAGUN_KEY);
    public static final RegistryKey<Item> MM40_HEX_BOFORS_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_hex_bofors_aagun"));
    public static final Item MM40_HEX_BOFORS_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_HEX_BOFORS_AAGUN_KEY)), MM40_HEX_BOFORS_AAGUN_KEY);
    public static final RegistryKey<Item> MM40_QUAD_BOFORSMK2_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_quad_boforsmk2_aagun"));
    public static final Item MM40_QUAD_BOFORSMK2_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_QUAD_BOFORSMK2_AAGUN_KEY)), MM40_QUAD_BOFORSMK2_AAGUN_KEY);

    public static final RegistryKey<Item> MM40_SOLO_FLAK28_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_solo_flak28_aagun"));
    public static final Item MM40_SOLO_FLAK28_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_SOLO_FLAK28_AAGUN_KEY)), MM40_SOLO_FLAK28_AAGUN_KEY);

    public static final RegistryKey<Item> MM40_TWIN_POMPOM_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_twin_pompom_aagun"));
    public static final Item MM40_TWIN_POMPOM_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_TWIN_POMPOM_AAGUN_KEY)), MM40_TWIN_POMPOM_AAGUN_KEY);
    public static final RegistryKey<Item> MM40_QUAD_POMPOM_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_quad_pompom_aagun"));
    public static final Item MM40_QUAD_POMPOM_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_QUAD_POMPOM_AAGUN_KEY)), MM40_QUAD_POMPOM_AAGUN_KEY);
    public static final RegistryKey<Item> MM40_OCT_POMPOM_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_oct_pompom_aagun"));
    public static final Item MM40_OCT_POMPOM_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_OCT_POMPOM_AAGUN_KEY)), MM40_OCT_POMPOM_AAGUN_KEY);

    public static final RegistryKey<Item> MM40_TWIN_VICKERSTYPE91_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_twin_vickerstype91_aagun"));
    public static final Item MM40_TWIN_VICKERSTYPE91_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_TWIN_VICKERSTYPE91_AAGUN_KEY)), MM40_TWIN_VICKERSTYPE91_AAGUN_KEY);

    public static final RegistryKey<Item> MM55_SOLO_GERAT58PROTO_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm55_solo_gerat58proto_aagun"));
    public static final Item MM55_SOLO_GERAT58PROTO_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM55_SOLO_GERAT58PROTO_AAGUN_KEY)), MM55_SOLO_GERAT58PROTO_AAGUN_KEY);

    public static final RegistryKey<Item> MM57_TWIN_BOFORSMLE1951_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm57_twin_boforsmle1951_aagun"));
    public static final Item MM57_TWIN_BOFORSMLE1951_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM57_TWIN_BOFORSMLE1951_AAGUN_KEY)), MM57_TWIN_BOFORSMLE1951_AAGUN_KEY);

    public static final RegistryKey<Item> MM65_SOLO_MOD1939_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm65_solo_mod1939_aagun"));
    public static final Item MM65_SOLO_MOD1939_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM65_SOLO_MOD1939_AAGUN_KEY)), MM65_SOLO_MOD1939_AAGUN_KEY);

    public static final RegistryKey<Item> MM76_SOLO_3RDYEAR_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm76_solo_3rdyear_aagun"));
    public static final Item MM76_SOLO_3RDYEAR_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM76_SOLO_3RDYEAR_AAGUN_KEY)), MM76_SOLO_3RDYEAR_AAGUN_KEY);

    public static final RegistryKey<Item> MM76_SOLO_MK22_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm76_solo_mk22_aagun"));
    public static final Item MM76_SOLO_MK22_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM76_SOLO_MK22_AAGUN_KEY)), MM76_SOLO_MK22_AAGUN_KEY);
    public static final RegistryKey<Item> MM76_SOLO_MK26_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm76_solo_mk26_aagun"));
    public static final Item MM76_SOLO_MK26_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM76_SOLO_MK26_AAGUN_KEY)), MM76_SOLO_MK26_AAGUN_KEY);
    public static final RegistryKey<Item> MM76_TWIN_MK27_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm76_twin_mk27_aagun"));
    public static final Item MM76_TWIN_MK27_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM76_TWIN_MK27_AAGUN_KEY)), MM76_TWIN_MK27_AAGUN_KEY);
    public static final RegistryKey<Item> MM76_TWIN_MK37RF_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm76_twin_mk37rf_aagun"));
    public static final Item MM76_TWIN_MK37RF_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM76_TWIN_MK37RF_AAGUN_KEY)), MM76_TWIN_MK37RF_AAGUN_KEY);

    public static final RegistryKey<Item> MM80_SOLO_TYPE98_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm80_solo_type98_aagun"));
    public static final Item MM80_SOLO_TYPE98_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM80_SOLO_TYPE98_AAGUN_KEY)), MM80_SOLO_TYPE98_AAGUN_KEY);
    public static final RegistryKey<Item> MM80_TWIN_TYPE98_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm80_twin_type98_aagun"));
    public static final Item MM80_TWIN_TYPE98_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM80_TWIN_TYPE98_AAGUN_KEY)), MM80_TWIN_TYPE98_AAGUN_KEY);

    public static final RegistryKey<Item> MM88_TWIN_SKC32_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm80_twin_skc32_aagun"));
    public static final Item MM88_TWIN_SKC32_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM88_TWIN_SKC32_AAGUN_KEY)), MM88_TWIN_SKC32_AAGUN_KEY);

    public static final RegistryKey<Item> MM90_SOLO_MOD1939_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm90_solo_mod1939_aagun"));
    public static final Item MM90_SOLO_MOD1939_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM90_SOLO_MOD1939_AAGUN_KEY)), MM90_SOLO_MOD1939_AAGUN_KEY);
    public static final RegistryKey<Item> MM90_TWIN_MOD1939PROTO_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm90_twin_mod1939proto_aagun"));
    public static final Item MM90_TWIN_MOD1939PROTO_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM90_TWIN_MOD1939PROTO_AAGUN_KEY)), MM90_TWIN_MOD1939PROTO_AAGUN_KEY);

    public static final RegistryKey<Item> MM100_TWIN_B54_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_twin_b54_aagun"));
    public static final Item MM100_TWIN_B54_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_TWIN_B54_AAGUN_KEY)), MM100_TWIN_B54_AAGUN_KEY);
    public static final RegistryKey<Item> MM100_TWIN_MZ14_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_twin_mz14_aagun"));
    public static final Item MM100_TWIN_MZ14_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_TWIN_MZ14_AAGUN_KEY)), MM100_TWIN_MZ14_AAGUN_KEY);
    public static final RegistryKey<Item> MM100_TWIN_SM51S_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_twin_sm51s_aagun"));
    public static final Item MM100_TWIN_SM51S_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_TWIN_SM51S_AAGUN_KEY)), MM100_TWIN_SM51S_AAGUN_KEY);

    public static final RegistryKey<Item> MM100_TWIN_MLE1931_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_twin_mle1931_aagun"));
    public static final Item MM100_TWIN_MLE1931_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_TWIN_MLE1931_AAGUN_KEY)), MM100_TWIN_MLE1931_AAGUN_KEY);

    public static final RegistryKey<Item> MM100_TWIN_TYPE98_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_twin_type98_aagun"));
    public static final Item MM100_TWIN_TYPE98_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_TWIN_TYPE98_AAGUN_KEY)), MM100_TWIN_TYPE98_AAGUN_KEY);

    public static final RegistryKey<Item> MM102_SOLO_QFMK5_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm102_solo_qfmk5_aagun"));
    public static final Item MM102_SOLO_QFMK5_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM102_SOLO_QFMK5_AAGUN_KEY)), MM102_SOLO_QFMK5_AAGUN_KEY);

    public static final RegistryKey<Item> MM105_TWIN_SKC33_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm105_twin_skc33_aagun"));
    public static final Item MM105_TWIN_SKC33_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM105_TWIN_SKC33_AAGUN_KEY)), MM105_TWIN_SKC33_AAGUN_KEY);
    public static final RegistryKey<Item> MM105_TWIN_SKC33NA_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm105_twin_skc33na_aagun"));
    public static final Item MM105_TWIN_SKC33NA_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM105_TWIN_SKC33NA_AAGUN_KEY)), MM105_TWIN_SKC33NA_AAGUN_KEY);
    public static final RegistryKey<Item> MM105_TWIN_SKC33NATIMEFUZE_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm105_twin_skc33natimefuze_aagun"));
    public static final Item MM105_TWIN_SKC33NATIMEFUZE_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM105_TWIN_SKC33NATIMEFUZE_AAGUN_KEY)), MM105_TWIN_SKC33NATIMEFUZE_AAGUN_KEY);

    public static final RegistryKey<Item> MM113_TWIN_QFMK1_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm113_twin_qfmk1_aagun"));
    public static final Item MM113_TWIN_QFMK1_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM113_TWIN_QFMK1_AAGUN_KEY)), MM113_TWIN_QFMK1_AAGUN_KEY);

    public static final RegistryKey<Item> MM120_SOLO_QFMK8_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_solo_qfmk8_aagun"));
    public static final Item MM120_SOLO_QFMK8_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_SOLO_QFMK8_AAGUN_KEY)), MM120_SOLO_QFMK8_AAGUN_KEY);

    public static final RegistryKey<Item> MM127_TWIN_MK38TIMEFUZE_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_twin_mk38timefuze_aagun"));
    public static final Item MM127_TWIN_MK38TIMEFUZE_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_TWIN_MK38TIMEFUZE_AAGUN_KEY)), MM127_TWIN_MK38TIMEFUZE_AAGUN_KEY);
    public static final RegistryKey<Item> MM127_TWIN_TYPE89_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_twin_mk38timefuze_aagun"));
    public static final Item MM127_TWIN_TYPE89_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_TWIN_TYPE89_AAGUN_KEY)), MM127_TWIN_TYPE89_AAGUN_KEY);
    public static final RegistryKey<Item> MM127_TWIN_TYPE89A1MOD2_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_twin_type89a1mod2_aagun"));
    public static final Item MM127_TWIN_TYPE89A1MOD2_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_TWIN_TYPE89A1MOD2_AAGUN_KEY)), MM127_TWIN_TYPE89A1MOD2_AAGUN_KEY);
    public static final RegistryKey<Item> MM127_TWIN_TYPE89A1MOD2TIMEFUZE_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_twin_type89a1mod2timefuze_aagun"));
    public static final Item MM127_TWIN_TYPE89A1MOD2TIMEFUZE_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_TWIN_TYPE89A1MOD2TIMEFUZE_AAGUN_KEY)), MM127_TWIN_TYPE89A1MOD2TIMEFUZE_AAGUN_KEY);

    public static final RegistryKey<Item> MM134_TWIN_QFMK1_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm134_twin_qfmk1_aagun"));
    public static final Item MM134_TWIN_QFMK1_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM134_TWIN_QFMK1_AAGUN_KEY)), MM134_TWIN_QFMK1_AAGUN_KEY);
    public static final RegistryKey<Item> MM134_TWIN_TIMEFUZE_AAGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm134_twin_timefuze_aagun"));
    public static final Item MM134_TWIN_TIMEFUZE_AAGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM134_TWIN_TIMEFUZE_AAGUN_KEY)), MM134_TWIN_TIMEFUZE_AAGUN_KEY);
    // </editor-fold>

    // <editor-fold desc="cannons">
    public static final RegistryKey<Item> LB12_CANNON_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb12_cannon"));
    public static final Item LB12_CANNON = register(
            new Item(new Item.Settings()
                    .registryKey(LB12_CANNON_KEY)), LB12_CANNON_KEY);

    public static final RegistryKey<Item> LB24_CANNON_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb24_cannon"));
    public static final Item LB24_CANNON = register(
            new Item(new Item.Settings()
                    .registryKey(LB24_CANNON_KEY)), LB24_CANNON_KEY);
    // </editor-fold>

    // <editor-fold desc="destroyer guns">
    public static final RegistryKey<Item> MM76_SOLO_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm76_solo_ddgun"));
    public static final Item MM76_SOLO_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM76_SOLO_DDGUN_KEY)), MM76_SOLO_DDGUN_KEY);

    public static final RegistryKey<Item> MM100_SOLO_TYPE88_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_solo_type88_ddgun"));
    public static final Item MM100_SOLO_TYPE88_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_SOLO_TYPE88_DDGUN_KEY)), MM100_SOLO_TYPE88_DDGUN_KEY);
    public static final RegistryKey<Item> MM100_TWIN_TYPE98_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_twin_type98_ddgun"));
    public static final Item MM100_TWIN_TYPE98_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_TWIN_TYPE98_DDGUN_KEY)), MM100_TWIN_TYPE98_DDGUN_KEY);
    public static final RegistryKey<Item> MM100_TWIN_TYPE98KAI_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_twin_type98kai_ddgun"));
    public static final Item MM100_TWIN_TYPE98KAI_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_TWIN_TYPE98KAI_DDGUN_KEY)), MM100_TWIN_TYPE98KAI_DDGUN_KEY);

    public static final RegistryKey<Item> MM102_SOLO_QFMK5_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm102_solo_qfmk5_ddgun"));
    public static final Item MM102_SOLO_QFMK5_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM102_SOLO_QFMK5_DDGUN_KEY)), MM102_SOLO_QFMK5_DDGUN_KEY);
    public static final RegistryKey<Item> MM102_TWIN_QFMK16_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm102_twin_qfmk16_ddgun"));
    public static final Item MM102_TWIN_QFMK16_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM102_TWIN_QFMK16_DDGUN_KEY)), MM102_TWIN_QFMK16_DDGUN_KEY);
    public static final RegistryKey<Item> MM102_TWIN_QFMK16STAR_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm102_twin_qfmk16star_ddgun"));
    public static final Item MM102_TWIN_QFMK16STAR_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM102_TWIN_QFMK16STAR_DDGUN_KEY)), MM102_TWIN_QFMK16_DDGUN_KEY);
    public static final RegistryKey<Item> MM102_TRI_QFMK9_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm102_tri_qfmk9_ddgun"));
    public static final Item MM102_TRI_QFMK9_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM102_TRI_QFMK9_DDGUN_KEY)), MM102_TRI_QFMK9_DDGUN_KEY);

    public static final RegistryKey<Item> MM113_SOLO_QFMK4_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm113_solo_qfmk4_ddgun"));
    public static final Item MM113_SOLO_QFMK4_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM113_SOLO_QFMK4_DDGUN_KEY)), MM113_SOLO_QFMK4_DDGUN_KEY);

    public static final RegistryKey<Item> MM114_TWIN_QFMK4_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm114_twin_qfmk4_ddgun"));
    public static final Item MM114_TWIN_QFMK4_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM114_TWIN_QFMK4_DDGUN_KEY)), MM114_TWIN_QFMK4_DDGUN_KEY);

    public static final RegistryKey<Item> MM120_SOLO_10THYEAR_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_solo_10thyear_ddgun"));
    public static final Item MM120_SOLO_10THYEAR_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_SOLO_10THYEAR_DDGUN_KEY)), MM120_SOLO_10THYEAR_DDGUN_KEY);
    public static final RegistryKey<Item> MM120_SOLO_11THYEAR_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_solo_11thyear_ddgun"));
    public static final Item MM120_SOLO_11THYEAR_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_SOLO_11THYEAR_DDGUN_KEY)), MM120_SOLO_11THYEAR_DDGUN_KEY);

    public static final RegistryKey<Item> MM120_TWIN_MOD1926_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_twin_mod1926_ddgun"));
    public static final Item MM120_TWIN_MOD1926_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_TWIN_MOD1926_DDGUN_KEY)), MM120_TWIN_MOD1926_DDGUN_KEY);

    public static final RegistryKey<Item> MM120_TWIN_MOD1933_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_twin_mod1933_ddgun"));
    public static final Item MM120_TWIN_MOD1933_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_TWIN_MOD1933_DDGUN_KEY)), MM120_TWIN_MOD1933_DDGUN_KEY);
    public static final RegistryKey<Item> MM120_TWIN_MOD1936_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_twin_mod1936_ddgun"));
    public static final Item MM120_TWIN_MOD1936_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_TWIN_MOD1936_DDGUN_KEY)), MM120_TWIN_MOD1936_DDGUN_KEY);

    public static final RegistryKey<Item> MM120_TWIN_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_twin_ddgun"));
    public static final Item MM120_TWIN_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_TWIN_DDGUN_KEY)), MM120_TWIN_DDGUN_KEY);
    public static final RegistryKey<Item> MM120_SOLO_QFMK9_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_solo_qfmk9_ddgun"));
    public static final Item MM120_SOLO_QFMK9_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_SOLO_QFMK9_DDGUN_KEY)), MM120_SOLO_QFMK9_DDGUN_KEY);
    public static final RegistryKey<Item> MM120_TWIN_QFMK11_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_twin_qfmk11_ddgun"));
    public static final Item MM120_TWIN_QFMK11_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_TWIN_QFMK11_DDGUN_KEY)), MM120_TWIN_QFMK11_DDGUN_KEY);
    public static final RegistryKey<Item> MM120_TWIN_QFMK12_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_twin_qfmk12_ddgun"));
    public static final Item MM120_TWIN_QFMK12_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_TWIN_QFMK12_DDGUN_KEY)), MM120_TWIN_QFMK12_DDGUN_KEY);

    public static final RegistryKey<Item> MM120_SOLO_TYPE3_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_solo_type3_ddgun"));
    public static final Item MM120_SOLO_TYPE3_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_SOLO_TYPE3_DDGUN_KEY)), MM120_SOLO_TYPE3_DDGUN_KEY);

    public static final RegistryKey<Item> MM127_TWIN_KM40_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_twin_km40_ddgun"));
    public static final Item MM127_TWIN_KM40_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_TWIN_KM40_DDGUN_KEY)), MM127_TWIN_KM40_DDGUN_KEY);

    public static final RegistryKey<Item> MM127_SOLO_MK21_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_solo_mk21_ddgun"));
    public static final Item MM127_SOLO_MK21_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_SOLO_MK21_DDGUN_KEY)), MM127_SOLO_MK21_DDGUN_KEY);
    public static final RegistryKey<Item> MM127_SOLO_MK30_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_solo_mk30_ddgun"));
    public static final Item MM127_SOLO_MK30_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_SOLO_MK30_DDGUN_KEY)), MM127_SOLO_MK30_DDGUN_KEY);
    public static final RegistryKey<Item> MM127_TWIN_MK32_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_twin_mk32_ddgun"));
    public static final Item MM127_TWIN_MK32_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_TWIN_MK32_DDGUN_KEY)), MM127_TWIN_MK32_DDGUN_KEY);
    public static final RegistryKey<Item> MM127_TWIN_MK38_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_twin_mk38_ddgun"));
    public static final Item MM127_TWIN_MK38_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_TWIN_MK38_DDGUN_KEY)), MM127_TWIN_MK38_DDGUN_KEY);

    public static final RegistryKey<Item> MM127_SOLO_SKC34_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_solo_skc34_ddgun"));
    public static final Item MM127_SOLO_SKC34_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_SOLO_SKC34_DDGUN_KEY)), MM127_SOLO_SKC34_DDGUN_KEY);

    public static final RegistryKey<Item> MM127_TWIN_TYPE3_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_twin_type3_ddgun"));
    public static final Item MM127_TWIN_TYPE3_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_TWIN_TYPE3_DDGUN_KEY)), MM127_TWIN_TYPE3_DDGUN_KEY);
    public static final RegistryKey<Item> MM127_SOLO_TYPE3MODB_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_solo_type3modb_ddgun"));
    public static final Item MM127_SOLO_TYPE3MODB_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_SOLO_TYPE3MODB_DDGUN_KEY)), MM127_SOLO_TYPE3MODB_DDGUN_KEY);
    public static final RegistryKey<Item> MM127_TWIN_TYPE3MODB_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_twin_type3modb_ddgun"));
    public static final Item MM127_TWIN_TYPE3MODB_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_TWIN_TYPE3MODB_DDGUN_KEY)), MM127_TWIN_TYPE3MODB_DDGUN_KEY);

    public static final RegistryKey<Item> MM128_TWIN_SKC41_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm128_twin_skc41_ddgun"));
    public static final Item MM128_TWIN_SKC41_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM128_TWIN_SKC41_DDGUN_KEY)), MM128_TWIN_SKC41_DDGUN_KEY);
    public static final RegistryKey<Item> MM128_TWIN_45SKC41_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm128_twin_45skc41_ddgun"));
    public static final Item MM128_TWIN_45SKC41_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM128_TWIN_45SKC41_DDGUN_KEY)), MM128_TWIN_45SKC41_DDGUN_KEY);

    public static final RegistryKey<Item> MM130_SOLO_B13PATTERN1936_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_solo_b13pattern1936_ddgun"));
    public static final Item MM130_SOLO_B13PATTERN1936_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_SOLO_B13PATTERN1936_DDGUN_KEY)), MM130_SOLO_B13PATTERN1936_DDGUN_KEY);
    public static final RegistryKey<Item> MM130_TWIN_B2LM_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_twin_b2lm_ddgun"));
    public static final Item MM130_TWIN_B2LM_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_TWIN_B2LM_DDGUN_KEY)), MM130_TWIN_B2LM_DDGUN_KEY);

    public static final RegistryKey<Item> MM130_SOLO_MLE1924_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_solo_mle1924_ddgun"));
    public static final Item MM130_SOLO_MLE1924_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_SOLO_MLE1924_DDGUN_KEY)), MM130_SOLO_MLE1924_DDGUN_KEY);
    public static final RegistryKey<Item> MM130_QUAD_MLE1932_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_quad_mle1932_ddgun"));
    public static final Item MM130_QUAD_MLE1932_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_QUAD_MLE1932_DDGUN_KEY)), MM130_QUAD_MLE1932_DDGUN_KEY);
    public static final RegistryKey<Item> MM130_TWIN_MLE1935_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_quad_mle1935_ddgun"));
    public static final Item MM130_TWIN_MLE1935_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_TWIN_MLE1935_DDGUN_KEY)), MM130_TWIN_MLE1935_DDGUN_KEY);

    public static final RegistryKey<Item> MM130_TWIN_MOD1936PROTO_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_twin_mod1936proto_ddgun"));
    public static final Item MM130_TWIN_MOD1936PROTO_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_TWIN_MOD1936PROTO_DDGUN_KEY)), MM130_TWIN_MOD1936PROTO_DDGUN_KEY);

    public static final RegistryKey<Item> MM134_TWIN_QFMK2_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm134_twin_qfmk2_ddgun"));
    public static final Item MM134_TWIN_QFMK2_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM134_TWIN_QFMK2_DDGUN_KEY)), MM134_TWIN_QFMK2_DDGUN_KEY);

    public static final RegistryKey<Item> MM135_TWIN_MOD1938_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm135_twin_mod1938_ddgun"));
    public static final Item MM135_TWIN_MOD1938_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM135_TWIN_MOD1938_DDGUN_KEY)), MM135_TWIN_MOD1938_DDGUN_KEY);

    public static final RegistryKey<Item> MM137_TWIN_MK1PROTO_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm137_twin_mk1proto_ddgun"));
    public static final Item MM137_TWIN_MK1PROTO_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM137_TWIN_MK1PROTO_DDGUN_KEY)), MM137_TWIN_MK1PROTO_DDGUN_KEY);

    public static final RegistryKey<Item> MM138P6_SOLO_MLE1923_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm138p6_solo_mle1923_ddgun"));
    public static final Item MM138P6_SOLO_MLE1923_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM138P6_SOLO_MLE1923_DDGUN_KEY)), MM138P6_SOLO_MLE1923_DDGUN_KEY);
    public static final RegistryKey<Item> MM138P6_SOLO_MLE1927_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm138p6_solo_mle1927_ddgun"));
    public static final Item MM138P6_SOLO_MLE1927_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM138P6_SOLO_MLE1927_DDGUN_KEY)), MM138P6_SOLO_MLE1927_DDGUN_KEY);
    public static final RegistryKey<Item> MM138P6_SOLO_MLE1929_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm138p6_solo_mle1929_ddgun"));
    public static final Item MM138P6_SOLO_MLE1929_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM138P6_SOLO_MLE1929_DDGUN_KEY)), MM138P6_SOLO_MLE1929_DDGUN_KEY);
    public static final RegistryKey<Item> MM138P6_TWIN_MLE1934_DDGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm138p6_twin_mle1934_ddgun"));
    public static final Item MM138P6_TWIN_MLE1934_DDGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM138P6_TWIN_MLE1934_DDGUN_KEY)), MM138P6_TWIN_MLE1934_DDGUN_KEY);
    // </editor-fold>

    // <editor-fold desc="light cruiser guns">
    public static final RegistryKey<Item> MM_CLGUN_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm_clgun"));
    public static final Item MM_CLGUN = register(
            new Item(new Item.Settings()
                    .registryKey(MM_CLGUN_KEY)), MM_CLGUN_KEY);
    // </editor-fold>

    // <editor-fold desc="heavy cruiser guns">
    // </editor-fold>

    // <editor-fold desc="large cruiser guns">
    // </editor-fold>

    // <editor-fold desc="battleship guns">
    // </editor-fold>

    // <editor-fold desc="airplanes">
    // </editor-fold>

    // <editor-fold desc="auxiliaries">
    // </editor-fold>

    // <editor-fold desc="cargo">
    // </editor-fold>

    // <editor-fold desc="augments">
    // </editor-fold>
}