package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListFilter: ImageVector
    get() {
        if (_listFilter != null) return _listFilter!!
        _listFilter = lucideOutlineIcon(
            name = "ListFilter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 5h20")
            addPathData("M6 12h12")
            addPathData("M9 19h6")
        }
        return _listFilter!!
    }

private var _listFilter: ImageVector? = null
