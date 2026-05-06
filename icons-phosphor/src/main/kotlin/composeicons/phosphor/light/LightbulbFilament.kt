package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorLightIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 232c0 3.314-2.686 6-6 6h-80c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h80c3.314 0 6 2.686 6 6ZM214 104c.068 26.413-12.067 51.377-32.88 67.64-4.463 3.431-7.091 8.731-7.12 14.36v6c0 7.732-6.268 14-14 14h-64c-7.732 0-14-6.268-14-14v-6c-.006-5.571-2.59-10.826-7-14.23h0C54.253 155.613 42.085 130.816 42 104.52 41.74 57.91 79.39 19.12 125.93 18c23.165-.558 45.575 8.256 62.154 24.445C204.662 58.634 214.007 80.828 214 104ZM202 104c.006-19.94-8.036-39.039-22.303-52.969C165.43 37.101 146.144 29.518 126.21 30 86.17 31 53.78 64.34 54 104.42c.077 22.628 10.548 43.965 28.4 57.87C89.732 167.968 94.017 176.726 94 186v6c0 1.105 .895 2 2 2h26v-47.51L91.76 116.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L128 135.52l27.76-27.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L134 146.49v47.51h26c1.105 0 2-.895 2-2v-6c.025-9.307 4.342-18.081 11.7-23.78C191.621 148.227 202.067 126.736 202 104Z"),
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
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
