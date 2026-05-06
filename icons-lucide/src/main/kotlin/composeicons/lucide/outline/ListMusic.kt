package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListMusic: ImageVector
    get() {
        if (_listMusic != null) return _listMusic!!
        _listMusic = lucideOutlineIcon(
            name = "ListMusic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 5h-13")
            addPathData("M11 12h-8")
            addPathData("M11 19h-8")
            addPathData("M21 16v-11")
            addPathData("M21 16c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _listMusic!!
    }

private var _listMusic: ImageVector? = null
