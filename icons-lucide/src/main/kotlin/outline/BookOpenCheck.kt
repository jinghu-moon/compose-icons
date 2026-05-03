package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookOpenCheck: ImageVector
    get() {
        if (_bookOpenCheck != null) return _bookOpenCheck!!
        _bookOpenCheck = lucideOutlineIcon(
            name = "BookOpenCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 21.000 L 12.000 7.000"),
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
        pathData = parseSvgPathData("M 16.000 12.000 L 18.000 14.000 L 22.000 10.000"),
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
        pathData = parseSvgPathData("M 22.000 6.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 16.000 3.000 C 13.791 3.000 12.000 4.791 12.000 7.000 C 12.000 4.791 10.209 3.000 8.000 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 17.000 C 2.000 17.552 2.448 18.000 3.000 18.000 L 9.000 18.000 C 10.657 18.000 12.000 19.343 12.000 21.000 C 12.000 19.343 13.343 18.000 15.000 18.000 L 21.000 18.000 C 21.552 18.000 22.000 17.552 22.000 17.000 L 22.000 15.700"),
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
        return _bookOpenCheck!!
    }

private var _bookOpenCheck: ImageVector? = null
