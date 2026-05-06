package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.NavigationOff: ImageVector
    get() {
        if (_navigationOff != null) return _navigationOff!!
        _navigationOff = lucideOutlineIcon(
            name = "NavigationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.43 8.43 3 11l8 2 2 8 2.57-5.43")
            addPathData("M17.39 11.73 22 2 12.27 6.61")
            addPathData("M2 2 22 22")
        }
        return _navigationOff!!
    }

private var _navigationOff: ImageVector? = null
