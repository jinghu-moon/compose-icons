package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListEnd: ImageVector
    get() {
        if (_listEnd != null) return _listEnd!!
        _listEnd = lucideOutlineIcon(
            name = "ListEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 5h-13")
            addPathData("M16 12h-13")
            addPathData("M9 19h-6")
            addPathData("M16 16l-3 3 3 3")
            addPathData("M21 5v12c0 1.105-.895 2-2 2h-6")
        }
        return _listEnd!!
    }

private var _listEnd: ImageVector? = null
