package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorThinIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 132h-28.06L235.71 73.51c.828-2.049-.161-4.382-2.21-5.21-2.049-.828-4.382 .161-5.21 2.21l-25 61.51h-46.6l-25-61.51c-.61-1.513-2.078-2.505-3.71-2.505-1.632 0-3.1 .991-3.71 2.505L99.31 132h-46.62L27.69 70.49c-.828-2.049-3.161-3.038-5.21-2.21-2.049 .828-3.038 3.161-2.21 5.21L44.06 132h-28.06c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h31.31l25 61.51c.61 1.513 2.078 2.505 3.71 2.505 1.632 0 3.1-.991 3.71-2.505l25-61.51h46.62l25 61.51c.61 1.513 2.078 2.505 3.71 2.505 1.632 0 3.1-.991 3.71-2.505l25-61.51h31.23c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM76 189.37 55.94 140h40.12ZM107.94 132 128 82.63 148.06 132ZM180 189.37 159.94 140h40.12Z"),
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
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
