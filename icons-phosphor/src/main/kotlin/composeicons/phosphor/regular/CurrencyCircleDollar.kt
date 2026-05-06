package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyCircleDollar: ImageVector
    get() {
        if (_currencyCircleDollar != null) return _currencyCircleDollar!!
        _currencyCircleDollar = phosphorRegularIcon(
            name = "CurrencyCircleDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM168 148c0 15.464-12.536 28-28 28h-4v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h36c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-24C100.536 136 88 123.464 88 108 88 92.536 100.536 80 116 80h4v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-36c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h24c15.464 0 28 12.536 28 28Z"),
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
        return _currencyCircleDollar!!
    }

private var _currencyCircleDollar: ImageVector? = null
