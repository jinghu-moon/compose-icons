package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellDot: ImageVector
    get() {
        if (_bellDot != null) return _bellDot!!
        _bellDot = lucideOutlineIcon(
            name = "BellDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.268 21c.357 .619 1.018 1 1.732 1 .714 0 1.375-.381 1.732-1")
            addPathData("M11.68 2.009C8.495 2.179 6 4.811 6 8c0 4.499-1.411 5.956-2.738 7.326-.267 .293-.336 .715-.176 1.077 .16 .362 .518 .596 .914 .597h16c.396 0 .755-.233 .915-.595 .16-.362 .092-.785-.175-1.078-.824-.85-1.678-1.731-2.21-3.348")
            addPathData("M21 5c0 1.657-1.343 3-3 3C16.343 8 15 6.657 15 5 15 3.343 16.343 2 18 2c1.657 0 3 1.343 3 3Z")
        }
        return _bellDot!!
    }

private var _bellDot: ImageVector? = null
