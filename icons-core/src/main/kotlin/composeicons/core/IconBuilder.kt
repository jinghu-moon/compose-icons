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

fun androidx.compose.ui.graphics.vector.ImageVector.Builder.addPath(
    pathData: List<androidx.compose.ui.graphics.vector.PathNode>,
    pathFillType: androidx.compose.ui.graphics.PathFillType = androidx.compose.ui.graphics.PathFillType.NonZero,
    fill: androidx.compose.ui.graphics.Brush? = null,
    fillAlpha: Float = 1.0f,
    stroke: androidx.compose.ui.graphics.Brush? = null,
    strokeAlpha: Float = 1.0f,
    strokeLineWidth: Float = 0f,
    strokeLineCap: androidx.compose.ui.graphics.StrokeCap = androidx.compose.ui.graphics.StrokeCap.Butt,
    strokeLineJoin: androidx.compose.ui.graphics.StrokeJoin = androidx.compose.ui.graphics.StrokeJoin.Miter,
    strokeLineMiter: Float = 4f
) = path(
    pathData = pathData,
    pathFillType = pathFillType,
    fill = fill,
    fillAlpha = fillAlpha,
    stroke = stroke,
    strokeAlpha = strokeAlpha,
    strokeLineWidth = strokeLineWidth,
    strokeLineCap = strokeLineCap,
    strokeLineJoin = strokeLineJoin,
    strokeLineMiter = strokeLineMiter
)
