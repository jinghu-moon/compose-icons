package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = lucideOutlineIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 22h8")
            addPathData("M7 10h10")
            addPathData("M12 15v7")
            addPathData("M12 15c2.761 0 5-2.239 5-5C17 8 16.5 6 15 2h-6C7.5 6 7 8 7 10c0 2.761 2.239 5 5 5Z")
        }
        return _wine!!
    }

private var _wine: ImageVector? = null
