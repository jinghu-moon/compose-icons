package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorThinIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 184c0 15.464-12.536 28-28 28-12.09 0-23.76-7.83-27.75-18.61-.528-1.347-.287-2.874 .63-3.993 .916-1.119 2.366-1.656 3.79-1.405 1.425 .252 2.602 1.253 3.08 2.618C134.58 198.24 143.28 204 152 204c11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20h-112c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h112c15.464 0 28 12.536 28 28ZM148 72C148 56.536 135.464 44 120 44 107.91 44 96.24 51.83 92.25 62.61c-.72 2.058 .341 4.314 2.385 5.072 2.045 .758 4.319-.261 5.115-2.292C102.58 57.76 111.28 52 120 52c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c15.464 0 28-12.536 28-28ZM208 76c-12.09 0-23.76 7.83-27.75 18.61-.528 1.347-.287 2.874 .63 3.993 .916 1.119 2.366 1.656 3.79 1.405 1.425-.252 2.602-1.253 3.08-2.618C190.58 89.76 199.28 84 208 84c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20h-176c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h176c15.464 0 28-12.536 28-28C236 88.536 223.464 76 208 76Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
