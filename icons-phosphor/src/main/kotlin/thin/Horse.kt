package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorThinIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 100.000 C 132.000 104.418 128.418 108.000 124.000 108.000 C 119.582 108.000 116.000 104.418 116.000 100.000 C 116.000 95.582 119.582 92.000 124.000 92.000 C 128.418 92.000 132.000 95.582 132.000 100.000 ZM 228.000 129.420 C 227.096 183.261 183.834 226.778 130.000 228.000 L 127.910 228.000 C 103.386 228.171 79.664 219.266 61.310 203.000 C 59.653 201.525 59.505 198.987 60.980 197.330 C 62.455 195.673 64.993 195.525 66.650 197.000 C 73.799 203.393 81.934 208.590 90.740 212.390 L 122.090 169.280 C 96.930 156.280 68.140 161.180 53.950 163.580 C 43.411 165.419 32.749 161.058 26.520 152.360 C 26.470 152.290 26.420 152.220 26.380 152.150 L 12.590 130.150 C 12.029 129.257 11.848 128.177 12.090 127.150 C 12.330 126.111 12.974 125.212 13.880 124.650 L 116.000 61.760 L 116.000 32.000 C 116.000 29.791 117.791 28.000 120.000 28.000 L 128.000 28.000 C 154.770 27.997 180.423 38.728 199.217 57.790 C 218.012 76.851 228.380 102.653 228.000 129.420 ZM 193.520 63.420 C 176.273 45.816 152.645 35.928 128.000 36.000 L 124.000 36.000 L 124.000 64.000 C 124.002 65.390 123.283 66.681 122.100 67.410 L 21.530 129.290 L 33.110 147.810 C 37.572 153.958 45.147 157.027 52.630 155.720 C 68.310 153.060 100.710 147.590 129.020 163.970 C 152.929 163.426 172.026 143.885 172.020 119.970 C 172.020 117.761 173.811 115.970 176.020 115.970 C 178.229 115.970 180.020 117.761 180.020 119.970 C 180.027 147.906 157.983 170.868 130.070 172.000 L 98.510 215.400 C 108.627 218.686 119.226 220.241 129.860 220.000 C 166.618 219.266 199.409 196.719 213.253 162.660 C 227.096 128.600 219.333 89.570 193.510 63.400 Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
