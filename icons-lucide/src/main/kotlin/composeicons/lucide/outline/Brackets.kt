package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Brackets: ImageVector
    get() {
        if (_brackets != null) return _brackets!!
        _brackets = lucideOutlineIcon(
            name = "Brackets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3h3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-3")
            addPathData("M8 21h-3C4.448 21 4 20.552 4 20v-16C4 3.448 4.448 3 5 3h3")
        }
        return _brackets!!
    }

private var _brackets: ImageVector? = null
