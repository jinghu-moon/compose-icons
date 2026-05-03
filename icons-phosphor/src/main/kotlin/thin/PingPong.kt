package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorThinIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 196.360 C 235.704 192.844 233.875 189.636 231.000 187.590 L 189.130 157.700 L 209.420 137.410 C 217.895 129.015 221.614 116.939 219.330 105.230 C 214.861 83.299 202.827 63.637 185.330 49.680 C 167.573 35.408 145.410 27.745 122.630 28.000 C 70.741 28.892 28.892 70.741 28.000 122.630 C 27.718 145.419 35.380 167.596 49.670 185.350 C 63.627 202.847 83.289 214.881 105.220 219.350 C 116.931 221.635 129.008 217.912 137.400 209.430 L 157.690 189.150 L 187.590 231.000 C 189.638 233.878 192.850 235.707 196.370 236.000 C 196.700 236.000 197.030 236.000 197.370 236.000 C 200.552 235.997 203.602 234.731 205.850 232.480 L 232.490 205.840 C 234.999 203.351 236.283 199.883 236.000 196.360 ZM 56.000 180.360 C 42.838 164.062 35.766 143.688 36.000 122.740 C 36.818 75.174 75.184 36.812 122.750 36.000 C 143.675 35.747 164.036 42.782 180.340 55.900 C 188.902 62.788 196.117 71.199 201.620 80.710 L 80.720 201.620 C 71.206 196.116 62.794 188.898 55.910 180.330 ZM 226.920 200.210 L 200.270 226.860 C 199.410 227.717 198.207 228.136 197.000 228.000 C 195.822 227.913 194.745 227.300 194.070 226.330 L 161.430 180.640 C 160.747 179.685 159.680 179.078 158.510 178.980 L 158.180 178.980 C 157.119 178.979 156.101 179.400 155.350 180.150 L 131.720 203.780 L 131.720 203.780 C 125.208 210.381 115.821 213.280 106.720 211.500 C 100.308 210.227 94.067 208.214 88.120 205.500 L 205.470 88.180 C 208.184 94.127 210.197 100.368 211.470 106.780 C 213.244 115.880 210.347 125.265 203.750 131.780 L 180.120 155.410 C 179.289 156.241 178.866 157.395 178.962 158.566 C 179.059 159.737 179.665 160.806 180.620 161.490 L 226.310 194.130 C 227.267 194.812 227.875 195.881 227.973 197.052 C 228.071 198.223 227.650 199.378 226.820 200.210 Z"),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
