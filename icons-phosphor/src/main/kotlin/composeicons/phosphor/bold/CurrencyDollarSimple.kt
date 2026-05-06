package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorBoldIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 168c-.033 28.705-23.295 51.967-52 52h-12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12C75.295 219.967 52.033 196.705 52 168c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 15.464 12.536 28 28 28h48c15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28h-40C83.281 140 60 116.719 60 88 60 59.281 83.281 36 112 36h4v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v12h4c28.705 .033 51.967 23.295 52 52 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12C172 72.536 159.464 60 144 60h-32C96.536 60 84 72.536 84 88c0 15.464 12.536 28 28 28h40c28.705 .033 51.967 23.295 52 52Z"),
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
        return _currencyDollarSimple!!
    }

private var _currencyDollarSimple: ImageVector? = null
