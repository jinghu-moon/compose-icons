package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorRegularIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 112c0 4.418-3.582 8-8 8h-68c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h68c4.418 0 8 3.582 8 8ZM164 136h-68c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h68c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 124c-.061 55.203-44.797 99.939-100 100h-84c-8.837 0-16-7.163-16-16v-84C32 68.772 76.772 24 132 24c55.228 0 100 44.772 100 100ZM216 124C216 77.608 178.392 40 132 40 85.608 40 48 77.608 48 124v84h84c46.371-.05 83.95-37.629 84-84Z"),
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
