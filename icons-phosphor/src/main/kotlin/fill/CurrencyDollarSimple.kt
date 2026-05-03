package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorFillIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 144.000 184.000 L 136.000 184.000 L 136.000 192.000 C 136.000 196.418 132.418 200.000 128.000 200.000 C 123.582 200.000 120.000 196.418 120.000 192.000 L 120.000 184.000 L 112.000 184.000 C 94.327 184.000 80.000 169.673 80.000 152.000 C 80.000 147.582 83.582 144.000 88.000 144.000 C 92.418 144.000 96.000 147.582 96.000 152.000 C 96.000 160.837 103.163 168.000 112.000 168.000 L 144.000 168.000 C 152.837 168.000 160.000 160.837 160.000 152.000 C 160.000 143.163 152.837 136.000 144.000 136.000 L 116.000 136.000 C 98.327 136.000 84.000 121.673 84.000 104.000 C 84.000 86.327 98.327 72.000 116.000 72.000 L 120.000 72.000 L 120.000 64.000 C 120.000 59.582 123.582 56.000 128.000 56.000 C 132.418 56.000 136.000 59.582 136.000 64.000 L 136.000 72.000 L 140.000 72.000 C 157.673 72.000 172.000 86.327 172.000 104.000 C 172.000 108.418 168.418 112.000 164.000 112.000 C 159.582 112.000 156.000 108.418 156.000 104.000 C 156.000 95.163 148.837 88.000 140.000 88.000 L 116.000 88.000 C 107.163 88.000 100.000 95.163 100.000 104.000 C 100.000 112.837 107.163 120.000 116.000 120.000 L 144.000 120.000 C 161.673 120.000 176.000 134.327 176.000 152.000 C 176.000 169.673 161.673 184.000 144.000 184.000 Z"),
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
        return _currencyDollarSimple!!
    }

private var _currencyDollarSimple: ImageVector? = null
