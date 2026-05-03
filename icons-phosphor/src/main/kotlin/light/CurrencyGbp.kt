package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorLightIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 190.000 208.000 C 190.000 211.314 187.314 214.000 184.000 214.000 L 56.000 214.000 C 52.686 214.000 50.000 211.314 50.000 208.000 C 50.000 204.686 52.686 202.000 56.000 202.000 L 60.000 202.000 C 76.569 202.000 90.000 188.569 90.000 172.000 L 90.000 134.000 L 56.000 134.000 C 52.686 134.000 50.000 131.314 50.000 128.000 C 50.000 124.686 52.686 122.000 56.000 122.000 L 90.000 122.000 L 90.000 84.000 C 89.999 64.645 101.168 47.028 118.673 38.773 C 136.179 30.517 156.877 33.106 171.810 45.420 C 174.367 47.530 174.730 51.313 172.620 53.870 C 170.510 56.427 166.727 56.790 164.170 54.680 C 152.821 45.325 137.093 43.359 123.791 49.633 C 110.489 55.906 102.001 69.293 102.000 84.000 L 102.000 122.000 L 136.000 122.000 C 139.314 122.000 142.000 124.686 142.000 128.000 C 142.000 131.314 139.314 134.000 136.000 134.000 L 102.000 134.000 L 102.000 172.000 C 102.007 183.294 97.453 194.112 89.370 202.000 L 184.000 202.000 C 187.314 202.000 190.000 204.686 190.000 208.000 Z"),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
