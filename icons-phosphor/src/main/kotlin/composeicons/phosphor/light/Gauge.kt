package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorLightIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.65 74.08C185.077 53.465 157.124 41.917 128 42h-.39C67.17 42.21 18 92.06 18 153.13v22.87c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-24c.08-29.256-11.573-57.323-32.35-77.92ZM226 176c0 1.105-.895 2-2 2h-108.22L172.85 99.53c1.863-2.679 1.244-6.356-1.395-8.277-2.639-1.92-6.328-1.38-8.305 1.217L100.94 178h-68.94c-1.105 0-2-.895-2-2v-22.87c.004-3.719 .211-7.434 .62-11.13h25.38c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-23.29C42.6 88.4 78.53 56.86 122 54.19v25.81c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-25.81c43.337 2.66 79.763 33.505 89.53 75.81h-23.53c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h25.5c.33 3.3 .5 6.64 .5 10Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
