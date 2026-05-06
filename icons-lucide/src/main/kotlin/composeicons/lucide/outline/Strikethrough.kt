package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) return _strikethrough!!
        _strikethrough = lucideOutlineIcon(
            name = "Strikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 4h-7C8.026 3.999 7.112 4.472 6.549 5.267 5.987 6.063 5.845 7.082 6.17 8")
            addPathData("M14 12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-8")
            addPathData("M4 12h16")
        }
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
