package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Minimize2: ImageVector
    get() {
        if (_minimize2 != null) return _minimize2!!
        _minimize2 = lucideOutlineIcon(
            name = "Minimize2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10 21 3")
            addPathData("M20 10h-6v-6")
            addPathData("M3 21l7-7")
            addPathData("M4 14h6v6")
        }
        return _minimize2!!
    }

private var _minimize2: ImageVector? = null
