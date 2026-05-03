package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorLightIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 126.790 C 234.340 84.831 207.130 48.608 167.852 33.404 C 128.574 18.199 84.067 26.661 53.110 55.220 C 32.849 73.826 20.333 99.377 18.050 126.790 C 17.711 130.699 19.028 134.571 21.680 137.463 C 24.332 140.355 28.076 142.001 32.000 142.000 L 122.000 142.000 L 122.000 200.000 C 122.000 216.569 135.431 230.000 152.000 230.000 C 168.569 230.000 182.000 216.569 182.000 200.000 C 182.000 196.686 179.314 194.000 176.000 194.000 C 172.686 194.000 170.000 196.686 170.000 200.000 C 170.000 209.941 161.941 218.000 152.000 218.000 C 142.059 218.000 134.000 209.941 134.000 200.000 L 134.000 142.000 L 224.000 142.000 C 227.933 142.015 231.690 140.375 234.353 137.481 C 237.016 134.588 238.340 130.708 238.000 126.790 ZM 225.510 129.350 C 225.123 129.773 224.573 130.010 224.000 130.000 L 32.000 130.000 C 31.434 130.004 30.892 129.768 30.510 129.350 C 30.117 128.930 29.924 128.362 29.980 127.790 C 33.266 90.408 57.522 58.146 92.521 44.608 C 127.521 31.069 167.173 38.610 194.760 64.050 C 212.812 80.617 223.966 103.373 226.000 127.790 C 226.053 128.363 225.856 128.932 225.460 129.350 Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
