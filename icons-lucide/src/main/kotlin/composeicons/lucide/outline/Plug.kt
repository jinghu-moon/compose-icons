package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = lucideOutlineIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22v-5")
            addPathData("M15 8v-6")
            addPathData("M17 8c.552 0 1 .448 1 1v4c0 2.209-1.791 4-4 4h-4C7.791 17 6 15.209 6 13v-4C6 8.448 6.448 8 7 8Z")
            addPathData("M9 8v-6")
        }
        return _plug!!
    }

private var _plug: ImageVector? = null
