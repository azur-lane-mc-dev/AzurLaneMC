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

public class NavalComponents {
    public static final String MOD_ID = "azur_lane_mc";

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, NAVAL_COMPONENTS_KEY, NAVAL_COMPONENTS);

        ItemGroupEvents.modifyEntriesEvent(NAVAL_COMPONENTS_KEY)
                .register(itemGroup -> {
                    itemGroup.add(OLDEN_CANNON_BARREL);
                    itemGroup.add(AVI_CAL_BARREL);
                    itemGroup.add(AA_CAL_BARREL);
                    itemGroup.add(DD_CAL_BARREL);
                    itemGroup.add(CL_CAL_BARREL);
                    itemGroup.add(CA_CAL_BARREL);
                    itemGroup.add(CB_CAL_BARREL);
                    itemGroup.add(BB_CAL_BARREL);

                    itemGroup.add(LB12_BARREL);
                    itemGroup.add(LB24_BARREL);
                    itemGroup.add(LB36_BARREL);
                    itemGroup.add(MM7P5_BARREL);
                    itemGroup.add(MM7P7_BARREL);
                    itemGroup.add(MM7P92_BARREL);
                    itemGroup.add(MM12P7_BARREL);
                    itemGroup.add(MM13_BARREL);
                    itemGroup.add(MM13P2_BARREL);
                    itemGroup.add(MM20_BARREL);
                    itemGroup.add(MM23_BARREL);
                    itemGroup.add(MM25_BARREL);
                    itemGroup.add(MM28_BARREL);
                    itemGroup.add(MM30_BARREL);
                    itemGroup.add(MM37_BARREL);
                    itemGroup.add(MM40_BARREL);
                    itemGroup.add(MM55_BARREL);
                    itemGroup.add(MM57_BARREL);
                    itemGroup.add(MM65_BARREL);
                    itemGroup.add(MM76_BARREL);
                    itemGroup.add(MM80_BARREL);
                    itemGroup.add(MM88_BARREL);
                    itemGroup.add(MM90_BARREL);
                    itemGroup.add(MM100_BARREL);
                    itemGroup.add(MM102_BARREL);
                    itemGroup.add(MM105_BARREL);
                    itemGroup.add(MM113_BARREL);
                    itemGroup.add(MM114_BARREL);
                    itemGroup.add(MM120_BARREL);
                    itemGroup.add(MM127_BARREL);
                    itemGroup.add(MM128_BARREL);
                    itemGroup.add(MM130_BARREL);
                    itemGroup.add(MM134_BARREL);
                    itemGroup.add(MM135_BARREL);
                    itemGroup.add(MM137_BARREL);
                    itemGroup.add(MM138P6_BARREL);
                    itemGroup.add(MM140_BARREL);
                    itemGroup.add(MM150_BARREL);
                    itemGroup.add(MM152_BARREL);
                    itemGroup.add(MM155_BARREL);
                    itemGroup.add(MM180_BARREL);
                    itemGroup.add(MM203_BARREL);
                    itemGroup.add(MM234_BARREL);
                    itemGroup.add(MM240_BARREL);
                    itemGroup.add(MM254_BARREL);
                    itemGroup.add(MM283_BARREL);
                    itemGroup.add(MM305_BARREL);
                    itemGroup.add(MM310_BARREL);
                    itemGroup.add(MM320_BARREL);
                    itemGroup.add(MM330_BARREL);
                    itemGroup.add(MM340_BARREL);
                    itemGroup.add(MM356_BARREL);
                    itemGroup.add(MM380_BARREL);
                    itemGroup.add(MM381_BARREL);
                    itemGroup.add(MM406_BARREL);
                    itemGroup.add(MM410_BARREL);
                    itemGroup.add(MM457_BARREL);
                    itemGroup.add(MM460_BARREL);

                    itemGroup.add(AICHI_FUSELAGE);
                    itemGroup.add(ARADO_FUSELAGE);
                    itemGroup.add(BLACKBURN_FUSELAGE);
                    itemGroup.add(BREGUET_FUSELAGE);
                    itemGroup.add(BREWSTER_FUSELAGE);
                    itemGroup.add(CONSOLIDATED_FUSELAGE);
                    itemGroup.add(CURTISS_FUSELAGE);
                    itemGroup.add(DEHAVILLAND_FUSELAGE);
                    itemGroup.add(DEWOITINE_FUSELAGE);
                    itemGroup.add(DOUGLAS_FUSELAGE);
                    itemGroup.add(FAIREY_FUSELAGE);
                    itemGroup.add(FIAT_FUSELAGE);
                    itemGroup.add(FIESELER_FUSELAGE);
                    itemGroup.add(FLETTNER_FUSELAGE);
                    itemGroup.add(FOCKEWULF_FUSELAGE);
                    itemGroup.add(FRANCOBRITAVI_FUSELAGE);
                    itemGroup.add(GENERALMOTORS_FUSELAGE);
                    itemGroup.add(GLOSTER_FUSELAGE);
                    itemGroup.add(GOURDOULESEURRE_FUSELAGE);
                    itemGroup.add(GRUMMAN_FUSELAGE);
                    itemGroup.add(HAWKER_FUSELAGE);
                    itemGroup.add(HEINKEL_FUSELAGE);
                    itemGroup.add(JUNKERS_FUSELAGE);
                    itemGroup.add(KAWANISHI_FUSELAGE);
                    itemGroup.add(LAVOCHKIN_FUSELAGE);
                    itemGroup.add(LEVASSEUR_FUSELAGE);
                    itemGroup.add(MAWEI_FUSELAGE);
                    itemGroup.add(MESSERSCHMITT_FUSELAGE);
                    itemGroup.add(MITSUBISHI_FUSELAGE);
                    itemGroup.add(NAKAJIMA_FUSELAGE);
                    itemGroup.add(POLIKARPOV_FUSELAGE);
                    itemGroup.add(REGGIANE_FUSELAGE);
                    itemGroup.add(SUKHOI_FUSELAGE);
                    itemGroup.add(SUPERMARINE_FUSELAGE);
                    itemGroup.add(VOUGHT_FUSELAGE);
                    itemGroup.add(WESTLAND_FUSELAGE);
                    itemGroup.add(YOKOSUKA_FUSELAGE);
                });
    }

    public static final ItemGroup NAVAL_COMPONENTS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(NavalComponents.DD_CAL_BARREL))
            .displayName(Text.translatable("item_group.azur_lane_mc.naval_components")).build();
    public static final RegistryKey<ItemGroup> NAVAL_COMPONENTS_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "naval_components"));

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
        return registeredItem;
    }

    // <editor-fold desc="generic barrel shapes">
    //raw cannon (sail-era iron pounders) -- uses iron?
    public static final RegistryKey<Item> OLDEN_CANNON_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "olden_cannon_barrel"));
    public static final Item OLDEN_CANNON_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(OLDEN_CANNON_BARREL_KEY)), OLDEN_CANNON_BARREL_KEY);

    //raw avi caliber barrel (7.5 mm thru 30 mm) -- uses steel?
    public static final RegistryKey<Item> AVI_CAL_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "avi_cal_barrel"));
    public static final Item AVI_CAL_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(AVI_CAL_BARREL_KEY)), AVI_CAL_BARREL_KEY);

    //raw aa caliber barrel (12.7 mm thru 134 mm) -- uses steel?
    public static final RegistryKey<Item> AA_CAL_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "aa_cal_barrel"));
    public static final Item AA_CAL_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(AA_CAL_BARREL_KEY)), AA_CAL_BARREL_KEY);

    //raw dd caliber barrel (76 mm thru 138.6 mm) -- uses steel?
    public static final RegistryKey<Item> DD_CAL_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "dd_cal_barrel"));
    public static final Item DD_CAL_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(DD_CAL_BARREL_KEY)), DD_CAL_BARREL_KEY);

    //raw cl caliber barrel (140 mm thru 180 mm) -- uses steel?
    public static final RegistryKey<Item> CL_CAL_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "cl_cal_barrel"));
    public static final Item CL_CAL_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(CL_CAL_BARREL_KEY)), CL_CAL_BARREL_KEY);

    //raw ca caliber barrel (203 mm thru 240 mm) -- uses steel?
    public static final RegistryKey<Item> CA_CAL_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "ca_cal_barrel"));
    public static final Item CA_CAL_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(CA_CAL_BARREL_KEY)), CA_CAL_BARREL_KEY);

    //raw cb caliber barrel (203 mm thru 240 mm) -- uses steel?
    public static final RegistryKey<Item> CB_CAL_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "cb_cal_barrel"));
    public static final Item CB_CAL_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(CB_CAL_BARREL_KEY)), CB_CAL_BARREL_KEY);

    //raw bb caliber barrel (283 mm thru 460 mm) -- uses steel?
    public static final RegistryKey<Item> BB_CAL_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "bb_cal_barrel"));
    public static final Item BB_CAL_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(BB_CAL_BARREL_KEY)), BB_CAL_BARREL_KEY);
    // </editor-fold>

    // <editor-fold desc="specific barrel calibers">
    public static final RegistryKey<Item> LB12_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb12_barrel"));
    public static final Item LB12_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(LB12_BARREL_KEY)), LB12_BARREL_KEY);

    public static final RegistryKey<Item> LB24_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb24_barrel"));
    public static final Item LB24_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(LB24_BARREL_KEY)), LB24_BARREL_KEY);

    public static final RegistryKey<Item> LB36_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lb36_barrel"));
    public static final Item LB36_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(LB36_BARREL_KEY)), LB36_BARREL_KEY);

    public static final RegistryKey<Item> MM7P5_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm7p5_barrel"));
    public static final Item MM7P5_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM7P5_BARREL_KEY)), MM7P5_BARREL_KEY);

    public static final RegistryKey<Item> MM7P7_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm7p7_barrel"));
    public static final Item MM7P7_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM7P7_BARREL_KEY)), MM7P7_BARREL_KEY);

    public static final RegistryKey<Item> MM7P92_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm7p92_barrel"));
    public static final Item MM7P92_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM7P92_BARREL_KEY)), MM7P92_BARREL_KEY);

    public static final RegistryKey<Item> MM12P7_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm12p7_barrel"));
    public static final Item MM12P7_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM12P7_BARREL_KEY)), MM12P7_BARREL_KEY);

    public static final RegistryKey<Item> MM13_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm13_barrel"));
    public static final Item MM13_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM13_BARREL_KEY)), MM13_BARREL_KEY);

    public static final RegistryKey<Item> MM13P2_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm13p2_barrel"));
    public static final Item MM13P2_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM13P2_BARREL_KEY)), MM13P2_BARREL_KEY);

    public static final RegistryKey<Item> MM20_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm20_barrel"));
    public static final Item MM20_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM20_BARREL_KEY)), MM20_BARREL_KEY);

    public static final RegistryKey<Item> MM23_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm23_barrel"));
    public static final Item MM23_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM23_BARREL_KEY)), MM23_BARREL_KEY);

    public static final RegistryKey<Item> MM25_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm25_barrel"));
    public static final Item MM25_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM25_BARREL_KEY)), MM25_BARREL_KEY);

    public static final RegistryKey<Item> MM28_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm28_barrel"));
    public static final Item MM28_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM28_BARREL_KEY)), MM28_BARREL_KEY);

    public static final RegistryKey<Item> MM30_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm30_barrel"));
    public static final Item MM30_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM30_BARREL_KEY)), MM30_BARREL_KEY);

    public static final RegistryKey<Item> MM37_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm37_barrel"));
    public static final Item MM37_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM37_BARREL_KEY)), MM37_BARREL_KEY);

    public static final RegistryKey<Item> MM40_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm40_barrel"));
    public static final Item MM40_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM40_BARREL_KEY)), MM40_BARREL_KEY);

    public static final RegistryKey<Item> MM55_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm55_barrel"));
    public static final Item MM55_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM55_BARREL_KEY)), MM55_BARREL_KEY);

    public static final RegistryKey<Item> MM57_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm57_barrel"));
    public static final Item MM57_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM57_BARREL_KEY)), MM57_BARREL_KEY);

    public static final RegistryKey<Item> MM65_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm65_barrel"));
    public static final Item MM65_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM65_BARREL_KEY)), MM65_BARREL_KEY);

    public static final RegistryKey<Item> MM76_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm76_barrel"));
    public static final Item MM76_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM76_BARREL_KEY)), MM76_BARREL_KEY);

    public static final RegistryKey<Item> MM80_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm80_barrel"));
    public static final Item MM80_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM80_BARREL_KEY)), MM80_BARREL_KEY);

    public static final RegistryKey<Item> MM88_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm88_barrel"));
    public static final Item MM88_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM88_BARREL_KEY)), MM88_BARREL_KEY);

    public static final RegistryKey<Item> MM90_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm90_barrel"));
    public static final Item MM90_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM90_BARREL_KEY)), MM90_BARREL_KEY);

    public static final RegistryKey<Item> MM100_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm100_barrel"));
    public static final Item MM100_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM100_BARREL_KEY)), MM100_BARREL_KEY);

    public static final RegistryKey<Item> MM102_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm102_barrel"));
    public static final Item MM102_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM102_BARREL_KEY)), MM102_BARREL_KEY);

    public static final RegistryKey<Item> MM105_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm105_barrel"));
    public static final Item MM105_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM105_BARREL_KEY)), MM105_BARREL_KEY);

    public static final RegistryKey<Item> MM113_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm113_barrel"));
    public static final Item MM113_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM113_BARREL_KEY)), MM113_BARREL_KEY);

    public static final RegistryKey<Item> MM114_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm114_barrel"));
    public static final Item MM114_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM114_BARREL_KEY)), MM114_BARREL_KEY);

    public static final RegistryKey<Item> MM120_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm120_barrel"));
    public static final Item MM120_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM120_BARREL_KEY)), MM120_BARREL_KEY);

    public static final RegistryKey<Item> MM127_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm127_barrel"));
    public static final Item MM127_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM127_BARREL_KEY)), MM127_BARREL_KEY);

    public static final RegistryKey<Item> MM128_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm128_barrel"));
    public static final Item MM128_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM128_BARREL_KEY)), MM128_BARREL_KEY);

    public static final RegistryKey<Item> MM130_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm130_barrel"));
    public static final Item MM130_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM130_BARREL_KEY)), MM130_BARREL_KEY);

    public static final RegistryKey<Item> MM134_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm134_barrel"));
    public static final Item MM134_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM134_BARREL_KEY)), MM134_BARREL_KEY);

    public static final RegistryKey<Item> MM135_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm135_barrel"));
    public static final Item MM135_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM135_BARREL_KEY)), MM135_BARREL_KEY);

    public static final RegistryKey<Item> MM137_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm137_barrel"));
    public static final Item MM137_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM137_BARREL_KEY)), MM137_BARREL_KEY);

    public static final RegistryKey<Item> MM138P6_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm138p6_barrel"));
    public static final Item MM138P6_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM138P6_BARREL_KEY)), MM138P6_BARREL_KEY);

    public static final RegistryKey<Item> MM140_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm140_barrel"));
    public static final Item MM140_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM140_BARREL_KEY)), MM140_BARREL_KEY);

    public static final RegistryKey<Item> MM150_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm150_barrel"));
    public static final Item MM150_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM150_BARREL_KEY)), MM150_BARREL_KEY);

    public static final RegistryKey<Item> MM152_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm152_barrel"));
    public static final Item MM152_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM152_BARREL_KEY)), MM152_BARREL_KEY);

    public static final RegistryKey<Item> MM155_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm155_barrel"));
    public static final Item MM155_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM155_BARREL_KEY)), MM155_BARREL_KEY);

    public static final RegistryKey<Item> MM180_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm180_barrel"));
    public static final Item MM180_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM180_BARREL_KEY)), MM180_BARREL_KEY);

    public static final RegistryKey<Item> MM203_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm203_barrel"));
    public static final Item MM203_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM203_BARREL_KEY)), MM203_BARREL_KEY);

    public static final RegistryKey<Item> MM234_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm234_barrel"));
    public static final Item MM234_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM234_BARREL_KEY)), MM234_BARREL_KEY);

    public static final RegistryKey<Item> MM240_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm240_barrel"));
    public static final Item MM240_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM240_BARREL_KEY)), MM240_BARREL_KEY);

    public static final RegistryKey<Item> MM254_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm254_barrel"));
    public static final Item MM254_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM254_BARREL_KEY)), MM254_BARREL_KEY);

    public static final RegistryKey<Item> MM283_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm283_barrel"));
    public static final Item MM283_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM283_BARREL_KEY)), MM283_BARREL_KEY);

    public static final RegistryKey<Item> MM305_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm305_barrel"));
    public static final Item MM305_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM305_BARREL_KEY)), MM305_BARREL_KEY);

    public static final RegistryKey<Item> MM310_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm310_barrel"));
    public static final Item MM310_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM310_BARREL_KEY)), MM310_BARREL_KEY);

    public static final RegistryKey<Item> MM320_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm320_barrel"));
    public static final Item MM320_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM320_BARREL_KEY)), MM320_BARREL_KEY);

    public static final RegistryKey<Item> MM330_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm330_barrel"));
    public static final Item MM330_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM330_BARREL_KEY)), MM330_BARREL_KEY);

    public static final RegistryKey<Item> MM340_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm340_barrel"));
    public static final Item MM340_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM340_BARREL_KEY)), MM340_BARREL_KEY);

    public static final RegistryKey<Item> MM356_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm356_barrel"));
    public static final Item MM356_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM356_BARREL_KEY)), MM356_BARREL_KEY);

    public static final RegistryKey<Item> MM380_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm380_barrel"));
    public static final Item MM380_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM380_BARREL_KEY)), MM380_BARREL_KEY);

    public static final RegistryKey<Item> MM381_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm381_barrel"));
    public static final Item MM381_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM381_BARREL_KEY)), MM381_BARREL_KEY);

    public static final RegistryKey<Item> MM406_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm406_barrel"));
    public static final Item MM406_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM406_BARREL_KEY)), MM406_BARREL_KEY);

    public static final RegistryKey<Item> MM410_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm410_barrel"));
    public static final Item MM410_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM410_BARREL_KEY)), MM410_BARREL_KEY);

    public static final RegistryKey<Item> MM457_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm457_barrel"));
    public static final Item MM457_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM457_BARREL_KEY)), MM457_BARREL_KEY);

    public static final RegistryKey<Item> MM460_BARREL_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mm460_barrel"));
    public static final Item MM460_BARREL = register(
            new Item(new Item.Settings()
                    .registryKey(MM460_BARREL_KEY)), MM460_BARREL_KEY);
    // </editor-fold>

    // <editor-fold desc="aviation fuselages">
    public static final RegistryKey<Item> AICHI_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "aichi_fuselage"));
    public static final Item AICHI_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(AICHI_FUSELAGE_KEY)), AICHI_FUSELAGE_KEY);

    public static final RegistryKey<Item> ARADO_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "arado_fuselage"));
    public static final Item ARADO_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(ARADO_FUSELAGE_KEY)), ARADO_FUSELAGE_KEY);

    public static final RegistryKey<Item> BLACKBURN_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "blackburn_fuselage"));
    public static final Item BLACKBURN_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(BLACKBURN_FUSELAGE_KEY)), BLACKBURN_FUSELAGE_KEY);

    public static final RegistryKey<Item> BREGUET_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "breguet_fuselage"));
    public static final Item BREGUET_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(BREGUET_FUSELAGE_KEY)), BREGUET_FUSELAGE_KEY);

    public static final RegistryKey<Item> BREWSTER_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "brewster_fuselage"));
    public static final Item BREWSTER_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(BREWSTER_FUSELAGE_KEY)), BREWSTER_FUSELAGE_KEY);

    public static final RegistryKey<Item> CONSOLIDATED_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "consolidated_fuselage"));
    public static final Item CONSOLIDATED_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(CONSOLIDATED_FUSELAGE_KEY)), CONSOLIDATED_FUSELAGE_KEY);

    public static final RegistryKey<Item> CURTISS_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "curtiss_fuselage"));
    public static final Item CURTISS_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(CURTISS_FUSELAGE_KEY)), CURTISS_FUSELAGE_KEY);

    public static final RegistryKey<Item> DEHAVILLAND_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "dehavilland_fuselage"));
    public static final Item DEHAVILLAND_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(DEHAVILLAND_FUSELAGE_KEY)), DEHAVILLAND_FUSELAGE_KEY);

    public static final RegistryKey<Item> DEWOITINE_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "dewoitine_fuselage"));
    public static final Item DEWOITINE_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(DEWOITINE_FUSELAGE_KEY)), DEWOITINE_FUSELAGE_KEY);

    public static final RegistryKey<Item> DOUGLAS_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "douglas_fuselage"));
    public static final Item DOUGLAS_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(DOUGLAS_FUSELAGE_KEY)), DOUGLAS_FUSELAGE_KEY);

    public static final RegistryKey<Item> FAIREY_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "fairey_fuselage"));
    public static final Item FAIREY_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(FAIREY_FUSELAGE_KEY)), FAIREY_FUSELAGE_KEY);

    public static final RegistryKey<Item> FIAT_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "fiat_fuselage"));
    public static final Item FIAT_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(FIAT_FUSELAGE_KEY)), FIAT_FUSELAGE_KEY);

    public static final RegistryKey<Item> FIESELER_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "fieseler_fuselage"));
    public static final Item FIESELER_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(FIESELER_FUSELAGE_KEY)), FIESELER_FUSELAGE_KEY);

    public static final RegistryKey<Item> FLETTNER_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "flettner_fuselage"));
    public static final Item FLETTNER_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(FLETTNER_FUSELAGE_KEY)), FLETTNER_FUSELAGE_KEY);

    public static final RegistryKey<Item> FOCKEWULF_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "fockewulf_fuselage"));
    public static final Item FOCKEWULF_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(FOCKEWULF_FUSELAGE_KEY)), FOCKEWULF_FUSELAGE_KEY);

    public static final RegistryKey<Item> FRANCOBRITAVI_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "francobritavi_fuselage"));
    public static final Item FRANCOBRITAVI_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(FRANCOBRITAVI_FUSELAGE_KEY)), FRANCOBRITAVI_FUSELAGE_KEY);

    public static final RegistryKey<Item> GENERALMOTORS_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "generalmotors_fuselage"));
    public static final Item GENERALMOTORS_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(GENERALMOTORS_FUSELAGE_KEY)), GENERALMOTORS_FUSELAGE_KEY);

    public static final RegistryKey<Item> GLOSTER_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "gloster_fuselage"));
    public static final Item GLOSTER_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(GLOSTER_FUSELAGE_KEY)), GLOSTER_FUSELAGE_KEY);

    public static final RegistryKey<Item> GOURDOULESEURRE_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "gourdouleseurre_fuselage"));
    public static final Item GOURDOULESEURRE_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(GOURDOULESEURRE_FUSELAGE_KEY)), GOURDOULESEURRE_FUSELAGE_KEY);

    public static final RegistryKey<Item> GRUMMAN_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "grumman_fuselage"));
    public static final Item GRUMMAN_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(GRUMMAN_FUSELAGE_KEY)), GRUMMAN_FUSELAGE_KEY);

    public static final RegistryKey<Item> HAWKER_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "hawker_fuselage"));
    public static final Item HAWKER_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(HAWKER_FUSELAGE_KEY)), HAWKER_FUSELAGE_KEY);

    public static final RegistryKey<Item> HEINKEL_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "heinkel_fuselage"));
    public static final Item HEINKEL_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(HEINKEL_FUSELAGE_KEY)), HEINKEL_FUSELAGE_KEY);

    public static final RegistryKey<Item> JUNKERS_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "junkers_fuselage"));
    public static final Item JUNKERS_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(JUNKERS_FUSELAGE_KEY)), JUNKERS_FUSELAGE_KEY);

    public static final RegistryKey<Item> KAWANISHI_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "kawanishi_fuselage"));
    public static final Item KAWANISHI_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(KAWANISHI_FUSELAGE_KEY)), KAWANISHI_FUSELAGE_KEY);

    public static final RegistryKey<Item> LAVOCHKIN_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "lavochkin_fuselage"));
    public static final Item LAVOCHKIN_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(LAVOCHKIN_FUSELAGE_KEY)), LAVOCHKIN_FUSELAGE_KEY);

    public static final RegistryKey<Item> LEVASSEUR_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "levasseur_fuselage"));
    public static final Item LEVASSEUR_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(LEVASSEUR_FUSELAGE_KEY)), LEVASSEUR_FUSELAGE_KEY);

    public static final RegistryKey<Item> MAWEI_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mawei_fuselage"));
    public static final Item MAWEI_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(MAWEI_FUSELAGE_KEY)), MAWEI_FUSELAGE_KEY);

    public static final RegistryKey<Item> MESSERSCHMITT_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "messerschmitt_fuselage"));
    public static final Item MESSERSCHMITT_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(MESSERSCHMITT_FUSELAGE_KEY)), MESSERSCHMITT_FUSELAGE_KEY);

    public static final RegistryKey<Item> MITSUBISHI_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "mitsubishi_fuselage"));
    public static final Item MITSUBISHI_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(MITSUBISHI_FUSELAGE_KEY)), MITSUBISHI_FUSELAGE_KEY);

    public static final RegistryKey<Item> NAKAJIMA_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "nakajima_fuselage"));
    public static final Item NAKAJIMA_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(NAKAJIMA_FUSELAGE_KEY)), NAKAJIMA_FUSELAGE_KEY);

    public static final RegistryKey<Item> POLIKARPOV_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "polikarpov_fuselage"));
    public static final Item POLIKARPOV_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(POLIKARPOV_FUSELAGE_KEY)), POLIKARPOV_FUSELAGE_KEY);

    public static final RegistryKey<Item> REGGIANE_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "reggiane_fuselage"));
    public static final Item REGGIANE_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(REGGIANE_FUSELAGE_KEY)), REGGIANE_FUSELAGE_KEY);

    public static final RegistryKey<Item> SUKHOI_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "sukhoi_fuselage"));
    public static final Item SUKHOI_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(SUKHOI_FUSELAGE_KEY)), SUKHOI_FUSELAGE_KEY);

    public static final RegistryKey<Item> SUPERMARINE_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "supermarine_fuselage"));
    public static final Item SUPERMARINE_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(SUPERMARINE_FUSELAGE_KEY)), SUPERMARINE_FUSELAGE_KEY);

    public static final RegistryKey<Item> VOUGHT_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "vought_fuselage"));
    public static final Item VOUGHT_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(VOUGHT_FUSELAGE_KEY)), VOUGHT_FUSELAGE_KEY);

    public static final RegistryKey<Item> WESTLAND_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "westland_fuselage"));
    public static final Item WESTLAND_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(WESTLAND_FUSELAGE_KEY)), WESTLAND_FUSELAGE_KEY);

    public static final RegistryKey<Item> YOKOSUKA_FUSELAGE_KEY = RegistryKey.of(
            RegistryKeys.ITEM, Identifier.of(MOD_ID, "yokosuka_fuselage"));
    public static final Item YOKOSUKA_FUSELAGE = register(
            new Item(new Item.Settings()
                    .registryKey(YOKOSUKA_FUSELAGE_KEY)), YOKOSUKA_FUSELAGE_KEY);
    // </editor-fold>
}