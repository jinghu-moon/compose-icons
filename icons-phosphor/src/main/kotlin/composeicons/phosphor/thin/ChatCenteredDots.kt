package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) return _chatCenteredDots!!
        _chatCenteredDots = phosphorThinIcon(
            name = "ChatCenteredDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 120c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM84 112c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM172 112c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM228 56v128c0 6.627-5.373 12-12 12h-62.75l-14.83 26c-2.136 3.74-6.113 6.048-10.42 6.048-4.307 0-8.284-2.308-10.42-6.048L102.75 196h-62.75c-6.627 0-12-5.373-12-12v-128C28 49.373 33.373 44 40 44h176c6.627 0 12 5.373 12 12ZM220 56c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v128c0 2.209 1.791 4 4 4h65.07c1.431-.002 2.754 .761 3.47 2l16 28c.713 1.243 2.037 2.01 3.47 2.01 1.433 0 2.757-.767 3.47-2.01l16-28c.716-1.239 2.039-2.002 3.47-2h65.05c2.209 0 4-1.791 4-4Z"),
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
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
