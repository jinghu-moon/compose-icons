package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = lucideOutlineIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 12h-14c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h14")
            addPathData("M18 8C18 5.5 16 5.5 16 3")
            addPathData("M21 16c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1")
            addPathData("M22 8C22 5.5 20 5.5 20 3")
            addPathData("M7 12v4")
        }
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
