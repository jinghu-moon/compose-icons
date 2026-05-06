package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorBoldIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 208c0 6.627-5.373 12-12 12h-128c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h4c13.255 0 24-10.745 24-24v-32h-28c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h28v-32C83.997 62.321 96.507 42.589 116.115 33.342c19.608-9.246 42.791-6.345 59.515 7.448 5.111 4.219 5.834 11.784 1.615 16.895-4.219 5.111-11.784 5.834-16.895 1.615C154.633 54.554 147.43 51.97 140 52c-17.673 0-32 14.327-32 32v32h28c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-28v32c.009 8.428-2.212 16.709-6.44 24h82.44c6.627 0 12 5.373 12 12Z"),
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
