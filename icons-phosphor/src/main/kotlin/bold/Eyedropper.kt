package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) return _eyedropper!!
        _eyedropper = phosphorBoldIcon(
            name = "Eyedropper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 67.240 C 227.880 56.428 223.364 46.131 215.490 38.720 C 199.910 24.000 174.710 24.500 159.290 39.930 L 142.480 56.840 C 131.358 49.210 116.377 50.593 106.840 60.130 L 97.840 69.130 C 90.336 76.646 90.016 88.716 97.110 96.620 L 48.900 144.840 C 38.274 155.395 33.785 170.652 37.000 185.280 L 29.500 202.470 C 26.552 209.157 28.027 216.968 33.210 222.120 C 39.014 227.967 47.821 229.633 55.360 226.310 L 71.670 219.180 C 86.013 221.970 100.803 217.437 111.120 207.090 L 159.360 158.830 C 167.261 165.912 179.316 165.591 186.830 158.100 L 195.830 149.100 C 205.378 139.533 206.748 124.518 199.090 113.380 L 216.320 96.050 C 223.969 88.434 228.186 78.032 228.000 67.240 ZM 94.150 190.110 C 88.922 195.349 81.228 197.272 74.150 195.110 C 71.410 194.261 68.457 194.428 65.830 195.580 L 57.000 199.380 L 60.690 191.000 C 61.883 188.266 62.015 185.186 61.060 182.360 C 58.605 175.154 60.471 167.178 65.870 161.810 L 114.070 113.590 L 142.350 141.890 ZM 199.290 79.110 L 173.920 104.630 C 169.247 109.314 169.247 116.896 173.920 121.580 L 178.800 126.470 C 179.551 127.220 179.973 128.238 179.973 129.300 C 179.973 130.362 179.551 131.380 178.800 132.130 L 172.660 138.280 L 117.660 83.230 L 123.800 77.090 C 125.361 75.532 127.889 75.532 129.450 77.090 L 134.350 82.000 C 136.602 84.250 139.656 85.513 142.840 85.510 L 142.840 85.510 C 146.027 85.515 149.085 84.252 151.340 82.000 L 176.280 56.920 C 182.580 50.620 192.760 50.290 198.990 56.180 C 202.146 59.154 203.960 63.281 204.016 67.616 C 204.073 71.952 202.367 76.125 199.290 79.180 Z"),
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
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
