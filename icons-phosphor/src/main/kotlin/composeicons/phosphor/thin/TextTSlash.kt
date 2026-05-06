package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorThinIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.69 219c-1.635 1.485-4.164 1.365-5.65-.27l-73-80.34v57.61h28c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-64.04c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28v-66.45L60.78 60h-.78v28c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-32c.005-1.424 .767-2.738 2-3.45L45 42.69C43.514 41.033 43.653 38.486 45.31 37c1.657-1.486 4.204-1.347 5.69 .31L211 213.31c.721 .792 1.094 1.84 1.036 2.91-.058 1.07-.543 2.071-1.346 2.78ZM105.79 60h18.21v20.43c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20.43h64v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4h-94.21c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
