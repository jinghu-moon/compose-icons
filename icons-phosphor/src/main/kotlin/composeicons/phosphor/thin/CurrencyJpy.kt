package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorThinIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.1 50.53 136.44 132h39.56c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-44v24h44c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-44v44c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-44h-44c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h44v-24h-44c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h39.56L52.9 50.53c-1.397-1.712-1.142-4.233 .57-5.63 1.712-1.397 4.233-1.142 5.63 .57L128 129.68 196.9 45.47c1.397-1.712 3.918-1.967 5.63-.57 1.712 1.397 1.967 3.918 .57 5.63Z"),
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
