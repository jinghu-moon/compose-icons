package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorFillIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 120.000 L 232.000 128.000 C 232.000 155.647 220.992 182.156 201.408 201.670 C 181.825 221.185 155.277 232.098 127.630 232.000 C 73.630 231.810 29.630 189.940 24.510 137.220 C 24.397 135.823 25.023 134.469 26.161 133.651 C 27.299 132.832 28.782 132.669 30.070 133.220 C 44.853 139.426 61.959 135.089 72.000 122.590 C 78.478 130.647 88.114 135.521 98.442 135.967 C 108.771 136.414 118.791 132.388 125.940 124.920 C 129.178 130.181 133.582 134.629 138.810 137.920 C 126.952 146.992 119.998 161.070 120.000 176.000 C 119.992 178.243 120.926 180.386 122.575 181.908 C 124.223 183.429 126.435 184.188 128.670 184.000 C 132.877 183.547 136.050 179.971 136.000 175.740 C 136.143 158.169 150.428 143.999 168.000 144.000 C 170.217 144.005 172.336 143.090 173.853 141.473 C 175.369 139.856 176.147 137.682 176.000 135.470 C 175.629 131.205 172.031 127.947 167.750 128.000 L 160.000 128.000 C 146.745 128.000 136.000 117.255 136.000 104.000 L 136.000 88.000 L 200.000 88.000 C 217.673 88.000 232.000 102.327 232.000 120.000 ZM 44.730 120.000 C 55.570 119.600 64.000 110.370 64.000 99.520 L 64.000 76.520 C 64.000 65.630 55.570 56.400 44.730 56.000 C 39.300 55.802 34.024 57.821 30.114 61.593 C 26.203 65.366 23.996 70.567 24.000 76.000 L 24.000 100.000 C 23.996 105.433 26.203 110.634 30.114 114.407 C 34.024 118.179 39.300 120.198 44.730 120.000 ZM 100.730 120.000 C 111.570 119.610 120.000 110.380 120.000 99.530 L 120.000 52.530 C 120.000 41.680 111.570 32.450 100.730 32.060 C 95.311 31.862 90.043 33.873 86.135 37.633 C 82.227 41.392 80.013 46.577 80.000 52.000 L 80.000 100.000 C 79.996 105.433 82.203 110.634 86.114 114.407 C 90.024 118.179 95.300 120.198 100.730 120.000 ZM 176.000 52.000 C 176.004 46.567 173.797 41.366 169.886 37.593 C 165.976 33.821 160.700 31.802 155.270 32.000 C 144.430 32.400 136.000 41.630 136.000 52.480 L 136.000 72.000 L 172.000 72.000 C 174.209 72.000 176.000 70.209 176.000 68.000 Z"),
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
        return _handFist!!
    }

private var _handFist: ImageVector? = null
