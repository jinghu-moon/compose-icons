package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorFillIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.660 77.660 L 215.760 107.560 C 209.720 177.580 150.670 232.000 80.000 232.000 C 65.480 232.000 53.510 229.700 44.420 225.160 C 37.090 221.490 34.090 217.560 33.340 216.440 C 31.985 214.408 31.633 211.869 32.383 209.545 C 33.133 207.221 34.903 205.367 37.190 204.510 C 37.450 204.410 61.430 195.200 76.660 177.670 C 68.214 170.726 60.841 162.571 54.780 153.470 C 42.380 135.060 28.500 103.080 32.780 55.290 C 33.057 52.190 35.107 49.531 38.036 48.476 C 40.964 47.420 44.239 48.159 46.430 50.370 C 46.780 50.720 79.710 83.470 119.970 94.090 L 119.970 88.000 C 119.939 75.099 125.117 62.731 134.330 53.700 C 143.278 44.765 155.456 39.824 168.100 40.000 C 185.177 40.168 200.916 49.277 209.570 64.000 L 240.000 64.000 C 243.238 63.997 246.158 65.947 247.397 68.938 C 248.636 71.929 247.951 75.372 245.660 77.660 Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
