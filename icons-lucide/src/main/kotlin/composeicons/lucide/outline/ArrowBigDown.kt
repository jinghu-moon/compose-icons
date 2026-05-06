package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigDown: ImageVector
    get() {
        if (_arrowBigDown != null) return _arrowBigDown!!
        _arrowBigDown = lucideOutlineIcon(
            name = "ArrowBigDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 5C9 4.448 9.448 4 10 4h4c.552 0 1 .448 1 1v6c0 .552 .448 1 1 1h3.293c.286-0 .544 .172 .653 .436 .109 .264 .049 .568-.153 .771l-7.086 7.086c-.391 .39-1.023 .39-1.414 0L4.207 13.207c-.202-.202-.263-.506-.153-.771 .109-.264 .367-.436 .653-.436h3.293c.552 0 1-.448 1-1Z"),
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
        return _arrowBigDown!!
    }

private var _arrowBigDown: ImageVector? = null
