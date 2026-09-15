# Fork Notice

## Project identity

Effortless Structure: Survival Edition is an unofficial modified fork of
Effortless Structure. It is maintained by GarfieldZero and is not affiliated
with or endorsed by the upstream author.

The fork keeps the upstream `effortless` mod ID for compatibility with existing
code, configuration, and world data. As a result, it must not be installed
alongside an upstream build that uses the same mod ID.

## Upstream source

- Project: Effortless Structure
- Source: https://github.com/huskuraft/effortless
- Base revision: `c9ec60f1` (`v3.4.0`)
- Upstream license: GNU Lesser General Public License v3.0

## Fork source

- Source: https://github.com/GarfieldZero/effortless
- Issues: https://github.com/GarfieldZero/effortless/issues
- Fork version: `3.4.0-survival.1`
- Initial modification date: 2026-09-15

## Main modifications

- Apply normal tool durability and food exhaustion when blocks are broken.
- Keep proper-tool checks enabled by default.
- Add a configurable reserved tool durability threshold.
- Add an option to prefer the selected hotbar tool.
- Add configurable gathering of drops at the nearest broken block.
- Add a configurable key binding that temporarily disables building while held.
- Adjust survival defaults and builder settings.

This list is a summary. The exact changes are recorded by the source history and
the differences from the upstream revision.

## License and source availability

This fork is distributed under GNU LGPL v3.0. The original `LICENSE` and
copyright notices are retained. Corresponding source code is available from the
fork repository and from the exact source revision used for each released
binary.

If a binary release is published separately from the repository, that release
must include or link to the corresponding source code and preserve this notice
and the upstream license.
