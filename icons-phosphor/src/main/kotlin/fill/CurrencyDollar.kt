package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorFillIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 152.000 C 160.000 160.837 152.837 168.000 144.000 168.000 L 136.000 168.000 L 136.000 136.000 L 144.000 136.000 C 152.837 136.000 160.000 143.163 160.000 152.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 176.000 152.000 C 176.000 134.327 161.673 120.000 144.000 120.000 L 136.000 120.000 L 136.000 88.000 L 140.000 88.000 C 148.837 88.000 156.000 95.163 156.000 104.000 C 156.000 108.418 159.582 112.000 164.000 112.000 C 168.418 112.000 172.000 108.418 172.000 104.000 C 172.000 86.327 157.673 72.000 140.000 72.000 L 136.000 72.000 L 136.000 64.000 C 136.000 59.582 132.418 56.000 128.000 56.000 C 123.582 56.000 120.000 59.582 120.000 64.000 L 120.000 72.000 L 116.000 72.000 C 98.327 72.000 84.000 86.327 84.000 104.000 C 84.000 121.673 98.327 136.000 116.000 136.000 L 120.000 136.000 L 120.000 168.000 L 112.000 168.000 C 103.163 168.000 96.000 160.837 96.000 152.000 C 96.000 147.582 92.418 144.000 88.000 144.000 C 83.582 144.000 80.000 147.582 80.000 152.000 C 80.000 169.673 94.327 184.000 112.000 184.000 L 120.000 184.000 L 120.000 192.000 C 120.000 196.418 123.582 200.000 128.000 200.000 C 132.418 200.000 136.000 196.418 136.000 192.000 L 136.000 184.000 L 144.000 184.000 C 161.673 184.000 176.000 169.673 176.000 152.000 ZM 100.000 104.000 C 100.000 112.837 107.163 120.000 116.000 120.000 L 120.000 120.000 L 120.000 88.000 L 116.000 88.000 C 107.163 88.000 100.000 95.163 100.000 104.000 Z"),
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
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
