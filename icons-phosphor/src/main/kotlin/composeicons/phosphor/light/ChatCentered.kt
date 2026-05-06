package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorLightIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v128c0 7.732 6.268 14 14 14h61.59l14.25 25c2.491 4.367 7.133 7.062 12.16 7.062 5.027 0 9.669-2.696 12.16-7.062l14.25-25h61.59c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM218 184c0 1.105-.895 2-2 2h-65.07c-2.149-.005-4.136 1.139-5.21 3l-16 28c-.355 .627-1.02 1.014-1.74 1.014-.72 0-1.385-.387-1.74-1.014l-16-28c-1.074-1.861-3.061-3.005-5.21-3h-65.03c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2Z"),
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
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
