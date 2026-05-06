package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorThinIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.15 125.53l-88-112c-.758-.969-1.92-1.535-3.15-1.535-1.23 0-2.392 .566-3.15 1.535l-88 112c-1.138 1.45-1.138 3.49 0 4.94l88 112c.758 .969 1.92 1.535 3.15 1.535 1.23 0 2.392-.566 3.15-1.535l88-112c1.138-1.45 1.138-3.49 0-4.94ZM132 27.57l77.71 98.9L132 161.79ZM124 161.79 46.29 126.47 124 27.57ZM124 170.58v57.85l-70.72-90ZM132 170.58l70.72-32.15-70.72 90Z"),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
