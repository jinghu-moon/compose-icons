package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = phosphorThinIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 251.360 99.000 C 249.897 94.635 246.066 91.492 241.500 90.910 C 221.009 88.128 201.379 80.877 184.000 69.670 L 197.860 55.800 C 205.355 47.501 205.031 34.784 197.124 26.876 C 189.216 18.969 176.499 18.645 168.200 26.140 L 152.000 42.390 C 149.340 39.441 146.846 36.346 144.530 33.120 C 142.496 30.222 139.286 28.370 135.760 28.059 C 132.233 27.749 128.749 29.012 126.240 31.510 L 87.510 70.180 C 85.008 72.689 83.743 76.175 84.053 79.705 C 84.364 83.234 86.218 86.446 89.120 88.480 C 92.347 90.813 95.442 93.323 98.390 96.000 L 10.140 184.200 C 2.645 192.499 2.969 205.216 10.876 213.124 C 18.784 221.031 31.501 221.355 39.800 213.860 L 125.670 128.000 C 136.884 145.383 144.135 165.021 146.910 185.520 C 147.481 190.063 150.588 193.885 154.918 195.372 C 159.249 196.860 164.048 195.753 167.290 192.520 L 248.480 111.330 C 251.731 108.115 252.850 103.322 251.360 99.000 ZM 173.860 31.800 C 177.049 28.131 182.019 26.548 186.743 27.697 C 191.466 28.846 195.154 32.534 196.303 37.257 C 197.452 41.981 195.869 46.951 192.200 50.140 L 177.200 65.140 C 170.140 60.072 163.514 54.426 157.390 48.260 ZM 34.140 208.200 C 30.951 211.869 25.981 213.452 21.257 212.303 C 16.534 211.154 12.846 207.466 11.697 202.743 C 10.548 198.019 12.131 193.049 15.800 189.860 L 104.230 101.430 C 110.396 107.554 116.042 114.180 121.110 121.240 ZM 242.820 105.640 L 161.640 186.820 C 160.596 187.929 158.998 188.321 157.560 187.820 C 156.080 187.332 155.019 186.028 154.840 184.480 C 146.300 120.510 99.070 85.690 93.720 81.930 C 92.740 81.257 92.109 80.184 92.000 79.000 C 91.887 77.832 92.305 76.675 93.140 75.850 L 131.820 37.170 C 132.560 36.424 133.569 36.006 134.620 36.010 L 134.970 36.010 C 136.154 36.112 137.231 36.735 137.910 37.710 C 141.670 43.060 176.490 90.290 240.430 98.820 C 241.977 99.004 243.276 100.069 243.760 101.550 C 244.280 102.979 243.912 104.581 242.820 105.640 Z"),
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
        return _axe!!
    }

private var _axe: ImageVector? = null
