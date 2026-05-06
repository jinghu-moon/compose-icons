package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatText: ImageVector
    get() {
        if (_chatText != null) return _chatText!!
        _chatText = phosphorBoldIcon(
            name = "ChatText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C28.954 44 20 52.954 20 64v160c-.033 7.779 4.489 14.858 11.56 18.1 2.658 1.244 5.555 1.893 8.49 1.9 4.696-.012 9.237-1.684 12.82-4.72l.12-.11L84.47 212h131.53c11.046 0 20-8.954 20-20v-128C236 52.954 227.046 44 216 44ZM212 188h-132c-2.88-.005-5.665 1.032-7.84 2.92L44 215.23v-147.23h168ZM84 108c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12ZM84 148c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12Z"),
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
        return _chatText!!
    }

private var _chatText: ImageVector? = null
