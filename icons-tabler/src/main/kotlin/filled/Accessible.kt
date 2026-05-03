package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Accessible: ImageVector
    get() {
        if (_accessible != null) return _accessible!!
        _accessible = tablerFilledIcon(
            name = "Accessible",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 15.949 10.184 C 15.789 9.703 15.294 9.418 14.797 9.521 L 14.684 9.551 L 12.000 10.446 L 9.316 9.551 L 9.203 9.521 C 8.707 9.419 8.213 9.704 8.053 10.184 C 7.893 10.665 8.117 11.189 8.575 11.405 L 8.684 11.449 L 11.000 12.220 L 11.000 13.196 L 9.168 15.946 L 9.108 16.046 C 8.899 16.456 8.997 16.955 9.345 17.256 L 9.445 17.332 L 9.546 17.392 C 9.956 17.601 10.455 17.503 10.756 17.155 L 10.832 17.055 L 12.000 15.303 L 13.168 17.055 L 13.238 17.148 C 13.566 17.535 14.133 17.615 14.555 17.333 C 14.978 17.051 15.122 16.498 14.891 16.046 L 14.832 15.946 L 13.000 13.196 L 13.000 12.219 L 15.316 11.448 L 15.425 11.404 C 15.884 11.189 16.109 10.664 15.949 10.183 ZM 12.000 6.000 C 11.172 6.000 10.500 6.672 10.500 7.500 C 10.500 8.328 11.172 9.000 12.000 9.000 C 12.828 9.000 13.500 8.328 13.500 7.500 C 13.500 6.672 12.828 6.000 12.000 6.000"),
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
        return _accessible!!
    }

private var _accessible: ImageVector? = null
