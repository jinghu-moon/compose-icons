package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorLightIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 96.000 C 206.000 99.314 203.314 102.000 200.000 102.000 L 134.000 102.000 L 134.000 216.000 C 134.000 219.314 131.314 222.000 128.000 222.000 C 124.686 222.000 122.000 219.314 122.000 216.000 L 122.000 102.000 L 56.000 102.000 C 52.686 102.000 50.000 99.314 50.000 96.000 C 50.000 92.686 52.686 90.000 56.000 90.000 L 200.000 90.000 C 203.314 90.000 206.000 92.686 206.000 96.000 ZM 56.000 62.000 L 200.000 62.000 C 203.314 62.000 206.000 59.314 206.000 56.000 C 206.000 52.686 203.314 50.000 200.000 50.000 L 56.000 50.000 C 52.686 50.000 50.000 52.686 50.000 56.000 C 50.000 59.314 52.686 62.000 56.000 62.000 Z"),
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
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null
