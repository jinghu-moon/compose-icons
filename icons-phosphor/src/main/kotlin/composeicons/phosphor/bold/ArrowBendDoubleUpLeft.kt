package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorBoldIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88.49 143.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L23.49 112.51c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L71.49 47.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L49 104ZM128 92h-11L144.52 64.48c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-48 48c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l48 48c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L117 116h11c46.371 .05 83.95 37.629 84 84 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C235.934 140.381 187.619 92.066 128 92Z"),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
