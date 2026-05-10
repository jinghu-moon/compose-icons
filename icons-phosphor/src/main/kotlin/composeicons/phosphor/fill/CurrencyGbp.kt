package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorFillIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM168 184h-80c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 8.837 0 16-7.163 16-16v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-24c0-14.29 7.624-27.495 20-34.64 12.376-7.145 27.624-7.145 40 0 3.696 2.267 4.914 7.066 2.745 10.821-2.169 3.755-6.934 5.098-10.745 3.029-7.426-4.288-16.576-4.287-24.002 .001C124.572 79.5 119.998 87.425 120 96v24h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v16c.007 5.621-1.481 11.143-4.31 16h52.31c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
