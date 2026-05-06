package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wifi: ImageVector
    get() {
        if (_wifi != null) return _wifi!!
        _wifi = lucideOutlineIcon(
            name = "Wifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h.01")
            addPathData("M2 8.82c5.694-5.093 14.306-5.093 20 0")
            addPathData("M5 12.859c3.888-3.811 10.112-3.811 14 0")
            addPathData("M8.5 16.429c1.944-1.906 5.056-1.906 7 0")
        }
        return _wifi!!
    }

private var _wifi: ImageVector? = null
