package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = lucideOutlineIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 19 5 13")
            addPathData("M5 21 3 19")
            addPathData("M8 16 4 20")
            addPathData("M9.5 17.5 21 6v-3h-3L6.5 14.5")
        }
        return _sword!!
    }

private var _sword: ImageVector? = null
