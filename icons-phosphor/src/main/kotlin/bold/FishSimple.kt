package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorBoldIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 76.000 C 172.000 84.837 164.837 92.000 156.000 92.000 C 147.163 92.000 140.000 84.837 140.000 76.000 C 140.000 67.163 147.163 60.000 156.000 60.000 C 164.837 60.000 172.000 67.163 172.000 76.000 ZM 236.000 76.660 C 236.320 108.510 228.450 136.430 213.260 157.420 C 197.600 179.070 174.370 193.630 144.260 200.710 C 125.060 205.230 102.870 206.710 77.900 205.090 Q 80.170 220.580 83.900 237.430 C 84.896 241.647 83.540 246.073 80.355 249.010 C 77.169 251.947 72.648 252.938 68.525 251.604 C 64.403 250.270 61.320 246.817 60.460 242.570 Q 55.880 221.720 53.380 202.660 Q 34.380 200.160 13.510 195.590 C 7.133 194.084 3.142 187.741 4.546 181.341 C 5.949 174.940 12.228 170.849 18.650 172.150 Q 35.480 175.820 50.960 178.150 C 49.380 153.150 50.830 131.030 55.340 111.850 C 62.420 81.710 76.980 58.490 98.610 42.850 C 119.610 27.640 147.530 19.750 179.390 20.080 C 201.180 20.290 221.390 24.500 225.190 26.720 C 226.938 27.749 228.397 29.204 229.430 30.950 C 231.570 34.640 235.780 54.870 236.000 76.660 ZM 177.540 159.940 C 137.865 149.129 106.871 118.135 96.060 78.460 C 86.850 90.620 80.500 106.030 77.130 124.460 C 74.130 140.850 73.470 159.710 75.130 180.850 C 96.290 182.500 115.130 181.850 131.550 178.850 C 150.000 175.490 165.370 169.140 177.530 159.940 ZM 209.000 47.000 C 193.100 44.000 149.700 38.550 116.740 59.440 C 121.978 101.158 154.833 134.017 196.550 139.260 C 217.430 106.320 212.000 62.920 209.000 47.000 Z"),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
