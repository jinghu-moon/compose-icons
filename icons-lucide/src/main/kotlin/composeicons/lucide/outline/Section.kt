package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Section: ImageVector
    get() {
        if (_section != null) return _section!!
        _section = lucideOutlineIcon(
            name = "Section",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 5C16 3.343 14.209 2 12 2 9.791 2 8 3.343 8 5c0 4 8 3 8 7 0 1.657-1.791 3-4 3C9.791 15 8 13.657 8 12")
            addPathData("M8 19c0 1.657 1.791 3 4 3 2.209 0 4-1.343 4-3C16 15 8 16 8 12 8 10.343 9.791 9 12 9c2.209 0 4 1.343 4 3")
        }
        return _section!!
    }

private var _section: ImageVector? = null
