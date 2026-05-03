package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorRegularIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 76.000 C 168.000 82.627 162.627 88.000 156.000 88.000 C 149.373 88.000 144.000 82.627 144.000 76.000 C 144.000 69.373 149.373 64.000 156.000 64.000 C 162.627 64.000 168.000 69.373 168.000 76.000 ZM 210.000 155.080 C 194.920 175.920 172.470 189.960 143.300 196.820 C 123.220 201.540 99.760 202.820 73.180 200.750 Q 75.580 218.570 79.900 238.290 C 80.841 242.603 78.112 246.863 73.800 247.810 C 73.235 247.937 72.659 248.001 72.080 248.000 C 68.323 247.998 65.073 245.381 64.270 241.710 Q 59.380 219.350 56.860 199.090 Q 36.640 196.580 14.280 191.680 C 9.964 190.733 7.233 186.466 8.180 182.150 C 9.127 177.834 13.394 175.103 17.710 176.050 Q 37.410 180.370 55.210 182.780 C 53.120 156.220 54.430 132.780 59.140 112.720 C 66.000 83.550 80.050 61.100 100.880 46.000 C 115.000 35.760 140.150 23.640 179.270 24.000 C 200.460 24.210 220.100 28.330 223.080 30.080 C 224.248 30.768 225.222 31.742 225.910 32.910 C 227.660 35.910 231.780 55.500 231.990 76.690 C 232.210 98.310 228.570 129.440 210.000 155.080 ZM 186.240 157.880 C 141.732 149.049 106.941 114.250 98.120 69.740 C 75.640 94.000 66.700 132.470 71.360 184.600 C 123.510 189.280 162.000 180.350 186.250 157.880 ZM 212.440 43.560 C 199.539 40.925 186.384 39.747 173.220 40.050 C 148.880 40.690 128.510 46.540 112.460 57.440 C 116.959 102.995 152.996 139.036 198.550 143.540 C 209.460 127.540 215.310 107.120 215.950 82.780 C 216.252 69.616 215.075 56.461 212.440 43.560 Z"),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
