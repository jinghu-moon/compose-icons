package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorLightIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.47 193.66c1.064 1.186 1.612 2.747 1.524 4.337-.088 1.591-.805 3.081-1.994 4.143-22.119 19.771-53.538 25.283-81.066 14.221C79.406 205.299 60.537 179.579 58.25 150h-18.25c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-20h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18.25C60.537 76.421 79.406 50.701 106.934 39.639 134.462 28.577 165.881 34.089 188 53.86c2.485 2.209 2.709 6.015 .5 8.5-2.209 2.485-6.015 2.709-8.5 .5C161.416 46.246 135.057 41.519 111.859 50.641 88.66 59.763 72.58 81.178 70.29 106h65.71c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-66v20h50c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-49.71c2.27 24.833 18.342 46.266 41.545 55.403 23.203 9.136 49.573 4.416 68.165-12.203 2.466-2.211 6.258-2.005 8.47 .46Z"),
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
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
