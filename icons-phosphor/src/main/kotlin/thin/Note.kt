package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorThinIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 96.000 C 92.000 93.791 93.791 92.000 96.000 92.000 L 160.000 92.000 C 162.209 92.000 164.000 93.791 164.000 96.000 C 164.000 98.209 162.209 100.000 160.000 100.000 L 96.000 100.000 C 93.791 100.000 92.000 98.209 92.000 96.000 ZM 96.000 132.000 L 160.000 132.000 C 162.209 132.000 164.000 130.209 164.000 128.000 C 164.000 125.791 162.209 124.000 160.000 124.000 L 96.000 124.000 C 93.791 124.000 92.000 125.791 92.000 128.000 C 92.000 130.209 93.791 132.000 96.000 132.000 ZM 128.000 156.000 L 96.000 156.000 C 93.791 156.000 92.000 157.791 92.000 160.000 C 92.000 162.209 93.791 164.000 96.000 164.000 L 128.000 164.000 C 130.209 164.000 132.000 162.209 132.000 160.000 C 132.000 157.791 130.209 156.000 128.000 156.000 ZM 220.000 48.000 L 220.000 156.690 C 220.008 159.874 218.740 162.928 216.480 165.170 L 165.170 216.490 C 162.924 218.744 159.872 220.008 156.690 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 48.000 C 36.000 41.373 41.373 36.000 48.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 48.000 212.000 L 156.000 212.000 L 156.000 160.000 C 156.000 157.791 157.791 156.000 160.000 156.000 L 212.000 156.000 L 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 ZM 206.350 164.000 L 164.000 164.000 L 164.000 206.350 Z"),
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
        return _note!!
    }

private var _note: ImageVector? = null
