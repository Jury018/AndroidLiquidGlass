# Android Liquid Glass (Backdrop)

![frontPhoto](artworks/banner.jpg)

A customizable Liquid Glass effect library for Jetpack Compose.

## Docs

[![Maven Central](https://img.shields.io/maven-central/v/io.github.kyant0/backdrop)](https://central.sonatype.com/artifact/io.github.kyant0/backdrop)

[Documentation](https://kyant.gitbook.io/backdrop)

## Usage

### Accessing the Backdrop API

The backdrop library provides its API through two packages:

1. **Main package** (`com.kyant.backdrop`): Contains the core `Backdrop` interface and convenience wrappers
2. **Backdrops subpackage** (`com.kyant.backdrop.backdrops`): Contains various Backdrop implementations

You can import functions in two ways:

```kotlin
// Option 1: Import from the main package (recommended for convenience)
import com.kyant.backdrop.rememberLayerBackdrop
import com.kyant.backdrop.rememberCombinedBackdrop
import com.kyant.backdrop.layerBackdrop

// Option 2: Import from the backdrops subpackage (explicit)
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.kyant.backdrop.backdrops.rememberCombinedBackdrop
import com.kyant.backdrop.backdrops.layerBackdrop
```

Both approaches work identically. The main package exports convenience wrappers for easier access.

### Available Backdrop Types

- `rememberLayerBackdrop`: Captures content drawn to a GraphicsLayer for backdrop effects
- `rememberCombinedBackdrop`: Combines multiple backdrops
- `rememberCanvasBackdrop`: Creates a backdrop with custom canvas drawing
- `rememberBackdrop`: Wraps a backdrop with custom drawing logic
- `emptyBackdrop()`: Returns an empty backdrop that doesn't draw anything

## Components

The library does not include any high-level components; you will need to create your own.
Below are some example components:

- [LiquidButton](/catalog/src/main/java/com/kyant/backdrop/catalog/components/LiquidButton.kt)
- [LiquidToggle](/catalog/src/main/java/com/kyant/backdrop/catalog/components/LiquidToggle.kt)
- [LiquidSlider](/catalog/src/main/java/com/kyant/backdrop/catalog/components/LiquidSlider.kt)
- [LiquidBottomTabs](/catalog/src/main/java/com/kyant/backdrop/catalog/components/LiquidBottomTabs.kt)

## Demos

- [Backdrop Catalog](./catalog/release/catalog-release.apk)

![Screenshots of Backdrop Catalog](artworks/catalog_app.jpg)

- **(Deprecated)** [Liquid Glass Playground](./app/release/app-release.apk) (Android 13+)

<img alt="Screenshots of Liquid Glass Playground" height="400" src="artworks/playground_app.jpg"/>
