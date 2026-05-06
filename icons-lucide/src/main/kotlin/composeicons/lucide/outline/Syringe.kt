package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = lucideOutlineIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 2l4 4")
            addPathData("M17 7 20 4")
            addPathData("M19 9 8.7 19.3c-1 1-2.5 1-3.4 0l-.6-.6c-1-1-1-2.5 0-3.4L15 5")
            addPathData("M9 11l4 4")
            addPathData("M5 19 2 22")
            addPathData("M14 4l6 6")
        }
        return _syringe!!
    }

private var _syringe: ImageVector? = null
