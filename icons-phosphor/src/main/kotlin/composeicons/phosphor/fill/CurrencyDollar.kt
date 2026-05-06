package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorFillIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 152c0 8.837-7.163 16-16 16h-8v-32h8c8.837 0 16 7.163 16 16ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM176 152c0-17.673-14.327-32-32-32h-8v-32h4c8.837 0 16 7.163 16 16 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C172 86.327 157.673 72 140 72h-4v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-4C98.327 72 84 86.327 84 104c0 17.673 14.327 32 32 32h4v32h-8c-8.837 0-16-7.163-16-16 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 17.673 14.327 32 32 32h8v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h8c17.673 0 32-14.327 32-32ZM100 104c0 8.837 7.163 16 16 16h4v-32h-4c-8.837 0-16 7.163-16 16Z"),
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
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
