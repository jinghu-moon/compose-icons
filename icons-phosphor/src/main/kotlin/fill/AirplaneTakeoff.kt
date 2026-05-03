package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorFillIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 216.000 C 176.000 220.418 172.418 224.000 168.000 224.000 L 24.000 224.000 C 19.582 224.000 16.000 220.418 16.000 216.000 C 16.000 211.582 19.582 208.000 24.000 208.000 L 168.000 208.000 C 172.418 208.000 176.000 211.582 176.000 216.000 ZM 246.310 86.760 L 227.670 62.870 L 227.550 62.720 C 215.090 47.373 193.257 43.490 176.270 53.600 L 124.700 84.380 L 70.760 64.540 C 68.957 63.868 66.973 63.868 65.170 64.540 L 58.000 67.270 L 57.680 67.400 C 52.696 69.539 49.135 74.058 48.220 79.404 C 47.306 84.750 49.161 90.195 53.150 93.870 L 75.000 115.060 L 54.830 127.260 L 26.570 117.720 C 24.570 117.046 22.385 117.190 20.490 118.120 L 17.490 119.590 C 12.616 121.768 9.149 126.234 8.247 131.496 C 7.346 136.758 9.129 142.124 13.000 145.800 L 49.000 181.070 L 49.120 181.190 C 56.494 188.160 66.253 192.048 76.400 192.060 C 83.523 192.048 90.515 190.143 96.660 186.540 L 244.070 98.540 C 246.038 97.364 247.406 95.401 247.829 93.148 C 248.252 90.895 247.688 88.569 246.280 86.760 Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
