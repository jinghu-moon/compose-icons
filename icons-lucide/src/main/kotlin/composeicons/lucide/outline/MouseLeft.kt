package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MouseLeft: ImageVector
    get() {
        if (_mouseLeft != null) return _mouseLeft!!
        _mouseLeft = lucideOutlineIcon(
            name = "MouseLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 7.318v2.682")
            addPathData("M5 10v5c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7v-6C19 5.473 16.392 2.485 13 2")
            addPathData("M9 4C9 5.105 8.105 6 7 6 5.895 6 5 5.105 5 4 5 2.895 5.895 2 7 2c1.105 0 2 .895 2 2Z")
        }
        return _mouseLeft!!
    }

private var _mouseLeft: ImageVector? = null
