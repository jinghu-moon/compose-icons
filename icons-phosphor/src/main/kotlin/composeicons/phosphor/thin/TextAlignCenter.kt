package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextAlignCenter: ImageVector
    get() {
        if (_textAlignCenter != null) return _textAlignCenter!!
        _textAlignCenter = phosphorThinIcon(
            name = "TextAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 64c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4ZM64 100c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h128c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM216 140h-176c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM192 180h-128c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h128c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _textAlignCenter!!
    }

private var _textAlignCenter: ImageVector? = null
