package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlowerLotus: ImageVector
    get() {
        if (_flowerLotus != null) return _flowerLotus!!
        _flowerLotus = phosphorFillIcon(
            name = "FlowerLotus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.830 121.630 C 243.769 118.008 240.338 115.367 236.310 114.300 C 229.076 112.438 221.600 111.690 214.140 112.080 C 218.140 92.230 215.140 76.530 212.140 67.220 C 209.605 59.298 201.472 54.591 193.340 56.340 C 183.164 58.606 173.488 62.714 164.790 68.460 C 158.419 55.446 149.144 44.070 137.680 35.210 C 131.973 30.930 124.127 30.930 118.420 35.210 C 106.938 44.065 97.645 55.441 91.260 68.460 C 82.562 62.714 72.886 58.606 62.710 56.340 C 54.579 54.582 46.443 59.293 43.920 67.220 C 40.920 76.530 37.920 92.220 41.860 112.080 C 34.400 111.690 26.924 112.438 19.690 114.300 C 15.662 115.367 12.231 118.008 10.170 121.630 C 8.015 125.337 7.439 129.754 8.570 133.890 C 11.960 146.470 22.370 170.380 53.900 189.220 C 85.430 208.060 113.130 208.000 128.050 208.000 C 142.970 208.000 170.720 208.000 202.050 189.220 C 233.580 170.380 243.990 146.470 247.380 133.890 C 248.526 129.761 247.968 125.344 245.830 121.630 ZM 62.100 175.490 C 35.470 159.570 26.820 140.050 24.000 129.700 C 31.357 127.883 38.994 127.486 46.500 128.530 C 49.006 135.243 52.067 141.735 55.650 147.940 C 64.449 163.109 75.976 176.521 89.650 187.500 C 79.981 184.720 70.718 180.682 62.100 175.490 ZM 128.000 190.400 C 118.670 183.460 96.000 162.170 96.000 119.170 C 96.000 76.700 118.380 55.240 128.000 48.000 C 137.620 55.260 160.000 76.720 160.000 119.190 C 160.000 162.170 137.330 183.460 128.000 190.400 ZM 232.000 129.720 C 229.230 139.960 220.600 159.530 193.910 175.490 C 185.291 180.679 176.029 184.713 166.360 187.490 C 180.034 176.511 191.561 163.099 200.360 147.930 C 203.943 141.725 207.004 135.233 209.510 128.520 C 217.014 127.486 224.647 127.890 232.000 129.710 Z"),
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
        return _flowerLotus!!
    }

private var _flowerLotus: ImageVector? = null
