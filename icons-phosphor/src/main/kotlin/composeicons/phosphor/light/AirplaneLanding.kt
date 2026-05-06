package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorLightIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M254 216c0 3.314-2.686 6-6 6h-144c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h144c3.314 0 6 2.686 6 6ZM230.38 189.78 53.75 140.32C37.367 135.682 26.044 120.746 26 103.72v-55.72c-.003-4.502 2.16-8.731 5.811-11.365 3.652-2.633 8.348-3.35 12.619-1.925l5.47 1.83c1.739 .581 3.116 1.926 3.74 3.65l11 30.33L98 80v-32c-.003-4.502 2.16-8.731 5.811-11.365 3.652-2.633 8.348-3.35 12.619-1.925l5.47 1.83c1.639 .548 2.962 1.776 3.63 3.37l22.88 54.53 61.77 17.27c16.424 4.599 27.789 19.554 27.82 36.61v35.68c.001 1.878-.878 3.648-2.374 4.783-1.496 1.135-3.438 1.504-5.246 .997ZM226 148.32c-.042-11.641-7.795-21.843-19-25l-64.58-18c-1.763-.496-3.203-1.77-3.91-3.46L115.51 47.16l-2.89-1c-.599-.196-1.255-.098-1.77 .264-.516 .362-.83 .946-.85 1.576v40c-0 1.881-.883 3.653-2.384 4.786-1.501 1.134-3.447 1.498-5.256 .984l-44-12.54c-1.855-.528-3.344-1.916-4-3.73L43.34 47l-2.71-.9C40.427 46.032 40.214 45.998 40 46c-.417 .003-.822 .136-1.16 .38-.524 .373-.837 .976-.84 1.62v55.72c.048 11.638 7.799 21.837 19 25l169 47.33Z"),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
