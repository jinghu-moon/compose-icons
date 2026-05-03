package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextItalic: ImageVector
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = phosphorThinIcon(
            name = "TextItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 56.000 C 196.000 58.209 194.209 60.000 192.000 60.000 L 154.880 60.000 L 109.550 196.000 L 144.000 196.000 C 146.209 196.000 148.000 197.791 148.000 200.000 C 148.000 202.209 146.209 204.000 144.000 204.000 L 64.000 204.000 C 61.791 204.000 60.000 202.209 60.000 200.000 C 60.000 197.791 61.791 196.000 64.000 196.000 L 101.120 196.000 L 146.450 60.000 L 112.000 60.000 C 109.791 60.000 108.000 58.209 108.000 56.000 C 108.000 53.791 109.791 52.000 112.000 52.000 L 192.000 52.000 C 194.209 52.000 196.000 53.791 196.000 56.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
