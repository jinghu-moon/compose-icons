package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = lucideOutlineIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 5h-13")
            addPathData("M11 12h-8")
            addPathData("M16 19h-13")
            addPathData("M18 9v6")
            addPathData("M21 12h-6")
        }
        return _listPlus!!
    }

private var _listPlus: ImageVector? = null
