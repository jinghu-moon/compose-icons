package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IterationCw: ImageVector
    get() {
        if (_iterationCw != null) return _iterationCw!!
        _iterationCw = lucideOutlineIcon(
            name = "IterationCw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10C4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8")
            addPathData("M8 22 4 18 8 14")
        }
        return _iterationCw!!
    }

private var _iterationCw: ImageVector? = null
