package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorRegularIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 120c-2.757 .001-5.319 1.422-6.78 3.76-4.176 6.71-8.789 13.137-13.81 19.24L178.32 53.07C177.286 47.547 173.43 42.972 168.163 41.016c-5.267-1.956-11.175-1.005-15.563 2.504l-.13 .1L128 64 103.53 43.62l-.13-.1C99.015 40.011 93.111 39.058 87.844 41.009c-5.267 1.951-9.124 6.521-10.164 12.041L60.59 143C55.567 136.895 50.954 130.464 46.78 123.75 45.316 121.416 42.755 119.999 40 120 17.909 120 0 137.909 0 160c0 22.091 17.909 40 40 40h176c22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM93.41 56l24.47 20.4 .12 .1c5.835 4.71 14.165 4.71 20 0l.12-.1L162.59 56l13.68 72h-96.54ZM40 184C27.551 183.999 17.169 174.48 16.091 162.078c-1.078-12.402 7.506-23.57 19.769-25.718C51.28 159.83 67.73 174.65 82.4 184ZM128 184c-.33 0-25.49-.4-53.86-26.6L76.68 144h102.63l2.54 13.35c-8.131 7.646-17.347 14.049-27.35 19C139.1 183.77 128.06 184 128 184ZM216 184h-42.4c14.67-9.35 31.12-24.17 46.54-47.64 12.262 2.148 20.846 13.316 19.769 25.718C238.831 174.48 228.449 183.999 216 184Z"),
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
