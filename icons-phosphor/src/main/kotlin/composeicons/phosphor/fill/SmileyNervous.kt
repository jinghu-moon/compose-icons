package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) return _smileyNervous!!
        _smileyNervous = phosphorFillIcon(
            name = "SmileyNervous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM164 96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM92 96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM176 176c-10 0-15.05-6.74-18.4-11.2-3-4-3.92-4.8-5.6-4.8-1.68 0-2.57 .76-5.6 4.8C143.05 169.26 138 176 128 176c-10 0-15-6.74-18.4-11.2-3-4-3.92-4.8-5.6-4.8-1.68 0-2.57 .76-5.6 4.8C95.05 169.26 90 176 80 176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 1.68 0 2.57-.76 5.6-4.8C89 150.74 94 144 104 144c10 0 15 6.74 18.4 11.2 3 4 3.92 4.8 5.6 4.8 1.68 0 2.57-.76 5.6-4.8C137 150.74 142 144 152 144c10 0 15.05 6.74 18.4 11.2 3 4 3.92 4.8 5.6 4.8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
