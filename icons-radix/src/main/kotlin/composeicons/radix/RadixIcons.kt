package composeicons.radix

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.iconBuilder

object RadixIcons {
    object Regular
}

fun radixIcon(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    autoMirror: Boolean = false,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = iconBuilder(name = name, size = size, viewBox = viewBox, autoMirror = autoMirror, block = block)
