package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellMinus: ImageVector
    get() {
        if (_bellMinus != null) return _bellMinus!!
        _bellMinus = lucideOutlineIcon(
            name = "BellMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.268 21c.357 .619 1.018 1 1.732 1 .714 0 1.375-.381 1.732-1")
            addPathData("M15 8h6")
            addPathData("M16.243 3.757C14.527 2.041 11.946 1.527 9.704 2.456 7.462 3.385 6 5.573 6 8c0 4.499-1.411 5.956-2.738 7.326-.267 .293-.336 .715-.176 1.077 .16 .362 .518 .596 .914 .597h16c.396 0 .755-.233 .915-.595 .16-.362 .092-.785-.175-1.078C19.823 14.376 19.117 13.242 18.667 12")
        }
        return _bellMinus!!
    }

private var _bellMinus: ImageVector? = null
