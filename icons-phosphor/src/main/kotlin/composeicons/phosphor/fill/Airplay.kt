package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorFillIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174.15 210.88c1.987 2.385 2.414 5.705 1.097 8.515-1.318 2.811-4.142 4.606-7.247 4.605h-80c-3.104 .001-5.929-1.794-7.247-4.605-1.318-2.811-.89-6.13 1.097-8.515l40-48c1.52-1.823 3.771-2.878 6.145-2.878 2.374 0 4.625 1.054 6.145 2.878ZM208 40h-160C34.745 40 24 50.745 24 64v112c0 13.255 10.745 24 24 24h20.22c1.186-.001 2.311-.529 3.07-1.44l38.28-45.92c5.136-6.171 13.017-9.364 21-8.51 6.373 .754 12.202 3.961 16.25 8.94l37.91 45.49c.759 .911 1.884 1.439 3.07 1.44h20.2c13.255 0 24-10.745 24-24v-112C232 50.745 221.255 40 208 40Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
