package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookLock: ImageVector
    get() {
        if (_bookLock != null) return _bookLock!!
        _bookLock = lucideOutlineIcon(
            name = "BookLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 6.000 L 18.000 4.000 C 18.000 2.895 17.105 2.000 16.000 2.000 C 14.895 2.000 14.000 2.895 14.000 4.000 L 14.000 6.000"),
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
                pathData = parseSvgPathData("M 20.000 15.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 6.500 22.000 C 5.119 22.000 4.000 20.881 4.000 19.500 C 4.000 18.119 5.119 17.000 6.500 17.000 L 20.000 17.000"),
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
                pathData = parseSvgPathData("M 4.000 19.500 L 4.000 4.500 C 4.000 3.119 5.119 2.000 6.500 2.000 L 10.000 2.000"),
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
                pathData = parseSvgPathData("M 13.000 6.000 L 19.000 6.000 C 19.552 6.000 20.000 6.448 20.000 7.000 L 20.000 10.000 C 20.000 10.552 19.552 11.000 19.000 11.000 L 13.000 11.000 C 12.448 11.000 12.000 10.552 12.000 10.000 L 12.000 7.000 C 12.000 6.448 12.448 6.000 13.000 6.000 Z"),
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
        return _bookLock!!
    }

private var _bookLock: ImageVector? = null
