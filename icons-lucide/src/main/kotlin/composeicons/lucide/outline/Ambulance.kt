package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ambulance: ImageVector
    get() {
        if (_ambulance != null) return _ambulance!!
        _ambulance = lucideOutlineIcon(
            name = "Ambulance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10h-4")
            addPathData("M14 18v-12C14 4.895 13.105 4 12 4h-8C2.895 4 2 4.895 2 6v11c0 .552 .448 1 1 1h2")
            addPathData("M19 18h2c.552 0 1-.448 1-1v-3.28c-0-.43-.276-.812-.684-.948l-1.923-.641c-.252-.084-.46-.265-.578-.502L17.276 8.553C17.107 8.214 16.761 8 16.382 8h-2.382")
            addPathData("M8 8v4")
            addPathData("M9 18h6")
            addPathData("M19 18c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M9 18c0 1.105-.895 2-2 2C5.895 20 5 19.105 5 18c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
