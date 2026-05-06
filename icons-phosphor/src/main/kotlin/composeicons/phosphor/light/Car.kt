package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = phosphorLightIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 106h-12.1L199.59 42.31C197.342 37.257 192.33 34.001 186.8 34h-117.6c-5.53 .001-10.542 3.257-12.79 8.31L28.1 106h-12.1c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v82c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-18h100v18c0 7.732 6.268 14 14 14h24c7.732 0 14-6.268 14-14v-82h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM67.37 47.19c.321-.724 1.038-1.191 1.83-1.19h117.6c.792-.001 1.509 .466 1.83 1.19L214.77 106h-173.54ZM66 200c0 1.105-.895 2-2 2h-24c-1.105 0-2-.895-2-2v-18h28ZM216 202h-24c-1.105 0-2-.895-2-2v-18h28v18c0 1.105-.895 2-2 2ZM218 170h-180v-52h180ZM58 144c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6ZM170 144c0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6Z"),
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
        return _car!!
    }

private var _car: ImageVector? = null
