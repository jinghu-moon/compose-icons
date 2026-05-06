package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronsDownUp: ImageVector
    get() {
        if (_chevronsDownUp != null) return _chevronsDownUp!!
        _chevronsDownUp = lucideOutlineIcon(
            name = "ChevronsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 20l5-5 5 5")
            addPathData("M7 4l5 5L17 4")
        }
        return _chevronsDownUp!!
    }

private var _chevronsDownUp: ImageVector? = null
