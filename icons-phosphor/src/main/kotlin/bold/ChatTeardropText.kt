package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorBoldIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 108.000 C 176.000 114.627 170.627 120.000 164.000 120.000 L 96.000 120.000 C 89.373 120.000 84.000 114.627 84.000 108.000 C 84.000 101.373 89.373 96.000 96.000 96.000 L 164.000 96.000 C 170.627 96.000 176.000 101.373 176.000 108.000 ZM 164.000 136.000 L 96.000 136.000 C 89.373 136.000 84.000 141.373 84.000 148.000 C 84.000 154.627 89.373 160.000 96.000 160.000 L 164.000 160.000 C 170.627 160.000 176.000 154.627 176.000 148.000 C 176.000 141.373 170.627 136.000 164.000 136.000 ZM 236.000 124.000 C 235.939 181.412 189.412 227.939 132.000 228.000 L 48.000 228.000 C 36.954 228.000 28.000 219.046 28.000 208.000 L 28.000 124.000 C 28.000 66.562 74.562 20.000 132.000 20.000 C 189.438 20.000 236.000 66.562 236.000 124.000 ZM 212.000 124.000 C 212.000 79.817 176.183 44.000 132.000 44.000 C 87.817 44.000 52.000 79.817 52.000 124.000 L 52.000 204.000 L 132.000 204.000 C 176.162 203.950 211.950 168.162 212.000 124.000 Z"),
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
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
