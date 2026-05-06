package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigUpDash: ImageVector
    get() {
        if (_arrowBigUpDash != null) return _arrowBigUpDash!!
        _arrowBigUpDash = lucideOutlineIcon(
            name = "ArrowBigUpDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 16c.552 0 1-.448 1-1v-2c0-.552 .448-1 1-1h3.293c.286 0 .544-.172 .653-.436 .109-.264 .049-.568-.153-.771L12.854 3.854C12.628 3.627 12.32 3.5 12 3.5c-.32 0-.628 .127-.854 .354L4.206 10.794c-.202 .202-.262 .506-.152 .77 .109 .264 .367 .436 .652 .436h3.294c.552 0 1 .448 1 1v2c0 .552 .448 1 1 1Z")
            addPathData("M9 20h6")
        }
        return _arrowBigUpDash!!
    }

private var _arrowBigUpDash: ImageVector? = null
