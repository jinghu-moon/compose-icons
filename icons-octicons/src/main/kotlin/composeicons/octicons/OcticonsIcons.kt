package composeicons.octicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

object OcticonsIcons {
    object Default
    object Fill
}

fun octiconsIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = name,
    size = size,
    viewBox = viewBox,
    block = block,
)

fun octiconsFillIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = name,
    size = size,
    viewBox = viewBox,
    block = block,
)
