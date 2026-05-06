package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorDuotoneIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 56v144c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-144C40 47.163 47.163 40 56 40h144c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M112 72c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM104 176h-24v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM152 176h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM216 192h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM154.34 101.66c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346L184 83.31l18.34 18.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L195.31 72 213.66 53.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L184 60.69 165.66 42.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L172.69 72 154.34 90.34c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66Z"),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
