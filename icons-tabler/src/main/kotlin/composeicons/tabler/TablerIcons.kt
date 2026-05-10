package composeicons.tabler

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

object TablerIcons {
    object Outline
    object Filled
}

fun tablerOutlineIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    autoMirror: Boolean = false,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = name,
    size = size,
    viewBox = viewBox,
    block = block,
)

fun tablerFilledIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    autoMirror: Boolean = false,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(
    name = name,
    size = size,
    viewBox = viewBox,
    block = block,
)
