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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM182.4 76.8 144 128h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24v16h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-16h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16L73.6 76.8C70.949 73.265 71.665 68.251 75.2 65.6c3.535-2.651 8.549-1.935 11.2 1.6L128 122.67 169.6 67.2c2.651-3.535 7.665-4.251 11.2-1.6 3.535 2.651 4.251 7.665 1.6 11.2Z"),
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
