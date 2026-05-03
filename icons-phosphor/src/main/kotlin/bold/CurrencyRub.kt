package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorBoldIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 156.000 C 183.346 156.000 212.000 127.346 212.000 92.000 C 212.000 56.654 183.346 28.000 148.000 28.000 L 88.000 28.000 C 81.373 28.000 76.000 33.373 76.000 40.000 L 76.000 132.000 L 56.000 132.000 C 49.373 132.000 44.000 137.373 44.000 144.000 C 44.000 150.627 49.373 156.000 56.000 156.000 L 76.000 156.000 L 76.000 172.000 L 56.000 172.000 C 49.373 172.000 44.000 177.373 44.000 184.000 C 44.000 190.627 49.373 196.000 56.000 196.000 L 76.000 196.000 L 76.000 216.000 C 76.000 222.627 81.373 228.000 88.000 228.000 C 94.627 228.000 100.000 222.627 100.000 216.000 L 100.000 196.000 L 144.000 196.000 C 150.627 196.000 156.000 190.627 156.000 184.000 C 156.000 177.373 150.627 172.000 144.000 172.000 L 100.000 172.000 L 100.000 156.000 ZM 100.000 52.000 L 148.000 52.000 C 170.091 52.000 188.000 69.909 188.000 92.000 C 188.000 114.091 170.091 132.000 148.000 132.000 L 100.000 132.000 Z"),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
