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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 122.000 L 134.000 122.000 L 134.000 54.000 L 144.000 54.000 C 162.778 54.000 178.000 69.222 178.000 88.000 C 178.000 91.314 180.686 94.000 184.000 94.000 C 187.314 94.000 190.000 91.314 190.000 88.000 C 189.967 62.609 169.391 42.033 144.000 42.000 L 134.000 42.000 L 134.000 24.000 C 134.000 20.686 131.314 18.000 128.000 18.000 C 124.686 18.000 122.000 20.686 122.000 24.000 L 122.000 42.000 L 112.000 42.000 C 86.595 42.000 66.000 62.595 66.000 88.000 C 66.000 113.405 86.595 134.000 112.000 134.000 L 122.000 134.000 L 122.000 202.000 L 104.000 202.000 C 85.222 202.000 70.000 186.778 70.000 168.000 C 70.000 164.686 67.314 162.000 64.000 162.000 C 60.686 162.000 58.000 164.686 58.000 168.000 C 58.033 193.391 78.609 213.967 104.000 214.000 L 122.000 214.000 L 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 L 134.000 214.000 L 152.000 214.000 C 177.405 214.000 198.000 193.405 198.000 168.000 C 198.000 142.595 177.405 122.000 152.000 122.000 ZM 112.000 122.000 C 93.222 122.000 78.000 106.778 78.000 88.000 C 78.000 69.222 93.222 54.000 112.000 54.000 L 122.000 54.000 L 122.000 122.000 ZM 152.000 202.000 L 134.000 202.000 L 134.000 134.000 L 152.000 134.000 C 170.778 134.000 186.000 149.222 186.000 168.000 C 186.000 186.778 170.778 202.000 152.000 202.000 Z"),
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
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
