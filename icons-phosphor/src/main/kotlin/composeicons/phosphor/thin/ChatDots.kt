package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorThinIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM84 120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM172 120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM228 64v128c0 6.627-5.373 12-12 12h-134.51L47.76 233.13h0C45.6 234.985 42.847 236.003 40 236c-1.762-.006-3.503-.395-5.1-1.14C30.671 232.905 27.973 228.659 28 224v-160C28 57.373 33.373 52 40 52h176c6.627 0 12 5.373 12 12ZM220 64c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v160c-.003 1.553 .894 2.967 2.3 3.627 1.406 .66 3.067 .447 4.26-.547L77.38 197c.724-.639 1.655-.994 2.62-1h136c2.209 0 4-1.791 4-4Z"),
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
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
