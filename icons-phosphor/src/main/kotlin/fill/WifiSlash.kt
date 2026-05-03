package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorFillIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 168.410 184.380 L 140.310 218.260 C 137.269 221.914 132.754 224.020 128.000 224.000 L 128.000 224.000 C 123.241 224.012 118.725 221.896 115.690 218.230 L 11.650 92.800 C 8.882 89.494 7.602 85.192 8.110 80.910 C 8.616 76.619 10.842 72.717 14.280 70.100 C 24.362 62.447 35.190 55.830 46.600 50.350 L 42.310 45.630 C 39.296 42.415 39.353 37.395 42.440 34.250 C 43.996 32.746 46.095 31.936 48.258 32.006 C 50.421 32.075 52.464 33.019 53.920 34.620 ZM 247.920 80.910 C 247.414 76.619 245.188 72.717 241.750 70.100 C 209.058 45.231 169.076 31.839 128.000 32.000 C 113.704 31.988 99.451 33.581 85.510 36.750 C 84.136 37.085 83.041 38.121 82.630 39.474 C 82.219 40.828 82.554 42.298 83.510 43.340 L 186.000 156.070 C 186.779 156.914 187.883 157.382 189.032 157.355 C 190.180 157.328 191.261 156.809 192.000 155.930 L 244.350 92.800 C 247.118 89.494 248.398 85.192 247.890 80.910 Z"),
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
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
