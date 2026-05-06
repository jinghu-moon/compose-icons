package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorThinIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 60h-60C33.373 60 28 65.373 28 72v64c0 6.627 5.373 12 12 12h64v12c0 19.882-16.118 36-36 36-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 24.289-.028 43.972-19.711 44-44v-88c0-6.627-5.373-12-12-12ZM104 140h-64c-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4h60c2.209 0 4 1.791 4 4ZM216 60h-60c-6.627 0-12 5.373-12 12v64c0 6.627 5.373 12 12 12h64v12c0 19.882-16.118 36-36 36-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 24.289-.028 43.972-19.711 44-44v-88c0-6.627-5.373-12-12-12ZM220 140h-64c-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4h60c2.209 0 4 1.791 4 4Z"),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
