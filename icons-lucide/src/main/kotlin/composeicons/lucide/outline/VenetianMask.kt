package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VenetianMask: ImageVector
    get() {
        if (_venetianMask != null) return _venetianMask!!
        _venetianMask = lucideOutlineIcon(
            name = "VenetianMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 11c-1.5 0-2.5 .5-3 2")
            addPathData("M4 6C2.895 6 2 6.895 2 8v4c0 2.761 2.239 5 5 5 1.848 .069 3.615 .776 5 2 1.385-1.224 3.152-1.931 5-2 2.761 0 5-2.239 5-5v-4C22 6.895 21.105 6 20 6h-3c-1.848 .069-3.615 .776-5 2C10.615 6.776 8.848 6.069 7 6Z")
            addPathData("M6 11c1.5 0 2.5 .5 3 2")
        }
        return _venetianMask!!
    }

private var _venetianMask: ImageVector? = null
