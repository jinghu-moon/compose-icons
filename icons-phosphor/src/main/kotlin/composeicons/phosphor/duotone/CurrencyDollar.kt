package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorDuotoneIcon(
            name = "CurrencyDollar",
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
                pathData = parseSvgPathData("M152 120h-16v-64h8c17.673 0 32 14.327 32 32 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C191.972 61.502 170.498 40.028 144 40h-8v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-8C85.49 40 64 61.49 64 88c0 26.51 21.49 48 48 48h8v64h-16C86.327 200 72 185.673 72 168c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 .028 26.498 21.502 47.972 48 48h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16c26.51 0 48-21.49 48-48 0-26.51-21.49-48-48-48ZM112 120C94.327 120 80 105.673 80 88 80 70.327 94.327 56 112 56h8v64ZM152 200h-16v-64h16c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
