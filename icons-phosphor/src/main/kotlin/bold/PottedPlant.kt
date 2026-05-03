package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorBoldIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 144.000 L 129.000 144.000 L 150.240 122.750 C 157.795 126.123 165.966 127.900 174.240 127.970 C 183.763 127.992 193.106 125.382 201.240 120.430 C 225.240 105.860 238.240 72.640 235.780 31.560 C 235.421 25.491 230.579 20.649 224.510 20.290 C 183.420 17.880 150.200 30.780 135.640 54.830 C 126.400 70.070 125.640 88.230 133.310 105.830 L 120.000 119.000 L 108.860 107.870 C 113.800 94.980 112.860 81.750 106.100 70.510 C 95.000 52.250 70.120 42.400 39.490 44.210 C 33.417 44.564 28.570 49.407 28.210 55.480 C 26.410 86.120 36.210 111.020 54.530 122.090 C 60.854 125.951 68.121 127.993 75.530 127.990 C 81.112 127.954 86.641 126.893 91.840 124.860 L 103.000 136.000 L 95.000 144.000 L 56.000 144.000 C 49.373 144.000 44.000 149.373 44.000 156.000 C 44.000 162.627 49.373 168.000 56.000 168.000 L 63.270 168.000 L 74.900 220.340 C 76.896 229.512 85.033 236.040 94.420 236.000 L 161.590 236.000 C 170.978 236.044 179.117 229.514 181.110 220.340 L 192.740 168.000 L 200.000 168.000 C 206.627 168.000 212.000 162.627 212.000 156.000 C 212.000 149.373 206.627 144.000 200.000 144.000 ZM 156.100 67.260 C 164.800 52.890 185.290 44.500 212.000 44.000 C 211.520 70.690 203.130 91.180 188.750 99.890 C 179.320 105.600 168.300 105.370 156.750 99.270 C 150.610 87.710 150.390 76.690 156.100 67.260 ZM 85.510 101.500 C 80.280 104.030 73.510 105.500 66.970 101.570 C 58.500 96.440 53.160 84.090 52.170 68.170 C 68.100 69.170 80.440 74.490 85.570 82.960 C 89.510 89.480 88.000 96.270 85.510 101.500 ZM 158.380 212.000 L 97.620 212.000 L 87.850 168.000 L 168.160 168.000 Z"),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
