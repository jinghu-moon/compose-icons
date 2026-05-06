package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = lucideOutlineIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12c0 2.209-1.791 4-4 4C9.791 16 8 14.209 8 12 8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4Z")
            addPathData("M12 2v2")
            addPathData("M12 20v2")
            addPathData("M4.93 4.93 6.34 6.34")
            addPathData("M17.66 17.66l1.41 1.41")
            addPathData("M2 12h2")
            addPathData("M20 12h2")
            addPathData("M6.34 17.66 4.93 19.07")
            addPathData("M19.07 4.93 17.66 6.34")
        }
        return _sun!!
    }

private var _sun: ImageVector? = null
