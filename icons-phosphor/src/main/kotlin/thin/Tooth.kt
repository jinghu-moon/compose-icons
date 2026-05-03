package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorThinIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 169.490 67.710 L 138.770 80.000 L 169.490 92.280 C 171.280 92.987 172.312 94.869 171.947 96.758 C 171.583 98.648 169.924 100.010 168.000 100.000 C 167.489 100.002 166.983 99.903 166.510 99.710 L 128.000 84.310 L 89.490 99.710 C 89.017 99.903 88.511 100.002 88.000 100.000 C 86.076 100.010 84.417 98.648 84.053 96.758 C 83.688 94.869 84.720 92.987 86.510 92.280 L 117.230 80.000 L 86.510 67.710 C 84.458 66.882 83.467 64.547 84.295 62.495 C 85.123 60.443 87.458 59.452 89.510 60.280 L 128.000 75.690 L 166.510 60.280 C 168.562 59.452 170.897 60.443 171.725 62.495 C 172.553 64.547 171.562 66.882 169.510 67.710 ZM 220.000 79.710 C 220.070 150.790 196.840 209.780 174.350 225.760 C 170.855 228.248 166.281 228.632 162.420 226.760 C 158.465 224.939 155.819 221.104 155.520 216.760 C 154.350 200.930 149.330 164.000 128.000 164.000 C 106.670 164.000 101.650 200.940 100.480 216.820 C 100.001 223.104 94.782 227.971 88.480 228.010 C 86.030 228.005 83.642 227.236 81.650 225.810 C 59.160 209.810 35.930 150.810 36.000 79.810 C 36.105 51.165 59.355 28.000 88.000 28.000 L 168.000 28.000 C 196.621 28.000 219.862 51.129 220.000 79.750 ZM 212.000 79.710 C 211.841 55.523 192.188 35.999 168.000 36.000 L 88.000 36.000 C 63.793 36.000 44.132 55.553 44.000 79.760 C 43.930 147.340 65.900 204.760 86.290 219.270 C 87.424 220.095 88.923 220.222 90.180 219.600 C 91.513 218.987 92.403 217.694 92.500 216.230 C 95.360 177.390 108.000 156.000 128.000 156.000 C 148.000 156.000 160.640 177.400 163.500 216.240 C 163.597 217.704 164.487 218.997 165.820 219.610 C 167.077 220.232 168.576 220.105 169.710 219.280 C 190.100 204.800 212.070 147.340 212.000 79.760 Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
