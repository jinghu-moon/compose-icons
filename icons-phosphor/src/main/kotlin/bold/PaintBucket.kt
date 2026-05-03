package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorBoldIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.790 142.880 C 239.737 141.567 242.723 138.304 243.681 134.256 C 244.638 130.207 243.431 125.952 240.490 123.010 L 125.000 7.520 C 122.748 5.261 119.690 3.991 116.500 3.991 C 113.310 3.991 110.252 5.261 108.000 7.520 L 70.250 45.290 L 48.480 23.520 C 43.786 18.826 36.174 18.826 31.480 23.520 C 26.786 28.214 26.786 35.826 31.480 40.520 L 53.280 62.260 L 12.200 103.350 C 6.948 108.601 3.998 115.723 3.998 123.150 C 3.998 130.577 6.948 137.699 12.200 142.950 L 97.060 227.810 C 102.311 233.062 109.433 236.012 116.860 236.012 C 124.287 236.012 131.409 233.062 136.660 227.810 L 214.480 150.000 ZM 204.210 128.110 C 202.439 128.698 200.830 129.691 199.510 131.010 L 119.690 210.840 C 118.940 211.591 117.922 212.013 116.860 212.013 C 115.798 212.013 114.780 211.591 114.030 210.840 L 29.170 126.000 C 28.419 125.250 27.997 124.232 27.997 123.170 C 27.997 122.108 28.419 121.090 29.170 120.340 L 70.250 79.240 L 94.540 103.530 C 88.569 117.630 93.424 133.985 106.121 142.544 C 118.819 151.102 135.800 149.466 146.630 138.640 L 146.630 138.640 C 157.449 127.807 159.079 110.829 150.520 98.136 C 141.960 85.442 125.608 80.590 111.510 86.560 L 87.230 62.260 L 116.520 33.000 L 209.790 126.280 ZM 118.340 110.360 L 118.340 110.360 C 121.475 107.258 126.529 107.278 129.639 110.405 C 132.749 113.532 132.742 118.585 129.624 121.704 C 126.505 124.822 121.452 124.829 118.325 121.719 C 115.198 118.609 115.178 113.555 118.280 110.420 ZM 256.000 208.000 C 256.000 221.255 245.255 232.000 232.000 232.000 C 218.745 232.000 208.000 221.255 208.000 208.000 C 208.000 188.560 220.930 170.770 222.400 168.800 C 224.666 165.778 228.223 164.000 232.000 164.000 C 235.777 164.000 239.334 165.778 241.600 168.800 C 243.070 170.780 256.000 188.570 256.000 208.000 Z"),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
