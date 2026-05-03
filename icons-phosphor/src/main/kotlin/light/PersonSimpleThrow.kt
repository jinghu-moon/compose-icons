package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorLightIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 86.000 C 144.569 86.000 158.000 72.569 158.000 56.000 C 158.000 39.431 144.569 26.000 128.000 26.000 C 111.431 26.000 98.000 39.431 98.000 56.000 C 98.000 72.569 111.431 86.000 128.000 86.000 ZM 128.000 38.000 C 137.941 38.000 146.000 46.059 146.000 56.000 C 146.000 65.941 137.941 74.000 128.000 74.000 C 118.059 74.000 110.000 65.941 110.000 56.000 C 110.000 46.059 118.059 38.000 128.000 38.000 ZM 50.000 96.000 C 50.000 88.268 56.268 82.000 64.000 82.000 C 71.732 82.000 78.000 88.268 78.000 96.000 C 78.000 103.732 71.732 110.000 64.000 110.000 C 56.268 110.000 50.000 103.732 50.000 96.000 ZM 220.680 109.350 C 218.630 111.943 214.870 112.390 212.270 110.350 C 211.100 109.430 187.210 91.440 149.750 111.290 C 149.494 122.150 148.414 132.974 146.520 143.670 L 179.840 171.440 C 181.738 173.022 182.473 175.606 181.690 177.950 L 165.690 225.950 C 164.594 229.029 161.236 230.664 158.137 229.629 C 155.037 228.594 153.336 225.269 154.310 222.150 L 169.000 178.000 L 143.510 156.750 C 141.923 162.559 139.966 168.261 137.650 173.820 C 124.150 206.000 100.000 227.480 65.730 237.750 C 65.168 237.915 64.586 238.000 64.000 238.000 C 61.020 238.003 58.489 235.818 58.057 232.869 C 57.625 229.920 59.424 227.101 62.280 226.250 C 127.100 206.800 135.700 147.490 137.390 118.840 C 109.000 137.650 86.800 142.000 72.390 142.000 C 60.680 142.000 54.100 139.140 53.510 138.870 C 50.495 137.489 49.169 133.925 50.550 130.910 C 51.931 127.895 55.495 126.569 58.510 127.950 C 58.720 128.040 86.110 139.230 132.650 107.600 C 159.090 89.600 181.150 88.600 195.010 90.930 C 210.380 93.500 219.400 100.630 219.770 100.930 C 222.340 103.007 222.747 106.772 220.680 109.350 Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
