package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorLightIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 58.000 56.000 C 58.000 52.686 60.686 50.000 64.000 50.000 L 192.000 50.000 C 195.314 50.000 198.000 52.686 198.000 56.000 C 198.000 59.314 195.314 62.000 192.000 62.000 L 64.000 62.000 C 60.686 62.000 58.000 59.314 58.000 56.000 ZM 216.000 162.000 C 212.686 162.000 210.000 164.686 210.000 168.000 L 210.000 186.000 L 176.000 186.000 C 166.059 186.000 158.000 177.941 158.000 168.000 L 158.000 118.000 L 208.000 118.000 C 211.314 118.000 214.000 115.314 214.000 112.000 C 214.000 108.686 211.314 106.000 208.000 106.000 L 48.000 106.000 C 44.686 106.000 42.000 108.686 42.000 112.000 C 42.000 115.314 44.686 118.000 48.000 118.000 L 98.000 118.000 L 98.000 128.000 C 97.961 160.017 72.017 185.961 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 C 78.642 197.956 109.956 166.642 110.000 128.000 L 110.000 118.000 L 146.000 118.000 L 146.000 168.000 C 146.000 184.569 159.431 198.000 176.000 198.000 L 216.000 198.000 C 219.314 198.000 222.000 195.314 222.000 192.000 L 222.000 168.000 C 222.000 164.686 219.314 162.000 216.000 162.000 Z"),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
