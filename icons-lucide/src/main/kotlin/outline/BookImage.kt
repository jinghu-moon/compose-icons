package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookImage: ImageVector
    get() {
        if (_bookImage != null) return _bookImage!!
        _bookImage = lucideOutlineIcon(
            name = "BookImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 13.700 L 17.900 11.600 C 17.122 10.838 15.878 10.838 15.100 11.600 L 9.700 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 4.000 19.500 L 4.000 4.500 C 4.000 3.119 5.119 2.000 6.500 2.000 L 19.000 2.000 C 19.552 2.000 20.000 2.448 20.000 3.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 6.500 22.000 C 5.119 22.000 4.000 20.881 4.000 19.500 C 4.000 18.119 5.119 17.000 6.500 17.000 L 20.000 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 8.000 C 12.000 9.105 11.105 10.000 10.000 10.000 C 8.895 10.000 8.000 9.105 8.000 8.000 C 8.000 6.895 8.895 6.000 10.000 6.000 C 11.105 6.000 12.000 6.895 12.000 8.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _bookImage!!
    }

private var _bookImage: ImageVector? = null
