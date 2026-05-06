package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wand: ImageVector
    get() {
        if (_wand != null) return _wand!!
        _wand = lucideOutlineIcon(
            name = "Wand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 4v-2")
            addPathData("M15 16v-2")
            addPathData("M8 9h2")
            addPathData("M20 9h2")
            addPathData("M17.8 11.8 19 13")
            addPathData("M15 9h.01")
            addPathData("M17.8 6.2 19 5")
            addPathData("M3 21l9-9")
            addPathData("M12.2 6.2 11 5")
        }
        return _wand!!
    }

private var _wand: ImageVector? = null
