package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorThinIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 108h-12.1C209.715 63.254 172.799 28.098 128 28.098 83.201 28.098 46.285 63.254 44.1 108h-12.1c-2.209 0-4 1.791-4 4 .068 38.153 21.772 72.965 56 89.82v6.18c0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12v-6.18C206.228 184.965 227.932 150.153 228 112c0-2.209-1.791-4-4-4ZM203.89 108h-62.84C151.455 88.621 169.754 74.707 191.21 69.86c7.597 11.333 11.98 24.514 12.68 38.14ZM186 62.93C162.299 69.342 142.595 85.812 132.08 108h-37.4C103.765 74.982 133.755 52.076 168 52c2.33 0 4.68 .13 7 .34 4.009 3.156 7.694 6.703 11 10.59ZM128 36c11.921-.01 23.675 2.803 34.3 8.21C125.847 46.768 95.198 72.53 86.41 108h-34.3C54.282 67.659 87.601 36.048 128 36ZM166.33 195.66c-1.422 .653-2.332 2.075-2.33 3.64v8.7c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4v-8.7c.002-1.565-.908-2.987-2.33-3.64C58.324 181.209 37.656 150.481 36.09 116h183.82c-1.566 34.481-22.234 65.209-53.58 79.66Z"),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
