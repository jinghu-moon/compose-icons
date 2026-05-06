package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorThinIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 124h-20v-72h12c19.882 0 36 16.118 36 36 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C187.972 63.711 168.289 44.028 144 44h-12v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-12C87.699 44 68 63.699 68 88c0 24.301 19.699 44 44 44h12v72h-20C84.118 204 68 187.882 68 168c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 .028 24.289 19.711 43.972 44 44h20v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h20c24.301 0 44-19.699 44-44 0-24.301-19.699-44-44-44ZM112 124C92.118 124 76 107.882 76 88 76 68.118 92.118 52 112 52h12v72ZM152 204h-20v-72h20c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
