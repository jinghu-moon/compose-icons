package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorRegularIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178.48 115.7c12.4-11.939 16.699-30.013 11.002-46.256C183.786 53.2 169.141 41.77 152 40.19v-16.19c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-16v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v136h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h8c22.877 0 42.575-16.145 47.066-38.577 4.491-22.432-7.472-44.916-28.586-53.723ZM176 84c0 15.464-12.536 28-28 28h-52v-56h52c15.464 0 28 12.536 28 28ZM160 192h-64v-64h64c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
