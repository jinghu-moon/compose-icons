package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigRightDash: ImageVector
    get() {
        if (_arrowBigRightDash != null) return _arrowBigRightDash!!
        _arrowBigRightDash = lucideOutlineIcon(
            name = "ArrowBigRightDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 9c.552 0 1-.448 1-1v-3.293c-0-.286 .172-.544 .436-.653 .264-.109 .568-.049 .771 .153l6.94 6.94c.226 .226 .354 .533 .354 .853 0 .32-.127 .627-.354 .854l-6.94 6.94c-.202 .202-.506 .263-.771 .153-.264-.109-.436-.367-.436-.653v-3.294c0-.552-.448-1-1-1h-2C8.448 15 8 14.552 8 14v-4C8 9.448 8.448 9 9 9Z")
            addPathData("M4 9v6")
        }
        return _arrowBigRightDash!!
    }

private var _arrowBigRightDash: ImageVector? = null
