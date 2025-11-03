package com.kyant.backdrop

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.layer.GraphicsLayer
import androidx.compose.ui.graphics.rememberGraphicsLayer

/**
 * This file provides convenient access to the backdrops subpackage.
 *
 * The backdrops subpackage (com.kyant.backdrop.backdrops) contains various Backdrop
 * implementations and utility functions. You can access them in two ways:
 *
 * 1. Import directly from the main package (using the functions below):
 *    ```kotlin
 *    import com.kyant.backdrop.rememberLayerBackdrop
 *    import com.kyant.backdrop.rememberCombinedBackdrop
 *    ```
 *
 * 2. Import from the backdrops subpackage:
 *    ```kotlin
 *    import com.kyant.backdrop.backdrops.rememberLayerBackdrop
 *    import com.kyant.backdrop.backdrops.rememberCombinedBackdrop
 *    ```
 *
 * Both approaches work the same way.
 */

/**
 * Type alias for [com.kyant.backdrop.backdrops.LayerBackdrop] to make it accessible
 * from the main package.
 */
typealias LayerBackdrop = com.kyant.backdrop.backdrops.LayerBackdrop

/**
 * Creates and remembers a [LayerBackdrop] that captures content drawn to a [GraphicsLayer].
 *
 * This is a convenience wrapper for [com.kyant.backdrop.backdrops.rememberLayerBackdrop].
 *
 * @param graphicsLayer The graphics layer to use for backdrop effects. Defaults to a new graphics layer.
 * @param onDraw Custom drawing logic. Defaults to drawing the content.
 * @return A [LayerBackdrop] instance.
 */
@Composable
inline fun rememberLayerBackdrop(
    graphicsLayer: GraphicsLayer = rememberGraphicsLayer(),
    noinline onDraw: ContentDrawScope.() -> Unit = { drawContent() }
): LayerBackdrop = com.kyant.backdrop.backdrops.rememberLayerBackdrop(graphicsLayer, onDraw)

/**
 * Creates and remembers a combined [Backdrop] from two backdrops.
 *
 * This is a convenience wrapper for [com.kyant.backdrop.backdrops.rememberCombinedBackdrop].
 *
 * @param backdrop1 The first backdrop.
 * @param backdrop2 The second backdrop.
 * @return A combined [Backdrop] instance.
 */
@Composable
inline fun rememberCombinedBackdrop(
    backdrop1: Backdrop,
    backdrop2: Backdrop
): Backdrop = com.kyant.backdrop.backdrops.rememberCombinedBackdrop(backdrop1, backdrop2)

/**
 * Creates and remembers a combined [Backdrop] from three backdrops.
 *
 * This is a convenience wrapper for [com.kyant.backdrop.backdrops.rememberCombinedBackdrop].
 *
 * @param backdrop1 The first backdrop.
 * @param backdrop2 The second backdrop.
 * @param backdrop3 The third backdrop.
 * @return A combined [Backdrop] instance.
 */
@Composable
inline fun rememberCombinedBackdrop(
    backdrop1: Backdrop,
    backdrop2: Backdrop,
    backdrop3: Backdrop
): Backdrop = com.kyant.backdrop.backdrops.rememberCombinedBackdrop(backdrop1, backdrop2, backdrop3)

/**
 * Creates and remembers a combined [Backdrop] from multiple backdrops.
 *
 * This is a convenience wrapper for [com.kyant.backdrop.backdrops.rememberCombinedBackdrop].
 *
 * @param backdrops The backdrops to combine.
 * @return A combined [Backdrop] instance.
 */
@Composable
inline fun rememberCombinedBackdrop(vararg backdrops: Backdrop): Backdrop =
    com.kyant.backdrop.backdrops.rememberCombinedBackdrop(*backdrops)

/**
 * Creates and remembers a [Backdrop] with custom drawing logic.
 *
 * This is a convenience wrapper for [com.kyant.backdrop.backdrops.rememberBackdrop].
 *
 * @param backdrop The base backdrop.
 * @param onDraw Custom drawing logic that wraps the backdrop drawing.
 * @return A [Backdrop] instance.
 */
@Composable
inline fun rememberBackdrop(
    backdrop: Backdrop,
    noinline onDraw: DrawScope.(drawBackdrop: DrawScope.() -> Unit) -> Unit
): Backdrop = com.kyant.backdrop.backdrops.rememberBackdrop(backdrop, onDraw)

/**
 * Creates and remembers a [Backdrop] that draws custom content on a canvas.
 *
 * This is a convenience wrapper for [com.kyant.backdrop.backdrops.rememberCanvasBackdrop].
 *
 * @param onDraw Custom drawing logic.
 * @return A [Backdrop] instance.
 */
@Composable
inline fun rememberCanvasBackdrop(
    noinline onDraw: DrawScope.() -> Unit
): Backdrop = com.kyant.backdrop.backdrops.rememberCanvasBackdrop(onDraw)

/**
 * Returns an empty [Backdrop] that doesn't draw anything.
 *
 * This is a convenience wrapper for [com.kyant.backdrop.backdrops.emptyBackdrop].
 *
 * @return An empty [Backdrop] instance.
 */
inline fun emptyBackdrop(): Backdrop = com.kyant.backdrop.backdrops.emptyBackdrop()

/**
 * A modifier that applies a [LayerBackdrop] to a composable.
 *
 * This is a convenience wrapper for [com.kyant.backdrop.backdrops.layerBackdrop].
 *
 * @param backdrop The layer backdrop to apply.
 * @return A modified [Modifier].
 */
inline fun Modifier.layerBackdrop(backdrop: LayerBackdrop): Modifier =
    com.kyant.backdrop.backdrops.layerBackdrop(backdrop)
