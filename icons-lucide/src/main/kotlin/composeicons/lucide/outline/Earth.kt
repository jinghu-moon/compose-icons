package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Earth: ImageVector
    get() {
        if (_earth != null) return _earth!!
        _earth = lucideOutlineIcon(
            name = "Earth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21.54 15h-4.54c-1.105 0-2 .895-2 2v4.54")
            addPathData("M7 3.34v1.66c0 1.657 1.343 3 3 3 1.105 0 2 .895 2 2 0 1.1 .9 2 2 2 1.105 0 2-.895 2-2 0-1.1 .9-2 2-2h3.17")
            addPathData("M11 21.95v-3.95c0-1.105-.895-2-2-2C7.895 16 7 15.105 7 14v-1C7 11.895 6.105 11 5 11h-2.95")
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
        }
        return _earth!!
    }

private var _earth: ImageVector? = null
