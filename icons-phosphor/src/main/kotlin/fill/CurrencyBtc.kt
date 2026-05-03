package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorFillIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 152.000 C 176.000 160.837 168.837 168.000 160.000 168.000 L 112.000 168.000 L 112.000 136.000 L 160.000 136.000 C 168.837 136.000 176.000 143.163 176.000 152.000 ZM 240.000 128.000 C 240.000 185.438 193.438 232.000 136.000 232.000 C 78.562 232.000 32.000 185.438 32.000 128.000 C 32.000 70.562 78.562 24.000 136.000 24.000 C 193.412 24.061 239.939 70.588 240.000 128.000 ZM 192.000 152.000 C 191.999 140.772 186.113 130.366 176.490 124.580 C 183.566 116.167 185.827 104.710 182.480 94.239 C 179.132 83.768 170.644 75.749 160.000 73.000 L 160.000 64.000 C 160.000 59.582 156.418 56.000 152.000 56.000 C 147.582 56.000 144.000 59.582 144.000 64.000 L 144.000 72.000 L 128.000 72.000 L 128.000 64.000 C 128.000 59.582 124.418 56.000 120.000 56.000 C 115.582 56.000 112.000 59.582 112.000 64.000 L 112.000 72.000 L 96.000 72.000 C 91.582 72.000 88.000 75.582 88.000 80.000 C 88.000 84.418 91.582 88.000 96.000 88.000 L 96.000 168.000 C 91.582 168.000 88.000 171.582 88.000 176.000 C 88.000 180.418 91.582 184.000 96.000 184.000 L 112.000 184.000 L 112.000 192.000 C 112.000 196.418 115.582 200.000 120.000 200.000 C 124.418 200.000 128.000 196.418 128.000 192.000 L 128.000 184.000 L 144.000 184.000 L 144.000 192.000 C 144.000 196.418 147.582 200.000 152.000 200.000 C 156.418 200.000 160.000 196.418 160.000 192.000 L 160.000 184.000 C 177.673 184.000 192.000 169.673 192.000 152.000 ZM 168.000 104.000 C 168.000 95.163 160.837 88.000 152.000 88.000 L 112.000 88.000 L 112.000 120.000 L 152.000 120.000 C 160.837 120.000 168.000 112.837 168.000 104.000 Z"),
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
