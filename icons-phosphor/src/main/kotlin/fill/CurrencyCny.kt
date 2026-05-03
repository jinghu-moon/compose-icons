package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorFillIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 16.000 C 70.562 16.000 24.000 62.562 24.000 120.000 C 24.000 177.438 70.562 224.000 128.000 224.000 C 185.438 224.000 232.000 177.438 232.000 120.000 C 231.939 62.588 185.412 16.061 128.000 16.000 ZM 88.000 72.000 L 168.000 72.000 C 172.418 72.000 176.000 75.582 176.000 80.000 C 176.000 84.418 172.418 88.000 168.000 88.000 L 88.000 88.000 C 83.582 88.000 80.000 84.418 80.000 80.000 C 80.000 75.582 83.582 72.000 88.000 72.000 ZM 192.000 160.000 C 192.000 164.418 188.418 168.000 184.000 168.000 L 160.000 168.000 C 146.745 168.000 136.000 157.255 136.000 144.000 L 136.000 120.000 L 120.000 120.000 C 119.972 146.498 98.498 167.972 72.000 168.000 C 67.582 168.000 64.000 164.418 64.000 160.000 C 64.000 155.582 67.582 152.000 72.000 152.000 C 89.673 152.000 104.000 137.673 104.000 120.000 L 80.000 120.000 C 75.582 120.000 72.000 116.418 72.000 112.000 C 72.000 107.582 75.582 104.000 80.000 104.000 L 176.000 104.000 C 180.418 104.000 184.000 107.582 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 L 152.000 120.000 L 152.000 144.000 C 152.000 148.418 155.582 152.000 160.000 152.000 L 176.000 152.000 L 176.000 144.000 C 176.000 139.582 179.582 136.000 184.000 136.000 C 188.418 136.000 192.000 139.582 192.000 144.000 Z"),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
