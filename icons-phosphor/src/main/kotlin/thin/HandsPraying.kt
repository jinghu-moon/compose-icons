package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorThinIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.490 182.830 L 195.490 145.830 L 158.790 24.620 C 156.884 18.332 151.663 13.608 145.216 12.339 C 138.768 11.070 132.147 13.463 128.000 18.560 C 123.853 13.463 117.232 11.070 110.784 12.339 C 104.337 13.608 99.116 18.332 97.210 24.620 L 60.460 145.880 L 23.510 182.880 C 21.251 185.132 19.981 188.190 19.981 191.380 C 19.981 194.570 21.251 197.628 23.510 199.880 L 56.200 232.490 C 58.452 234.749 61.510 236.019 64.700 236.019 C 67.890 236.019 70.948 234.749 73.200 232.490 L 121.480 184.200 C 124.112 181.576 126.321 178.560 128.030 175.260 C 129.739 178.560 131.948 181.576 134.580 184.200 L 182.860 232.490 C 185.112 234.749 188.170 236.019 191.360 236.019 C 194.550 236.019 197.608 234.749 199.860 232.490 L 232.550 199.800 C 237.219 195.097 237.193 187.500 232.490 182.830 ZM 67.490 226.830 C 66.740 227.581 65.722 228.003 64.660 228.003 C 63.598 228.003 62.580 227.581 61.830 226.830 L 29.170 194.150 C 28.419 193.400 27.997 192.382 27.997 191.320 C 27.997 190.258 28.419 189.240 29.170 188.490 L 44.680 173.000 L 83.000 211.320 ZM 115.780 178.550 L 88.680 205.660 L 50.340 167.320 L 66.820 150.830 C 67.288 150.366 67.632 149.792 67.820 149.160 L 104.820 26.940 C 106.172 22.227 110.804 19.243 115.654 19.961 C 120.503 20.680 124.072 24.878 124.000 29.780 L 124.000 158.780 C 124.014 166.200 121.061 173.318 115.800 178.550 ZM 131.980 158.750 L 131.980 29.750 C 131.978 24.901 135.528 20.783 140.325 20.071 C 145.121 19.360 149.714 22.269 151.120 26.910 L 188.120 149.130 C 188.308 149.762 188.652 150.336 189.120 150.800 L 206.500 168.180 L 167.320 205.690 L 140.200 178.550 C 134.931 173.311 131.978 166.180 132.000 158.750 ZM 226.810 194.150 L 194.130 226.830 C 193.380 227.581 192.362 228.003 191.300 228.003 C 190.238 228.003 189.220 227.581 188.470 226.830 L 173.000 211.380 L 212.180 173.870 L 226.790 188.490 C 227.546 189.235 227.976 190.250 227.983 191.312 C 227.991 192.373 227.576 193.394 226.830 194.150 Z"),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
