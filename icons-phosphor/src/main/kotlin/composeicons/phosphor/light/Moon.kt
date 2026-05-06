package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorLightIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.13 143.64c-1.571-1.568-3.878-2.141-6-1.49-31.786 9.607-66.28 .946-89.757-22.537C112.896 96.129 104.244 61.633 113.86 29.85c.642-2.12 .065-4.421-1.502-5.986-1.567-1.565-3.869-2.139-5.988-1.494C85.686 28.716 67.528 41.421 54.48 58.68 23.898 99.289 27.887 156.219 63.834 192.166c35.947 35.947 92.877 39.936 133.486 9.354 17.259-13.048 29.964-31.206 36.31-51.89 .645-2.12 .068-4.424-1.5-5.99ZM190.13 191.93c-35.831 26.873-85.969 23.31-117.64-8.36C40.82 151.899 37.257 101.761 64.13 65.93 73.389 53.654 85.61 43.928 99.65 37.66c-6 32.957 4.555 66.761 28.242 90.448 23.687 23.687 57.491 34.242 90.448 28.242-6.251 14.059-15.967 26.301-28.24 35.58Z"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
