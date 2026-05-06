package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorRegularIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190 192.33c1.416 1.582 2.145 3.661 2.026 5.781-.118 2.119-1.074 4.105-2.656 5.519-22.435 20.09-54.251 25.878-82.324 14.978C78.973 207.708 59.399 181.965 56.4 152h-16.4c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16.4C59.408 74.047 78.976 48.317 107.038 37.419c28.062-10.898 59.866-5.121 82.302 14.951 3.294 2.949 3.574 8.011 .625 11.305-2.949 3.294-8.011 3.574-11.305 .625C160.927 48.453 135.869 43.747 113.594 52.078 91.319 60.41 75.501 80.406 72.52 104h63.48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64v16h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-47.48c2.978 23.596 18.795 43.595 41.07 51.929 22.275 8.334 47.335 3.628 65.07-12.219 1.582-1.429 3.67-2.168 5.799-2.051 2.129 .116 4.124 1.078 5.541 2.671Z"),
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
