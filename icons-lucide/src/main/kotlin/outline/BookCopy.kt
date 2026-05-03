package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookCopy: ImageVector
    get() {
        if (_bookCopy != null) return _bookCopy!!
        _bookCopy = lucideOutlineIcon(
            name = "BookCopy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 7.000 C 3.895 7.000 3.000 7.895 3.000 9.000 L 3.000 20.000"),
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
                pathData = parseSvgPathData("M 5.803 18.000 L 5.000 18.000 C 3.895 18.000 3.000 18.895 3.000 20.000 C 3.000 21.105 3.895 22.000 5.000 22.000 L 14.500 22.000 C 14.776 22.000 15.000 21.776 15.000 21.500 L 15.000 21.000"),
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
                pathData = parseSvgPathData("M 9.000 15.000 L 9.000 4.000 C 9.000 2.895 9.895 2.000 11.000 2.000 L 20.500 2.000 C 20.776 2.000 21.000 2.224 21.000 2.500 L 21.000 16.500 C 21.000 16.776 20.776 17.000 20.500 17.000 L 11.000 17.000 C 9.895 17.000 9.000 16.105 9.000 15.000 C 9.000 13.895 9.895 13.000 11.000 13.000 L 21.000 13.000"),
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
        return _bookCopy!!
    }

private var _bookCopy: ImageVector? = null
