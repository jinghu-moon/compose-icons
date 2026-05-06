package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorRegularIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206.19 53.07 144.88 128h31.12c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40v16h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40v-16h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h31.12L49.81 53.07C47.01 49.651 47.511 44.61 50.93 41.81c3.419-2.8 8.46-2.299 11.26 1.12L128 123.37 193.81 42.93c2.8-3.419 7.841-3.92 11.26-1.12 3.419 2.8 3.92 7.841 1.12 11.26Z"),
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
