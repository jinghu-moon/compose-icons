package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorThinIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 56c0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4ZM216 164c-2.209 0-4 1.791-4 4v20h-36c-11.046 0-20-8.954-20-20v-52h52c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h52v12c-.039 33.121-26.879 59.961-60 60-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 37.539-.039 67.961-30.461 68-68v-12h40v52c0 15.464 12.536 28 28 28h40c2.209 0 4-1.791 4-4v-24c0-2.209-1.791-4-4-4Z"),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
