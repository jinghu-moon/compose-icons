package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorBoldIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.49 143.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L140 109v115c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-115L64.49 160.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L119.49 71.49c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM216 28h-176C33.373 28 28 33.373 28 40c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
