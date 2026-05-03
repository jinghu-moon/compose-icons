package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorThinIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 75.350 76.000 C 65.420 76.880 53.090 80.540 40.480 90.710 C 37.818 92.841 36.189 96.003 35.998 99.407 C 35.807 102.811 37.073 106.135 39.480 108.550 L 90.610 159.680 L 45.170 205.170 C 43.607 206.733 43.607 209.267 45.170 210.830 C 46.733 212.393 49.267 212.393 50.830 210.830 L 96.290 165.360 L 147.410 216.480 C 149.661 218.734 152.715 220.000 155.900 220.000 C 156.180 220.000 156.470 220.000 156.750 220.000 C 160.208 219.755 163.391 218.027 165.480 215.260 C 171.364 207.597 175.831 198.945 178.670 189.710 L 205.040 218.710 C 205.996 219.788 207.457 220.268 208.866 219.968 C 210.275 219.667 211.414 218.633 211.847 217.259 C 212.280 215.885 211.942 214.384 210.960 213.330 ZM 159.080 210.420 C 158.380 211.334 157.320 211.902 156.171 211.979 C 155.022 212.055 153.895 211.633 153.080 210.820 L 45.170 102.930 C 44.349 102.124 43.914 101.004 43.978 99.855 C 44.041 98.707 44.595 97.641 45.500 96.930 C 59.580 85.570 73.120 83.430 82.500 83.810 L 172.190 182.460 C 170.070 193.920 164.000 203.920 159.080 210.420 ZM 232.490 101.170 L 187.850 146.000 C 186.281 147.499 183.804 147.474 182.266 145.944 C 180.728 144.414 180.690 141.937 182.180 140.360 L 226.830 95.560 C 227.581 94.810 228.003 93.792 228.003 92.730 C 228.003 91.668 227.581 90.650 226.830 89.900 L 166.150 29.170 C 165.400 28.419 164.382 27.997 163.320 27.997 C 162.258 27.997 161.240 28.419 160.490 29.170 L 119.270 70.530 C 117.710 72.096 115.176 72.100 113.610 70.540 C 112.044 68.980 112.040 66.446 113.600 64.880 L 154.830 23.520 C 157.082 21.261 160.140 19.991 163.330 19.991 C 166.520 19.991 169.578 21.261 171.830 23.520 L 232.490 84.200 C 237.176 88.886 237.176 96.484 232.490 101.170 Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
