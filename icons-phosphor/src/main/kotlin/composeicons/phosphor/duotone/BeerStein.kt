package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorDuotoneIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 72v136c0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8v-136Z"),
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
                pathData = parseSvgPathData("M104 104v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM144 96c-4.418 0-8 3.582-8 8v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-80c0-4.418-3.582-8-8-8ZM240 112v64c0 13.255-10.745 24-24 24h-16v8c0 8.837-7.163 16-16 16h-128c-8.837 0-16-7.163-16-16v-136C40 41.12 68.71 16 104 16c16.77 0 32.91 5.8 44.82 16h11.18c22.091 0 40 17.909 40 40v16h16c13.255 0 24 10.745 24 24ZM57 64h125.62C179.231 54.413 170.168 48.003 160 48h-14.26c-2.06-0-4.041-.795-5.53-2.22C131.06 37 117.87 32 104 32 80.82 32 61.43 45.76 57 64ZM184 208v-15.83c0-.06 0-.11 0-.17 0-.06 0-.11 0-.17v-111.83h-128v128h128ZM224 112c0-4.418-3.582-8-8-8h-16v80h16c4.418 0 8-3.582 8-8Z"),
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
        return _beerStein!!
    }

private var _beerStein: ImageVector? = null
