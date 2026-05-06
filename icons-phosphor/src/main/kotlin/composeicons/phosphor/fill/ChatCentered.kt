package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorFillIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 56v128c0 8.837-7.163 16-16 16h-60.43l-13.68 23.94c-2.849 4.983-8.15 8.058-13.89 8.058-5.74 0-11.041-3.075-13.89-8.058L100.43 200h-60.43c-8.837 0-16-7.163-16-16v-128C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16Z"),
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
