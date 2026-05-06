package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorThinIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 92h-20v-20C196 52.118 179.882 36 160 36h-12.69C136 25.81 120.34 20 104 20 70.92 20 44 43.33 44 72v136c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-12h20c11.046 0 20-8.954 20-20v-64c0-11.046-8.954-20-20-20ZM104 28c14.89 0 29.09 5.43 39 14.89 .738 .706 1.718 1.103 2.74 1.11h14.26c13.918 .001 25.722 10.225 27.71 24h-135.49C54.62 45.61 76.92 28 104 28ZM188 208c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4v-132h136ZM228 176c0 6.627-5.373 12-12 12h-20v-88h20c6.627 0 12 5.373 12 12ZM100 104v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM148 104v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
