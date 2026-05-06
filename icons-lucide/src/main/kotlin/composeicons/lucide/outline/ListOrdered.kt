package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListOrdered: ImageVector
    get() {
        if (_listOrdered != null) return _listOrdered!!
        _listOrdered = lucideOutlineIcon(
            name = "ListOrdered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5h10")
            addPathData("M11 12h10")
            addPathData("M11 19h10")
            addPathData("M4 4h1v5")
            addPathData("M4 9h2")
            addPathData("M6.5 20h-3.1C3.4 19 6 18.075 6 16.5c0-.617-.378-1.171-.952-1.397-.574-.225-1.228-.076-1.648 .377")
        }
        return _listOrdered!!
    }

private var _listOrdered: ImageVector? = null
