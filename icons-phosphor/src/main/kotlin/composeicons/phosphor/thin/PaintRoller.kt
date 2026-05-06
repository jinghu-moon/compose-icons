package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorThinIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 92h-20v-28c0-6.627-5.373-12-12-12h-152C41.373 52 36 57.373 36 64v28h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v28c0 6.627 5.373 12 12 12h152c6.627 0 12-5.373 12-12v-28h20c2.209 0 4 1.791 4 4v50c-.003 1.783-1.185 3.35-2.9 3.84L132.7 186.5c-5.137 1.469-8.683 6.157-8.7 11.5v34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-34c.003-1.783 1.185-3.35 2.9-3.84L235.3 165.5c5.137-1.469 8.683-6.157 8.7-11.5v-50c0-6.627-5.373-12-12-12ZM204 128c0 2.209-1.791 4-4 4h-152c-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4h152c2.209 0 4 1.791 4 4Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
