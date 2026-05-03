package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorBoldIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 100.000 C 212.000 106.627 206.627 112.000 200.000 112.000 L 140.000 112.000 L 140.000 212.000 C 140.000 218.627 134.627 224.000 128.000 224.000 C 121.373 224.000 116.000 218.627 116.000 212.000 L 116.000 112.000 L 56.000 112.000 C 49.373 112.000 44.000 106.627 44.000 100.000 C 44.000 93.373 49.373 88.000 56.000 88.000 L 200.000 88.000 C 206.627 88.000 212.000 93.373 212.000 100.000 ZM 56.000 64.000 L 200.000 64.000 C 206.627 64.000 212.000 58.627 212.000 52.000 C 212.000 45.373 206.627 40.000 200.000 40.000 L 56.000 40.000 C 49.373 40.000 44.000 45.373 44.000 52.000 C 44.000 58.627 49.373 64.000 56.000 64.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null
