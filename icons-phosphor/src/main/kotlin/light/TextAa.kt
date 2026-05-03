package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorLightIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 85.430 53.450 C 84.441 51.346 82.325 50.002 80.000 50.002 C 77.675 50.002 75.559 51.346 74.570 53.450 L 10.570 189.450 C 9.159 192.449 10.446 196.024 13.445 197.435 C 16.444 198.846 20.019 197.559 21.430 194.560 L 38.630 158.000 L 121.370 158.000 L 138.570 194.550 C 139.981 197.549 143.556 198.836 146.555 197.425 C 149.554 196.014 150.841 192.439 149.430 189.440 ZM 44.280 146.000 L 80.000 70.090 L 115.720 146.000 ZM 200.000 98.000 C 187.790 98.000 178.290 101.280 171.770 107.740 C 169.417 110.076 169.404 113.877 171.740 116.230 C 174.076 118.583 177.877 118.596 180.230 116.260 C 184.410 112.110 191.070 110.000 200.000 110.000 C 214.340 110.000 226.000 119.870 226.000 132.000 L 226.000 139.240 C 218.688 133.201 209.483 129.930 200.000 130.000 C 179.050 130.000 162.000 145.250 162.000 164.000 C 162.000 182.750 179.050 198.000 200.000 198.000 C 209.483 198.070 218.688 194.799 226.000 188.760 L 226.000 192.000 C 226.000 195.314 228.686 198.000 232.000 198.000 C 235.314 198.000 238.000 195.314 238.000 192.000 L 238.000 132.000 C 238.000 113.250 221.000 98.000 200.000 98.000 ZM 200.000 186.000 C 185.660 186.000 174.000 176.130 174.000 164.000 C 174.000 151.870 185.660 142.000 200.000 142.000 C 214.340 142.000 226.000 151.870 226.000 164.000 C 226.000 176.130 214.340 186.000 200.000 186.000 Z"),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
