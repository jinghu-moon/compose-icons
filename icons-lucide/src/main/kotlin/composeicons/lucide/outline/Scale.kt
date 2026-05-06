package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Scale: ImageVector
    get() {
        if (_scale != null) return _scale!!
        _scale = lucideOutlineIcon(
            name = "Scale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v18")
            addPathData("M19 8l3 8c-1.778 1.333-4.222 1.333-6 0ZM19 8v-1")
            addPathData("M3 7h1C6.79 7 9.538 6.313 12 5c2.462 1.313 5.21 2 8 2h1")
            addPathData("M5 8l3 8C6.222 17.333 3.778 17.333 2 16ZM5 8v-1")
            addPathData("M7 21h10")
        }
        return _scale!!
    }

private var _scale: ImageVector? = null
