package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorBoldIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.850 134.000 C 232.030 115.989 219.595 100.975 202.797 92.884 C 185.999 84.793 166.508 84.430 149.420 91.890 L 163.640 35.120 C 164.882 30.126 162.802 24.897 158.470 22.120 C 129.402 3.697 90.969 11.558 71.471 39.916 C 51.973 68.274 58.391 106.974 86.000 127.520 L 29.720 143.590 C 24.760 145.008 21.261 149.437 21.030 154.590 C 19.275 189.205 45.393 218.927 79.946 221.636 C 114.499 224.344 144.930 199.055 148.590 164.590 L 190.590 205.290 C 194.302 208.863 199.880 209.668 204.450 207.290 C 231.100 193.480 244.572 163.005 236.850 134.000 ZM 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 ZM 124.000 36.000 C 128.780 36.000 133.522 36.857 138.000 38.530 L 124.600 92.170 C 114.237 93.159 104.810 98.586 98.750 107.050 C 85.601 96.371 80.604 78.567 86.276 62.605 C 91.949 46.644 107.060 35.986 124.000 36.000 ZM 105.000 192.100 C 93.632 198.678 79.759 199.257 67.883 193.649 C 56.007 188.040 47.641 176.958 45.500 164.000 L 98.680 148.810 C 104.705 157.307 114.115 162.778 124.480 163.810 C 122.594 175.699 115.434 186.097 105.000 192.100 ZM 209.700 170.540 C 207.309 174.693 204.189 178.382 200.490 181.430 L 160.730 143.000 C 165.072 133.535 165.091 122.650 160.780 113.170 C 176.603 107.129 194.516 111.709 205.498 124.603 C 216.480 137.496 218.152 155.910 209.670 170.570 Z"),
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
        return _fan!!
    }

private var _fan: ImageVector? = null
