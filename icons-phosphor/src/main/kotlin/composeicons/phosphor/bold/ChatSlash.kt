package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorBoldIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C52.996 27.677 46.639 26.784 41.733 29.801c-4.906 3.017-6.976 9.094-4.933 14.479C27.124 45.848 20.011 54.198 20 64v160c-.033 7.779 4.489 14.858 11.56 18.1 2.658 1.244 5.555 1.893 8.49 1.9 4.696-.012 9.237-1.684 12.82-4.72l.12-.11L84.47 212h103.68l11 12.07c4.46 4.904 12.051 5.265 16.955 .805 4.904-4.46 5.265-12.051 .805-16.955ZM80 188c-2.88-.005-5.665 1.032-7.84 2.92L44 215.23v-147.23h13.24L166.33 188ZM236 64v110.12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-106.12h-95.4c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h99.4c11.046 0 20 8.954 20 20Z"),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
