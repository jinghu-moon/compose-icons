package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorThinIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 76c15.464 0 28-12.536 28-28C156 32.536 143.464 20 128 20c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM128 28c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C116.954 68 108 59.046 108 48c0-11.046 8.954-20 20-20ZM220 104c0 2.209-1.791 4-4 4h-84v33.36l53.58 23c1.457 .626 2.406 2.054 2.42 3.64v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-45.36l-51.22-22L50.68 219c-1.657 1.48-4.2 1.337-5.68-.32-1.48-1.657-1.337-4.2 .32-5.68L124 142.22v-34.22h-84c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4Z"),
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
        return _personSimpleTaiChi!!
    }

private var _personSimpleTaiChi: ImageVector? = null
