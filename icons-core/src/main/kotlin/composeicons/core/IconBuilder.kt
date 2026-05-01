package composeicons.core

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class IconSize(
    val width: Dp,
    val height: Dp,
)

data class ViewBox(
    val minX: Float = 0f,
    val minY: Float = 0f,
    val width: Float,
    val height: Float,
)

inline fun iconBuilder(
    name: String,
    size: IconSize = IconSize(width = 24.dp, height = 24.dp),
    viewBox: ViewBox = ViewBox(width = 24f, height = 24f),
    block: ImageVector.Builder.() -> Unit,
): ImageVector = ImageVector.Builder(
    name = name,
    defaultWidth = size.width,
    defaultHeight = size.height,
    viewportWidth = viewBox.width,
    viewportHeight = viewBox.height,
).apply(block).build()
