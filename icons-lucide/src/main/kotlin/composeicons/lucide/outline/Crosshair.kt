package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = lucideOutlineIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M22 12h-4")
            addPathData("M6 12h-4")
            addPathData("M12 6v-4")
            addPathData("M12 22v-4")
        }
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
