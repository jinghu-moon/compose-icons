package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorBoldIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 190.000 57.340 C 171.060 29.000 147.880 12.000 128.000 12.000 C 108.120 12.000 84.940 29.000 66.000 57.340 C 46.940 86.000 36.000 120.460 36.000 152.000 C 36.000 202.810 77.190 244.000 128.000 244.000 C 178.810 244.000 220.000 202.810 220.000 152.000 C 220.000 120.460 209.060 86.000 190.000 57.340 ZM 128.000 220.000 C 90.461 219.961 60.039 189.539 60.000 152.000 C 60.000 90.880 106.190 36.000 128.000 36.000 C 135.590 36.000 146.130 42.650 156.640 53.880 L 119.050 96.000 C 116.253 99.129 115.294 103.492 116.521 107.505 C 117.747 111.519 120.982 114.599 125.050 115.630 L 145.950 120.860 L 140.190 149.640 C 139.566 152.762 140.208 156.003 141.975 158.651 C 143.742 161.300 146.488 163.137 149.610 163.760 C 150.396 163.921 151.197 164.001 152.000 164.000 C 157.719 163.996 162.640 159.958 163.760 154.350 L 171.760 114.350 C 173.019 108.066 169.118 101.902 162.900 100.350 L 150.160 97.160 L 171.560 73.160 C 185.200 94.340 196.000 122.440 196.000 152.000 C 195.961 189.539 165.539 219.961 128.000 220.000 Z"),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
