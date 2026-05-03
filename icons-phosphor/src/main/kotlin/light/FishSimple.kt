package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorLightIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 166.000 76.000 C 166.000 81.523 161.523 86.000 156.000 86.000 C 150.477 86.000 146.000 81.523 146.000 76.000 C 146.000 70.477 150.477 66.000 156.000 66.000 C 161.523 66.000 166.000 70.477 166.000 76.000 ZM 208.380 153.900 C 193.590 174.340 171.540 188.120 142.850 194.900 C 122.350 199.710 98.270 200.900 70.850 198.580 Q 73.280 217.580 77.920 238.730 C 78.262 240.286 77.971 241.913 77.112 243.254 C 76.253 244.596 74.896 245.540 73.340 245.880 C 72.916 245.971 72.484 246.018 72.050 246.020 C 69.234 246.014 66.801 244.051 66.200 241.300 Q 61.130 218.170 58.630 197.300 Q 37.830 194.790 14.690 189.730 C 11.451 189.012 9.407 185.804 10.125 182.565 C 10.843 179.326 14.051 177.282 17.290 178.000 Q 38.430 182.630 57.410 185.070 C 55.060 157.710 56.280 133.660 61.100 113.170 C 67.840 84.490 81.610 62.440 102.000 47.640 C 149.550 13.200 218.310 29.640 222.000 31.830 C 222.872 32.342 223.598 33.068 224.110 33.940 C 226.340 37.630 242.810 106.330 208.370 153.910 ZM 190.440 156.590 C 143.685 148.999 107.031 112.345 99.440 65.590 C 74.310 90.290 64.320 130.830 69.570 186.480 C 125.190 191.710 165.720 181.730 190.430 156.600 ZM 214.060 41.930 C 201.280 39.090 148.640 29.760 110.370 56.450 C 114.450 103.901 152.080 141.534 199.530 145.620 C 226.210 107.370 216.890 54.720 214.060 41.930 Z"),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
