package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = lucideOutlineIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3v14")
            addPathData("M12 3v8")
            addPathData("M19 3v18")
        }
        return _kanban!!
    }

private var _kanban: ImageVector? = null
