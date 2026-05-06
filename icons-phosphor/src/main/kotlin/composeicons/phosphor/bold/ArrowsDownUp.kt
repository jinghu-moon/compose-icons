package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorBoldIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120.49 167.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-32-32c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L68 179v-131C68 41.373 73.373 36 80 36c6.627 0 12 5.373 12 12v131l11.51-11.52c2.255-2.249 5.311-3.51 8.496-3.504 3.185 .006 6.237 1.277 8.484 3.534ZM216.49 71.51l-32-32c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-32 32c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L164 77v131c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-131l11.51 11.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
