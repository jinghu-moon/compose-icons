package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellRing: ImageVector
    get() {
        if (_bellRing != null) return _bellRing!!
        _bellRing = lucideOutlineIcon(
            name = "BellRing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.268 21c.357 .619 1.018 1 1.732 1 .714 0 1.375-.381 1.732-1")
            addPathData("M22 8C22 5.7 21.2 3.7 20 2")
            addPathData("M3.262 15.326c-.267 .293-.336 .715-.176 1.077 .16 .362 .518 .596 .914 .597h16c.396 0 .755-.233 .915-.595 .16-.362 .092-.785-.175-1.078C19.41 13.956 18 12.499 18 8 18 4.686 15.314 2 12 2 8.686 2 6 4.686 6 8c0 4.499-1.411 5.956-2.738 7.326")
            addPathData("M4 2C2.8 3.7 2 5.7 2 8")
        }
        return _bellRing!!
    }

private var _bellRing: ImageVector? = null
