package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorThinIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 76.000 C 164.000 80.418 160.418 84.000 156.000 84.000 C 151.582 84.000 148.000 80.418 148.000 76.000 C 148.000 71.582 151.582 68.000 156.000 68.000 C 160.418 68.000 164.000 71.582 164.000 76.000 ZM 206.770 152.730 C 192.270 172.730 170.600 186.300 142.390 192.930 C 121.480 197.840 96.780 198.930 68.590 196.350 Q 71.050 216.530 76.000 239.140 C 76.480 241.284 75.140 243.414 73.000 243.910 C 72.717 243.970 72.429 244.000 72.140 244.000 C 70.265 243.997 68.643 242.691 68.240 240.860 C 64.907 225.879 62.330 210.740 60.520 195.500 Q 39.120 193.010 15.190 187.780 C 13.671 187.615 12.378 186.599 11.859 185.162 C 11.340 183.725 11.685 182.118 12.748 181.020 C 13.811 179.923 15.407 179.527 16.860 180.000 Q 39.450 184.950 59.620 187.410 C 57.000 159.250 58.140 134.570 63.050 113.680 C 69.680 85.470 83.190 63.800 103.230 49.290 C 127.320 31.800 156.610 28.000 177.530 28.000 L 179.240 28.000 C 201.240 28.210 219.360 32.540 221.050 33.530 C 221.639 33.890 222.125 34.397 222.460 35.000 C 223.460 36.680 227.770 54.800 227.990 76.790 C 228.200 97.750 224.690 128.000 206.770 152.730 ZM 194.540 155.160 C 145.564 149.009 106.991 110.436 100.840 61.460 C 72.920 86.540 61.840 129.080 67.700 188.270 C 126.900 194.140 169.450 183.070 194.540 155.160 ZM 215.740 40.260 C 204.900 37.730 148.500 26.690 108.300 55.460 C 111.966 104.801 151.190 144.028 200.530 147.700 C 229.290 107.520 218.270 51.110 215.740 40.260 Z"),
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
