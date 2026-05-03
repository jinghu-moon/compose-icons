package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorLightIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.690 116.410 C 188.081 105.372 193.304 87.236 187.836 70.766 C 182.367 54.297 167.333 42.887 150.000 42.050 L 150.000 24.000 C 150.000 20.686 147.314 18.000 144.000 18.000 C 140.686 18.000 138.000 20.686 138.000 24.000 L 138.000 42.000 L 118.000 42.000 L 118.000 24.000 C 118.000 20.686 115.314 18.000 112.000 18.000 C 108.686 18.000 106.000 20.686 106.000 24.000 L 106.000 42.000 L 72.000 42.000 C 68.686 42.000 66.000 44.686 66.000 48.000 C 66.000 51.314 68.686 54.000 72.000 54.000 L 82.000 54.000 L 82.000 194.000 L 72.000 194.000 C 68.686 194.000 66.000 196.686 66.000 200.000 C 66.000 203.314 68.686 206.000 72.000 206.000 L 106.000 206.000 L 106.000 224.000 C 106.000 227.314 108.686 230.000 112.000 230.000 C 115.314 230.000 118.000 227.314 118.000 224.000 L 118.000 206.000 L 138.000 206.000 L 138.000 224.000 C 138.000 227.314 140.686 230.000 144.000 230.000 C 147.314 230.000 150.000 227.314 150.000 224.000 L 150.000 206.000 L 160.000 206.000 C 182.531 205.998 201.744 189.677 205.390 167.443 C 209.036 145.209 196.040 123.607 174.690 116.410 ZM 178.000 84.000 C 178.000 100.569 164.569 114.000 148.000 114.000 L 94.000 114.000 L 94.000 54.000 L 148.000 54.000 C 164.569 54.000 178.000 67.431 178.000 84.000 ZM 160.000 194.000 L 94.000 194.000 L 94.000 126.000 L 160.000 126.000 C 178.778 126.000 194.000 141.222 194.000 160.000 C 194.000 178.778 178.778 194.000 160.000 194.000 Z"),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
