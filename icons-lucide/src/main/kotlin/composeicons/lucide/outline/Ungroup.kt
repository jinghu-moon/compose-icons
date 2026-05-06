package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ungroup: ImageVector
    get() {
        if (_ungroup != null) return _ungroup!!
        _ungroup = lucideOutlineIcon(
            name = "Ungroup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4h6c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-6C5.448 10 5 9.552 5 9v-4C5 4.448 5.448 4 6 4Z")
            addPathData("M12 14h6c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1Z")
        }
        return _ungroup!!
    }

private var _ungroup: ImageVector? = null
