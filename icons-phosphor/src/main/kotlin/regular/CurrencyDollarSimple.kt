package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorRegularIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 168.000 C 199.972 194.498 178.498 215.972 152.000 216.000 L 136.000 216.000 L 136.000 232.000 C 136.000 236.418 132.418 240.000 128.000 240.000 C 123.582 240.000 120.000 236.418 120.000 232.000 L 120.000 216.000 L 104.000 216.000 C 77.502 215.972 56.028 194.498 56.000 168.000 C 56.000 163.582 59.582 160.000 64.000 160.000 C 68.418 160.000 72.000 163.582 72.000 168.000 C 72.000 185.673 86.327 200.000 104.000 200.000 L 152.000 200.000 C 169.673 200.000 184.000 185.673 184.000 168.000 C 184.000 150.327 169.673 136.000 152.000 136.000 L 112.000 136.000 C 85.490 136.000 64.000 114.510 64.000 88.000 C 64.000 61.490 85.490 40.000 112.000 40.000 L 120.000 40.000 L 120.000 24.000 C 120.000 19.582 123.582 16.000 128.000 16.000 C 132.418 16.000 136.000 19.582 136.000 24.000 L 136.000 40.000 L 144.000 40.000 C 170.498 40.028 191.972 61.502 192.000 88.000 C 192.000 92.418 188.418 96.000 184.000 96.000 C 179.582 96.000 176.000 92.418 176.000 88.000 C 176.000 70.327 161.673 56.000 144.000 56.000 L 112.000 56.000 C 94.327 56.000 80.000 70.327 80.000 88.000 C 80.000 105.673 94.327 120.000 112.000 120.000 L 152.000 120.000 C 178.498 120.028 199.972 141.502 200.000 168.000 Z"),
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
