package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextItalic: ImageVector
    get() {
        if (_textItalic != null) return _textItalic!!
        _textItalic = phosphorLightIcon(
            name = "TextItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.000 56.000 C 198.000 59.314 195.314 62.000 192.000 62.000 L 156.320 62.000 L 112.320 194.000 L 144.000 194.000 C 147.314 194.000 150.000 196.686 150.000 200.000 C 150.000 203.314 147.314 206.000 144.000 206.000 L 64.000 206.000 C 60.686 206.000 58.000 203.314 58.000 200.000 C 58.000 196.686 60.686 194.000 64.000 194.000 L 99.680 194.000 L 143.680 62.000 L 112.000 62.000 C 108.686 62.000 106.000 59.314 106.000 56.000 C 106.000 52.686 108.686 50.000 112.000 50.000 L 192.000 50.000 C 195.314 50.000 198.000 52.686 198.000 56.000 Z"),
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
