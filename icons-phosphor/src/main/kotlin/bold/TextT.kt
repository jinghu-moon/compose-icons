package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorBoldIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 56.000 L 212.000 88.000 C 212.000 94.627 206.627 100.000 200.000 100.000 C 193.373 100.000 188.000 94.627 188.000 88.000 L 188.000 68.000 L 140.000 68.000 L 140.000 188.000 L 160.000 188.000 C 166.627 188.000 172.000 193.373 172.000 200.000 C 172.000 206.627 166.627 212.000 160.000 212.000 L 96.000 212.000 C 89.373 212.000 84.000 206.627 84.000 200.000 C 84.000 193.373 89.373 188.000 96.000 188.000 L 116.000 188.000 L 116.000 68.000 L 68.000 68.000 L 68.000 88.000 C 68.000 94.627 62.627 100.000 56.000 100.000 C 49.373 100.000 44.000 94.627 44.000 88.000 L 44.000 56.000 C 44.000 49.373 49.373 44.000 56.000 44.000 L 200.000 44.000 C 206.627 44.000 212.000 49.373 212.000 56.000 Z"),
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
        return _textT!!
    }

private var _textT: ImageVector? = null
