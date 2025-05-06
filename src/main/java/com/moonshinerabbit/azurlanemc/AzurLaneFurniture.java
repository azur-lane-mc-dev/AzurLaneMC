package com.moonshinerabbit.azurlanemc;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.*;
import java.util.function.BiFunction;


public class AzurLaneFurniture {
    //mod id shortcut
    public static final String MOD_ID = "azur_lane_mc";
    public record AdditionalParams(int value, String category, Set<String> material, String faction,
                                   Set<String> aesthetic) {}

    // register the Azur Lane Furniture block group and its contents on initialization
    public static void initialize() {
        // Register Item Group: Furniture
        Registry.register(Registries.ITEM_GROUP, AZURLANEFURNITURE_KEY, AZURLANEFURNITURE);
        ItemGroupEvents.modifyEntriesEvent(AzurLaneFurniture.AZURLANEFURNITURE_KEY)
                .register(itemGroup -> {
                    itemGroup.add(AzurLaneFurniture.SET001_BROKENFLOORING.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_BROKENWALLPAPER.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_ANGLERFISHLAMP.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_BLACKBOARD.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_BROKENDININGSET.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_BROKENSCREEN.asItem());
                    //itemGroup.add(AzurLaneFurniture.SET001_BROKENSPEAKER.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_BROKENTEASET.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_BROKENTV.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_BROKENWASHBASIN.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_BROKENWINDOW.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_CANDLESTICK.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_CARDBOARDBOX.asItem());
                    //itemGroup.add(AzurLaneFurniture.SET001_CARDBOARDTABLE.asItem());
                    //itemGroup.add(AzurLaneFurniture.SET001_CHEAPBEDMAT.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_FRAGILEDOOR.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_KEROSENELAMP.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_LAZYCAT.asItem());
                    //itemGroup.add(AzurLaneFurniture.SET001_MOP.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_MOUSE.asItem());
                    //itemGroup.add(AzurLaneFurniture.SET001_NEWSPAPERCUSHION.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_POSTER.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_RADISHSEEDLINGS.asItem());
                    //itemGroup.add(AzurLaneFurniture.SET001_SIMPLECOUCH.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_STICKYNOTES.asItem());
                    itemGroup.add(AzurLaneFurniture.SET001_TATTEREDMAT.asItem());
                });
    }

    // Create Furniture ItemGroup directory with properties AND its registry key
    // All registered in initialization above
    public static final ItemGroup AZURLANEFURNITURE = FabricItemGroup.builder()
            .icon(() -> new ItemStack(AzurLaneFurniture.SET001_RADISHSEEDLINGS))
            .displayName(Text.translatable("item_group.azur_lane_mc.azurlane_furniture"))
            .build();
    public static final RegistryKey<ItemGroup> AZURLANEFURNITURE_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "azurlane_furniture")
    );

    //register block outline
    private static Block register(String name, BiFunction<AbstractBlock.Settings, AdditionalParams, Block> blockFactory, Block.Settings settings,
                                  boolean shouldRegisterItem, int value, String category, Set<String> material,
                                  String faction, Set<String> aesthetic) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        settings = settings.nonOpaque()
                .allowsSpawning((state, world, pos, type) -> false);
        AdditionalParams additionalParams = new AdditionalParams(value, category, material, faction, aesthetic);
        Block block = blockFactory.apply(settings.registryKey(blockKey), additionalParams);
        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }
        return Registry.register(Registries.BLOCK, blockKey, block);
    }
    private static RegistryKey<Block> keyOfBlock(String name){
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, name));
    }
    private static RegistryKey<Item> keyOfItem(String name){
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name));
    }



    // Create Furniture blocks and register
    // provide a json in blockstates and items
    // provide a texture in textures/block and textures/item
    // provide drop table in data/modid/loot_table/blocks
    // provide recipe in data/modid/recipe
    // <editor-fold desc="SET001 Run-down">
    public static final Block SET001_BROKENFLOORING = register(
            "set001_flooring", (settings, params) -> new FurnitureSetup.DormBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1, 1).sounds(BlockSoundGroup.BAMBOO).burnable(),
            true,
            0,"floor",Set.of("bamboo"),"univ",Set.of("rundown"));
    public static final Block SET001_BROKENWALLPAPER = register(
            "set001_walls", (settings, params) -> new FurnitureSetup.Wall3Block(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1, 1).sounds(BlockSoundGroup.SCAFFOLDING).burnable(),
            true,
            0,"wallpaper",Set.of("paper"),"univ",Set.of("rundown"));
    public static final Block SET001_ANGLERFISHLAMP = register(
            "set001_lighting_a", (settings, params) -> new FurnitureSetup.DimLampBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,2).sounds(BlockSoundGroup.DECORATED_POT)
                    .luminance(FurnitureSetup.DimLampBlock::getLuminance).noCollision(),
            true,
            0, "light",Set.of("ceramic", "electric"),"univ",Set.of("rundown"));
    public static final Block SET001_BLACKBOARD = register(
            "set001_walldecor_a", (settings, params) -> new FurnitureSetup.WallDecorBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(2,2).sounds(BlockSoundGroup.CALCITE),
            true,
            0, "walldecor",Set.of("ceramic","wood"),"univ",Set.of("rundown"));
    public static final Block SET001_BROKENDININGSET = register(
            "set001_decor_a", (settings,  params) -> new FurnitureSetup.DecorBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.DECORATED_POT),
            true,
            0, "decor",Set.of("ceramic"),"univ",Set.of("rundown"));
    public static final Block SET001_BROKENSCREEN = register(
            "set001_prop_a", (settings,  params) -> new FurnitureSetup.ScreenBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.SCAFFOLDING),
            true,
            0,"prop",Set.of("wood"),"univ",Set.of("rundown"));
    //public static final Block SET001_BROKENSPEAKER = register("set001_walldecor_d", Block::new, AbstractBlock.Settings.create().strength(2,1).sounds(BlockSoundGroup.STONE), true);
    public static final Block SET001_BROKENTEASET = register(
            "set001_decor_b", (settings,  params) -> new FurnitureSetup.DecorBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.DECORATED_POT).noCollision(),
            true,
            0,"decor",Set.of("ceramic","wood"),"univ",Set.of("rundown"));
    public static final Block SET001_BROKENTV = register(
            "set001_prop_b", (settings,  params) -> new FurnitureSetup.PropBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                .strength(2,1).sounds(BlockSoundGroup.STONE),
            true,
            0, "prop",Set.of("electric"),"univ",Set.of("rundown"));
    public static final Block SET001_BROKENWASHBASIN = register(
            "set001_decor_c", (settings,  params) -> new FurnitureSetup.DecorBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.CALCITE),
            true,
            0,"decor",Set.of("ceramic"),"univ",Set.of("rundown"));
    public static final Block SET001_BROKENWINDOW = register(
            "set001_window", (settings, params) -> new FurnitureSetup.TallWindowBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.SCAFFOLDING).burnable(),
            true,
            0,"window",Set.of("wood","paper"),"univ",Set.of("rundown"));
    public static final Block SET001_CANDLESTICK = register(
            "set001_lighting_b", (settings, params) -> new FurnitureSetup.MidLampBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormStorageBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.DECORATED_POT)
                    .luminance(FurnitureSetup.MidLampBlock::getLuminance),
            true,
            0, "light",Set.of("ceramic", "electric"),"univ",Set.of("rundown"));
    public static final Block SET001_CARDBOARDBOX = register(
            "set001_storage", (settings, params) -> new FurnitureSetup.TallStorageBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormStorageBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.PACKED_MUD).burnable(),
            true,
            0, "storage",Set.of("paper"),"univ",Set.of("rundown"));
    //public static final Block SET001_CARDBOARDTABLE = register("set001_table", Block::new, AbstractBlock.Settings.create().strength(1,1).sounds(BlockSoundGroup.PACKED_MUD), true);
    //public static final Block SET001_CHEAPBEDMAT = register("set001_bed", Block::new, AbstractBlock.Settings.create().strength(1,1).sounds(BlockSoundGroup.BAMBOO_WOOD), true);
    public static final Block SET001_FRAGILEDOOR = register(
            "set001_door", (settings, params) -> new FurnitureSetup.SlidingDoorBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.SCAFFOLDING).burnable(),
            true,
            0,"door",Set.of("wood","paper"), "univ",Set.of("rundown"));
    public static final Block SET001_KEROSENELAMP = register(
            "set001_lighting_c", (settings, params) -> new FurnitureSetup.BrightLampBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(2,3).sounds(BlockSoundGroup.LANTERN)
                    .luminance(FurnitureSetup.BrightLampBlock::getLuminance).noCollision(),
            true,
            0,"light",Set.of("metal","gasoline"),"univ",Set.of("rundown"));
    public static final Block SET001_LAZYCAT = register(
            "set001_decor_d", (settings, params) -> new FurnitureSetup.CatBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.WOOL).burnable(),
            true,
            0,"decor",Set.of("wool"),"univ",Set.of("rundown"));
    //public static final Block SET001_MOP = register("set001_prop_c", Block::new, AbstractBlock.Settings.create().strength(1,2).sounds(BlockSoundGroup.CANDLE), true);
    public static final Block SET001_MOUSE = register(
            "set001_decor_e", (settings, params) -> new FurnitureSetup.RodentBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.WOOL).burnable(),
            true,
            0,"decor",Set.of("wool"),"univ",Set.of("rundown"));
    //public static final Block SET001_NEWSPAPERCUSHION = register("set001_seat_a", Block::new, AbstractBlock.Settings.create().strength(1,1).sounds(BlockSoundGroup.SMALL_DRIPLEAF), true);
    public static final Block SET001_POSTER = register(
            "set001_walldecor_c", (settings, params) -> new FurnitureSetup.WallDecorBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.SMALL_DRIPLEAF).burnable()
                    .noCollision(),
            true,
            0, "walldecor",Set.of("paper"),"eagle",Set.of("rundown"));
    public static final Block SET001_RADISHSEEDLINGS = register(
            "set001_prop_d", (settings, params) -> new FurnitureSetup.PlanterBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(2,1).sounds(BlockSoundGroup.CROP),
            true,
            0, "prop",Set.of("plant","ceramic","stone"),"univ",Set.of("rundown"));
    //public static final Block SET001_SIMPLECOUCH = register("set001_seat_b", Block::new, AbstractBlock.Settings.create().strength(1,1).sounds(BlockSoundGroup.WOOL), true);
    public static final Block SET001_STICKYNOTES = register(
            "set001_walldecor_b", (settings, params) -> new FurnitureSetup.WallDecorBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.SMALL_DRIPLEAF).burnable(),
            true,
            0,"walldecor",Set.of("paper"),"univ",Set.of("rundown"));
    public static final Block SET001_TATTEREDMAT = register(
            "set001_floordecor", (settings, params) -> new FurnitureSetup.FloorDecorBlock(settings,params.value,params.category,params.material,params.faction,params.aesthetic),
            FurnitureSetup.DormBlock.Settings.create()
                    .strength(1,1).sounds(BlockSoundGroup.WOOL).burnable()
                    .noCollision(),
            true,
            0,"rug",Set.of("cotton"),"univ",Set.of("rundown"));
    // </editor-fold>

    //register all block entities
    public static final BlockEntityType<FurnitureSetup.TallStorageEntity> TALL_STORAGE_ENTITY =
                Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MOD_ID,"tall_storage_block"),
                        FabricBlockEntityTypeBuilder.create(FurnitureSetup.TallStorageEntity::new,
                                SET001_CARDBOARDBOX
                        ).build());
    public static final BlockEntityType<FurnitureSetup.ChalkboardEntity> CHALKBOARD_ENTITY =
                Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MOD_ID, "chalkboard_block"),
                        FabricBlockEntityTypeBuilder.create(FurnitureSetup.ChalkboardEntity::new,
                                SET001_BLACKBOARD
                        ).build());
}