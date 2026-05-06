package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = lucideOutlineIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12c0 1.657-1.343 3-3 3C7.343 15 6 13.657 6 12 6 10.343 7.343 9 9 9c1.657 0 3 1.343 3 3Z")
            addPathData("M9 5h6c3.866 0 7 3.134 7 7h0c0 3.866-3.134 7-7 7h-6C5.134 19 2 15.866 2 12h0C2 8.134 5.134 5 9 5Z")
        }
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
