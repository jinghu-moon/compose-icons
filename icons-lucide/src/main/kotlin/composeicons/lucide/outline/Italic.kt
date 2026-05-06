package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Italic: ImageVector
    get() {
        if (_italic != null) return _italic!!
        _italic = lucideOutlineIcon(
            name = "Italic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 4h-9")
            addPathData("M14 20h-9")
            addPathData("M15 4 9 20")
        }
        return _italic!!
    }

private var _italic: ImageVector? = null
