package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorLightIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.82 147.6 174 51.67l-.09-.15C164.058 35.66 146.711 26.015 128.04 26.015c-18.671 0-36.018 9.645-45.87 25.505l-.09 .15L26.18 147.6c-10.298 16.654-10.774 37.578-1.244 54.683 9.53 17.105 27.573 27.711 47.154 27.717h111.82c19.581-.007 37.624-10.613 47.154-27.717 9.53-17.105 9.054-38.029-1.244-54.683ZM162 218h-68v-50c0-1.105 .895-2 2-2h64c1.105 0 2 .895 2 2ZM220.61 196.42c-7.326 13.403-21.426 21.694-36.7 21.58h-9.91v-50c0-7.732-6.268-14-14-14h-64c-7.732 0-14 6.268-14 14v50h-9.91C56.848 217.995 42.805 209.732 35.397 196.411c-7.407-13.321-7.016-29.61 1.023-42.561l.08-.14L92.37 57.78C100.042 45.487 113.509 38.017 128 38.017c14.491 0 27.958 7.47 35.63 19.763l55.87 95.93 .08 .14c8.153 12.919 8.545 29.275 1.02 42.57Z"),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
