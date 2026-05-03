package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorFillIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 215.520 197.260 C 216.582 200.181 215.857 203.452 213.660 205.650 L 189.660 229.650 C 188.160 231.154 186.124 231.999 184.000 232.000 C 183.737 232.015 183.473 232.015 183.210 232.000 C 180.825 231.765 178.671 230.473 177.340 228.480 L 133.270 162.360 L 112.000 183.590 L 112.000 208.000 C 111.999 210.119 111.157 212.151 109.660 213.650 C 109.660 213.650 95.660 227.710 93.780 229.530 C 92.998 230.348 92.050 230.989 91.000 231.410 C 86.924 233.070 82.273 231.127 80.590 227.060 L 80.530 226.910 L 65.830 190.150 L 29.000 175.420 C 26.504 174.422 24.677 172.237 24.135 169.604 C 23.594 166.971 24.411 164.242 26.310 162.340 L 42.310 146.340 C 43.819 144.833 45.867 143.990 48.000 144.000 L 72.400 144.000 L 93.670 122.730 L 27.560 78.650 C 25.563 77.321 24.268 75.166 24.032 72.779 C 23.796 70.392 24.643 68.025 26.340 66.330 L 50.340 42.330 C 52.538 40.133 55.809 39.408 58.730 40.470 L 144.670 71.720 L 176.200 40.190 C 187.135 29.255 204.865 29.255 215.800 40.190 C 226.735 51.125 226.735 68.855 215.800 79.790 L 184.270 111.320 Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
