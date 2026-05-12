package composeicons.iconsax

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

object IconsaxIcons {
    object Linear
    object Outline
    object Broken
    object Bold
    object Bulk
    object TwoTone
}

fun iconsaxLinearIcon(
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

fun iconsaxOutlineIcon(
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

fun iconsaxBrokenIcon(
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

fun iconsaxBoldIcon(
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

fun iconsaxBulkIcon(
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

fun iconsaxTwoToneIcon(
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
