package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointerClick: ImageVector
    get() {
        if (_mousePointerClick != null) return _mousePointerClick!!
        _mousePointerClick = lucideOutlineIcon(
            name = "MousePointerClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 4.1 12 6")
            addPathData("M5.1 8 2.2 7.2")
            addPathData("M6 12 4.1 14")
            addPathData("M7.2 2.2 8 5.1")
            addPathData("M9.037 9.69c-.079-.187-.037-.403 .106-.547 .144-.144 .36-.186 .547-.106l11 4.5c.201 .082 .326 .285 .309 .501-.017 .216-.172 .397-.383 .448l-4.349 1.041c-.366 .087-.652 .373-.74 .739l-1.04 4.35c-.05 .212-.231 .367-.448 .384-.217 .017-.42-.109-.502-.31Z")
        }
        return _mousePointerClick!!
    }

private var _mousePointerClick: ImageVector? = null
