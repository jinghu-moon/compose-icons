package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LocateOff: ImageVector
    get() {
        if (_locateOff != null) return _locateOff!!
        _locateOff = lucideOutlineIcon(
            name = "LocateOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19v3")
            addPathData("M12 2v3")
            addPathData("M18.89 13.24c.406-2.257-.318-4.569-1.939-6.191C15.329 5.428 13.017 4.704 10.76 5.11")
            addPathData("M19 12h3")
            addPathData("M2 12h3")
            addPathData("M2 2 22 22")
            addPathData("M7.05 7.05c-2.734 2.734-2.734 7.166 0 9.9 2.734 2.734 7.166 2.734 9.9 0")
        }
        return _locateOff!!
    }

private var _locateOff: ImageVector? = null
