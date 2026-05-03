package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorLightIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.340 45.660 C 194.000 29.350 170.000 22.870 142.790 27.420 C 116.280 31.830 89.710 46.240 68.000 68.000 C 46.290 89.760 31.860 116.300 27.440 142.810 C 22.870 170.000 29.350 194.000 45.660 210.340 C 58.570 223.250 76.290 230.000 96.640 230.000 C 102.193 229.984 107.734 229.512 113.210 228.590 C 139.720 224.170 166.290 209.760 188.030 188.030 C 209.770 166.300 224.170 139.720 228.590 113.210 C 233.130 86.000 226.650 62.000 210.340 45.660 ZM 76.460 76.460 C 101.520 51.400 132.460 38.000 159.180 38.000 C 171.760 38.000 183.400 41.000 193.050 47.120 C 180.481 50.958 168.718 57.058 158.340 65.120 C 139.520 79.980 127.340 100.740 122.120 126.830 C 112.000 177.350 75.180 194.000 52.000 199.500 C 26.300 170.420 36.830 116.090 76.460 76.460 ZM 179.540 179.540 C 142.680 216.400 93.100 228.100 63.000 208.910 C 75.569 205.072 87.332 198.972 97.710 190.910 C 116.530 176.050 128.710 155.290 133.930 129.200 C 144.000 78.650 180.820 62.000 204.050 56.500 C 229.700 85.590 219.170 139.910 179.540 179.540 Z"),
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
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
