package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorDuotoneIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64v144h-192v-160h176c8.837 0 16 7.163 16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M232 208c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v108.69L90.34 106.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346L128 132.69 180.69 80h-20.69c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-20.69l-58.34 58.35c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L96 123.31l-56 56v20.69h184c4.418 0 8 3.582 8 8Z"),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
