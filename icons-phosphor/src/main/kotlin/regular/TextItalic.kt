package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextItalic: ImageVector
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = phosphorRegularIcon(
            name = "TextItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 56.000 C 200.000 60.418 196.418 64.000 192.000 64.000 L 157.770 64.000 L 115.100 192.000 L 144.000 192.000 C 148.418 192.000 152.000 195.582 152.000 200.000 C 152.000 204.418 148.418 208.000 144.000 208.000 L 64.000 208.000 C 59.582 208.000 56.000 204.418 56.000 200.000 C 56.000 195.582 59.582 192.000 64.000 192.000 L 98.230 192.000 L 140.900 64.000 L 112.000 64.000 C 107.582 64.000 104.000 60.418 104.000 56.000 C 104.000 51.582 107.582 48.000 112.000 48.000 L 192.000 48.000 C 196.418 48.000 200.000 51.582 200.000 56.000 Z"),
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
