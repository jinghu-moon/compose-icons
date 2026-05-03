package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorFillIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 104.000 C 168.000 117.255 157.255 128.000 144.000 128.000 L 112.000 128.000 L 112.000 80.000 L 144.000 80.000 C 157.255 80.000 168.000 90.745 168.000 104.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 184.000 104.000 C 184.000 81.909 166.091 64.000 144.000 64.000 L 104.000 64.000 C 99.582 64.000 96.000 67.582 96.000 72.000 L 96.000 128.000 L 88.000 128.000 C 83.582 128.000 80.000 131.582 80.000 136.000 C 80.000 140.418 83.582 144.000 88.000 144.000 L 96.000 144.000 L 96.000 160.000 L 88.000 160.000 C 83.582 160.000 80.000 163.582 80.000 168.000 C 80.000 172.418 83.582 176.000 88.000 176.000 L 96.000 176.000 L 96.000 192.000 C 96.000 196.418 99.582 200.000 104.000 200.000 C 108.418 200.000 112.000 196.418 112.000 192.000 L 112.000 176.000 L 152.000 176.000 C 156.418 176.000 160.000 172.418 160.000 168.000 C 160.000 163.582 156.418 160.000 152.000 160.000 L 112.000 160.000 L 112.000 144.000 L 144.000 144.000 C 166.091 144.000 184.000 126.091 184.000 104.000 Z"),
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
