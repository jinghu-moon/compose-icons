package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorThinIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.910 214.510 L 197.910 38.510 C 197.158 32.504 192.052 27.999 186.000 28.000 L 70.000 28.000 C 63.948 27.999 58.842 32.504 58.090 38.510 L 36.090 214.510 C 35.663 217.926 36.723 221.361 39.001 223.942 C 41.280 226.523 44.557 228.001 48.000 228.000 L 88.690 228.000 C 94.187 228.003 98.983 224.270 100.330 218.940 L 128.000 112.000 L 155.670 218.940 C 157.017 224.270 161.813 228.003 167.310 228.000 L 208.000 228.000 C 211.443 228.001 214.720 226.523 216.999 223.942 C 219.277 221.361 220.337 217.926 219.910 214.510 ZM 197.520 99.900 C 180.176 98.700 166.168 85.277 164.230 68.000 L 193.530 68.000 ZM 70.000 36.000 L 186.000 36.000 C 188.028 35.984 189.747 37.488 190.000 39.500 L 192.530 60.000 L 63.470 60.000 L 66.000 39.500 C 66.253 37.488 67.972 35.984 70.000 36.000 ZM 62.470 68.000 L 91.770 68.000 C 89.832 85.277 75.824 98.700 58.480 99.900 ZM 92.570 217.000 C 92.113 218.769 90.517 220.003 88.690 220.000 L 48.000 220.000 C 46.847 220.009 45.745 219.520 44.979 218.658 C 44.213 217.795 43.856 216.644 44.000 215.500 L 57.470 108.000 C 79.643 107.231 97.784 90.093 99.810 68.000 L 124.000 68.000 L 124.000 95.490 ZM 211.000 218.650 C 210.240 219.509 209.147 220.001 208.000 220.000 L 167.310 220.000 C 165.462 220.001 163.854 218.736 163.420 216.940 L 132.000 95.490 L 132.000 68.000 L 156.190 68.000 C 158.216 90.093 176.357 107.231 198.530 108.000 L 212.000 215.500 C 212.136 216.645 211.772 217.793 211.000 218.650 Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
