package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) return _eyedropperSample!!
        _eyedropperSample = phosphorBoldIcon(
            name = "EyedropperSample",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 67.240 C 227.880 56.428 223.364 46.131 215.490 38.720 C 199.910 24.000 174.710 24.500 159.290 39.930 L 142.480 56.840 C 131.358 49.210 116.377 50.593 106.840 60.130 L 97.840 69.130 C 90.336 76.646 90.016 88.716 97.110 96.620 L 48.900 144.840 C 38.274 155.395 33.785 170.652 37.000 185.280 L 29.500 202.470 C 26.552 209.157 28.027 216.968 33.210 222.120 C 39.014 227.967 47.821 229.633 55.360 226.310 L 71.670 219.180 C 86.013 221.968 100.802 217.435 111.120 207.090 L 159.360 158.830 C 167.261 165.912 179.316 165.591 186.830 158.100 L 195.830 149.100 C 205.370 139.532 206.735 124.523 199.080 113.390 L 216.320 96.050 C 223.969 88.434 228.186 78.032 228.000 67.240 ZM 142.350 141.900 L 136.290 148.000 L 79.730 148.000 L 114.070 113.640 ZM 94.150 190.110 C 88.922 195.349 81.228 197.272 74.150 195.110 C 71.410 194.261 68.457 194.428 65.830 195.580 L 57.000 199.380 L 60.690 191.000 C 61.883 188.266 62.015 185.186 61.060 182.360 C 59.935 179.024 59.711 175.450 60.410 172.000 L 112.290 172.000 ZM 199.290 79.110 L 173.920 104.630 C 171.661 106.882 170.391 109.940 170.391 113.130 C 170.391 116.320 171.661 119.378 173.920 121.630 L 178.800 126.510 C 179.551 127.260 179.973 128.278 179.973 129.340 C 179.973 130.402 179.551 131.420 178.800 132.170 L 172.660 138.320 L 167.780 133.430 L 167.780 133.430 L 122.550 88.140 L 122.550 88.140 L 117.670 83.250 L 123.810 77.110 C 124.560 76.359 125.578 75.937 126.640 75.937 C 127.702 75.937 128.720 76.359 129.470 77.110 L 134.350 82.000 C 136.602 84.250 139.656 85.513 142.840 85.510 L 142.840 85.510 C 146.027 85.515 149.085 84.252 151.340 82.000 L 176.280 56.920 C 182.580 50.620 192.760 50.290 198.990 56.180 C 202.146 59.154 203.960 63.281 204.016 67.616 C 204.073 71.952 202.367 76.125 199.290 79.180 Z"),
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
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
