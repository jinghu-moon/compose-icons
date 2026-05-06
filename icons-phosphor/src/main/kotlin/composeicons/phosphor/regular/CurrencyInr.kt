package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorRegularIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 80c0 4.418-3.582 8-8 8h-32.15c.09 1.32 .15 2.65 .15 4-.039 33.121-26.879 59.961-60 60h-15.31l72.69 66.08c2.155 1.912 3.116 4.835 2.515 7.653-.601 2.818-2.67 5.095-5.418 5.961-2.748 .867-5.749 .189-7.858-1.774l-88-80c-2.446-2.223-3.273-5.721-2.081-8.804C65.73 138.033 68.695 136 72 136h36c24.289-.028 43.972-19.711 44-44 0-1.35-.07-2.68-.19-4h-79.81c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h75.17C139.657 57.278 124.528 48.008 108 48h-36c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-51.26c7.136 6.603 12.565 14.839 15.82 24h35.44c4.418 0 8 3.582 8 8Z"),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
