package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextColumns: ImageVector
    get() {
        if (_textColumns != null) return _textColumns!!
        _textColumns = phosphorThinIcon(
            name = "TextColumns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 64c0 2.209-1.791 4-4 4h-72c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h72c2.209 0 4 1.791 4 4ZM112 100h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM112 140h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM112 180h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM144 68h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM216 100h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM216 140h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM216 180h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _textColumns!!
    }

private var _textColumns: ImageVector? = null
