package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorThinIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 112v96c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-88.53l-17.78 11.86c-1.839 1.226-4.324 .729-5.55-1.11-1.226-1.839-.729-4.324 1.11-5.55l24-16c1.228-.819 2.807-.896 4.108-.199 1.301 .697 2.113 2.053 2.112 3.529ZM144 52c-2.209 0-4 1.791-4 4v56h-96v-56c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v120c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-56h96v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-120c0-2.209-1.791-4-4-4Z"),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
