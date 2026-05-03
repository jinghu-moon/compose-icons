package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) return _chatTeardropDots!!
        _chatTeardropDots = phosphorThinIcon(
            name = "ChatTeardropDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 128.000 C 140.000 132.418 136.418 136.000 132.000 136.000 C 127.582 136.000 124.000 132.418 124.000 128.000 C 124.000 123.582 127.582 120.000 132.000 120.000 C 136.418 120.000 140.000 123.582 140.000 128.000 ZM 88.000 120.000 C 83.582 120.000 80.000 123.582 80.000 128.000 C 80.000 132.418 83.582 136.000 88.000 136.000 C 92.418 136.000 96.000 132.418 96.000 128.000 C 96.000 123.582 92.418 120.000 88.000 120.000 ZM 176.000 120.000 C 171.582 120.000 168.000 123.582 168.000 128.000 C 168.000 132.418 171.582 136.000 176.000 136.000 C 180.418 136.000 184.000 132.418 184.000 128.000 C 184.000 123.582 180.418 120.000 176.000 120.000 ZM 228.000 124.000 C 227.939 176.994 184.994 219.939 132.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 124.000 C 36.000 70.981 78.981 28.000 132.000 28.000 C 185.019 28.000 228.000 70.981 228.000 124.000 ZM 220.000 124.000 C 220.000 75.399 180.601 36.000 132.000 36.000 C 83.399 36.000 44.000 75.399 44.000 124.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 132.000 212.000 C 180.578 211.945 219.945 172.578 220.000 124.000 Z"),
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
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
