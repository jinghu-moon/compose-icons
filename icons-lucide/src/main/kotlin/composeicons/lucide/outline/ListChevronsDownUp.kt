package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListChevronsDownUp: ImageVector
    get() {
        if (_listChevronsDownUp != null) return _listChevronsDownUp!!
        _listChevronsDownUp = lucideOutlineIcon(
            name = "ListChevronsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h8")
            addPathData("M3 12h8")
            addPathData("M3 19h8")
            addPathData("M15 5l3 3L21 5")
            addPathData("M15 19l3-3 3 3")
        }
        return _listChevronsDownUp!!
    }

private var _listChevronsDownUp: ImageVector? = null
