package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CreativeCommons: ImageVector
    get() {
        if (_creativeCommons != null) return _creativeCommons!!
        _creativeCommons = lucideOutlineIcon(
            name = "CreativeCommons",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M10 9.3c-1.254-.574-2.739-.15-3.5 1-.677 1.032-.677 2.368 0 3.4 .733 1.188 2.25 1.621 3.5 1")
            addPathData("M17 9.3c-1.254-.574-2.739-.15-3.5 1-.677 1.032-.677 2.368 0 3.4 .733 1.188 2.25 1.621 3.5 1")
        }
        return _creativeCommons!!
    }

private var _creativeCommons: ImageVector? = null
