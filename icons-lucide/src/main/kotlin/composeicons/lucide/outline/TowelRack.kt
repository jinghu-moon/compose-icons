package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TowelRack: ImageVector
    get() {
        if (_towelRack != null) return _towelRack!!
        _towelRack = lucideOutlineIcon(
            name = "TowelRack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 7h-2")
            addPathData("M6.5 3h11C18.881 3 20 4.119 20 5.5v14.5c0 .552-.448 1-1 1h-9C9.448 21 9 20.552 9 20v-14.5C9 4.119 7.881 3 6.5 3 5.119 3 4 4.119 4 5.5v11.5c0 .552 .448 1 1 1h4")
            addPathData("M9 7h-7")
        }
        return _towelRack!!
    }

private var _towelRack: ImageVector? = null
