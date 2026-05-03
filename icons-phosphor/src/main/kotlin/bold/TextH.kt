package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextH: ImageVector
    get() {
        if (_textH != null) return _textH!!
        _textH = phosphorBoldIcon(
            name = "TextH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 56.000 L 212.000 200.000 C 212.000 206.627 206.627 212.000 200.000 212.000 C 193.373 212.000 188.000 206.627 188.000 200.000 L 188.000 140.000 L 68.000 140.000 L 68.000 200.000 C 68.000 206.627 62.627 212.000 56.000 212.000 C 49.373 212.000 44.000 206.627 44.000 200.000 L 44.000 56.000 C 44.000 49.373 49.373 44.000 56.000 44.000 C 62.627 44.000 68.000 49.373 68.000 56.000 L 68.000 116.000 L 188.000 116.000 L 188.000 56.000 C 188.000 49.373 193.373 44.000 200.000 44.000 C 206.627 44.000 212.000 49.373 212.000 56.000 Z"),
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
        return _textH!!
    }

private var _textH: ImageVector? = null
