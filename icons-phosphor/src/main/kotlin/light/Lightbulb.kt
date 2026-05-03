package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorLightIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.000 232.000 C 174.000 235.314 171.314 238.000 168.000 238.000 L 88.000 238.000 C 84.686 238.000 82.000 235.314 82.000 232.000 C 82.000 228.686 84.686 226.000 88.000 226.000 L 168.000 226.000 C 171.314 226.000 174.000 228.686 174.000 232.000 ZM 214.000 104.000 C 214.068 130.413 201.933 155.377 181.120 171.640 C 176.657 175.071 174.029 180.371 174.000 186.000 L 174.000 192.000 C 174.000 199.732 167.732 206.000 160.000 206.000 L 96.000 206.000 C 88.268 206.000 82.000 199.732 82.000 192.000 L 82.000 186.000 C 81.994 180.429 79.410 175.174 75.000 171.770 L 75.000 171.770 C 54.256 155.615 42.088 130.822 42.000 104.530 C 41.740 57.910 79.390 19.120 125.930 18.000 C 149.095 17.442 171.505 26.256 188.084 42.445 C 204.662 58.634 214.007 80.828 214.000 104.000 ZM 202.000 104.000 C 202.006 84.060 193.964 64.961 179.697 51.031 C 165.430 37.101 146.144 29.518 126.210 30.000 C 86.170 31.000 53.780 64.340 54.000 104.420 C 54.077 127.048 64.548 148.385 82.400 162.290 C 89.732 167.968 94.017 176.726 94.000 186.000 L 94.000 192.000 C 94.000 193.105 94.895 194.000 96.000 194.000 L 160.000 194.000 C 161.105 194.000 162.000 193.105 162.000 192.000 L 162.000 186.000 C 162.025 176.693 166.342 167.919 173.700 162.220 C 191.621 148.227 202.067 126.736 202.000 104.000 ZM 181.920 95.000 C 177.822 72.102 159.898 54.178 137.000 50.080 C 133.730 49.528 130.632 51.730 130.080 55.000 C 129.528 58.270 131.730 61.368 135.000 61.920 C 152.380 64.840 167.130 79.600 170.080 97.000 C 170.568 99.885 173.064 101.997 175.990 102.000 C 176.325 101.998 176.659 101.971 176.990 101.920 C 178.562 101.658 179.966 100.781 180.891 99.483 C 181.816 98.185 182.186 96.572 181.920 95.000 Z"),
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
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
