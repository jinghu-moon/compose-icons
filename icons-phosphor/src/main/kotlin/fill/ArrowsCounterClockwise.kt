package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorFillIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 104.000 L 40.000 104.000 C 35.582 104.000 32.000 100.418 32.000 96.000 L 32.000 48.000 C 31.997 44.762 33.947 41.842 36.938 40.603 C 39.929 39.364 43.372 40.049 45.660 42.340 L 64.000 60.700 C 81.722 43.597 105.371 34.008 130.000 33.940 L 130.530 33.940 C 155.611 33.875 179.707 43.694 197.600 61.270 C 200.639 64.379 200.639 69.345 197.601 72.454 C 194.562 75.562 189.598 75.676 186.420 72.710 C 171.506 58.071 151.428 49.891 130.530 49.940 L 130.080 49.940 C 109.682 49.998 90.087 57.896 75.350 72.000 L 93.660 90.340 C 95.951 92.628 96.636 96.071 95.397 99.062 C 94.158 102.053 91.238 104.003 88.000 104.000 ZM 216.000 152.000 L 168.000 152.000 C 164.762 151.997 161.842 153.947 160.603 156.938 C 159.364 159.929 160.049 163.372 162.340 165.660 L 180.650 184.000 C 165.921 198.113 146.329 206.022 125.930 206.090 L 125.480 206.090 C 104.582 206.139 84.504 197.959 69.590 183.320 C 67.562 181.245 64.569 180.431 61.769 181.193 C 58.969 181.955 56.801 184.173 56.104 186.990 C 55.406 189.806 56.289 192.780 58.410 194.760 C 76.303 212.336 100.399 222.155 125.480 222.090 L 126.000 222.090 C 150.629 222.022 174.278 212.433 192.000 195.330 L 210.360 213.690 C 212.654 215.970 216.095 216.645 219.080 215.400 C 222.065 214.154 224.007 211.234 224.000 208.000 L 224.000 160.000 C 224.000 155.582 220.418 152.000 216.000 152.000 Z"),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
