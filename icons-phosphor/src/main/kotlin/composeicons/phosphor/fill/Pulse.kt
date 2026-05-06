package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorFillIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM208 136h-19.36L159 188c-1.433 2.482-4.084 4.008-6.95 4h-.46c-3.029-.176-5.697-2.051-6.89-4.84L103 89.92 79 132c-1.442 2.498-4.116 4.026-7 4h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h19.36L97.05 68c1.506-2.635 4.374-4.191 7.404-4.018 3.03 .174 5.701 2.047 6.896 4.838L153 166.08l24-42.05c1.433-2.482 4.084-4.008 6.95-4h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
