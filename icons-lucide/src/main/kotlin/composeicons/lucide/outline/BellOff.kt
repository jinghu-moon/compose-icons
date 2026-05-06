package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellOff: ImageVector
    get() {
        if (_bellOff != null) return _bellOff!!
        _bellOff = lucideOutlineIcon(
            name = "BellOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.268 21c.357 .619 1.018 1 1.732 1 .714 0 1.375-.381 1.732-1")
            addPathData("M17 17h-13c-.396 0-.755-.233-.915-.595-.16-.362-.092-.785 .175-1.078C4.59 13.956 6 12.499 6 8 6 7.41 6.087 6.823 6.258 6.258")
            addPathData("M2 2 22 22")
            addPathData("M8.668 3.01c1.841-1.229 4.209-1.345 6.161-.301C16.781 3.753 18 5.786 18 8c0 2.687 .77 4.653 1.707 6.05")
        }
        return _bellOff!!
    }

private var _bellOff: ImageVector? = null
