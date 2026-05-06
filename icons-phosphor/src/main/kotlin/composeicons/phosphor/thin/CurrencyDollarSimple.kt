package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorThinIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 168c-.028 24.289-19.711 43.972-44 44h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20C79.711 211.972 60.028 192.289 60 168c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 19.882 16.118 36 36 36h48c19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36h-40C87.699 132 68 112.301 68 88 68 63.699 87.699 44 112 44h12v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h12c24.289 .028 43.972 19.711 44 44 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C180 68.118 163.882 52 144 52h-32C92.118 52 76 68.118 76 88c0 19.882 16.118 36 36 36h40c24.289 .028 43.972 19.711 44 44Z"),
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
