package composeicons.mdi

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

object MdiIcons {
    object Default
    object Outline
}

fun mdiIcon(
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

fun mdiOutlineIcon(
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
