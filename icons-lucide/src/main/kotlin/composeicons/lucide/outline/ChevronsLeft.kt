package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronsLeft: ImageVector
    get() {
        if (_chevronsLeft != null) return _chevronsLeft!!
        _chevronsLeft = lucideOutlineIcon(
            name = "ChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 17 6 12 11 7")
            addPathData("M18 17 13 12 18 7")
        }
        return _chevronsLeft!!
    }

private var _chevronsLeft: ImageVector? = null
