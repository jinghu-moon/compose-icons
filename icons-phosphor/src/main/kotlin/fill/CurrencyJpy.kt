package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorFillIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 182.400 76.800 L 144.000 128.000 L 160.000 128.000 C 164.418 128.000 168.000 131.582 168.000 136.000 C 168.000 140.418 164.418 144.000 160.000 144.000 L 136.000 144.000 L 136.000 160.000 L 160.000 160.000 C 164.418 160.000 168.000 163.582 168.000 168.000 C 168.000 172.418 164.418 176.000 160.000 176.000 L 136.000 176.000 L 136.000 192.000 C 136.000 196.418 132.418 200.000 128.000 200.000 C 123.582 200.000 120.000 196.418 120.000 192.000 L 120.000 176.000 L 96.000 176.000 C 91.582 176.000 88.000 172.418 88.000 168.000 C 88.000 163.582 91.582 160.000 96.000 160.000 L 120.000 160.000 L 120.000 144.000 L 96.000 144.000 C 91.582 144.000 88.000 140.418 88.000 136.000 C 88.000 131.582 91.582 128.000 96.000 128.000 L 112.000 128.000 L 73.600 76.800 C 70.949 73.265 71.665 68.251 75.200 65.600 C 78.735 62.949 83.749 63.665 86.400 67.200 L 128.000 122.670 L 169.600 67.200 C 172.251 63.665 177.265 62.949 180.800 65.600 C 184.335 68.251 185.051 73.265 182.400 76.800 Z"),
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
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null
