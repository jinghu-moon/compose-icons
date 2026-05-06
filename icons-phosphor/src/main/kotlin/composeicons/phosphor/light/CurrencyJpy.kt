package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorLightIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.64 51.8l-64 78.2h35.36c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-42v20h42c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-42v42c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-42h-42c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h42v-20h-42c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h35.34L51.34 51.8C49.907 50.15 49.484 47.852 50.236 45.8c.752-2.052 2.56-3.532 4.72-3.865 2.16-.333 4.33 .535 5.664 2.265L128 126.53 195.36 44.2c2.129-2.45 5.82-2.764 8.331-.707 2.511 2.057 2.932 5.737 .949 8.307Z"),
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
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null
