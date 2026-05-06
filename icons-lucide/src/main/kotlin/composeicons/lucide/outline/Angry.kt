package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Angry: ImageVector
    get() {
        if (_angry != null) return _angry!!
        _angry = lucideOutlineIcon(
            name = "Angry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M16 16c0 0-1.5-2-4-2C9.5 14 8 16 8 16")
            addPathData("M7.5 8 10 9")
            addPathData("M14 9 16.5 8")
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
        }
        return _angry!!
    }

private var _angry: ImageVector? = null
