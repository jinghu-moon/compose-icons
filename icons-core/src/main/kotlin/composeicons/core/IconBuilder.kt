package composeicons.core

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
    autoMirror: Boolean = false,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = ImageVector.Builder(
    name = name,
    defaultWidth = size.width,
    defaultHeight = size.height,
    viewportWidth = viewBox.width,
    viewportHeight = viewBox.height,
    autoMirror = autoMirror,
).apply(block).build()

/**
 * Simplified addPath for icons where all paths share the same style.
 * Accepts SVG path data string directly, avoiding parseSvgPathData() call at each site.
 */
fun ImageVector.Builder.addPathData(
    pathData: String,
    pathFillType: PathFillType = PathFillType.NonZero,
    fill: Brush? = null,
    fillAlpha: Float = 1f,
    stroke: Brush? = null,
    strokeAlpha: Float = 1f,
    strokeLineWidth: Float = 0f,
    strokeLineCap: StrokeCap = StrokeCap.Butt,
    strokeLineJoin: StrokeJoin = StrokeJoin.Miter,
) {
    addPath(
        pathData = parseSvgPathData(pathData),
        pathFillType = pathFillType,
        fill = fill,
        fillAlpha = fillAlpha,
        stroke = stroke,
        strokeAlpha = strokeAlpha,
        strokeLineWidth = strokeLineWidth,
        strokeLineCap = strokeLineCap,
        strokeLineJoin = strokeLineJoin,
    )
}
