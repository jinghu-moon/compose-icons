package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorBoldIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 255.800 162.930 L 255.800 162.620 C 254.062 145.419 242.398 130.836 226.000 125.360 L 169.380 105.160 L 169.140 105.070 C 163.834 103.301 159.511 99.392 157.220 94.290 L 134.060 40.000 L 134.000 39.840 C 129.699 30.274 118.754 25.637 108.890 29.200 L 33.170 56.730 C 25.276 59.620 20.020 67.124 20.000 75.530 L 20.000 192.000 C 20.000 203.046 28.954 212.000 40.000 212.000 L 236.000 212.000 C 247.046 212.000 256.000 203.046 256.000 192.000 L 256.000 167.060 C 256.000 165.670 255.930 164.300 255.800 162.930 ZM 113.530 53.050 L 119.530 67.050 L 103.900 72.720 C 99.784 74.119 96.746 77.635 95.959 81.911 C 95.173 86.187 96.761 90.554 100.110 93.326 C 103.460 96.098 108.046 96.842 112.100 95.270 L 129.000 89.140 L 133.540 99.770 L 119.940 104.770 C 114.542 106.801 111.352 112.386 112.345 118.067 C 113.338 123.749 118.233 127.920 124.000 128.000 C 125.399 128.002 126.787 127.755 128.100 127.270 L 147.670 120.160 C 151.770 123.520 156.446 126.108 161.470 127.800 L 218.090 148.000 L 218.320 148.080 C 220.838 148.914 223.164 150.244 225.160 151.990 L 44.000 151.990 L 44.000 78.330 ZM 44.000 188.000 L 44.000 176.000 L 232.000 176.000 L 232.000 188.000 Z"),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
