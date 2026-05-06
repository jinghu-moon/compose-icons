package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = lucideOutlineIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 14c.2-1 .7-1.7 1.5-2.5C17.5 10.6 18 9.3 18 8 18 4.686 15.314 2 12 2 8.686 2 6 4.686 6 8c0 1 .2 2.2 1.5 3.5C8.2 12.2 8.8 13 9 14")
            addPathData("M9 18h6")
            addPathData("M10 22h4")
        }
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
