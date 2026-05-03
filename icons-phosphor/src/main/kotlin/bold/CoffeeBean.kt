package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorBoldIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.580 41.420 C 196.860 23.710 171.000 16.630 141.810 21.500 C 114.070 26.120 86.350 41.120 63.730 63.730 C 41.110 86.340 26.120 114.070 21.500 141.810 C 16.630 171.020 23.710 196.860 41.420 214.580 C 55.480 228.640 74.670 236.000 96.600 236.000 C 102.495 235.983 108.378 235.482 114.190 234.500 C 141.930 229.880 169.650 214.880 192.270 192.270 C 214.890 169.660 229.880 141.930 234.500 114.190 C 239.370 85.000 232.290 59.140 214.580 41.420 ZM 45.170 145.750 C 48.970 122.910 61.590 99.810 80.700 80.750 C 99.810 61.690 122.910 49.000 145.750 45.170 C 150.217 44.407 154.739 44.016 159.270 44.000 C 165.443 43.955 171.589 44.821 177.510 46.570 C 169.346 50.233 161.660 54.877 154.620 60.400 C 134.620 76.170 121.740 98.120 116.240 125.650 C 107.290 170.380 75.940 186.750 54.170 192.740 C 45.250 180.830 42.060 164.410 45.170 145.750 ZM 210.830 110.250 C 207.030 133.090 194.410 156.190 175.300 175.300 C 156.190 194.410 133.090 207.000 110.250 210.830 C 98.600 212.770 87.850 212.240 78.500 209.410 C 86.659 205.758 94.339 201.120 101.370 195.600 C 121.370 179.830 134.260 157.880 139.760 130.350 C 148.760 85.620 180.060 69.250 201.830 63.260 C 210.750 75.170 213.940 91.590 210.830 110.250 Z"),
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
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
