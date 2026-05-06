package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClockCheck: ImageVector
    get() {
        if (_clockCheck != null) return _clockCheck!!
        _clockCheck = lucideOutlineIcon(
            name = "ClockCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v6l4 2")
            addPathData("M22 12C22 6.607 17.724 2.186 12.334 2.006 6.944 1.826 2.382 5.952 2.022 11.333 1.662 16.714 5.634 21.411 11 21.95")
            addPathData("M22 16l-5.5 5.5L14 19")
        }
        return _clockCheck!!
    }

private var _clockCheck: ImageVector? = null
