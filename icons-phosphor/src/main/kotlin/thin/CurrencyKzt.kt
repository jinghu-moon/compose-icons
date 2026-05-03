package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorThinIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 96.000 C 204.000 98.209 202.209 100.000 200.000 100.000 L 132.000 100.000 L 132.000 216.000 C 132.000 218.209 130.209 220.000 128.000 220.000 C 125.791 220.000 124.000 218.209 124.000 216.000 L 124.000 100.000 L 56.000 100.000 C 53.791 100.000 52.000 98.209 52.000 96.000 C 52.000 93.791 53.791 92.000 56.000 92.000 L 200.000 92.000 C 202.209 92.000 204.000 93.791 204.000 96.000 ZM 56.000 60.000 L 200.000 60.000 C 202.209 60.000 204.000 58.209 204.000 56.000 C 204.000 53.791 202.209 52.000 200.000 52.000 L 56.000 52.000 C 53.791 52.000 52.000 53.791 52.000 56.000 C 52.000 58.209 53.791 60.000 56.000 60.000 Z"),
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
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null
