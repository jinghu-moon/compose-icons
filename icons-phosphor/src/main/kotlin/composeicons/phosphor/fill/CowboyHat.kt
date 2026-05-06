package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorFillIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 120c-2.757 .001-5.319 1.422-6.78 3.76-4.176 6.71-8.789 13.137-13.81 19.24l-1.63-8.57h0L178.32 53.07C177.286 47.547 173.43 42.972 168.163 41.016c-5.267-1.956-11.175-1.005-15.563 2.504l-.13 .1L128 64 103.53 43.62l-.13-.1C99.015 40.011 93.111 39.058 87.844 41.009c-5.267 1.951-9.124 6.521-10.164 12.041L62.23 134.38h0L60.59 143C55.567 136.895 50.954 130.464 46.78 123.75 45.316 121.416 42.755 119.999 40 120 17.909 120 0 137.909 0 160c0 22.091 17.909 40 40 40h176c22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM76.68 144h102.63l2.54 13.35c-8.131 7.646-17.347 14.049-27.35 19C139.1 183.77 128.06 184 128 184c-.33 0-25.49-.4-53.86-26.6Z"),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
