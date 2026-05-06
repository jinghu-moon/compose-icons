package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CornerDownLeft: ImageVector
    get() {
        if (_cornerDownLeft != null) return _cornerDownLeft!!
        _cornerDownLeft = lucideOutlineIcon(
            name = "CornerDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4v7c0 2.209-1.791 4-4 4h-12")
            addPathData("M9 10 4 15l5 5")
        }
        return _cornerDownLeft!!
    }

private var _cornerDownLeft: ImageVector? = null
