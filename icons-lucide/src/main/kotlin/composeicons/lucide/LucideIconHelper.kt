package composeicons.lucide

import androidx.compose.ui.graphics.vector.ImageVector
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

inline fun lucideOutlineIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = "LucideOutline/$name",
    size = size,
    viewBox = viewBox,
    block = block,
)

