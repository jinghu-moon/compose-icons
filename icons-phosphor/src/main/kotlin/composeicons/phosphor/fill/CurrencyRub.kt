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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 104c0 13.255-10.745 24-24 24h-32v-48h32c13.255 0 24 10.745 24 24ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM184 104C184 81.909 166.091 64 144 64h-40c-4.418 0-8 3.582-8 8v56h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v16h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40v-16h32c22.091 0 40-17.909 40-40Z"),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
