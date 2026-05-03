package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorThinIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.270 152.070 L 216.190 99.850 C 213.906 93.661 207.054 90.476 200.850 92.720 L 126.550 119.640 L 139.820 43.810 C 140.972 37.301 136.644 31.087 130.140 29.910 L 75.470 20.190 C 72.358 19.634 69.154 20.355 66.580 22.190 C 63.957 24.012 62.177 26.812 61.640 29.960 L 36.640 173.090 C 32.815 194.739 47.178 215.416 68.800 219.390 C 71.178 219.796 73.587 220.001 76.000 220.000 L 224.000 220.000 C 230.627 220.000 236.000 214.627 236.000 208.000 L 236.000 156.190 C 235.964 154.788 235.718 153.399 235.270 152.070 ZM 203.570 100.240 C 205.629 99.499 207.902 100.551 208.670 102.600 L 227.760 154.810 C 228.119 155.787 228.072 156.867 227.630 157.810 C 227.177 158.746 226.371 159.465 225.390 159.810 L 108.780 202.110 C 111.801 197.519 113.843 192.355 114.780 186.940 L 125.000 128.730 ZM 93.750 206.290 C 86.915 211.112 78.432 212.992 70.200 211.510 C 52.891 208.323 41.405 191.757 44.490 174.430 L 69.490 31.300 C 69.671 30.253 70.261 29.321 71.130 28.710 C 71.787 28.244 72.574 27.995 73.380 28.000 C 73.611 28.000 73.842 28.020 74.070 28.060 L 128.740 37.790 C 130.900 38.195 132.329 40.267 131.940 42.430 L 106.940 185.560 L 106.940 185.560 C 105.499 193.958 100.747 201.427 93.750 206.290 ZM 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 105.000 212.000 L 228.000 167.410 ZM 84.000 180.000 C 84.000 184.418 80.418 188.000 76.000 188.000 C 71.582 188.000 68.000 184.418 68.000 180.000 C 68.000 175.582 71.582 172.000 76.000 172.000 C 80.418 172.000 84.000 175.582 84.000 180.000 Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
