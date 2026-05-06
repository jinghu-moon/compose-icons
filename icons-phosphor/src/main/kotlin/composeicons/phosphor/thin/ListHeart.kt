package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorThinIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 64c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4ZM40 132h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM120 188h-80c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM244 144c0 14.51-8.56 29-25.44 43.07-7.662 6.347-15.963 11.88-24.77 16.51-1.127 .564-2.453 .564-3.58 0-8.807-4.63-17.108-10.163-24.77-16.51C148.56 173 140 158.51 140 144c.005-12.58 8.4-23.611 20.523-26.971 12.123-3.359 24.998 1.778 31.477 12.561 6.48-10.783 19.355-15.92 31.477-12.561 12.123 3.359 20.517 14.391 20.523 26.971ZM236 144c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 25.8 35.54 46.83 44 51.47 8.46-4.64 44-25.67 44-51.47Z"),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
