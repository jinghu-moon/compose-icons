package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigLeftDash: ImageVector
    get() {
        if (_arrowBigLeftDash != null) return _arrowBigLeftDash!!
        _arrowBigLeftDash = lucideOutlineIcon(
            name = "ArrowBigLeftDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 9C12.448 9 12 8.552 12 8v-3.293c0-.286-.172-.544-.436-.653-.264-.109-.568-.049-.771 .153L3.853 11.147c-.226 .226-.354 .533-.354 .853 0 .32 .127 .627 .354 .854l6.94 6.94c.202 .202 .506 .263 .771 .153 .264-.109 .436-.367 .436-.653v-3.294c0-.552 .448-1 1-1h2c.552 0 1-.448 1-1v-4C16 9.448 15.552 9 15 9Z")
            addPathData("M20 9v6")
        }
        return _arrowBigLeftDash!!
    }

private var _arrowBigLeftDash: ImageVector? = null
