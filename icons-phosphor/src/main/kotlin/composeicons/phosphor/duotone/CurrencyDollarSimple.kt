package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorDuotoneIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 168c0 22.091-17.909 40-40 40h-24v-80h24c22.091 0 40 17.909 40 40ZM112 48C89.909 48 72 65.909 72 88c0 22.091 17.909 40 40 40h16v-80Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 168c-.028 26.498-21.502 47.972-48 48h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16C77.502 215.972 56.028 194.498 56 168c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 17.673 14.327 32 32 32h48c17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32h-40C85.49 136 64 114.51 64 88 64 61.49 85.49 40 112 40h8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h8c26.498 .028 47.972 21.502 48 48 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C176 70.327 161.673 56 144 56h-32C94.327 56 80 70.327 80 88c0 17.673 14.327 32 32 32h40c26.498 .028 47.972 21.502 48 48Z"),
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
