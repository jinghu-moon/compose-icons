package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Notification4Line: ImageVector
    get() {
        if (_notification4Line != null) return _notification4Line!!
        _notification4Line = remixIcon(
            name = "Notification4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 10.000 C 18.000 6.686 15.314 4.000 12.000 4.000 C 8.686 4.000 6.000 6.686 6.000 10.000 L 6.000 18.000 L 18.000 18.000 L 18.000 10.000 ZM 20.000 18.667 L 20.400 19.200 C 20.566 19.421 20.521 19.734 20.300 19.900 C 20.213 19.965 20.108 20.000 20.000 20.000 L 4.000 20.000 C 3.724 20.000 3.500 19.776 3.500 19.500 C 3.500 19.392 3.535 19.287 3.600 19.200 L 4.000 18.667 L 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 16.418 2.000 20.000 5.582 20.000 10.000 L 20.000 18.667 ZM 9.500 21.000 L 14.500 21.000 C 14.500 22.381 13.381 23.500 12.000 23.500 C 10.619 23.500 9.500 22.381 9.500 21.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _notification4Line!!
    }

private var _notification4Line: ImageVector? = null
