package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorThinIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 160.000 36.000 C 153.373 36.000 148.000 41.373 148.000 48.000 L 148.000 208.000 C 148.000 214.627 153.373 220.000 160.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 160.000 212.000 C 157.791 212.000 156.000 210.209 156.000 208.000 L 156.000 172.000 L 184.000 172.000 C 186.209 172.000 188.000 170.209 188.000 168.000 C 188.000 165.791 186.209 164.000 184.000 164.000 L 156.000 164.000 L 156.000 132.000 L 184.000 132.000 C 186.209 132.000 188.000 130.209 188.000 128.000 C 188.000 125.791 186.209 124.000 184.000 124.000 L 156.000 124.000 L 156.000 92.000 L 184.000 92.000 C 186.209 92.000 188.000 90.209 188.000 88.000 C 188.000 85.791 186.209 84.000 184.000 84.000 L 156.000 84.000 L 156.000 48.000 C 156.000 45.791 157.791 44.000 160.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 74.830 29.170 C 74.080 28.419 73.062 27.997 72.000 27.997 C 70.938 27.997 69.920 28.419 69.170 29.170 L 37.170 61.170 C 36.420 61.921 35.999 62.939 36.000 64.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 96.000 220.000 C 102.627 220.000 108.000 214.627 108.000 208.000 L 108.000 64.000 C 108.001 62.939 107.580 61.921 106.830 61.170 ZM 44.000 76.000 L 68.000 76.000 L 68.000 180.000 L 44.000 180.000 ZM 100.000 208.000 C 100.000 210.209 98.209 212.000 96.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 188.000 L 100.000 188.000 ZM 100.000 180.000 L 76.000 180.000 L 76.000 76.000 L 100.000 76.000 ZM 100.000 68.000 L 44.000 68.000 L 44.000 65.660 L 72.000 37.660 L 100.000 65.660 Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
