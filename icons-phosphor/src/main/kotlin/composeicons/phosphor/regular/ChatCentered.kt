package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorRegularIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v128c0 8.837 7.163 16 16 16h60.43l13.68 23.94c2.849 4.983 8.15 8.058 13.89 8.058 5.74 0 11.041-3.075 13.89-8.058L155.57 200h60.43c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM216 184h-65.07c-2.884-.026-5.558 1.502-7 4l-16 28-16-28c-1.442-2.498-4.116-4.026-7-4h-64.93v-128h176Z"),
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
