package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Forward5Line: ImageVector
    get() {
        if (_forward5Line != null) return _forward5Line!!
        _forward5Line = remixIcon(
            name = "Forward5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 L 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 14.750 4.000 17.176 5.387 18.615 7.500 L 16.000 7.500 L 16.000 9.500 L 22.000 9.500 L 22.000 3.500 L 20.000 3.500 L 20.000 5.999 C 18.176 3.571 15.271 2.000 12.000 2.000 ZM 9.500 8.500 L 14.500 8.500 L 14.500 10.000 L 11.000 10.000 L 11.000 11.250 L 12.625 11.250 C 13.799 11.250 14.750 12.201 14.750 13.375 C 14.750 14.549 13.799 15.500 12.625 15.500 L 9.500 15.500 L 9.500 14.000 L 12.625 14.000 C 12.970 14.000 13.250 13.720 13.250 13.375 C 13.250 13.030 12.970 12.750 12.625 12.750 L 9.500 12.750 L 9.500 8.500 Z"),
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
        return _forward5Line!!
    }

private var _forward5Line: ImageVector? = null
