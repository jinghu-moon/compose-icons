package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowUpFromDot: ImageVector
    get() {
        if (_arrowUpFromDot != null) return _arrowUpFromDot!!
        _arrowUpFromDot = lucideOutlineIcon(
            name = "ArrowUpFromDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 9 12 2l7 7")
            addPathData("M12 16v-14")
            addPathData("M13 21c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _arrowUpFromDot!!
    }

private var _arrowUpFromDot: ImageVector? = null
