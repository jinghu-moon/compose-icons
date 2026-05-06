package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListStart: ImageVector
    get() {
        if (_listStart != null) return _listStart!!
        _listStart = lucideOutlineIcon(
            name = "ListStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5h6")
            addPathData("M3 12h13")
            addPathData("M3 19h13")
            addPathData("M16 8 13 5 16 2")
            addPathData("M21 19v-12C21 5.895 20.105 5 19 5h-6")
        }
        return _listStart!!
    }

private var _listStart: ImageVector? = null
