# OpAnchor - Fabric EditioN

A lightweight Fabric mod for Minecraft 1.21.11 that automates anchor clicking sequences. Perfect for singleplayer anchor challenges and building.

## Features

- **Quick Anchor Macro**: Press **Z** to execute a fast anchor clicking sequence
- **Optimized Timing**: 0 tick delay with maximum 1ms delay between actions
- **Fabric Based**: Lightweight and efficient using Fabric API
- **Launcher Compatible**: Works with Modrinth Launcher, Prism Launcher, and other launchers
- **Singleplayer Optimized**: Designed for single-player gameplay

## How It Works

When you press the **Z** key in-game:

1. Switches to hotbar slot 9 and right-clicks
2. Switches to hotbar slot 8 and right-clicks  
3. Switches back to hotbar slot 9 and right-clicks

Perfect for anchor challenges, building sequences, or any use case requiring quick multi-slot item usage.

## Installation

### Via Modrinth Launcher
1. Open Modrinth Launcher
2. Click "Create Instance"
3. Select Minecraft 1.21.11 with Fabric loader
4. Go to "Add Content"
5. Search for "OpAnchor"
6. Install and play!

### Via Prism Launcher
1. Create new instance with Fabric 1.21.11
2. Open the folder icon → mods
3. Download the OpAnchor JAR and place in mods folder
4. Launch and play!

### Manual Installation
1. Install Fabric Loader for Minecraft 1.21.11
   - Go to https://fabricmc.net/use/
   - Download and run the installer
2. Download OpAnchor JAR from Modrinth or GitHub
3. Place the JAR in your `mods` folder
4. Launch Minecraft with Fabric profile
5. Press **Z** in-game to use!

## Requirements

- **Minecraft Version**: 1.21.11
- **Fabric Loader**: 0.19.3 or later
- **Fabric API**: 0.104.0+1.21.11 or later
- **Java**: 21 or later

## Usage

Simply press **Z** while in-game (singleplayer or multiplayer) to execute the anchor sequence.

The key binding can be customized in Minecraft's Controls settings under "OpAnchor" category.

## Building from Source

### Prerequisites
- Java 21 or later
- Gradle

### Build Steps
```bash
git clone <repo-url>
cd OpAnchorFabric
./gradlew build
```

The compiled JAR will be located in `build/libs/opanchor-1.0.0.jar`

## Configuration

No configuration needed! The mod works out of the box.

If you want to customize the key binding:
1. Launch Minecraft
2. Go to Options → Controls
3. Find "OpAnchor - Anchor Click" under the OpAnchor category
4. Rebind to your preferred key

## Compatibility

- **Modrinth Launcher**: ✅ Full support
- **Prism Launcher**: ✅ Full support
- **CurseForge**: ✅ Compatible
- **MultiMC**: ✅ Compatible (via Fabric)
- **Vanilla Launcher**: ✅ Compatible (with Fabric)

## Notes

- This mod is primarily designed for singleplayer use
- Client-side only - no server-side components
- Works with other Fabric mods
- Lightweight and performant

## Troubleshooting

**Mod not working?**
- Ensure you have Fabric Loader 0.19.3+ installed
- Check that Fabric API is installed
- Verify Minecraft version is 1.21.11
- Check game logs for errors

**Key not responding?**
- Verify Z key is not bound to another action
- Check Controls menu for "OpAnchor - Anchor Click"
- Restart Minecraft if changes don't apply

## License

MIT License - Feel free to use and modify!

## Support

If you encounter issues or have suggestions, please create an issue on the repository or message on Modrinth.

---

Enjoy your anchor sequences! 🎮⚓
