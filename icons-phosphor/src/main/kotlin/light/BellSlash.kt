package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorLightIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 61.310 63.560 C 53.888 75.741 49.974 89.736 50.000 104.000 C 50.000 139.740 41.580 167.200 35.920 176.940 C 33.392 181.268 33.372 186.618 35.865 190.966 C 38.359 195.314 42.988 197.997 48.000 198.000 L 90.500 198.000 C 93.510 216.370 109.385 229.856 128.000 229.856 C 146.615 229.856 162.490 216.370 165.500 198.000 L 183.500 198.000 L 203.500 220.000 C 205.731 222.452 209.528 222.631 211.980 220.400 C 214.432 218.169 214.611 214.372 212.380 211.920 ZM 128.000 218.000 C 115.955 217.996 105.490 209.720 102.710 198.000 L 153.290 198.000 C 150.510 209.720 140.045 217.996 128.000 218.000 ZM 48.000 186.000 C 47.291 186.010 46.636 185.624 46.300 185.000 C 45.943 184.381 45.943 183.619 46.300 183.000 C 53.860 170.000 62.000 139.690 62.000 104.000 C 61.979 93.143 64.652 82.450 69.780 72.880 L 172.620 186.000 ZM 213.290 177.380 C 212.590 177.660 211.843 177.802 211.090 177.800 C 208.624 177.798 206.410 176.286 205.510 173.990 C 198.310 155.680 194.020 129.510 194.020 103.990 C 194.026 80.496 181.542 58.770 161.241 46.944 C 140.941 35.119 115.884 34.976 95.450 46.570 C 93.584 47.678 91.265 47.691 89.386 46.605 C 87.506 45.519 86.360 43.503 86.388 41.333 C 86.416 39.163 87.614 37.177 89.520 36.140 C 113.668 22.444 143.277 22.616 167.265 36.591 C 191.252 50.566 206.004 76.238 206.000 104.000 C 206.000 139.700 214.160 163.240 216.660 169.610 C 217.866 172.692 216.349 176.168 213.270 177.380 Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
