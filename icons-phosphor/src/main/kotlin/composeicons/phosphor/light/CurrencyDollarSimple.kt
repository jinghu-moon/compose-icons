package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorLightIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 168c-.033 25.391-20.609 45.967-46 46h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18C78.609 213.967 58.033 193.391 58 168c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 18.778 15.222 34 34 34h48c18.778 0 34-15.222 34-34 0-18.778-15.222-34-34-34h-40C86.595 134 66 113.405 66 88 66 62.595 86.595 42 112 42h10v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h10c25.391 .033 45.967 20.609 46 46 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C178 69.222 162.778 54 144 54h-32C93.222 54 78 69.222 78 88c0 18.778 15.222 34 34 34h40c25.391 .033 45.967 20.609 46 46Z"),
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
        return _currencyDollarSimple!!
    }

private var _currencyDollarSimple: ImageVector? = null
