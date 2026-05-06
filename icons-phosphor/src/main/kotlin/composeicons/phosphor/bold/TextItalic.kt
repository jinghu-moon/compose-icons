package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextItalic: ImageVector
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = phosphorBoldIcon(
            name = "TextItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 56c0 6.627-5.373 12-12 12h-31.35L120.65 188h23.35c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-80c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h31.35L135.35 68h-23.35c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h80c6.627 0 12 5.373 12 12Z"),
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
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
