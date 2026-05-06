package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorBoldIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 156c35.346 0 64-28.654 64-64C212 56.654 183.346 28 148 28h-60C81.373 28 76 33.373 76 40v92h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20v16h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h44c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-44v-16ZM100 52h48c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40h-48Z"),
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
