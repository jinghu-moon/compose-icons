package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorThinIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.830 61.170 L 194.830 29.170 C 194.080 28.419 193.062 27.997 192.000 27.997 C 190.938 27.997 189.920 28.419 189.170 29.170 L 93.170 125.170 C 92.420 125.921 91.999 126.939 92.000 128.000 L 92.000 160.000 C 92.000 162.209 93.791 164.000 96.000 164.000 L 128.000 164.000 C 129.061 164.001 130.079 163.580 130.830 162.830 L 226.830 66.830 C 227.581 66.080 228.003 65.062 228.003 64.000 C 228.003 62.938 227.581 61.920 226.830 61.170 ZM 126.340 156.000 L 100.000 156.000 L 100.000 129.660 L 168.000 61.660 L 194.340 88.000 ZM 200.000 82.340 L 173.660 56.000 L 192.000 37.660 L 218.340 64.000 ZM 220.000 128.000 L 220.000 208.000 C 220.000 214.627 214.627 220.000 208.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 48.000 C 36.000 41.373 41.373 36.000 48.000 36.000 L 128.000 36.000 C 130.209 36.000 132.000 37.791 132.000 40.000 C 132.000 42.209 130.209 44.000 128.000 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 208.000 212.000 C 210.209 212.000 212.000 210.209 212.000 208.000 L 212.000 128.000 C 212.000 125.791 213.791 124.000 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 Z"),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
