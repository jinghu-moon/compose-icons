package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorDuotoneIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 48v63.1c0 39.7-31.75 72.6-71.45 72.9-19.191 .147-37.646-7.374-51.268-20.893C63.661 149.589 55.999 131.191 56 112v-64Z"),
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
                pathData = parseSvgPathData("M232 64h-24v-16c0-4.418-3.582-8-8-8h-144c-4.418 0-8 3.582-8 8v16h-24C15.163 64 8 71.163 8 80v16c0 22.091 17.909 40 40 40h3.65c9.632 30.524 36.505 52.388 68.35 55.61v24.39h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-24.42c31.94-3.23 58.44-25.64 68.08-55.58h3.92c22.091 0 40-17.909 40-40v-16c0-8.837-7.163-16-16-16ZM48 120C34.745 120 24 109.255 24 96v-16h24v32q0 4 .39 8ZM192 111.1c0 35.52-29 64.64-64 64.9C92.654 176 64 147.346 64 112v-56h128ZM232 96c0 13.255-10.745 24-24 24h-.5c.328-2.955 .495-5.926 .5-8.9v-31.1h24Z"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
