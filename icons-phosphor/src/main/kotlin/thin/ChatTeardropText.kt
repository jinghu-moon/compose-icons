package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorThinIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 112.000 C 168.000 114.209 166.209 116.000 164.000 116.000 L 96.000 116.000 C 93.791 116.000 92.000 114.209 92.000 112.000 C 92.000 109.791 93.791 108.000 96.000 108.000 L 164.000 108.000 C 166.209 108.000 168.000 109.791 168.000 112.000 ZM 164.000 140.000 L 96.000 140.000 C 93.791 140.000 92.000 141.791 92.000 144.000 C 92.000 146.209 93.791 148.000 96.000 148.000 L 164.000 148.000 C 166.209 148.000 168.000 146.209 168.000 144.000 C 168.000 141.791 166.209 140.000 164.000 140.000 ZM 228.000 124.000 C 227.939 176.994 184.994 219.939 132.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 L 36.000 124.000 C 36.000 70.981 78.981 28.000 132.000 28.000 C 185.019 28.000 228.000 70.981 228.000 124.000 ZM 220.000 124.000 C 220.000 75.399 180.601 36.000 132.000 36.000 C 83.399 36.000 44.000 75.399 44.000 124.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 132.000 212.000 C 180.578 211.945 219.945 172.578 220.000 124.000 Z"),
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
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
