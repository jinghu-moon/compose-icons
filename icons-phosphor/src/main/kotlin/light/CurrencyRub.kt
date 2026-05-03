package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorLightIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 148.000 150.000 C 180.033 150.000 206.000 124.033 206.000 92.000 C 206.000 59.967 180.033 34.000 148.000 34.000 L 88.000 34.000 C 84.686 34.000 82.000 36.686 82.000 40.000 L 82.000 138.000 L 56.000 138.000 C 52.686 138.000 50.000 140.686 50.000 144.000 C 50.000 147.314 52.686 150.000 56.000 150.000 L 82.000 150.000 L 82.000 170.000 L 56.000 170.000 C 52.686 170.000 50.000 172.686 50.000 176.000 C 50.000 179.314 52.686 182.000 56.000 182.000 L 82.000 182.000 L 82.000 216.000 C 82.000 219.314 84.686 222.000 88.000 222.000 C 91.314 222.000 94.000 219.314 94.000 216.000 L 94.000 182.000 L 144.000 182.000 C 147.314 182.000 150.000 179.314 150.000 176.000 C 150.000 172.686 147.314 170.000 144.000 170.000 L 94.000 170.000 L 94.000 150.000 ZM 94.000 46.000 L 148.000 46.000 C 173.405 46.000 194.000 66.595 194.000 92.000 C 194.000 117.405 173.405 138.000 148.000 138.000 L 94.000 138.000 Z"),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
