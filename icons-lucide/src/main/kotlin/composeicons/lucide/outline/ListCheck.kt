package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListCheck: ImageVector
    get() {
        if (_listCheck != null) return _listCheck!!
        _listCheck = lucideOutlineIcon(
            name = "ListCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 5h-13")
            addPathData("M16 12h-13")
            addPathData("M11 19h-8")
            addPathData("M15 18l2 2 4-4")
        }
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
