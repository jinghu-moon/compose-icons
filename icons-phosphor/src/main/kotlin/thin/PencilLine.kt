package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) return _pencilLine!!
        _pencilLine = phosphorThinIcon(
            name = "PencilLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.490 76.200 L 179.800 31.510 C 177.548 29.251 174.490 27.981 171.300 27.981 C 168.110 27.981 165.052 29.251 162.800 31.510 L 39.510 154.830 C 37.263 157.080 36.000 160.130 36.000 163.310 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 C 220.000 213.791 218.209 212.000 216.000 212.000 L 105.660 212.000 L 224.490 93.170 C 229.176 88.484 229.176 80.886 224.490 76.200 ZM 73.660 188.000 L 164.000 97.660 L 186.350 120.000 L 96.000 210.340 ZM 68.000 182.340 L 45.660 160.000 L 136.000 69.660 L 158.350 92.000 ZM 44.000 208.000 L 44.000 169.660 L 65.170 190.830 L 65.170 190.830 L 86.340 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 ZM 218.830 87.510 L 192.000 114.340 L 141.660 64.000 L 168.490 37.170 C 169.240 36.419 170.258 35.997 171.320 35.997 C 172.382 35.997 173.400 36.419 174.150 37.170 L 218.830 81.860 C 220.388 83.421 220.388 85.949 218.830 87.510 Z"),
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
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
