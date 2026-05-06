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
                pathData = parseSvgPathData("M52 56C52 49.373 57.373 44 64 44h128c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-128C57.373 68 52 62.627 52 56ZM216 156c-6.627 0-12 5.373-12 12v12h-28c-6.627 0-12-5.373-12-12v-44h44c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-160c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h44v4c-.033 28.705-23.295 51.967-52 52-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 41.955-.044 75.956-34.045 76-76v-4h24v44c0 19.882 16.118 36 36 36h40c6.627 0 12-5.373 12-12v-24c0-6.627-5.373-12-12-12Z"),
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
