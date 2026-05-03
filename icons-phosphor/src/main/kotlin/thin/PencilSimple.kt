package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorThinIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.490 76.200 L 179.800 31.510 C 177.548 29.251 174.490 27.981 171.300 27.981 C 168.110 27.981 165.052 29.251 162.800 31.510 L 133.170 61.170 L 133.170 61.170 L 39.520 154.830 C 37.260 157.072 35.992 160.126 36.000 163.310 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 92.690 220.000 C 95.870 220.000 98.920 218.737 101.170 216.490 L 224.480 93.170 C 226.739 90.918 228.009 87.860 228.009 84.670 C 228.009 81.480 226.739 78.422 224.480 76.170 ZM 95.490 210.830 C 94.747 211.573 93.741 211.993 92.690 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 163.310 C 43.999 162.249 44.420 161.231 45.170 160.480 L 136.000 69.650 L 186.340 120.000 ZM 218.830 87.510 L 192.000 114.340 L 141.660 64.000 L 168.480 37.170 C 169.230 36.419 170.248 35.997 171.310 35.997 C 172.372 35.997 173.390 36.419 174.140 37.170 L 218.830 81.850 C 219.581 82.600 220.003 83.618 220.003 84.680 C 220.003 85.742 219.581 86.760 218.830 87.510 Z"),
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
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
