package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorRegularIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 104c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8ZM96 144h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM232 56v128c0 8.837-7.163 16-16 16h-60.43l-13.68 23.94c-2.849 4.983-8.15 8.058-13.89 8.058-5.74 0-11.041-3.075-13.89-8.058L100.43 200h-60.43c-8.837 0-16-7.163-16-16v-128C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM216 56h-176v128h65.07c2.884-.026 5.558 1.502 7 4l16 28 16-28c1.442-2.498 4.116-4.026 7-4h64.93Z"),
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
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null
