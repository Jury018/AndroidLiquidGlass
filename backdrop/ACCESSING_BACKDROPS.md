# Accessing the Backdrop API

This document explains how to access functions and classes from the `backdrops` folder (package).

## The Problem

Users were asking: **"On backdrop, how do I get this backdrop folder?"**

The backdrop library has a structure where:
- Core interfaces are in `com.kyant.backdrop`
- Implementation classes and helper functions are in `com.kyant.backdrop.backdrops`

This can be confusing for new users who don't know they need to import from the `backdrops` subpackage.

## The Solution

We now provide **two ways** to access the backdrop API:

### Option 1: Import from the Main Package (Recommended)

```kotlin
import com.kyant.backdrop.rememberLayerBackdrop
import com.kyant.backdrop.rememberCombinedBackdrop
import com.kyant.backdrop.layerBackdrop
import com.kyant.backdrop.LayerBackdrop

@Composable
fun MyComponent() {
    val backdrop = rememberLayerBackdrop()
    
    Box(
        modifier = Modifier
            .layerBackdrop(backdrop)
            .size(200.dp)
    ) {
        // Your content here
    }
}
```

### Option 2: Import from the Backdrops Subpackage (Explicit)

```kotlin
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.kyant.backdrop.backdrops.rememberCombinedBackdrop
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.LayerBackdrop

@Composable
fun MyComponent() {
    val backdrop = rememberLayerBackdrop()
    
    Box(
        modifier = Modifier
            .layerBackdrop(backdrop)
            .size(200.dp)
    ) {
        // Your content here
    }
}
```

Both approaches work identically! The main package provides convenience wrappers that delegate to the backdrops subpackage.

## Available Functions

The following functions are available from both packages:

- `rememberLayerBackdrop()` - Creates a layer-based backdrop
- `rememberCombinedBackdrop()` - Combines multiple backdrops
- `rememberCanvasBackdrop()` - Creates a canvas-based backdrop
- `rememberBackdrop()` - Wraps a backdrop with custom logic
- `emptyBackdrop()` - Returns an empty backdrop
- `layerBackdrop()` - Modifier extension for applying backdrops
- `LayerBackdrop` - Type alias for the LayerBackdrop class

## How It Works

The main package (`com.kyant.backdrop`) exports inline wrapper functions that delegate to the actual implementations in the backdrops subpackage. This provides:

1. **Convenience**: Shorter import paths
2. **Discoverability**: Users can find functions more easily
3. **Backward compatibility**: Existing code using `com.kyant.backdrop.backdrops.*` continues to work
4. **Zero overhead**: Inline functions have no runtime cost

## Migration Guide

If you're currently using imports from the backdrops subpackage, you don't need to change anything! Your code will continue to work. However, you can optionally update your imports to use the shorter main package imports:

```kotlin
// Before
import com.kyant.backdrop.backdrops.rememberLayerBackdrop

// After (optional)
import com.kyant.backdrop.rememberLayerBackdrop
```
