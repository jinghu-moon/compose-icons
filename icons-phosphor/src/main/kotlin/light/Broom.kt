package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorLightIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.620 218.600 C 211.350 207.290 198.000 183.000 198.000 152.000 L 198.000 134.700 C 197.997 128.970 194.503 123.820 189.180 121.700 L 164.290 111.870 C 161.824 110.889 159.849 108.967 158.800 106.529 C 157.752 104.090 157.716 101.335 158.700 98.870 L 180.000 45.900 C 182.704 39.370 182.632 32.021 179.802 25.544 C 176.973 19.068 171.628 14.023 165.000 11.570 C 152.050 6.740 137.120 13.410 131.690 26.570 L 110.690 79.680 C 109.713 82.150 107.793 84.129 105.354 85.182 C 102.915 86.234 100.158 86.273 97.690 85.290 L 72.370 75.000 C 67.126 72.870 61.115 74.131 57.170 78.190 C 36.490 99.420 26.000 124.260 26.000 152.000 C 25.948 180.396 36.927 207.702 56.620 228.160 C 57.765 229.350 59.349 230.015 61.000 230.000 L 232.000 230.000 C 234.798 230.002 237.226 228.071 237.852 225.344 C 238.479 222.617 237.138 219.819 234.620 218.600 ZM 65.770 86.520 C 66.331 85.974 67.160 85.806 67.890 86.090 L 93.290 96.380 C 98.719 98.554 104.791 98.476 110.163 96.164 C 115.535 93.853 119.766 89.497 121.920 84.060 L 142.920 31.060 C 145.920 23.930 153.920 20.250 160.920 22.850 C 164.489 24.185 167.360 26.917 168.869 30.416 C 170.379 33.915 170.397 37.877 168.920 41.390 L 147.560 94.490 C 143.140 105.758 148.630 118.484 159.860 123.000 L 184.740 132.830 C 185.505 133.135 186.005 133.877 186.000 134.700 L 186.000 152.000 C 186.000 153.340 186.000 154.650 186.080 156.000 L 52.740 102.610 C 56.568 96.849 60.931 91.462 65.770 86.520 ZM 114.330 218.000 C 101.841 206.240 92.991 191.142 88.830 174.500 C 88.002 171.291 84.729 169.362 81.520 170.190 C 78.311 171.018 76.382 174.291 77.210 177.500 C 80.972 192.367 88.010 206.204 97.810 218.000 L 63.560 218.000 C 47.079 199.975 37.958 176.424 38.000 152.000 C 37.875 138.549 40.856 125.251 46.710 113.140 L 187.350 169.400 C 190.500 189.320 199.120 206.060 212.350 218.000 Z"),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
