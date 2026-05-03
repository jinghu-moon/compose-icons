package composeicons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox

object RadixIcons

fun radixIcon(
    name: String,
    size: IconSize,
    viewBox: ViewBox,
    block: ImageVector.Builder.() -> Unit
): ImageVector = ImageVector.Builder(
    name = name,
    defaultWidth = size.width,
    defaultHeight = size.height,
    viewportWidth = viewBox.width,
    viewportHeight = viewBox.height
).apply(block).build()

fun ImageVector.Builder.addPath(
    pathData: List<PathNode>,
    pathFillType: PathFillType = PathFillType.NonZero,
    fill: androidx.compose.ui.graphics.Brush? = null,
    fillAlpha: Float = 1.0f,
    stroke: androidx.compose.ui.graphics.Brush? = null,
    strokeAlpha: Float = 1.0f,
    strokeLineWidth: Float = 0f,
    strokeLineCap: StrokeCap = StrokeCap.Butt,
    strokeLineJoin: StrokeJoin = StrokeJoin.Miter,
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
