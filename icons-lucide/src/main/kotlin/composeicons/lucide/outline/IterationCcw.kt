package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IterationCcw: ImageVector
    get() {
        if (_iterationCcw != null) return _iterationCcw!!
        _iterationCcw = lucideOutlineIcon(
            name = "IterationCcw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 14l4 4-4 4")
            addPathData("M20 10C20 5.582 16.418 2 12 2 7.582 2 4 5.582 4 10c0 4.418 3.582 8 8 8h8")
        }
        return _iterationCcw!!
    }

private var _iterationCcw: ImageVector? = null
