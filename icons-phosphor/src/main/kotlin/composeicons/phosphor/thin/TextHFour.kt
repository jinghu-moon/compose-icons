package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorThinIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 56v120c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56h-96v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-120c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v56h96v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM252 184c0 2.209-1.791 4-4 4h-12v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-52c-1.53 .002-2.927-.868-3.599-2.242-.672-1.374-.502-3.011 .439-4.218l56-72c1.049-1.352 2.842-1.886 4.46-1.331 1.618 .556 2.704 2.08 2.7 3.791v68h12c2.209 0 4 1.791 4 4ZM228 123.66 184.18 180h43.82Z"),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
