package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorBoldIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 80c0 6.627-5.373 12-12 12h-28c-.039 35.33-28.67 63.961-64 64h-5l65 59.12c3.233 2.868 4.674 7.252 3.773 11.479-.901 4.226-4.005 7.642-8.126 8.942-4.121 1.3-8.623 .284-11.786-2.661l-88-80c-3.678-3.343-4.915-8.608-3.109-13.239C62.556 135.01 67.03 131.971 72 132h36c22.091 0 40-17.909 40-40h-76C65.373 92 60 86.627 60 80 60 73.373 65.373 68 72 68h68C132.446 57.928 120.59 52 108 52h-36C65.373 52 60 46.627 60 40 60 33.373 65.373 28 72 28h128c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-42.09c3.894 4.848 7.061 10.238 9.4 16h32.69c6.627 0 12 5.373 12 12Z"),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
