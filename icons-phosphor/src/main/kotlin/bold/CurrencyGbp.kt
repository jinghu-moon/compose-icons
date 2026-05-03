package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorBoldIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 208.000 C 196.000 214.627 190.627 220.000 184.000 220.000 L 56.000 220.000 C 49.373 220.000 44.000 214.627 44.000 208.000 C 44.000 201.373 49.373 196.000 56.000 196.000 L 60.000 196.000 C 73.255 196.000 84.000 185.255 84.000 172.000 L 84.000 140.000 L 56.000 140.000 C 49.373 140.000 44.000 134.627 44.000 128.000 C 44.000 121.373 49.373 116.000 56.000 116.000 L 84.000 116.000 L 84.000 84.000 C 83.997 62.321 96.507 42.589 116.115 33.342 C 135.722 24.096 158.905 26.997 175.630 40.790 C 180.741 45.009 181.464 52.574 177.245 57.685 C 173.026 62.796 165.461 63.519 160.350 59.300 C 154.633 54.554 147.430 51.970 140.000 52.000 C 122.327 52.000 108.000 66.327 108.000 84.000 L 108.000 116.000 L 136.000 116.000 C 142.627 116.000 148.000 121.373 148.000 128.000 C 148.000 134.627 142.627 140.000 136.000 140.000 L 108.000 140.000 L 108.000 172.000 C 108.009 180.428 105.788 188.709 101.560 196.000 L 184.000 196.000 C 190.627 196.000 196.000 201.373 196.000 208.000 Z"),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
