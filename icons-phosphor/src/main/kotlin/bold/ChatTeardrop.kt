package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatTeardrop: ImageVector
    get() {
        if (_chatTeardrop != null) return _chatTeardrop!!
        _chatTeardrop = phosphorBoldIcon(
            name = "ChatTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 132.000 20.000 C 74.588 20.061 28.061 66.588 28.000 124.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 132.000 228.000 C 189.438 228.000 236.000 181.438 236.000 124.000 C 236.000 66.562 189.438 20.000 132.000 20.000 ZM 132.000 204.000 L 52.000 204.000 L 52.000 124.000 C 52.000 79.817 87.817 44.000 132.000 44.000 C 176.183 44.000 212.000 79.817 212.000 124.000 C 212.000 168.183 176.183 204.000 132.000 204.000 Z"),
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
        return _chatTeardrop!!
    }

private var _chatTeardrop: ImageVector? = null
