package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatTeardrop: ImageVector
    get() {
        if (_chatTeardrop != null) return _chatTeardrop!!
        _chatTeardrop = phosphorThinIcon(
            name = "ChatTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 28.000 C 79.006 28.061 36.061 71.006 36.000 124.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 132.000 220.000 C 185.019 220.000 228.000 177.019 228.000 124.000 C 228.000 70.981 185.019 28.000 132.000 28.000 ZM 132.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 124.000 C 44.000 75.399 83.399 36.000 132.000 36.000 C 180.601 36.000 220.000 75.399 220.000 124.000 C 220.000 172.601 180.601 212.000 132.000 212.000 Z"),
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
        return _chatTeardrop!!
    }

private var _chatTeardrop: ImageVector? = null
