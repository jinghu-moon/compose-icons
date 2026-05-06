package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorBoldIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 200c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12-.05-46.371-37.629-83.95-84-84h-67l27.52 27.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L23.52 112.51c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L71.52 47.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L61 92h67c59.619 .066 107.934 48.381 108 108Z"),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
