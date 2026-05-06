package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListTree: ImageVector
    get() {
        if (_listTree != null) return _listTree!!
        _listTree = lucideOutlineIcon(
            name = "ListTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 5h13")
            addPathData("M13 12h8")
            addPathData("M13 19h8")
            addPathData("M3 10c0 1.105 .895 2 2 2h3")
            addPathData("M3 5v12c0 1.105 .895 2 2 2h3")
        }
        return _listTree!!
    }

private var _listTree: ImageVector? = null
