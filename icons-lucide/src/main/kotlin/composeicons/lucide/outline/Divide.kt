package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = lucideOutlineIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 6c0 .552-.448 1-1 1C11.448 7 11 6.552 11 6c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M5 12h14")
            addPathData("M13 18c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _divide!!
    }

private var _divide: ImageVector? = null
