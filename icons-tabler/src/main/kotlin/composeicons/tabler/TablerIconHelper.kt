package composeicons.tabler

import androidx.compose.ui.graphics.vector.ImageVector
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

inline fun tablerOutlineIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = "TablerOutline/$name",
    size = size,
    viewBox = viewBox,
    block = block,
)

inline fun tablerFilledIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = "TablerFilled/$name",
    size = size,
    viewBox = viewBox,
    block = block,
)

