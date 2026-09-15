package dev.huskuraft.effortless.building.config;

import dev.huskuraft.effortless.api.math.Range1i;

public record BuilderConfig(
        int reservedToolDurability,
        boolean passiveMode,
        boolean gatherDrops,
        boolean preferToolInHand
) {

    public static final Range1i RESERVED_TOOL_DURABILITY_RANGE = new Range1i(0, 32);

    public static BuilderConfig DEFAULT = new BuilderConfig(
            1,
            Boolean.FALSE,
            Boolean.TRUE,
            Boolean.TRUE
    );

    public BuilderConfig withReservedToolDurability(int reservedToolDurability) {
        return new BuilderConfig(reservedToolDurability, passiveMode, gatherDrops, preferToolInHand);
    }

    public BuilderConfig withPassiveMode(boolean passiveMode) {
        return new BuilderConfig(reservedToolDurability, passiveMode, gatherDrops, preferToolInHand);
    }

    public BuilderConfig withGatherDrops(boolean gatherDrops) {
        return new BuilderConfig(reservedToolDurability, passiveMode, gatherDrops, preferToolInHand);
    }

    public BuilderConfig withPreferToolInHand(boolean preferToolInHand) {
        return new BuilderConfig(reservedToolDurability, passiveMode, gatherDrops, preferToolInHand);
    }


}
