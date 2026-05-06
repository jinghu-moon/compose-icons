package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TriangleAlert: ImageVector
    get() {
        if (_triangleAlert != null) return _triangleAlert!!
        _triangleAlert = lucideOutlineIcon(
            name = "TriangleAlert",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.73 18l-8-14C13.375 3.373 12.71 2.986 11.99 2.986c-.72 0-1.385 .387-1.74 1.014l-8 14c-.359 .622-.357 1.388 .004 2.008 .362 .62 1.028 .999 1.746 .992h16c.714-.001 1.374-.382 1.731-1.001 .357-.619 .357-1.381-.001-1.999")
            addPathData("M12 9v4")
            addPathData("M12 17h.01")
        }
        return _triangleAlert!!
    }

private var _triangleAlert: ImageVector? = null
