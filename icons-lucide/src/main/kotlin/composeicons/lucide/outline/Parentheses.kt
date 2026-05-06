package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Parentheses: ImageVector
    get() {
        if (_parentheses != null) return _parentheses!!
        _parentheses = lucideOutlineIcon(
            name = "Parentheses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21C8 21 4 18 4 12 4 6 8 3 8 3")
            addPathData("M16 3c0 0 4 3 4 9 0 6-4 9-4 9")
        }
        return _parentheses!!
    }

private var _parentheses: ImageVector? = null
