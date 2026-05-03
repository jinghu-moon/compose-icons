package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorBoldIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.900 31.930 C 54.053 28.620 49.633 27.117 45.358 28.007 C 41.083 28.896 37.629 32.037 36.339 36.208 C 35.048 40.379 36.125 44.922 39.150 48.070 L 63.000 74.360 C 47.619 81.562 33.602 91.374 21.570 103.360 C 0.120 124.820 -1.950 156.460 16.570 180.360 C 20.381 185.208 26.214 188.027 32.380 188.000 C 34.814 188.001 37.228 187.554 39.500 186.680 L 88.400 169.330 L 88.850 169.160 C 95.122 166.647 99.695 161.130 101.000 154.500 L 106.440 127.280 C 107.660 126.900 108.910 126.560 110.160 126.280 L 199.070 224.110 C 201.917 227.420 206.337 228.923 210.612 228.033 C 214.887 227.144 218.341 224.003 219.631 219.832 C 220.922 215.661 219.845 211.118 216.820 207.970 ZM 83.400 120.290 L 78.000 147.570 L 33.840 163.220 C 24.680 149.380 26.430 132.460 38.570 120.320 C 50.385 108.490 64.512 99.223 80.070 93.100 L 92.740 107.000 C 87.892 109.915 84.500 114.741 83.400 120.290 ZM 239.400 180.290 C 236.593 183.909 232.623 186.449 228.160 187.480 C 221.998 188.924 215.775 185.335 213.938 179.279 C 212.102 173.223 215.284 166.781 221.210 164.560 C 231.420 150.490 229.960 132.850 217.420 120.310 C 194.770 97.650 164.000 84.760 130.910 84.000 C 124.283 83.925 118.970 78.492 119.045 71.865 C 119.120 65.238 124.553 59.925 131.180 60.000 L 131.450 60.000 C 170.780 60.870 207.340 76.250 234.390 103.310 C 255.840 124.810 257.910 156.450 239.410 180.300 Z"),
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
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
