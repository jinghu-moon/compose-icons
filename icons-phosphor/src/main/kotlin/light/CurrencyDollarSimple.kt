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
                pathData = parseSvgPathData("M 198.000 168.000 C 197.967 193.391 177.391 213.967 152.000 214.000 L 134.000 214.000 L 134.000 232.000 C 134.000 235.314 131.314 238.000 128.000 238.000 C 124.686 238.000 122.000 235.314 122.000 232.000 L 122.000 214.000 L 104.000 214.000 C 78.609 213.967 58.033 193.391 58.000 168.000 C 58.000 164.686 60.686 162.000 64.000 162.000 C 67.314 162.000 70.000 164.686 70.000 168.000 C 70.000 186.778 85.222 202.000 104.000 202.000 L 152.000 202.000 C 170.778 202.000 186.000 186.778 186.000 168.000 C 186.000 149.222 170.778 134.000 152.000 134.000 L 112.000 134.000 C 86.595 134.000 66.000 113.405 66.000 88.000 C 66.000 62.595 86.595 42.000 112.000 42.000 L 122.000 42.000 L 122.000 24.000 C 122.000 20.686 124.686 18.000 128.000 18.000 C 131.314 18.000 134.000 20.686 134.000 24.000 L 134.000 42.000 L 144.000 42.000 C 169.391 42.033 189.967 62.609 190.000 88.000 C 190.000 91.314 187.314 94.000 184.000 94.000 C 180.686 94.000 178.000 91.314 178.000 88.000 C 178.000 69.222 162.778 54.000 144.000 54.000 L 112.000 54.000 C 93.222 54.000 78.000 69.222 78.000 88.000 C 78.000 106.778 93.222 122.000 112.000 122.000 L 152.000 122.000 C 177.391 122.033 197.967 142.609 198.000 168.000 Z"),
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
