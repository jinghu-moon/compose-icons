package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorBoldIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.001 28.767 49.655 27.376 45.474 28.278c-4.181 .903-7.566 3.963-8.884 8.032C27.009 37.968 20.008 46.276 20 56v128c0 11.046 8.954 20 20 20h58.11l12.52 21.92c3.561 6.232 10.188 10.077 17.365 10.077 7.177 0 13.804-3.846 17.365-10.077L157.89 204h23l18.25 20.07c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM150.93 180c-4.307 0-8.284 2.309-10.42 6.05L128 207.94 115.49 186.05c-2.136-3.741-6.113-6.05-10.42-6.05h-61.07v-120h6L159.1 180ZM236 56v118.14c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-114.14h-102.67c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h106.67c11.046 0 20 8.954 20 20Z"),
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
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
