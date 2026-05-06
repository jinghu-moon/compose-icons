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
                pathData = parseSvgPathData("M209.29 55.6l-56 68.4h22.71c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-36v16h36c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-36v28c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28h-36c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h36v-16h-36c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h22.68l-56-68.4C42.483 50.461 43.246 42.892 48.385 38.695c5.139-4.197 12.708-3.434 16.905 1.705L128 117.05 190.71 40.4c4.197-5.131 11.759-5.887 16.89-1.69 5.131 4.197 5.887 11.759 1.69 16.89Z"),
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
