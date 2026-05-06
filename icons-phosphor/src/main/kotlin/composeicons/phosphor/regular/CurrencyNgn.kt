package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorRegularIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 136h-16v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-58c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v58h-64.58L70.31 41.08C68.21 38.385 64.63 37.322 61.399 38.432 58.168 39.543 55.999 42.583 56 46v58h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v58c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-58h64.58l49.11 62.92c1.516 1.944 3.844 3.081 6.31 3.08 .885 .002 1.765-.147 2.6-.44 3.229-1.11 5.398-4.146 5.4-7.56v-58h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM184 120v16h-39.61L131.9 120ZM72 69.25 99.12 104h-27.12ZM72 136v-16h39.61l12.49 16ZM184 186.75 156.88 152h27.12Z"),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
