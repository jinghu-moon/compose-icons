package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Dessert: ImageVector
    get() {
        if (_dessert != null) return _dessert!!
        _dessert = lucideOutlineIcon(
            name = "Dessert",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.162 3.167C5.429 4.052 1.998 8.185 2 13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-1c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v1c.002 1.105 .898 1.999 2.003 1.997 1.105-.002 1.999-.898 1.997-2.003C21.998 8.182 18.569 4.053 13.839 3.168")
            addPathData("M20.804 14.869c-.882 4.158-4.553 7.132-8.804 7.132-4.251 0-7.922-2.974-8.804-7.132")
            addPathData("M14 4c0 1.105-.895 2-2 2C10.895 6 10 5.105 10 4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _dessert!!
    }

private var _dessert: ImageVector? = null
