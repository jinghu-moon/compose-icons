package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorFillIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M143.55 136h16.45v23ZM96 120h16.45L96 97ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM200 128c0-4.418-3.582-8-8-8h-16v-48c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v48h-27.88L94.51 67.35C92.489 64.52 88.87 63.32 85.559 64.381 82.247 65.443 80 68.522 80 72v48h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48h27.88l37.61 52.65c1.502 2.102 3.926 3.35 6.51 3.35 .828 .002 1.652-.126 2.44-.38 3.313-1.061 5.561-4.141 5.56-7.62v-48h16c4.418 0 8-3.582 8-8Z"),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
