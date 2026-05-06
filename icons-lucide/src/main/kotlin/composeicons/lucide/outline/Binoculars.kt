package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = lucideOutlineIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10h4")
            addPathData("M19 7v-3C19 3.448 18.552 3 18 3h-2c-.552 0-1 .448-1 1v3")
            addPathData("M20 21c1.105 0 2-.895 2-2v-3.851c0-1.39-2-2.962-2-4.829v-2.32C20 7.448 19.552 7 19 7h-4c-.552 0-1 .448-1 1v11c0 1.105 .895 2 2 2Z")
            addPathData("M22 16h-20")
            addPathData("M4 21C2.895 21 2 20.105 2 19v-3.851C2 13.759 4 12.187 4 10.32v-2.32C4 7.448 4.448 7 5 7h4c.552 0 1 .448 1 1v11c0 1.105-.895 2-2 2Z")
            addPathData("M9 7v-3C9 3.448 8.552 3 8 3h-2C5.448 3 5 3.448 5 4v3")
        }
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
