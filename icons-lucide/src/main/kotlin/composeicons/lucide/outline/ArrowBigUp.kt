package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigUp: ImageVector
    get() {
        if (_arrowBigUp != null) return _arrowBigUp!!
        _arrowBigUp = lucideOutlineIcon(
            name = "ArrowBigUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 19c0 .552 .448 1 1 1h4c.552 0 1-.448 1-1v-6c0-.552 .448-1 1-1h3.293c.286 0 .544-.172 .653-.436 .109-.264 .049-.568-.153-.771L12.707 3.707c-.391-.39-1.023-.39-1.414 0L4.207 10.793c-.202 .202-.263 .506-.153 .771 .109 .264 .367 .436 .653 .436h3.293c.552 0 1 .448 1 1Z"),
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
        return _arrowBigUp!!
    }

private var _arrowBigUp: ImageVector? = null
