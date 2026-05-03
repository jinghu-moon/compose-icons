package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorLightIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.770 50.340 C 226.576 45.247 221.546 41.961 216.000 42.000 L 40.000 42.000 C 34.463 42.011 29.452 45.284 27.217 50.350 C 24.983 55.416 25.944 61.324 29.670 65.420 L 29.730 65.490 L 98.000 138.380 L 98.000 216.000 C 98.002 221.163 100.846 225.906 105.399 228.340 C 109.952 230.775 115.475 230.505 119.770 227.640 L 151.770 206.310 C 155.664 203.712 158.001 199.341 158.000 194.660 L 158.000 138.380 L 226.330 65.380 C 230.083 61.308 231.043 55.389 228.770 50.340 ZM 217.510 57.280 L 147.620 131.900 C 146.579 133.012 146.000 134.477 146.000 136.000 L 146.000 194.660 C 146.002 195.331 145.668 195.958 145.110 196.330 L 113.110 217.660 C 112.497 218.069 111.708 218.108 111.058 217.761 C 110.408 217.414 110.001 216.737 110.000 216.000 L 110.000 136.000 C 110.000 134.477 109.421 133.012 108.380 131.900 L 38.530 57.320 C 38.015 56.734 37.888 55.903 38.204 55.190 C 38.519 54.477 39.220 54.013 40.000 54.000 L 216.000 54.000 C 216.800 53.972 217.531 54.448 217.830 55.190 C 218.168 55.885 218.041 56.718 217.510 57.280 Z"),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
