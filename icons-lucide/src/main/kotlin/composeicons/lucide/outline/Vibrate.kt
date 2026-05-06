package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = lucideOutlineIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8l2 2L2 12l2 2L2 16")
            addPathData("M22 8l-2 2 2 2-2 2 2 2")
            addPathData("M9 5h6c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-6C8.448 19 8 18.552 8 18v-12C8 5.448 8.448 5 9 5Z")
        }
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
