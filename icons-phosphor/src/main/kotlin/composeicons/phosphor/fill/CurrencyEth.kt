package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorFillIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.29 123.06l-88-112C132.773 9.13 130.455 8.003 128 8.003c-2.455 0-4.773 1.127-6.29 3.057l-88 112c-2.277 2.9-2.277 6.98 0 9.88l88 112c1.517 1.93 3.835 3.057 6.29 3.057 2.455 0 4.773-1.127 6.29-3.057l88-112c2.277-2.9 2.277-6.98 0-9.88ZM136 155.58v-116.45l67.42 85.8ZM120 155.58 52.58 124.93 120 39.13ZM120 173.15v43.72l-53.43-68Z"),
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
