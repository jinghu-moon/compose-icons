package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorBoldIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 100C84 93.373 89.373 88 96 88h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12ZM96 152h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM236 56v128c0 11.046-8.954 20-20 20h-58.11l-12.52 21.92c-3.559 6.237-10.189 10.086-17.37 10.086-7.181 0-13.811-3.85-17.37-10.086L98.11 204h-58.11C28.954 204 20 195.046 20 184v-128C20 44.954 28.954 36 40 36h176c11.046 0 20 8.954 20 20ZM212 60h-168v120h61.07c4.307 0 8.284 2.309 10.42 6.05L128 207.94l12.51-21.89c2.136-3.741 6.113-6.05 10.42-6.05h61.07Z"),
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
