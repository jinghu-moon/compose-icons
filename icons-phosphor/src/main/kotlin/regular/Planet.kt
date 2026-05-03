package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorRegularIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 245.110 60.680 C 237.460 47.490 217.270 44.520 186.610 52.020 C 157.651 29.628 118.473 25.669 85.620 41.814 C 52.767 57.959 31.965 91.394 32.000 128.000 C 32.001 132.116 32.262 136.227 32.780 140.310 C 5.090 169.000 5.490 186.000 10.900 195.320 C 16.000 204.160 26.640 208.000 40.640 208.000 C 50.360 207.799 60.023 206.456 69.430 204.000 C 98.392 226.370 137.558 230.313 170.398 214.166 C 203.238 198.019 224.030 164.595 224.000 128.000 C 224.002 123.905 223.745 119.813 223.230 115.750 C 235.730 102.750 244.050 90.400 246.880 79.830 C 248.830 72.510 248.240 66.070 245.110 60.680 ZM 128.000 48.000 C 165.313 48.038 197.658 73.832 206.000 110.200 C 188.940 126.260 165.850 142.730 143.930 155.330 C 116.380 171.140 92.480 181.000 73.420 186.400 C 49.397 163.994 41.526 129.172 53.578 98.613 C 65.629 68.053 95.150 47.977 128.000 48.000 ZM 24.740 187.290 C 23.280 184.780 24.090 180.050 26.960 174.290 C 29.798 168.893 33.251 163.843 37.250 159.240 C 41.214 170.725 47.322 181.353 55.250 190.560 C 38.000 193.460 27.240 191.610 24.740 187.290 ZM 128.000 208.000 C 114.511 208.014 101.241 204.593 89.440 198.060 C 111.101 190.399 132.001 180.737 151.870 169.200 C 173.450 156.810 192.550 143.380 207.940 130.120 C 206.755 173.433 171.330 207.946 128.000 208.000 ZM 231.420 75.690 C 229.720 82.000 225.230 89.220 218.790 96.820 C 214.836 85.321 208.727 74.681 200.790 65.470 C 215.000 63.120 228.160 63.300 231.290 68.710 C 232.190 70.280 232.240 72.630 231.420 75.690 Z"),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
