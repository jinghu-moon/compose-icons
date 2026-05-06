package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorLightIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 122h-18v-68h10c18.778 0 34 15.222 34 34 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C189.967 62.609 169.391 42.033 144 42h-10v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-10C86.595 42 66 62.595 66 88c0 25.405 20.595 46 46 46h10v68h-18C85.222 202 70 186.778 70 168c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 .033 25.391 20.609 45.967 46 46h18v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h18c25.405 0 46-20.595 46-46 0-25.405-20.595-46-46-46ZM112 122C93.222 122 78 106.778 78 88 78 69.222 93.222 54 112 54h10v68ZM152 202h-18v-68h18c18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34Z"),
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
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
