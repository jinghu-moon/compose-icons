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
                pathData = parseSvgPathData("M190 208c0 3.314-2.686 6-6 6h-128c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h4c16.569 0 30-13.431 30-30v-38h-34c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h34v-38C89.999 64.645 101.168 47.028 118.673 38.773c17.506-8.255 38.204-5.666 53.137 6.647 2.557 2.11 2.92 5.893 .81 8.45-2.11 2.557-5.893 2.92-8.45 .81C152.821 45.325 137.093 43.359 123.791 49.633 110.489 55.906 102.001 69.293 102 84v38h34c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-34v38c.007 11.294-4.547 22.112-12.63 30h94.63c3.314 0 6 2.686 6 6Z"),
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
