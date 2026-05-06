package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorRegularIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60.59 175.24c1.92 .905 4.121 1.01 6.119 .292 1.997-.718 3.628-2.201 4.531-4.122L87.9 136h80.2l16.66 35.41c1.883 3.999 6.651 5.713 10.65 3.83 3.999-1.883 5.713-6.651 3.83-10.65l-64-136C133.921 25.784 131.1 23.993 128 23.993c-3.1 0-5.921 1.791-7.24 4.597L56.76 164.59c-.905 1.92-1.01 4.121-.292 6.119 .718 1.997 2.201 3.628 4.122 4.531ZM128 50.79 160.57 120h-65.14ZM224 216c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8Z"),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
