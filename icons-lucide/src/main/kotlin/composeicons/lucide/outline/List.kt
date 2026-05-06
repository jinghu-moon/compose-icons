package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.List: ImageVector
    get() {
        if (_list != null) return _list!!
        _list = lucideOutlineIcon(
            name = "List",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h.01")
            addPathData("M3 12h.01")
            addPathData("M3 19h.01")
            addPathData("M8 5h13")
            addPathData("M8 12h13")
            addPathData("M8 19h13")
        }
        return _list!!
    }

private var _list: ImageVector? = null
