package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = phosphorThinIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 76.050 C 164.000 80.468 160.418 84.050 156.000 84.050 C 151.582 84.050 148.000 80.468 148.000 76.050 C 148.000 71.632 151.582 68.050 156.000 68.050 C 160.418 68.050 164.000 71.632 164.000 76.050 ZM 213.230 141.730 C 194.230 175.880 158.470 194.080 106.800 195.860 L 83.800 249.580 C 83.165 251.057 81.708 252.010 80.100 252.000 L 79.840 252.000 C 78.153 251.892 76.716 250.735 76.250 249.110 L 60.840 195.170 L 6.900 179.730 C 5.275 179.262 4.120 177.823 4.014 176.136 C 3.909 174.448 4.876 172.876 6.430 172.210 L 60.150 149.210 C 62.000 97.600 80.160 61.810 114.300 42.850 C 159.800 17.580 218.080 31.850 221.060 33.580 C 221.644 33.928 222.132 34.416 222.480 35.000 C 223.350 36.480 227.200 51.940 227.900 71.950 C 228.540 90.570 226.520 117.790 213.230 141.730 ZM 172.770 171.500 C 149.305 167.925 131.976 147.736 132.000 124.000 L 132.000 124.000 C 108.303 123.992 88.150 106.709 84.530 83.290 C 74.260 101.290 68.740 124.240 68.070 152.000 C 68.033 153.564 67.087 154.963 65.650 155.580 L 19.920 175.140 L 65.180 188.140 C 66.504 188.520 67.540 189.556 67.920 190.880 L 80.850 236.130 L 100.450 190.410 C 101.064 188.969 102.464 188.019 104.030 187.980 C 131.810 187.280 154.780 181.770 172.770 171.500 ZM 220.000 77.250 C 219.962 64.800 218.554 52.392 215.800 40.250 C 203.658 37.495 191.250 36.087 178.800 36.050 C 159.990 35.930 132.870 39.050 110.600 54.540 C 103.656 59.364 97.468 65.194 92.240 71.840 C 90.986 83.775 95.156 95.643 103.601 104.169 C 112.046 112.696 123.873 116.980 135.820 115.840 C 137.007 115.727 138.183 116.150 139.026 116.994 C 139.870 117.837 140.293 119.013 140.180 120.200 C 139.044 132.155 143.338 143.988 151.878 152.431 C 160.418 160.873 172.299 165.033 184.240 163.760 C 190.868 158.537 196.685 152.360 201.500 145.430 C 210.000 133.160 220.180 111.350 220.000 77.250 Z"),
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
        return _fish!!
    }

private var _fish: ImageVector? = null
