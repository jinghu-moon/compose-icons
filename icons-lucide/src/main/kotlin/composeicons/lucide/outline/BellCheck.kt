package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellCheck: ImageVector
    get() {
        if (_bellCheck != null) return _bellCheck!!
        _bellCheck = lucideOutlineIcon(
            name = "BellCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.268 21c.357 .619 1.018 1 1.732 1 .714 0 1.375-.381 1.732-1")
            addPathData("M15 8l2 2L21 6")
            addPathData("M16.861 4.482C15.336 2.375 12.626 1.49 10.151 2.292 7.676 3.094 6 5.399 6 8c0 4.499-1.411 5.956-2.738 7.326")
            addPathData("M3.262 15.326c-.267 .293-.336 .715-.176 1.077 .16 .362 .518 .596 .914 .597h16c.396 0 .755-.233 .915-.595 .16-.362 .092-.785-.175-1.078-.531-.548-1.075-1.109-1.537-1.873")
        }
        return _bellCheck!!
    }

private var _bellCheck: ImageVector? = null
