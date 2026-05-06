package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Equal: ImageVector
    get() {
        if (_equal != null) return _equal!!
        _equal = lucideOutlineIcon(
            name = "Equal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 9h14")
            addPathData("M5 15h14")
        }
        return _equal!!
    }

private var _equal: ImageVector? = null
