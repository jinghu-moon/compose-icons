package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigDownDash: ImageVector
    get() {
        if (_arrowBigDownDash != null) return _arrowBigDownDash!!
        _arrowBigDownDash = lucideOutlineIcon(
            name = "ArrowBigDownDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8c.552 0 1 .448 1 1v2c0 .552 .448 1 1 1h3.293c.286-0 .544 .172 .653 .436 .109 .264 .049 .568-.153 .771l-6.939 6.939c-.226 .227-.534 .354-.854 .354-.32 0-.628-.127-.854-.354L4.206 13.206c-.202-.202-.262-.506-.152-.77 .109-.264 .367-.436 .652-.436h3.294c.552 0 1-.448 1-1v-2C9 8.448 9.448 8 10 8Z")
            addPathData("M9 4h6")
        }
        return _arrowBigDownDash!!
    }

private var _arrowBigDownDash: ImageVector? = null
