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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 80.000 C 212.000 86.627 206.627 92.000 200.000 92.000 L 172.000 92.000 C 171.961 127.330 143.330 155.961 108.000 156.000 L 103.000 156.000 L 168.000 215.120 C 171.233 217.988 172.674 222.372 171.773 226.599 C 170.872 230.825 167.768 234.241 163.646 235.541 C 159.525 236.841 155.023 235.825 151.860 232.880 L 63.860 152.880 C 60.182 149.537 58.945 144.272 60.751 139.641 C 62.556 135.010 67.030 131.971 72.000 132.000 L 108.000 132.000 C 130.091 132.000 148.000 114.091 148.000 92.000 L 72.000 92.000 C 65.373 92.000 60.000 86.627 60.000 80.000 C 60.000 73.373 65.373 68.000 72.000 68.000 L 140.000 68.000 C 132.446 57.928 120.590 52.000 108.000 52.000 L 72.000 52.000 C 65.373 52.000 60.000 46.627 60.000 40.000 C 60.000 33.373 65.373 28.000 72.000 28.000 L 200.000 28.000 C 206.627 28.000 212.000 33.373 212.000 40.000 C 212.000 46.627 206.627 52.000 200.000 52.000 L 157.910 52.000 C 161.804 56.848 164.971 62.238 167.310 68.000 L 200.000 68.000 C 206.627 68.000 212.000 73.373 212.000 80.000 Z"),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
