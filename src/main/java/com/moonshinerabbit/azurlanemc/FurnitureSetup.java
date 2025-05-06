package com.moonshinerabbit.azurlanemc;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import java.util.*;

import static com.moonshinerabbit.azurlanemc.AzurLaneFurniture.CHALKBOARD_ENTITY;
import static com.moonshinerabbit.azurlanemc.AzurLaneFurniture.TALL_STORAGE_ENTITY;


public class FurnitureSetup {
    public static class DormBlock extends Block {
        private final int value;
        private final String category;
        private final Set<String> material;
        private final String faction;
        private final Set<String> aesthetic;

        public DormBlock (Settings settings, int value, String category,
                          Set<String> material, String faction, Set<String> aesthetic){
            super(settings);
            this.value = value;
            this.category = category;
            this.material = Collections.unmodifiableSet(material);
            this.faction = faction;
            this.aesthetic = Collections.unmodifiableSet(aesthetic);
        }
        public int getValue(){return value;}
        public String getCategory(){return category;}
        public Set<String> getMaterial(){return material;}
        public String getFaction(){return faction;}
        public Set<String> getAesthetic(){return aesthetic;}

        public static final MapCodec<DormBlock> MAP_CODEC = RecordCodecBuilder.mapCodec(instance ->
                instance.group(
                        Block.Settings.CODEC.fieldOf("settings").forGetter(DormBlock::getSettings),
                        Codec.INT.fieldOf("value").forGetter(DormBlock::getValue),
                        Codec.STRING.fieldOf("category").forGetter(DormBlock::getCategory),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("material").forGetter(block -> (HashSet<String>) block.getMaterial()),
                        Codec.STRING.fieldOf("faction").forGetter(DormBlock::getFaction),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("aesthetic").forGetter(block -> (HashSet<String>) block.getAesthetic())
                ).apply(instance, DormBlock::new)
        );

        @Override
        public void appendTooltip(ItemStack itemStack, Item.TooltipContext context, List<Text> tooltip, TooltipType options){
            String registryPath = Objects.requireNonNull(Registries.ITEM.getId(this.asItem())).getPath();

            tooltip.add(Text.translatable("item.azur_lane_mc." + registryPath + ".tooltip"));
        }
    }
    public static class DormStorageBlock extends BlockWithEntity {
        private final int value;
        private final String category;
        private final Set<String> material;
        private final String faction;
        private final Set<String> aesthetic;

        public DormStorageBlock (Settings settings, int value, String category,
                          Set<String> material, String faction, Set<String> aesthetic){
            super(settings);
            this.value = value;
            this.category = category;
            this.material = Collections.unmodifiableSet(material);
            this.faction = faction;
            this.aesthetic = Collections.unmodifiableSet(aesthetic);
        }
        public int getValue(){return value;}
        public String getCategory(){return category;}
        public Set<String> getMaterial(){return material;}
        public String getFaction(){return faction;}
        public Set<String> getAesthetic(){return aesthetic;}

        public static final MapCodec<DormStorageBlock> MAP_CODEC = RecordCodecBuilder.mapCodec(instance ->
                instance.group(
                        Block.Settings.CODEC.fieldOf("settings").forGetter(DormStorageBlock::getSettings),
                        Codec.INT.fieldOf("value").forGetter(DormStorageBlock::getValue),
                        Codec.STRING.fieldOf("category").forGetter(DormStorageBlock::getCategory),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("material").forGetter(block -> (HashSet<String>) block.getMaterial()),
                        Codec.STRING.fieldOf("faction").forGetter(DormStorageBlock::getFaction),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("aesthetic").forGetter(block -> (HashSet<String>) block.getAesthetic())
                ).apply(instance, DormStorageBlock::new)
        );
        @Override public MapCodec<? extends BlockWithEntity> getCodec() {return MAP_CODEC;}
        @Override
        public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return null;
        }
        @Override
        public void appendTooltip(ItemStack itemStack, Item.TooltipContext context, List<Text> tooltip, TooltipType options){
            String registryPath = Objects.requireNonNull(Registries.ITEM.getId(this.asItem())).getPath();

            tooltip.add(Text.translatable("item.azur_lane_mc." + registryPath + ".tooltip"));
        }
    }
    public static class DormDrawingBlock extends BlockWithEntity {
        private final int value;
        private final String category;
        private final Set<String> material;
        private final String faction;
        private final Set<String> aesthetic;

        public DormDrawingBlock (Settings settings, int value, String category,
                                 Set<String> material, String faction, Set<String> aesthetic){
            super(settings);
            this.value = value;
            this.category = category;
            this.material = Collections.unmodifiableSet(material);
            this.faction = faction;
            this.aesthetic = Collections.unmodifiableSet(aesthetic);
        }
        public int getValue(){return value;}
        public String getCategory(){return category;}
        public Set<String> getMaterial(){return material;}
        public String getFaction(){return faction;}
        public Set<String> getAesthetic(){return aesthetic;}

        public static final MapCodec<DormDrawingBlock> MAP_CODEC = RecordCodecBuilder.mapCodec(instance ->
                instance.group(
                        Block.Settings.CODEC.fieldOf("settings").forGetter(DormDrawingBlock::getSettings),
                        Codec.INT.fieldOf("value").forGetter(DormDrawingBlock::getValue),
                        Codec.STRING.fieldOf("category").forGetter(DormDrawingBlock::getCategory),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("material").forGetter(block -> (HashSet<String>) block.getMaterial()),
                        Codec.STRING.fieldOf("faction").forGetter(DormDrawingBlock::getFaction),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("aesthetic").forGetter(block -> (HashSet<String>) block.getAesthetic())
                ).apply(instance, DormDrawingBlock::new)
        );
        @Override public MapCodec<? extends BlockWithEntity> getCodec() {return MAP_CODEC;}
        @Override
        public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return null;
        }
        @Override
        public void appendTooltip(ItemStack itemStack, Item.TooltipContext context, List<Text> tooltip, TooltipType options){
            String registryPath = Objects.requireNonNull(Registries.ITEM.getId(this.asItem())).getPath();

            tooltip.add(Text.translatable("item.azur_lane_mc." + registryPath + ".tooltip"));
        }
    }
    //this type of wall has 4 variants and updates with new textures to 3 meters vertically
    public static class Wall3Block extends DormBlock {
        public static final EnumProperty<BlockVariant> VARIANT = EnumProperty.of("variant", BlockVariant.class);
        public enum BlockVariant implements StringIdentifiable {
            GENERIC("generic"),
            BASEBOARD("baseboard"),
            MIDDLE("middle"),
            TOPBOARD("topboard");
            private final String name;
            BlockVariant(String name) {this.name = name;}
            @Override
            public String asString() {return this.name;}
        }

        public Wall3Block(Settings settings, int value, String category,
                          Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            this.setDefaultState(this.getStateManager().getDefaultState().with(VARIANT, BlockVariant.GENERIC));
        }

        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(VARIANT);
        }

        // Triggered when a block is placed
        @Override
        public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
            super.onPlaced(world, pos, state, placer, itemStack);
            updateBlockAndNeighbors(world, pos);
        }

        // Triggered when a block is removed or replaced
        @Override
        public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
            super.onStateReplaced(state, world, pos, newState, moved);
            // Ensure we only update if the block is removed (not just replaced by an identical one)
            if (!state.isOf(newState.getBlock())) {updateBlockAndNeighbors(world, pos);}
        }

        // Handles updating this block and its vertical neighbors
        private void updateBlockAndNeighbors(World world, BlockPos pos) {
            updateVariant(world, pos); // Update this block
            updateVariant(world, pos.up()); // Update block above
            updateVariant(world, pos.down()); // Update block below
        }
        // Calculates and sets the variant of a block at the specified position
        private void updateVariant(World world, BlockPos pos) {
            BlockState state = world.getBlockState(pos);
            if (!state.isOf(this)) return; // Skip if the block is not of the same type
            boolean hasNeighborUp = world.getBlockState(pos.up()).isOf(this);
            boolean hasNeighborDown = world.getBlockState(pos.down()).isOf(this);
            BlockVariant newVariant;
            if (hasNeighborUp && hasNeighborDown) {
                newVariant = BlockVariant.MIDDLE;
            } else if (hasNeighborUp) {
                newVariant = BlockVariant.BASEBOARD;
            } else if (hasNeighborDown) {
                newVariant = BlockVariant.TOPBOARD;
            } else {
                newVariant = BlockVariant.GENERIC;
            }
            world.setBlockState(pos, state.with(VARIANT, newVariant), Block.NOTIFY_ALL);
        }
    }
    //decor blocks need to sit on a solid surface and do not inhibit movement
    public static class DecorBlock extends DormBlock {
        public DecorBlock(Settings settings, int value, String category,
                          Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!world.getBlockState(pos.down()).isSolidBlock(world, pos.down())) {
                // Drop the block as an item
                Block.dropStack(world, pos, new ItemStack(this));
                // Remove the block from the world
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        @Override
        public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
            world.scheduleBlockTick(pos, this, 20); // Repeat every 20 ticks (1 second in-game time)
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return VoxelShapes.empty();
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return true;
        }
    }
    //this is a special type of decor block that makes cat noises when interacted with
    //there will eventually be some kind of function to have these cat blocks repel creepers like normal cats
    public static class CatBlock extends DecorBlock {
        public CatBlock(Settings settings, int value, String category,
                          Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!world.getBlockState(pos.down()).isSolidBlock(world, pos.down())) {
                // Drop the block as an item
                Block.dropStack(world, pos, new ItemStack(this));
                // Remove the block from the world
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        @Override
        protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
                world.playSound(player, pos, SoundEvents.ENTITY_CAT_PURR, SoundCategory.BLOCKS, 1.2F, 1.0F);
                return ActionResult.SUCCESS;
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 8, 16);
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
    }
    //similar to the cat block, but it makes a "rodent" noise when interacted with (a bat noise)
    public static class RodentBlock extends DecorBlock {
        public RodentBlock(Settings settings, int value, String category,
                        Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!world.getBlockState(pos.down()).isSolidBlock(world, pos.down())) {
                // Drop the block as an item
                Block.dropStack(world, pos, new ItemStack(this));
                // Remove the block from the world
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        @Override
        protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
            world.playSound(player, pos, SoundEvents.ENTITY_BAT_AMBIENT, SoundCategory.BLOCKS, 0.5F, 1.0F);
            return ActionResult.SUCCESS;
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 8, 16);
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
    }
    //rugs, carpets, and mats all go here. Entities can walk over them, and you can put furniture on them.
    public static class FloorDecorBlock extends DormBlock {
        public FloorDecorBlock(Settings settings, int value, String category,
                               Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!world.getBlockState(pos.down()).isSolidBlock(world, pos.down())) {
                Block.dropStack(world, pos, new ItemStack(this));
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        @Override
        public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
            world.scheduleBlockTick(pos, this, 20); // Repeat every 20 ticks (1 second in-game time)
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return VoxelShapes.empty();
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 8, 16);
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return true;
        }
    }
    //wall decor needs a solid wall, similar to a painting. Has no collision.
    public static class WallDecorBlock extends DormBlock {
        public WallDecorBlock(Settings settings, int value, String category,
                              Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            // Check all horizontal directions
            boolean hasSolidBlockAdjacent =
                    world.getBlockState(pos.north()).isSolidBlock(world, pos.north()) ||
                            world.getBlockState(pos.south()).isSolidBlock(world, pos.south()) ||
                            world.getBlockState(pos.east()).isSolidBlock(world, pos.east()) ||
                            world.getBlockState(pos.west()).isSolidBlock(world, pos.west());

            // If no solid block is found, drop the item and replace with air
            if (!hasSolidBlockAdjacent) {
                Block.dropStack(world, pos, new ItemStack(this));
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        @Override
        public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
            world.scheduleBlockTick(pos, this, 20); // Repeat every 20 ticks (1 second in-game time)
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return VoxelShapes.empty();
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return true;
        }
    }
    //prop blocks inhibit movement and don't need a solid surface
    public static class PropBlock extends DormBlock {
        public PropBlock(Settings settings, int value, String category,
                          Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return false;
        }
    }
    public static class ScreenBlock extends PropBlock{
        public ScreenBlock(Settings settings, int value, String category,
                         Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            Direction facing = state.get(Properties.HORIZONTAL_FACING);
            return switch (facing) {
                case NORTH -> Block.createCuboidShape(-16, 0, 4, 16, 24, 12);
                case SOUTH -> Block.createCuboidShape(0, 0, 4, 32, 24, 12);
                case EAST -> Block.createCuboidShape(4, 0, -16, 12, 24, 16);
                case WEST -> Block.createCuboidShape(4, 0, 0, 12, 24, 32);
                default ->
                    // Fallback shape
                        Block.createCuboidShape(0, 0, 0, 16, 24, 16);
            };
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            Direction facing = state.get(Properties.HORIZONTAL_FACING);
            return switch (facing) {
                case NORTH -> Block.createCuboidShape(-16, 0, 4, 16, 24, 12);
                case SOUTH -> Block.createCuboidShape(0, 0, 4, 32, 24, 12);
                case EAST -> Block.createCuboidShape(4, 0, -16, 12, 24, 16);
                case WEST -> Block.createCuboidShape(4, 0, 0, 12, 24, 32);
                default ->
                    // Fallback shape
                        Block.createCuboidShape(0, 0, 0, 16, 24, 16);
            };
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
    }
    //decor-type lighting in 5, 10, and 15 lighting values
    public static class DimLampBlock extends DormBlock {
        public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");
        public DimLampBlock(Settings settings, int value, String category,
                            Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(ACTIVATED, false));
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(ACTIVATED);
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
            if (!player.getAbilities().allowModifyWorld) {
                // Skip if the player isn't allowed to modify the world.
                return ActionResult.PASS;
            } else {
                // Get the current value of the "activated" property
                boolean activated = state.get(ACTIVATED);
                // Flip the value of activated and save the new blockstate.
                world.setBlockState(pos, state.with(ACTIVATED, !activated));
                // Play a click sound to emphasise the interaction.
                world.playSound(player, pos, SoundEvents.BLOCK_COMPARATOR_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.SUCCESS;
            }
        }
        public static int getLuminance(BlockState currentBlockState) {
            boolean activated = currentBlockState.get(DimLampBlock.ACTIVATED);
            return activated ? 5 : 0;
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!world.getBlockState(pos.down()).isSolidBlock(world, pos.down())) {
                Block.dropStack(world, pos, new ItemStack(this));
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        @Override
        public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
            world.scheduleBlockTick(pos, this, 20); // Repeat every 20 ticks (1 second in-game time)
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return VoxelShapes.empty();
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return false;
        }
    }
    public static class MidLampBlock extends DormBlock {
        public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");
        public MidLampBlock(Settings settings, int value, String category,
                            Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(ACTIVATED, false));
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(ACTIVATED);
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
            if (!player.getAbilities().allowModifyWorld) {
                // Skip if the player isn't allowed to modify the world.
                return ActionResult.PASS;
            } else {
                // Get the current value of the "activated" property
                boolean activated = state.get(ACTIVATED);
                // Flip the value of activated and save the new blockstate.
                world.setBlockState(pos, state.with(ACTIVATED, !activated));
                // Play a click sound to emphasise the interaction.
                world.playSound(player, pos, SoundEvents.BLOCK_COMPARATOR_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.SUCCESS;
            }
        }
        public static int getLuminance(BlockState currentBlockState) {
            // Get the value of the "activated" property.
            boolean activated = currentBlockState.get(MidLampBlock.ACTIVATED);
            // Return a light level if activated = true
            return activated ? 10 : 0;
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!world.getBlockState(pos.down()).isSolidBlock(world, pos.down())) {
                // Drop the block as an item
                Block.dropStack(world, pos, new ItemStack(this));
                // Remove the block from the world
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        @Override
        public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
            world.scheduleBlockTick(pos, this, 20); // Repeat every 20 ticks (1 second in-game time)
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return VoxelShapes.empty();
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return false;
        }
    }
    public static class BrightLampBlock extends DormBlock {
        public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");
        public BrightLampBlock(Settings settings, int value, String category,
                               Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(ACTIVATED, false));
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(ACTIVATED);
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
            if (!player.getAbilities().allowModifyWorld) {
                // Skip if the player isn't allowed to modify the world.
                return ActionResult.PASS;
            } else {
                // Get the current value of the "activated" property
                boolean activated = state.get(ACTIVATED);
                // Flip the value of activated and save the new blockstate.
                world.setBlockState(pos, state.with(ACTIVATED, !activated));
                // Play a click sound to emphasise the interaction.
                world.playSound(player, pos, SoundEvents.BLOCK_COMPARATOR_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.SUCCESS;
            }
        }
        public static int getLuminance(BlockState currentBlockState) {
            // Get the value of the "activated" property.
            boolean activated = currentBlockState.get(BrightLampBlock.ACTIVATED);
            // Return a light level if activated = true
            return activated ? 15 : 0;
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!world.getBlockState(pos.down()).isSolidBlock(world, pos.down())) {
                // Drop the block as an item
                Block.dropStack(world, pos, new ItemStack(this));
                // Remove the block from the world
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        @Override
        public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
            world.scheduleBlockTick(pos, this, 20); // Repeat every 20 ticks (1 second in-game time)
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return VoxelShapes.empty();
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return false;
        }
    }
    //doors in this mod are only activatable by kansen and players
    //1x2x1 sliding door block with no adjacency features
    public static class SlidingDoorBlock extends DormBlock {
        public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");
        public SlidingDoorBlock(Settings settings, int value, String category,
                                Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(ACTIVATED, false));
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(ACTIVATED);
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
            if (!player.getAbilities().allowModifyWorld) {
                // Skip if the player isn't allowed to modify the world.
                return ActionResult.PASS;
            } else {
                // Get the current value of the "activated" property
                boolean activated = state.get(ACTIVATED);
                // Flip the value of activated and save the new blockstate.
                world.setBlockState(pos, state.with(ACTIVATED, !activated));

                // Play different sounds based on the activation state
                if (activated) {
                    // If deactivating, play a "deactivation" sound
                    world.playSound(player, pos, SoundEvents.BLOCK_SHULKER_BOX_CLOSE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                } else {
                    // If activating, play an "activation" sound
                    world.playSound(player, pos, SoundEvents.BLOCK_SHULKER_BOX_OPEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                return ActionResult.SUCCESS;
            }
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!world.getBlockState(pos.down()).isSolidBlock(world, pos.down())) {
                // Drop the block as an item
                Block.dropStack(world, pos, new ItemStack(this));
                // Remove the block from the world
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }
        @Override
        public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
            world.scheduleBlockTick(pos, this, 20); // Repeat every 20 ticks (1 second in-game time)
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 32, 16);
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            VoxelShape unactivatedShape = Block.createCuboidShape(0, 0, 6, 16, 32, 10);
            VoxelShape activatedShape = VoxelShapes.empty();
            return state.get(ACTIVATED) ? activatedShape : unactivatedShape;
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            // Allow pathfinding through the block only when it is activated
            return state.get(ACTIVATED);
        }
    }
    //1x2x1 window block with no opening features
    public static class TallWindowBlock extends DormBlock {
        public TallWindowBlock(Settings settings, int value, String category,
                                Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            Direction facing = state.get(Properties.HORIZONTAL_FACING);
            return switch (facing) {
                case NORTH -> Block.createCuboidShape(0, 0, 0, 16, 32, 16);
                case SOUTH -> Block.createCuboidShape(0, 0, 0, 16, 32, 16);
                case EAST -> Block.createCuboidShape(0, 0, 0, 16, 32, 16);
                case WEST -> Block.createCuboidShape(0, 0, 0, 16, 32, 16);
                default ->
                    // Fallback shape
                        Block.createCuboidShape(0, 0, 0, 16, 32, 16);
            };
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            Direction facing = state.get(Properties.HORIZONTAL_FACING);
            return switch (facing) {
                case NORTH -> Block.createCuboidShape(0, 0, 0, 16, 32, 16);
                case SOUTH -> Block.createCuboidShape(0, 0, 0, 16, 32, 16);
                case EAST -> Block.createCuboidShape(0, 0, 0, 16, 32, 16);
                case WEST -> Block.createCuboidShape(0, 0, 0, 16, 32, 16);
                default ->
                    // Fallback shape
                        Block.createCuboidShape(0, 0, 0, 16, 32, 16);
            };
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            // Allow pathfinding through the block only when it is activated
            return false;
        }
    }
    //1x2x1 storage block with 9 spaces. Kansen will interact with this and store/retrieve items.
    public static class TallStorageBlock extends DormStorageBlock {
        protected TallStorageBlock(Settings settings, int value, String category,
                         Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        public static final MapCodec<TallStorageBlock> MAP_CODEC = RecordCodecBuilder.mapCodec(instance ->
                instance.group(
                        Block.Settings.CODEC.fieldOf("settings").forGetter(TallStorageBlock::getSettings),
                        Codec.INT.fieldOf("value").forGetter(TallStorageBlock::getValue),
                        Codec.STRING.fieldOf("category").forGetter(TallStorageBlock::getCategory),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("material").forGetter(block -> (HashSet<String>) block.getMaterial()),
                        Codec.STRING.fieldOf("faction").forGetter(TallStorageBlock::getFaction),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("aesthetic").forGetter(block -> (HashSet<String>) block.getAesthetic())
                ).apply(instance, TallStorageBlock::new)
        );
        @Override public MapCodec<? extends TallStorageBlock> getCodec(){return MAP_CODEC;}
        @Override
        public BlockEntity createBlockEntity(BlockPos pos, BlockState state){
            return new TallStorageEntity(pos,state);
        }
        @Override public BlockRenderType getRenderType(BlockState state) {return BlockRenderType.MODEL;}
        @Override
        public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit){
            if (!world.isClient){
                NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);
                if (screenHandlerFactory != null) {
                    player.openHandledScreen(screenHandlerFactory);
                }
            }
            return ActionResult.SUCCESS;
        }
        @Override
        public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved){
            if (state.getBlock() != newState.getBlock()){
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity instanceof TallStorageEntity tallStorageEntity){
                    ItemScatterer.spawn(world, pos, tallStorageEntity);
                    world.updateComparators(pos,this);
                }
                super.onStateReplaced(state,world,pos,newState,moved);
            }
        }
        @Override
        public boolean hasComparatorOutput(BlockState state){return true;}
        @Override
        public int getComparatorOutput(BlockState state, World world, BlockPos pos){
            return ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 24, 16);
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 24, 16);
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return false;
        }
    }
    public static class TallStorageEntity extends BlockEntity implements NamedScreenHandlerFactory, Inventory{
        private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(9, ItemStack.EMPTY);
        public TallStorageEntity(BlockPos pos, BlockState state){super(TALL_STORAGE_ENTITY, pos, state);}

        @Override public int size() {return inventory.size();}
        @Override public boolean isEmpty() {for (ItemStack stack :inventory){
            if(!stack.isEmpty()){return false;}}return true;}
        @Override public ItemStack getStack(int slot) {return inventory.get(slot);}
        @Override public ItemStack removeStack(int slot) {markDirty();return inventory.set(slot, ItemStack.EMPTY);}
        @Override public ItemStack removeStack(int slot, int amount) {ItemStack stack = inventory.get(slot);
            if (!stack.isEmpty()) {markDirty();return stack.split(amount);}return ItemStack.EMPTY;}
        @Override public void setStack(int slot, ItemStack stack){inventory.set(slot, stack);markDirty();}
        @Override public void markDirty(){if (world != null){world.markDirty(pos);}}
        @Override public boolean canPlayerUse(PlayerEntity player) {return true;}
        @Override public void clear() {inventory.clear();markDirty();}

        @Override
        public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory,PlayerEntity player){
            return new FurnitureStorageScreen.StorageScreenHandler(syncId, playerInventory,this);
        }

        @Override
        public Text getDisplayName(){
            return Text.translatable(getCachedState().getBlock().getTranslationKey());
        }
        @Override
        public void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup){
            super.writeNbt(nbt, registryLookup);
            Inventories.writeNbt(nbt, this.inventory, registryLookup);
        }
        @Override
        public void readNbt (NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup){
            super.readNbt(nbt, registryLookup);
            Inventories.readNbt(nbt, this.inventory, registryLookup);
        }
    }
    //this class is used by the radish seedling planter to grow beets (but will eventually grow daikon instead)
    public static class PlanterBlock extends DormBlock{
        public static final EnumProperty<PlanterState> PLANTER_STATE = EnumProperty.of("planter_state", PlanterState.class);
        public enum PlanterState implements StringIdentifiable {
            EMPTY("empty"),
            PLANTED("planted"),
            SPROUTED("sprouted"),
            GROWING("growing"),
            MATURE("mature");
            private final String name;
            PlanterState(String name) {this.name = name;}
            @Override
            public String asString() {return this.name;}
        }
        public PlanterBlock(Settings settings, int value, String category,
                            Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
            this.setDefaultState(this.stateManager.getDefaultState().with(PLANTER_STATE, PlanterState.EMPTY));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(Properties.HORIZONTAL_FACING);
            builder.add(PLANTER_STATE);
        }
        @Override
        protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
            PlanterState currentState = state.get(PLANTER_STATE);
            if (!player.getAbilities().allowModifyWorld && !world.isClient) {
                // Skip if the player isn't allowed to modify the world.
                return ActionResult.PASS;
            } else {
                world.playSound(player, pos, SoundEvents.BLOCK_ROOTED_DIRT_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                switch(currentState){
                    case EMPTY -> {
                        boolean hasSeeds = false;
                        for (int i = 0; i < player.getInventory().size(); i++) {
                            ItemStack stack = player.getInventory().getStack(i);
                            if (stack.getItem() == Items.BEETROOT_SEEDS && stack.getCount()>=2){
                                hasSeeds = true; stack.decrement(2); break;}}
                        if (hasSeeds){world.setBlockState(pos, state.with(PLANTER_STATE,PlanterState.PLANTED));
                            world.scheduleBlockTick(pos, this, 6000);}
                        else {
                            if (player instanceof ServerPlayerEntity serverPlayer){
                                serverPlayer.sendMessage(Text.literal("This planter needs two beetroot seeds!"), false);
                            }
                        }
                    }
                    case PLANTED -> {
                        player.giveOrDropStack(new ItemStack(Items.BEETROOT_SEEDS,2));
                        world.setBlockState(pos,state.with(PLANTER_STATE, PlanterState.EMPTY));
                    }
                    case SPROUTED, GROWING -> {
                        player.giveOrDropStack(new ItemStack(Items.BEETROOT_SEEDS,1));
                        world.setBlockState(pos,state.with(PLANTER_STATE, PlanterState.EMPTY));
                    }
                    case MATURE -> {
                        player.giveOrDropStack(new ItemStack(Items.BEETROOT_SEEDS,2));
                        player.giveOrDropStack(new ItemStack(Items.BEETROOT,2));
                        world.setBlockState(pos,state.with(PLANTER_STATE, PlanterState.EMPTY));
                    }
                }
                return ActionResult.SUCCESS;
            }
        }
        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            PlanterState currentState = state.get(PLANTER_STATE);
            int offset = random.nextInt(12001) - 6000;
            if (currentState == PlanterState.PLANTED) {
                world.scheduleBlockTick(pos, this, 24000+offset);
                world.setBlockState(pos, state.with(PLANTER_STATE, PlanterState.SPROUTED));
            } else if (currentState == PlanterState.SPROUTED) {
                world.scheduleBlockTick(pos, this, 24000+offset);
                world.setBlockState(pos, state.with(PLANTER_STATE, PlanterState.GROWING));
            } else if (currentState == PlanterState.GROWING) {
                world.scheduleBlockTick(pos, this, 24000+offset);
                world.setBlockState(pos, state.with(PLANTER_STATE, PlanterState.MATURE));
            }
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            Direction facing = state.get(Properties.HORIZONTAL_FACING);
            return switch (facing) {
                case NORTH -> Block.createCuboidShape(-16, 0, 0, 16, 10, 16);
                case SOUTH -> Block.createCuboidShape(0, 0, 0, 32, 10, 16);
                case EAST -> Block.createCuboidShape(0, 0, -16, 16, 10, 16);
                case WEST -> Block.createCuboidShape(0, 0, 0, 16, 10, 32);
                default ->
                    // Fallback shape
                        Block.createCuboidShape(0, 0, 0, 16, 10, 16);
            };
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            Direction facing = state.get(Properties.HORIZONTAL_FACING);
            return switch (facing) {
                case NORTH -> Block.createCuboidShape(-16, 0, 0, 16, 10, 16);
                case SOUTH -> Block.createCuboidShape(0, 0, 0, 32, 10, 16);
                case EAST -> Block.createCuboidShape(0, 0, -16, 16, 10, 16);
                case WEST -> Block.createCuboidShape(0, 0, 0, 16, 10, 32);
                default ->
                    // Fallback shape
                        Block.createCuboidShape(0, 0, 0, 16, 10, 16);
            };
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return false;
        }
    }
    //chalkboard and similar furniture drawing blocks with supported UI
    public static class ChalkboardBlock extends DormDrawingBlock{
        protected ChalkboardBlock(Settings settings, int value, String category,
                                   Set<String> material, String faction, Set<String> aesthetic) {
            super(settings, value, category, material, faction, aesthetic);
            setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        }
        public static final MapCodec<ChalkboardBlock> MAP_CODEC = RecordCodecBuilder.mapCodec(instance ->
                instance.group(
                        Block.Settings.CODEC.fieldOf("settings").forGetter(ChalkboardBlock::getSettings),
                        Codec.INT.fieldOf("value").forGetter(ChalkboardBlock::getValue),
                        Codec.STRING.fieldOf("category").forGetter(ChalkboardBlock::getCategory),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("material").forGetter(block -> (HashSet<String>) block.getMaterial()),
                        Codec.STRING.fieldOf("faction").forGetter(ChalkboardBlock::getFaction),
                        Codec.STRING.listOf().xmap(HashSet::new, ArrayList::new).fieldOf("aesthetic").forGetter(block -> (HashSet<String>) block.getAesthetic())
                ).apply(instance, ChalkboardBlock::new)
        );
        @Override public MapCodec<? extends ChalkboardBlock> getCodec(){return MAP_CODEC;}
        @Override
        public BlockEntity createBlockEntity(BlockPos pos, BlockState state){
            return new ChalkboardEntity(pos, state);
        }
        @Override public BlockRenderType getRenderType(BlockState state) {return BlockRenderType.MODEL;}
        @Override
        public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit){
            if (!world.isClient){
                NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);
                if (screenHandlerFactory != null) {
                    player.openHandledScreen(screenHandlerFactory);
                }
            }
            return ActionResult.SUCCESS;
        }
        @Override
        public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved){
            if (state.getBlock() != newState.getBlock()){
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity instanceof ChalkboardEntity chalkboardEntity){
                    ItemScatterer.spawn(world, pos, chalkboardEntity);
                    world.updateComparators(pos,this);
                }
                super.onStateReplaced(state,world,pos,newState,moved);
            }
        }
        @Override
        public boolean hasComparatorOutput(BlockState state){return true;}
        @Override
        public int getComparatorOutput(BlockState state, World world, BlockPos pos){
            return ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos));
        }
        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(Properties.HORIZONTAL_FACING);
        }
        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return VoxelShapes.empty();
        }
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
        }
        @Override
        public BlockState getPlacementState(ItemPlacementContext ctx) {
            return Objects.requireNonNull(super.getPlacementState(ctx)).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        @Override
        protected boolean canPathfindThrough(BlockState state, NavigationType type) {
            return true;
        }
    }
    public static class ChalkboardEntity extends BlockEntity implements NamedScreenHandlerFactory, Inventory{
        private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(9, ItemStack.EMPTY);
        public ChalkboardEntity(BlockPos pos, BlockState state){super(CHALKBOARD_ENTITY, pos, state);}

        @Override public int size() {return inventory.size();}
        @Override public boolean isEmpty() {for (ItemStack stack :inventory){
            if(!stack.isEmpty()){return false;}}return true;}
        @Override public ItemStack getStack(int slot) {return inventory.get(slot);}
        @Override public ItemStack removeStack(int slot) {markDirty();return inventory.set(slot, ItemStack.EMPTY);}
        @Override public ItemStack removeStack(int slot, int amount) {ItemStack stack = inventory.get(slot);
            if (!stack.isEmpty()) {markDirty();return stack.split(amount);}return ItemStack.EMPTY;}
        @Override public void setStack(int slot, ItemStack stack){inventory.set(slot, stack);markDirty();}
        @Override public void markDirty(){if (world != null){world.markDirty(pos);}}
        @Override public boolean canPlayerUse(PlayerEntity player) {return true;}
        @Override public void clear() {inventory.clear();markDirty();}
        @Override
        public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory,PlayerEntity player){
            return new FurnitureChalkboardScreen.ChalkboardScreenHandler(syncId, playerInventory,this);}
        @Override
        public Text getDisplayName(){return Text.translatable(getCachedState().getBlock().getTranslationKey());}

        private final int[][] pixelData = new int[32][24];
        private static final int[] COLOR_PALETTE = {
                0x99FFFFFF, //white
                0x00000000 //none
        };

        @Override public void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup){
            super.writeNbt(nbt, registryLookup); Inventories.writeNbt(nbt, this.inventory, registryLookup);
            nbt.putIntArray("PixelData", flattenPixelArray());
        }
        @Override
        public void readNbt (NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup){
            super.readNbt(nbt, registryLookup); Inventories.readNbt(nbt, this.inventory, registryLookup);
            int[] flattened = nbt.getIntArray("PixelData"); unflattenPixelArray(flattened);}
        private int[] flattenPixelArray(){
            int [] flattened = new int [16 * 16]; for (int x = 0; x < 32; x++) {
                System.arraycopy(pixelData[x], 0, flattened, x * 24, 24);} return flattened;}
        private void unflattenPixelArray(int[] flattened) {
            for (int x = 0; x < 32; x++) {
                System.arraycopy(flattened, x * 24, pixelData[x], 0, 24);}}
        public void clearPixels() {
            for (int x = 0; x < 32; x++) {for (int y = 0; y < 24; y++) {pixelData[x][y] = 0;}} markDirty();}
    }
}