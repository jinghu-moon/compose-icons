package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorThinIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 140h-20v-24h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-62c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v62h-70.54L67.15 43.54C66.099 42.197 64.311 41.668 62.699 42.223 61.086 42.778 60.002 44.294 60 46v62h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v24h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v62c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-62h70.54l50.31 64.46c.757 .971 1.919 1.539 3.15 1.54 .443 .001 .882-.073 1.3-.22 1.614-.555 2.699-2.073 2.7-3.78v-62h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM188 116v24h-45.56L123.71 116ZM68 57.63 107.32 108h-39.32ZM68 140v-24h45.56l18.73 24ZM188 198.37 148.68 148h39.32Z"),
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
