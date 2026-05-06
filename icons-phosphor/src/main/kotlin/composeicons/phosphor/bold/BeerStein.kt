package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorBoldIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 84h-12v-12C203.972 47.711 184.289 28.028 160 28h-9.73C137.77 17.78 121.18 12 104 12 66.5 12 36 38.92 36 72v136c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-4h12c15.464 0 28-12.536 28-28v-64C244 96.536 231.464 84 216 84ZM104 36c12.85 0 25 4.62 33.44 12.67 2.234 2.138 5.208 3.331 8.3 3.33h14.26c9.505-.002 17.699 6.687 19.6 16h-119.32C62.72 50 81.39 36 104 36ZM180 204h-120v-112h120ZM220 176c0 2.209-1.791 4-4 4h-12v-72h12c2.209 0 4 1.791 4 4ZM108 120v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM156 120v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
