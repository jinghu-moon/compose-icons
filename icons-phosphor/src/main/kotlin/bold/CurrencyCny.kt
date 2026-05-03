package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorBoldIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.000 56.000 C 52.000 49.373 57.373 44.000 64.000 44.000 L 192.000 44.000 C 198.627 44.000 204.000 49.373 204.000 56.000 C 204.000 62.627 198.627 68.000 192.000 68.000 L 64.000 68.000 C 57.373 68.000 52.000 62.627 52.000 56.000 ZM 216.000 156.000 C 209.373 156.000 204.000 161.373 204.000 168.000 L 204.000 180.000 L 176.000 180.000 C 169.373 180.000 164.000 174.627 164.000 168.000 L 164.000 124.000 L 208.000 124.000 C 214.627 124.000 220.000 118.627 220.000 112.000 C 220.000 105.373 214.627 100.000 208.000 100.000 L 48.000 100.000 C 41.373 100.000 36.000 105.373 36.000 112.000 C 36.000 118.627 41.373 124.000 48.000 124.000 L 92.000 124.000 L 92.000 128.000 C 91.967 156.705 68.705 179.967 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 C 81.955 203.956 115.956 169.955 116.000 128.000 L 116.000 124.000 L 140.000 124.000 L 140.000 168.000 C 140.000 187.882 156.118 204.000 176.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 L 228.000 168.000 C 228.000 161.373 222.627 156.000 216.000 156.000 Z"),
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
