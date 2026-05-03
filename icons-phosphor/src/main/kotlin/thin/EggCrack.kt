package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorThinIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 92.870 20.000 44.000 86.520 44.000 152.000 C 44.000 198.392 81.608 236.000 128.000 236.000 C 174.392 236.000 212.000 198.392 212.000 152.000 C 212.000 86.520 163.130 20.000 128.000 20.000 ZM 128.000 228.000 C 86.045 227.956 52.044 193.955 52.000 152.000 C 52.000 123.540 62.000 92.270 79.330 66.220 C 94.810 43.000 113.910 28.000 128.000 28.000 C 139.390 28.000 154.050 37.800 167.420 53.820 L 125.000 101.340 C 124.069 102.383 123.751 103.836 124.159 105.173 C 124.568 106.510 125.645 107.536 127.000 107.880 L 155.300 114.960 L 148.050 151.220 C 147.621 153.385 149.026 155.488 151.190 155.920 C 151.446 155.976 151.708 156.003 151.970 156.000 C 153.877 155.998 155.518 154.651 155.890 152.780 L 163.890 112.780 C 164.306 110.689 163.008 108.639 160.940 108.120 L 135.360 101.720 L 172.440 60.200 Q 174.600 63.110 176.670 66.200 C 194.000 92.270 204.000 123.540 204.000 152.000 C 203.956 193.955 169.955 227.956 128.000 228.000 Z"),
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
