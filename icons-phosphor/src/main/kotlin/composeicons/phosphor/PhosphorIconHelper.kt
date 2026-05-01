package composeicons.phosphor

import androidx.compose.ui.graphics.vector.ImageVector
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

inline fun phosphorThinIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = "PhosphorThin/$name",
    size = size,
    viewBox = viewBox,
    block = block,
)

inline fun phosphorLightIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = "PhosphorLight/$name",
    size = size,
    viewBox = viewBox,
    block = block,
)

inline fun phosphorRegularIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = "PhosphorRegular/$name",
    size = size,
    viewBox = viewBox,
    block = block,
)

inline fun phosphorBoldIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = "PhosphorBold/$name",
    size = size,
    viewBox = viewBox,
    block = block,
)

inline fun phosphorFillIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = "PhosphorFill/$name",
    size = size,
    viewBox = viewBox,
    block = block,
)

inline fun phosphorDuotoneIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = "PhosphorDuotone/$name",
    size = size,
    viewBox = viewBox,
    block = block,
)
