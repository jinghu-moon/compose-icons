package composeicons.phosphor

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

object PhosphorIcons {
    object Thin
    object Light
    object Regular
    object Bold
    object Fill
    object Duotone
}

fun phosphorThinIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(name = name, size = size, viewBox = viewBox, block = block)

fun phosphorLightIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(name = name, size = size, viewBox = viewBox, block = block)

fun phosphorRegularIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(name = name, size = size, viewBox = viewBox, block = block)

fun phosphorBoldIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(name = name, size = size, viewBox = viewBox, block = block)

fun phosphorFillIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(name = name, size = size, viewBox = viewBox, block = block)

fun phosphorDuotoneIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(name = name, size = size, viewBox = viewBox, block = block)
