package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowUpDown: ImageVector
    get() {
        if (_arrowUpDown != null) return _arrowUpDown!!
        _arrowUpDown = lucideOutlineIcon(
            name = "ArrowUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 16l-4 4L13 16")
            addPathData("M17 20v-16")
            addPathData("M3 8 7 4l4 4")
            addPathData("M7 4v16")
        }
        return _arrowUpDown!!
    }

private var _arrowUpDown: ImageVector? = null
