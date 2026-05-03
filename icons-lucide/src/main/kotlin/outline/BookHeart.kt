package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookHeart: ImageVector
    get() {
        if (_bookHeart != null) return _bookHeart!!
        _bookHeart = lucideOutlineIcon(
            name = "BookHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 19.500 L 4.000 4.500 C 4.000 3.119 5.119 2.000 6.500 2.000 L 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 6.500 22.000 C 5.119 22.000 4.000 20.881 4.000 19.500 C 4.000 18.119 5.119 17.000 6.500 17.000 L 20.000 17.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.620 9.800 C 8.047 9.203 7.848 8.339 8.103 7.551 C 8.357 6.763 9.024 6.179 9.838 6.029 C 10.652 5.880 11.483 6.190 12.000 6.836 C 12.520 6.197 13.348 5.893 14.158 6.044 C 14.968 6.195 15.630 6.776 15.885 7.560 C 16.140 8.343 15.946 9.203 15.380 9.802 L 12.754 12.658 C 12.564 12.876 12.290 13.002 12.000 13.002 C 11.711 13.002 11.437 12.876 11.247 12.658 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _bookHeart!!
    }

private var _bookHeart: ImageVector? = null
