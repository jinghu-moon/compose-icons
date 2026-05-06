package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListCollapse: ImageVector
    get() {
        if (_listCollapse != null) return _listCollapse!!
        _listCollapse = lucideOutlineIcon(
            name = "ListCollapse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5h11")
            addPathData("M10 12h11")
            addPathData("M10 19h11")
            addPathData("M3 10 6 7 3 4")
            addPathData("M3 20 6 17 3 14")
        }
        return _listCollapse!!
    }

private var _listCollapse: ImageVector? = null
