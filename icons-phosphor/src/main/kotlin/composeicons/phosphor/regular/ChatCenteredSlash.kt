package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorRegularIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.92 34.62C51.697 32.174 48.199 31.347 45.116 32.539 42.033 33.73 40 36.695 40 40h0C31.163 40 24 47.163 24 56v128c0 8.837 7.163 16 16 16h60.43l13.68 23.94c2.849 4.983 8.15 8.058 13.89 8.058 5.74 0 11.041-3.075 13.89-8.058L155.57 200h27.07l19.44 21.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM150.92 184c-2.884-.026-5.558 1.502-7 4l-16 28-16-28c-1.442-2.498-4.116-4.026-7-4h-64.92v-128h11.73L168.1 184ZM232 56v130c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-130h-117.48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h117.48c8.837 0 16 7.163 16 16Z"),
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
