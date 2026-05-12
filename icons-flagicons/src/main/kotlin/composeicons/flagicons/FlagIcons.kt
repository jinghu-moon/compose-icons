package composeicons.flagicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

object FlagIcons {
    object `1x1`
    object `4x3`
}

fun flagIcons1x1Icon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 512f, height = 512f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(name = name, size = size, viewBox = viewBox, block = block)

fun flagIcons4x3Icon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 18.dp),
    viewBox: ViewBox = ViewBox(width = 640f, height = 480f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(name = name, size = size, viewBox = viewBox, block = block)
