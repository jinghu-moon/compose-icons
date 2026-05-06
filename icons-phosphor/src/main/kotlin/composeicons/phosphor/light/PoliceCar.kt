package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PoliceCar: ImageVector
    get() {
        if (_policeCar != null) return _policeCar!!
        _policeCar = phosphorLightIcon(
            name = "PoliceCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 106h-12.52l-28-48.95c-2.505-4.34-7.139-7.009-12.15-7h-118.69c-5.011-.009-9.645 2.66-12.15 7L28.49 106.05h-12.49c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v82c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-18.05h100v18c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-82h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM66.91 63c.357-.618 1.016-.999 1.73-1h118.72c.714 .001 1.373 .382 1.73 1l24.57 43h-171.32ZM66 200c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-18h28ZM216 202h-24c-1.105 0-2-.895-2-2v-18h28v18c0 1.105-.895 2-2 2ZM218 170h-180v-52h180ZM58 144c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM170 144c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM98 24c0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6Z"),
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
        return _policeCar!!
    }

private var _policeCar: ImageVector? = null
