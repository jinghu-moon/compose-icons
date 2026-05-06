package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ToyBrick: ImageVector
    get() {
        if (_toyBrick != null) return _toyBrick!!
        _toyBrick = lucideOutlineIcon(
            name = "ToyBrick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8h16c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-16C3.448 20 3 19.552 3 19v-10C3 8.448 3.448 8 4 8Z")
            addPathData("M10 8v-3C10 4.4 9.6 4 9 4h-3C5.448 4 5 4.448 5 5v3")
            addPathData("M19 8v-3C19 4.4 18.6 4 18 4h-3c-.552 0-1 .448-1 1v3")
        }
        return _toyBrick!!
    }

private var _toyBrick: ImageVector? = null
