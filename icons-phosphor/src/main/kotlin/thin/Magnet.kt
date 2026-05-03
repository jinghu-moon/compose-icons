package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorThinIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.130 53.060 C 188.455 37.048 166.997 28.017 144.590 28.000 L 144.270 28.000 C 121.970 27.939 100.572 36.804 84.850 52.620 L 23.460 114.800 C 18.807 119.480 18.807 127.040 23.460 131.720 L 52.130 160.380 C 54.373 162.638 57.427 163.902 60.610 163.890 L 60.680 163.890 C 63.888 163.874 66.957 162.574 69.200 160.280 L 130.090 97.860 C 137.815 90.214 150.219 90.095 158.090 97.590 C 161.901 101.253 164.066 106.304 164.090 111.590 C 164.147 117.144 161.988 122.493 158.090 126.450 L 95.760 186.750 C 93.457 188.989 92.148 192.058 92.125 195.270 C 92.102 198.482 93.369 201.569 95.640 203.840 L 124.300 232.500 C 128.955 237.155 136.491 237.191 141.190 232.580 L 203.000 172.120 C 235.880 139.210 236.400 85.800 204.130 53.060 ZM 63.510 154.690 C 62.769 155.458 61.747 155.891 60.680 155.890 L 60.680 155.890 C 59.619 155.891 58.601 155.470 57.850 154.720 L 29.160 126.060 C 27.609 124.500 27.609 121.980 29.160 120.420 L 55.790 93.420 L 89.940 127.600 ZM 135.590 226.870 C 134.031 228.414 131.519 228.414 129.960 226.870 L 101.290 198.210 C 100.530 197.459 100.102 196.434 100.102 195.365 C 100.102 194.296 100.530 193.271 101.290 192.520 L 128.490 166.220 L 162.650 200.370 ZM 197.350 166.430 L 168.410 194.750 L 134.290 160.630 L 163.700 132.190 C 169.137 126.703 172.161 119.274 172.100 111.550 C 172.079 104.110 169.045 96.996 163.690 91.830 C 152.655 81.313 135.253 81.495 124.440 92.240 L 95.530 121.870 L 61.400 87.750 L 90.520 58.260 C 104.744 43.959 124.099 35.943 144.270 36.000 L 144.560 36.000 C 164.831 36.021 184.243 44.191 198.430 58.670 C 227.630 88.300 227.130 136.650 197.350 166.430 Z"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
