package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorBoldIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 116h-12v-56h4c15.464 0 28 12.536 28 28 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C195.967 59.295 172.705 36.033 144 36h-4v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-4C83.281 36 60 59.281 60 88c0 28.719 23.281 52 52 52h4v56h-12C88.536 196 76 183.464 76 168c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 .033 28.705 23.295 51.967 52 52h12v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h12c28.719 0 52-23.281 52-52 0-28.719-23.281-52-52-52ZM112 116C96.536 116 84 103.464 84 88 84 72.536 96.536 60 112 60h4v56ZM152 196h-12v-56h12c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
