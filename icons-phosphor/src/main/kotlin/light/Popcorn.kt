package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorLightIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.140 75.660 C 226.600 74.190 224.397 73.646 222.350 74.230 L 220.940 74.630 C 218.302 63.112 210.935 53.238 200.645 47.429 C 190.355 41.621 178.094 40.416 166.870 44.110 C 160.411 28.329 145.052 18.020 128.000 18.020 C 110.948 18.020 95.589 28.329 89.130 44.110 C 77.906 40.416 65.645 41.621 55.355 47.429 C 45.065 53.238 37.698 63.112 35.060 74.630 L 33.650 74.230 C 31.604 73.645 29.401 74.188 27.861 75.656 C 26.321 77.124 25.674 79.298 26.160 81.370 L 56.710 211.210 C 58.200 217.533 63.843 222.001 70.340 222.000 L 185.660 222.000 C 192.157 222.001 197.800 217.533 199.290 211.210 L 229.840 81.370 C 230.325 79.300 229.678 77.128 228.140 75.660 ZM 76.000 54.000 C 80.883 53.988 85.694 55.187 90.000 57.490 C 91.656 58.372 93.629 58.429 95.333 57.644 C 97.036 56.859 98.275 55.322 98.680 53.490 C 101.740 39.776 113.909 30.023 127.960 30.023 C 142.011 30.023 154.180 39.776 157.240 53.490 C 157.646 55.319 158.883 56.853 160.584 57.638 C 162.285 58.423 164.255 58.368 165.910 57.490 C 170.244 55.175 175.086 53.976 180.000 54.000 C 194.236 53.996 206.514 63.998 209.390 77.940 L 168.320 89.670 L 133.200 75.670 C 129.862 74.335 126.138 74.335 122.800 75.670 L 87.680 89.670 L 46.610 77.940 C 49.486 63.998 61.764 53.996 76.000 54.000 ZM 161.440 99.840 L 146.750 210.000 L 109.250 210.000 L 94.560 99.840 L 127.260 86.760 C 127.735 86.571 128.265 86.571 128.740 86.760 ZM 68.440 208.460 L 40.180 88.580 L 82.570 100.690 L 97.150 210.000 L 70.340 210.000 C 69.411 210.002 68.604 209.364 68.390 208.460 ZM 187.660 208.460 C 187.442 209.382 186.607 210.025 185.660 210.000 L 158.850 210.000 L 173.430 100.690 L 215.820 88.580 Z"),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
