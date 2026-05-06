package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorThinIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 128c0 2.209-1.791 4-4 4h-104c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h104c2.209 0 4 1.791 4 4ZM112 68h104c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-104c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM216 188h-176c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM72 140c1.619 .001 3.079-.973 3.698-2.469 .62-1.496 .277-3.217-.868-4.361L37.66 96 74.83 58.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0l-40 40c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l40 40c.751 .75 1.769 1.171 2.83 1.17Z"),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
