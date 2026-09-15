package dev.huskuraft.effortless.vanilla.core;

import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

import dev.huskuraft.effortless.api.core.BlockEntity;
import dev.huskuraft.effortless.api.core.BlockPosition;
import dev.huskuraft.effortless.api.core.BlockState;
import dev.huskuraft.effortless.api.core.DimensionType;
import dev.huskuraft.effortless.api.core.FluidState;
import dev.huskuraft.effortless.api.core.Player;
import dev.huskuraft.effortless.api.core.ResourceKey;
import dev.huskuraft.effortless.api.core.World;
import dev.huskuraft.effortless.api.core.WorldBorder;
import dev.huskuraft.effortless.api.math.Vector3d;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public record MinecraftWorld(Level refs) implements World {

    public static World ofNullable(Level refs) {
        if (refs == null) return null;
        return new MinecraftWorld(refs);
    }

    @Override
    public Player getPlayer(UUID uuid) {
        return MinecraftPlayer.ofNullable(refs.getPlayerByUUID(uuid));
    }

    @Override
    public BlockState getBlockState(BlockPosition blockPosition) {
        return MinecraftBlockState.ofNullable(refs.getBlockState(MinecraftConvertor.toPlatformBlockPosition(blockPosition)));
    }

    @Override
    public FluidState getFluidState(BlockPosition blockPosition) {
        return MinecraftFluidState.ofNullable(refs.getFluidState(MinecraftConvertor.toPlatformBlockPosition(blockPosition)));
    }

    @Override
    public BlockEntity getBlockEntity(BlockPosition blockPosition) {
        return MinecraftBlockEntity.ofNullable(refs.getBlockEntity(MinecraftConvertor.toPlatformBlockPosition(blockPosition)));
    }

    @Override
    public boolean setBlock(BlockPosition blockPosition, BlockState blockState, int flags, int recursionLeft) {
        return refs.setBlock(MinecraftConvertor.toPlatformBlockPosition(blockPosition), blockState.reference(), flags, recursionLeft);
    }

    @Override
    public boolean isClient() {
        return refs.isClientSide();
    }

    @Override
    public ResourceKey<World> getDimensionId() {
        return new MinecraftResourceKey<>(refs.dimension());
    }

    @Override
    public DimensionType getDimensionType() {
        return new MinecraftDimensionType(refs.dimensionType());
    }

    @Override
    public WorldBorder getWorldBorder() {
        return new MinecraftWorldBorder(refs.getWorldBorder());
    }

    @Override
    public boolean removeBlock(BlockPosition blockPosition, boolean moving) {
        return refs.removeBlock(MinecraftConvertor.toPlatformBlockPosition(blockPosition), moving);
    }

    @Override
    public void gatherItemDrops(Collection<BlockPosition> blockPositions, Vector3d destination) {
        if (refs.isClientSide() || blockPositions.isEmpty()) {
            return;
        }

        var minX = Double.POSITIVE_INFINITY;
        var minY = Double.POSITIVE_INFINITY;
        var minZ = Double.POSITIVE_INFINITY;
        var maxX = Double.NEGATIVE_INFINITY;
        var maxY = Double.NEGATIVE_INFINITY;
        var maxZ = Double.NEGATIVE_INFINITY;
        for (var blockPosition : blockPositions) {
            minX = Math.min(minX, blockPosition.x());
            minY = Math.min(minY, blockPosition.y());
            minZ = Math.min(minZ, blockPosition.z());
            maxX = Math.max(maxX, blockPosition.x());
            maxY = Math.max(maxY, blockPosition.y());
            maxZ = Math.max(maxZ, blockPosition.z());
        }

        var positions = blockPositions.stream().map(MinecraftConvertor::toPlatformBlockPosition).collect(Collectors.toSet());
        var searchBox = new AABB(minX, minY, minZ, maxX + 1, maxY + 1, maxZ + 1).inflate(1.0);
        for (var itemEntity : refs.getEntitiesOfClass(ItemEntity.class, searchBox)) {
            if (!positions.contains(itemEntity.blockPosition())) {
                continue;
            }
            itemEntity.setPos(destination.x(), destination.y(), destination.z());
            itemEntity.setDeltaMovement(Vec3.ZERO);
        }
    }
}
