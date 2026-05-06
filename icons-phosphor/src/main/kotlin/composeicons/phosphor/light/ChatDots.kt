package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorLightIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138 128c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM84 118c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM172 118c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM230 64v128c0 7.732-6.268 14-14 14h-133.77L49.07 234.64l-.06 .05C46.496 236.831 43.302 238.004 40 238c-2.057-.004-4.087-.458-5.95-1.33C29.117 234.387 25.971 229.435 26 224v-160C26 56.268 32.268 50 40 50h176c7.732 0 14 6.268 14 14ZM218 64c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v160c.001 .771 .445 1.472 1.141 1.803 .696 .331 1.52 .232 2.119-.253L76.08 195.47c1.088-.945 2.479-1.467 3.92-1.47h136c1.105 0 2-.895 2-2Z"),
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
