package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyCircleDollar: ImageVector
    get() {
        if (_currencyCircleDollar != null) return _currencyCircleDollar!!
        _currencyCircleDollar = phosphorBoldIcon(
            name = "CurrencyCircleDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM172 148c0 17.673-14.327 32-32 32v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h36c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24C98.327 140 84 125.673 84 108 84 90.327 98.327 76 116 76v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-36c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c17.673 0 32 14.327 32 32Z"),
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
        return _currencyCircleDollar!!
    }

private var _currencyCircleDollar: ImageVector? = null
