package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowDownToDot: ImageVector
    get() {
        if (_arrowDownToDot != null) return _arrowDownToDot!!
        _arrowDownToDot = lucideOutlineIcon(
            name = "ArrowDownToDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v14")
            addPathData("M19 9l-7 7L5 9")
            addPathData("M13 21c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _arrowDownToDot!!
    }

private var _arrowDownToDot: ImageVector? = null
