package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = phosphorDuotoneIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 245.650 108.460 L 164.460 189.650 C 162.301 191.807 159.103 192.547 156.216 191.559 C 153.329 190.572 151.255 188.027 150.870 185.000 C 143.780 131.860 108.460 97.200 91.420 85.240 C 89.470 83.888 88.220 81.739 88.010 79.375 C 87.799 77.011 88.649 74.676 90.330 73.000 L 129.000 34.330 C 130.675 32.664 133.001 31.823 135.354 32.033 C 137.707 32.244 139.847 33.483 141.200 35.420 C 153.200 52.420 187.820 87.780 240.960 94.870 C 243.994 95.242 246.551 97.311 247.548 100.201 C 248.545 103.090 247.809 106.296 245.650 108.460 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 255.150 97.720 C 253.197 91.902 248.088 87.714 242.000 86.940 C 223.745 84.487 206.175 78.364 190.350 68.940 L 200.660 58.640 C 209.684 48.771 209.343 33.548 199.887 24.093 C 190.432 14.637 175.209 14.296 165.340 23.320 L 152.140 36.530 C 149.810 33.730 148.330 31.690 147.730 30.840 C 145.019 26.967 140.735 24.492 136.026 24.077 C 131.317 23.662 126.666 25.351 123.320 28.690 L 84.680 67.360 C 81.343 70.704 79.655 75.352 80.068 80.058 C 80.481 84.764 82.952 89.047 86.820 91.760 C 87.680 92.360 89.720 93.840 92.520 96.170 L 7.310 181.370 C -1.714 191.239 -1.373 206.462 8.083 215.917 C 17.538 225.373 32.761 225.714 42.630 216.690 L 124.930 134.380 C 134.350 150.207 140.473 167.776 142.930 186.030 C 143.713 192.104 147.895 197.198 153.700 199.150 C 155.359 199.710 157.099 199.997 158.850 200.000 C 163.078 199.998 167.131 198.310 170.110 195.310 L 251.290 114.120 C 255.614 109.845 257.113 103.475 255.150 97.720 ZM 176.690 34.630 C 178.878 32.025 182.348 30.876 185.659 31.661 C 188.969 32.446 191.554 35.031 192.339 38.341 C 193.124 41.652 191.975 45.122 189.370 47.310 L 176.820 59.860 C 172.021 56.250 167.440 52.360 163.100 48.210 ZM 31.310 205.370 C 29.122 207.975 25.652 209.124 22.341 208.339 C 19.031 207.554 16.446 204.969 15.661 201.659 C 14.876 198.348 16.025 194.878 18.630 192.690 L 104.210 107.110 C 108.363 111.444 112.253 116.022 115.860 120.820 ZM 158.800 183.920 C 150.000 118.290 101.520 82.520 96.000 78.670 L 134.660 40.000 C 138.520 45.500 174.290 94.000 239.910 102.780 Z"),
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
