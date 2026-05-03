package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorLightIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 179.840 51.390 C 164.636 38.792 148.160 27.812 130.680 18.630 C 128.993 17.788 127.007 17.788 125.320 18.630 C 107.840 27.812 91.364 38.792 76.160 51.390 C 42.880 79.130 26.000 107.590 26.000 136.000 C 25.999 154.146 35.112 171.079 50.258 181.074 C 65.404 191.068 84.557 192.787 101.240 185.650 L 90.240 222.280 C 89.696 224.098 90.044 226.067 91.179 227.588 C 92.314 229.109 94.102 230.004 96.000 230.000 L 160.000 230.000 C 161.896 230.001 163.681 229.105 164.814 227.584 C 165.946 226.063 166.294 224.097 165.750 222.280 L 154.750 185.650 C 171.434 192.792 190.591 191.075 205.739 181.080 C 220.888 171.085 230.002 154.149 230.000 136.000 C 230.000 107.590 213.120 79.130 179.840 51.390 ZM 176.000 178.000 C 165.853 178.001 156.049 174.328 148.400 167.660 C 146.386 165.906 143.456 165.695 141.211 167.140 C 138.966 168.586 137.947 171.341 138.710 173.900 L 151.940 218.000 L 104.060 218.000 L 117.290 173.900 C 118.053 171.341 117.034 168.586 114.789 167.140 C 112.544 165.695 109.614 165.906 107.600 167.660 C 95.188 178.481 77.598 181.050 62.610 174.232 C 47.621 167.414 37.999 152.466 38.000 136.000 C 38.000 82.270 112.770 39.000 128.000 30.780 C 143.240 39.000 218.000 82.200 218.000 136.000 C 218.000 159.196 199.196 178.000 176.000 178.000 Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
