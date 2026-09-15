![Logo](assets/logo.png)

# Effortless Structure: Survival Edition

> **Unofficial fork notice**
>
> This is an unofficial, survival-focused fork of Effortless Structure. It is
> not affiliated with or endorsed by the upstream author. This fork keeps the
> upstream `effortless` mod ID for compatibility with existing code and
> configuration, so do not install it alongside the upstream mod.

<div style="text-align: center">
    <a href="https://github.com/huskuraft/effortless">Upstream</a>
    <span> | </span>
    <a href="https://github.com/GarfieldZero/effortless">Fork Source</a>
    <span> | </span>
    <a href="https://github.com/GarfieldZero/effortless/releases">Fork Releases</a>
    <span> | </span>
    <a href="https://github.com/GarfieldZero/effortless/issues">Fork Issues</a>
</div>

## Downloads

Builds for Minecraft 1.20.1 are available from
[this fork's GitHub Releases](https://github.com/GarfieldZero/effortless/releases).
This fork is not published through the upstream Modrinth or CurseForge pages.

## Fork Status

- Upstream project: `huskuraft/effortless`
- Upstream base: `v3.4.0` (`c9ec60f1`)
- Fork version: `3.4.0-survival.1`
- Verified targets: Minecraft 1.20.1 with Fabric and Forge
- License: GNU LGPL v3.0

## Survival Edition Changes

- Breaking or replacing blocks uses normal tool durability and applies vanilla
  block-breaking hunger exhaustion.
- **Use Proper Tools** defaults to enabled. A correct tool is required, and a
  tool with an insufficient tier cannot break a harder block.
- **Reserved Tool Durability** defaults to `1`, preventing automatic tool use
  when only the reserved durability remains.
- **Prefer Tool in Hand** defaults to enabled. The selected hotbar tool is used
  first when it is valid, with inventory fallback.
- **Gather Drops at Nearest Broken Block** defaults to enabled. It can be
  disabled in the builder settings.
- A configurable key binding, **Temporarily Disable Building (Hold)**, defaults
  to Left Ctrl. Hold it to suspend building and block interaction, then release
  it to resume.

See [FORK_NOTICE.md](FORK_NOTICE.md) for attribution and modification details.

## Features

- Pure Vanilla Compatibility: This mod is designed to be fully compatible with a pure vanilla game without adding new
  items or making incompatible modifications.
- Item Randomizer: This mod includes an item randomizer that lets players place blocks and entities randomly from a
  pre-defined list.
- Clipboard: This mod includes a clipboard that lets players copy and paste blocks and entities between worlds.

## How to Use

- Hold **LEFT_ALT/LEFT_OPTION** key to open **Build Mode Radial**. You can switch build modes to create different
  structures. There are buttons for **Undo/Redo**, **Replace**, **Settings**, **Pattern** and **Clipboard** on the
  left side.

- Click **ATTACK/DESTROY** key to start destroying blocks.
- Click **USE_ITEM/PLACE_BLOCK** key to start placing/interacting blocks.

- Click **LEFT_BRACKET** key to perform **Undo**. You can undo your last build operation.
- Click **RIGHT_BRACKET** key to perform **Redo**. You can redo your last build operation.

### Build Modes

- Build modes are the basic shapes you need to choose when creating a structure. There are currently 13 different types
  of shapes. Each one has unique features like hollow or filled.

- **Disable**: Place in the vanilla way.
- **Single**: Place with increased reach distance.
- **Line**: Place a line in any of the three axes.
- **Wall**: Place a wall in X or Z axis.
- **Floor**: Place a floor in Y axis.
- **Diagonal Line**: Place a line at any angle.
- **Diagonal Wall**: Place a wall at any angle.
- **Slope Floor**: Place a sloped floor at any angle.
- **Cube**: Place a cube.
- **Circle**: Place a circle shape in any of the three axes.
- **Cylinder**: Place a cylindrical shape in any of the three axes.
- **Sphere**: Place a sphere made of blocks.
- **Pyramid**: Place a pyramid made of blocks.
- **Cone**: Place a cone made of blocks.

### Replace

- You can choose how to replace blocks when placing new blocks.

- **Disable**: Replace air and replaceable blocks like grass only when placing new blocks.
- **Blocks and Air**: Replace air and blocks that can be destroyed by tools when placing new blocks.
- **Blocks Only**: Replace blocks that can be destroyed by tools only when placing new blocks.
- **Offhand Only**: Replace blocks that holding in your offhand only when placing new blocks.

### Pattern

- You can create complex shapes by combining different transformers. You can use a mirror to create a mirrored copy of a
  wall shape, or use an item randomizer to create a wall of random blocks. There are currently 4 types of transformers.

- **Mirror**: Mirrors blocks and entities for even and uneven builds.
- **Array**: Copies blocks and entities in a specific direction for a specified number of times.
- **Radial**: Places blocks and entities in a circular pattern around a central point. The circle can be divided
  into sections, and each section will contain a copy of the block placements.
- **Item Randomizer**: Randomizes the placement of blocks.

### Clipboard

- You can use clipboard to transfer structures between worlds by copying and pasting blocks.

### Transformers

## Platforms

- You need to install this mod on both the client side and server side.
- You can use this mod on servers with different platforms from your client.
- You can use the same mod jar file on multiple targets.

| Filename                                  | Targets  | Fabric  | Forge   |
|-------------------------------------------|----------|:-------:|:-------:|
| `effortless-1.20.1-3.4.0-survival.1.jar`  | `1.20.1` | &check; | &check; |

Quilt and NeoForge are not part of the verified target set for this fork.

## Dependencies

## Fabric

| Dependency    | Download                                                      |
|---------------|---------------------------------------------------------------|
| Fabric Loader | https://fabricmc.net/use/installer/                           |
| Fabric API    | https://www.curseforge.com/minecraft/mc-mods/fabric-api/files |

## Forge

| Dependency   | Download                                                   |
|--------------|------------------------------------------------------------|
| Forge Loader | https://files.minecraftforge.net/net/minecraftforge/forge/ |

## Credits

* **[Huskcasaca](https://github.com/huskcasaca)** and the Effortless Structure
  contributors, for the upstream project
* **[Requioss](https://www.curseforge.com/members/requioss)**, the author
  of [Effortless Building](https://www.curseforge.com/minecraft/mc-mods/effortless-building)
* **[loehnertj](https://github.com/loehnertj)**, for porting to 1.20.2
* **[GarfieldZero](https://github.com/GarfieldZero)**, for the Survival Edition
  fork changes

## License and Attribution

This fork is distributed under GNU LGPL v3.0, the same license as the upstream
project. The original `LICENSE` and copyright notices are retained. See
[FORK_NOTICE.md](FORK_NOTICE.md) for the upstream source, base revision, and a
summary of modifications.
