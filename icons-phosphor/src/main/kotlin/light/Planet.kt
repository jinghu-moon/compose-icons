package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorLightIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.390 61.680 C 236.150 49.200 216.390 46.680 186.150 54.190 C 157.885 31.886 119.358 27.704 86.966 43.423 C 54.574 59.142 34.019 91.995 34.050 128.000 C 34.051 132.349 34.351 136.693 34.950 141.000 C 13.090 163.380 5.390 181.780 12.660 194.320 C 17.160 202.080 26.660 206.010 40.520 206.010 C 48.943 205.865 57.326 204.805 65.520 202.850 C 66.970 202.530 68.440 202.170 69.930 201.850 C 100.070 225.607 141.629 228.644 174.902 209.521 C 208.175 190.399 226.473 152.962 221.120 114.960 C 233.770 101.960 242.230 89.640 244.980 79.360 C 246.760 72.530 246.240 66.590 243.390 61.680 ZM 128.000 46.000 C 166.691 46.053 200.096 73.106 208.190 110.940 C 192.190 126.240 170.050 142.610 144.890 157.060 C 117.490 172.820 92.790 183.000 72.850 188.600 C 47.841 165.803 39.405 129.984 51.612 98.422 C 63.818 66.860 94.160 46.038 128.000 46.000 ZM 23.000 188.300 C 19.480 182.230 25.310 169.740 38.000 155.300 C 42.154 168.947 49.359 181.470 59.070 191.920 C 39.420 195.740 26.390 194.080 23.000 188.300 ZM 128.000 210.000 C 112.666 210.015 97.639 205.700 84.650 197.550 C 105.330 190.840 128.210 180.490 150.870 167.470 C 173.700 154.350 194.000 139.800 209.920 125.560 C 209.920 126.370 209.980 127.180 209.980 128.000 C 209.936 173.261 173.261 209.945 128.000 210.000 ZM 233.350 76.210 C 231.470 83.210 226.070 91.700 217.990 100.820 C 213.841 87.140 206.625 74.588 196.890 64.120 C 212.710 61.070 228.890 60.630 233.010 67.700 C 234.200 69.750 234.310 72.620 233.350 76.210 Z"),
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
