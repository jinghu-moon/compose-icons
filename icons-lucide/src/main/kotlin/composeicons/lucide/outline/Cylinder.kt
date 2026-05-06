package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = lucideOutlineIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5c0 1.657-4.029 3-9 3C7.029 8 3 6.657 3 5 3 3.343 7.029 2 12 2c4.971 0 9 1.343 9 3Z")
            addPathData("M3 5v14c0 1.657 4.029 3 9 3 4.971 0 9-1.343 9-3v-14")
        }
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
