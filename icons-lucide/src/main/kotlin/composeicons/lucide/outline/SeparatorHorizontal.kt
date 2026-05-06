package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SeparatorHorizontal: ImageVector
    get() {
        if (_separatorHorizontal != null) return _separatorHorizontal!!
        _separatorHorizontal = lucideOutlineIcon(
            name = "SeparatorHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 16l-4 4L8 16")
            addPathData("M3 12h18")
            addPathData("M8 8 12 4l4 4")
        }
        return _separatorHorizontal!!
    }

private var _separatorHorizontal: ImageVector? = null
