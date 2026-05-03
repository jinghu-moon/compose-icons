package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorBoldIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 209.290 55.600 L 153.290 124.000 L 176.000 124.000 C 182.627 124.000 188.000 129.373 188.000 136.000 C 188.000 142.627 182.627 148.000 176.000 148.000 L 140.000 148.000 L 140.000 164.000 L 176.000 164.000 C 182.627 164.000 188.000 169.373 188.000 176.000 C 188.000 182.627 182.627 188.000 176.000 188.000 L 140.000 188.000 L 140.000 216.000 C 140.000 222.627 134.627 228.000 128.000 228.000 C 121.373 228.000 116.000 222.627 116.000 216.000 L 116.000 188.000 L 80.000 188.000 C 73.373 188.000 68.000 182.627 68.000 176.000 C 68.000 169.373 73.373 164.000 80.000 164.000 L 116.000 164.000 L 116.000 148.000 L 80.000 148.000 C 73.373 148.000 68.000 142.627 68.000 136.000 C 68.000 129.373 73.373 124.000 80.000 124.000 L 102.680 124.000 L 46.680 55.600 C 42.483 50.461 43.246 42.892 48.385 38.695 C 53.524 34.498 61.093 35.261 65.290 40.400 L 128.000 117.050 L 190.710 40.400 C 194.907 35.269 202.469 34.513 207.600 38.710 C 212.731 42.907 213.487 50.469 209.290 55.600 Z"),
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
