package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PilcrowLeft: ImageVector
    get() {
        if (_pilcrowLeft != null) return _pilcrowLeft!!
        _pilcrowLeft = lucideOutlineIcon(
            name = "PilcrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v11")
            addPathData("M14 9h-3C9.343 9 8 7.657 8 6 8 4.343 9.343 3 11 3h9")
            addPathData("M18 3v11")
            addPathData("M22 18h-20L6 14")
            addPathData("M6 22 2 18")
        }
        return _pilcrowLeft!!
    }

private var _pilcrowLeft: ImageVector? = null
