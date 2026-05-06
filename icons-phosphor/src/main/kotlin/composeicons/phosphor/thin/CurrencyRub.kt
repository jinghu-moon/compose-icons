package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorThinIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 36h-60c-2.209 0-4 1.791-4 4v100h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h28v24h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h28v36c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36h52c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-52v-24h56c30.928 0 56-25.072 56-56C204 61.072 178.928 36 148 36ZM148 140h-56v-96h56c26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48Z"),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
