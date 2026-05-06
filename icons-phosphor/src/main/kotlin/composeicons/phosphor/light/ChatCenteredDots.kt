package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) return _chatCenteredDots!!
        _chatCenteredDots = phosphorLightIcon(
            name = "ChatCenteredDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138 120c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM84 110c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM172 110c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM230 56v128c0 7.732-6.268 14-14 14h-61.59l-14.25 25c-2.491 4.367-7.133 7.062-12.16 7.062-5.027 0-9.669-2.696-12.16-7.062L101.59 198h-61.59c-7.732 0-14-6.268-14-14v-128C26 48.268 32.268 42 40 42h176c7.732 0 14 6.268 14 14ZM218 56c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v128c0 1.105 .895 2 2 2h65.07c2.149-.005 4.136 1.139 5.21 3l16 28c.355 .627 1.02 1.014 1.74 1.014 .72 0 1.385-.387 1.74-1.014l16-28c1.074-1.861 3.061-3.005 5.21-3h65.03c1.105 0 2-.895 2-2Z"),
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
