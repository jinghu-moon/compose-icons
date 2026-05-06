package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronLast: ImageVector
    get() {
        if (_chevronLast != null) return _chevronLast!!
        _chevronLast = lucideOutlineIcon(
            name = "ChevronLast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 18l6-6L7 6")
            addPathData("M17 6v12")
        }
        return _chevronLast!!
    }

private var _chevronLast: ImageVector? = null
