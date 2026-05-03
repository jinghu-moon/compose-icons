package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = tablerFilledIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.333 3.000 C 19.358 3.000 21.000 4.642 21.000 6.667 L 21.000 17.333 C 21.000 19.358 19.358 21.000 17.333 21.000 L 6.667 21.000 C 4.642 21.000 3.000 19.358 3.000 17.333 L 3.000 6.667 C 3.000 4.642 4.642 3.000 6.667 3.000 ZM 13.750 6.000 C 12.526 5.999 11.501 6.927 11.380 8.145 L 11.095 11.000 L 9.000 11.000 L 8.883 11.007 C 8.358 11.069 7.972 11.530 8.003 12.059 C 8.034 12.587 8.471 12.999 9.000 13.000 L 10.894 13.000 L 10.629 15.656 L 10.615 15.727 C 10.567 15.889 10.419 16.000 10.250 16.000 C 10.112 16.000 10.000 15.888 10.000 15.750 L 10.000 15.500 L 9.993 15.383 C 9.931 14.858 9.470 14.472 8.941 14.503 C 8.413 14.534 8.001 14.971 8.000 15.500 L 8.000 15.750 L 8.005 15.904 C 8.086 17.084 9.067 18.000 10.250 18.000 C 11.474 18.001 12.499 17.073 12.620 15.855 L 12.904 13.000 L 15.000 13.000 L 15.117 12.993 C 15.642 12.931 16.028 12.470 15.997 11.941 C 15.966 11.413 15.529 11.001 15.000 11.000 L 13.105 11.000 L 13.371 8.344 L 13.385 8.273 C 13.433 8.111 13.581 8.000 13.750 8.000 C 13.888 8.000 14.000 8.112 14.000 8.250 L 14.000 8.500 L 14.007 8.617 C 14.069 9.142 14.530 9.528 15.059 9.497 C 15.587 9.466 15.999 9.029 16.000 8.500 L 16.000 8.250 L 15.995 8.096 C 15.914 6.916 14.933 6.000 13.750 6.000 Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
