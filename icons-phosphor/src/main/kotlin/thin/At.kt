package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorThinIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 148.760 228.000 170.520 221.770 186.210 211.340 C 188.052 210.117 188.553 207.632 187.330 205.790 C 186.107 203.948 183.622 203.447 181.780 204.670 C 167.350 214.270 147.240 220.000 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 220.000 159.320 205.000 164.000 196.000 164.000 C 187.000 164.000 172.000 159.320 172.000 128.000 L 172.000 88.000 C 172.000 85.791 170.209 84.000 168.000 84.000 C 165.791 84.000 164.000 85.791 164.000 88.000 L 164.000 102.750 C 152.689 86.626 132.041 79.982 113.450 86.486 C 94.859 92.989 82.854 111.055 84.061 130.714 C 85.268 150.372 99.392 166.834 118.639 171.015 C 137.886 175.196 157.566 166.077 166.820 148.690 C 171.460 163.580 181.660 172.000 196.000 172.000 C 216.000 172.000 228.000 155.550 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 164.000 C 108.118 164.000 92.000 147.882 92.000 128.000 C 92.000 108.118 108.118 92.000 128.000 92.000 C 147.882 92.000 164.000 108.118 164.000 128.000 C 164.000 147.882 147.882 164.000 128.000 164.000 Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null
