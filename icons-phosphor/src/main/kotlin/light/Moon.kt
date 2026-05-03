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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.130 143.640 C 230.559 142.072 228.252 141.499 226.130 142.150 C 194.344 151.757 159.850 143.096 136.373 119.613 C 112.896 96.129 104.244 61.633 113.860 29.850 C 114.502 27.730 113.925 25.429 112.358 23.864 C 110.791 22.299 108.489 21.725 106.370 22.370 C 85.686 28.716 67.528 41.421 54.480 58.680 C 23.898 99.289 27.887 156.219 63.834 192.166 C 99.781 228.113 156.711 232.102 197.320 201.520 C 214.579 188.472 227.284 170.314 233.630 149.630 C 234.275 147.510 233.698 145.206 232.130 143.640 ZM 190.130 191.930 C 154.299 218.803 104.161 215.240 72.490 183.570 C 40.820 151.899 37.257 101.761 64.130 65.930 C 73.389 53.654 85.610 43.928 99.650 37.660 C 93.650 70.617 104.205 104.421 127.892 128.108 C 151.579 151.795 185.383 162.350 218.340 156.350 C 212.089 170.409 202.373 182.651 190.100 191.930 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _moon!!
    }

private var _moon: ImageVector? = null
