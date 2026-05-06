package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorFillIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 88h-16v-16C200 49.909 182.091 32 160 32h-11.18C136.91 21.8 120.82 16 104 16 68.71 16 40 41.12 40 72v136c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-8h16c13.255 0 24-10.745 24-24v-64C240 98.745 229.255 88 216 88ZM104 184c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM152 184c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM57 64C61.46 45.76 80.85 32 104 32c13.87 0 27.06 5 36.21 13.78 1.489 1.425 3.47 2.22 5.53 2.22h14.26c10.168 .003 19.231 6.413 22.62 16ZM224 176c0 4.418-3.582 8-8 8h-16v-80h16c4.418 0 8 3.582 8 8Z"),
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
