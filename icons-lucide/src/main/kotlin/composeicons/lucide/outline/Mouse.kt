package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Mouse: ImageVector
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = lucideOutlineIcon(
            name = "Mouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2h0c3.866 0 7 3.134 7 7v6c0 3.866-3.134 7-7 7h0C8.134 22 5 18.866 5 15v-6C5 5.134 8.134 2 12 2Z")
            addPathData("M12 6v4")
        }
        return _mouse!!
    }

private var _mouse: ImageVector? = null
