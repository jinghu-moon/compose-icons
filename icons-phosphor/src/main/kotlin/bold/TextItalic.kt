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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 56.000 C 204.000 62.627 198.627 68.000 192.000 68.000 L 160.650 68.000 L 120.650 188.000 L 144.000 188.000 C 150.627 188.000 156.000 193.373 156.000 200.000 C 156.000 206.627 150.627 212.000 144.000 212.000 L 64.000 212.000 C 57.373 212.000 52.000 206.627 52.000 200.000 C 52.000 193.373 57.373 188.000 64.000 188.000 L 95.350 188.000 L 135.350 68.000 L 112.000 68.000 C 105.373 68.000 100.000 62.627 100.000 56.000 C 100.000 49.373 105.373 44.000 112.000 44.000 L 192.000 44.000 C 198.627 44.000 204.000 49.373 204.000 56.000 Z"),
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
