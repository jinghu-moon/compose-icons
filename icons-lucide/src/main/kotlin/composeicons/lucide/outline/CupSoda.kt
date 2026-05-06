package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CupSoda: ImageVector
    get() {
        if (_cupSoda != null) return _cupSoda!!
        _cupSoda = lucideOutlineIcon(
            name = "CupSoda",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 8 7.75 20.28c.14 .994 .996 1.73 2 1.72h4.54c1.004 .01 1.859-.726 2-1.72L18 8")
            addPathData("M5 8h14")
            addPathData("M7 15c1.599-.67 3.401-.67 5 0 1.599 .67 3.401 .67 5 0")
            addPathData("M12 8 13 2h2")
        }
        return _cupSoda!!
    }

private var _cupSoda: ImageVector? = null
