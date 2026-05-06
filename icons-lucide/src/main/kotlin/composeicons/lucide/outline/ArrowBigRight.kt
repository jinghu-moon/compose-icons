package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigRight: ImageVector
    get() {
        if (_arrowBigRight != null) return _arrowBigRight!!
        _arrowBigRight = lucideOutlineIcon(
            name = "ArrowBigRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.207 19.793c-.202 .202-.506 .263-.771 .153-.264-.109-.436-.367-.436-.653v-3.293c0-.552-.448-1-1-1h-6C4.448 15 4 14.552 4 14v-4C4 9.448 4.448 9 5 9h6c.552 0 1-.448 1-1v-3.293c-0-.286 .172-.544 .436-.653 .264-.109 .568-.049 .771 .153l6.94 6.94c.226 .226 .354 .533 .354 .853 0 .32-.127 .627-.354 .854Z"),
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
        return _arrowBigRight!!
    }

private var _arrowBigRight: ImageVector? = null
