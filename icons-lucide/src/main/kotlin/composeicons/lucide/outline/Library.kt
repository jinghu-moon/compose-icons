package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Library: ImageVector
    get() {
        if (_library != null) return _library!!
        _library = lucideOutlineIcon(
            name = "Library",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 6l4 14")
            addPathData("M12 6v14")
            addPathData("M8 8v12")
            addPathData("M4 4v16")
        }
        return _library!!
    }

private var _library: ImageVector? = null
