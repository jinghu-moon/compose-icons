package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorLightIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 124.686 26.000 122.000 28.686 122.000 32.000 L 122.000 88.000 C 122.000 91.314 124.686 94.000 128.000 94.000 C 143.388 94.002 156.856 104.340 160.837 119.204 C 164.818 134.068 158.320 149.753 144.993 157.446 C 131.666 165.139 114.833 162.922 103.952 152.041 C 93.072 141.159 90.856 124.326 98.550 111.000 C 99.347 109.621 99.562 107.982 99.150 106.444 C 98.737 104.906 97.730 103.595 96.350 102.800 L 47.850 74.800 C 46.471 74.003 44.832 73.788 43.294 74.200 C 41.756 74.613 40.445 75.620 39.650 77.000 C 16.568 116.979 23.215 167.478 55.857 200.122 C 88.499 232.767 138.997 239.418 178.978 216.338 C 218.959 193.259 238.455 146.204 226.512 101.612 C 214.569 57.019 174.164 26.007 128.000 26.000 ZM 47.210 88.290 L 85.500 110.390 C 83.188 115.973 81.999 121.957 82.000 128.000 C 82.007 130.006 82.140 132.010 82.400 134.000 L 39.700 145.450 C 35.888 126.088 38.526 106.010 47.210 88.290 ZM 42.810 157.000 L 85.510 145.560 C 91.819 160.725 105.718 171.390 122.000 173.560 L 122.000 217.760 C 85.781 215.288 54.574 191.344 42.810 157.000 ZM 134.000 217.800 L 134.000 173.600 C 156.882 170.582 173.985 151.075 173.985 127.995 C 173.985 104.915 156.882 85.408 134.000 82.390 L 134.000 38.200 C 181.273 41.357 218.003 80.622 218.003 128.000 C 218.003 175.378 181.273 214.643 134.000 217.800 Z"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
