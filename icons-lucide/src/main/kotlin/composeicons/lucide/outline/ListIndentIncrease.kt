package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListIndentIncrease: ImageVector
    get() {
        if (_listIndentIncrease != null) return _listIndentIncrease!!
        _listIndentIncrease = lucideOutlineIcon(
            name = "ListIndentIncrease",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5h-10")
            addPathData("M21 12h-10")
            addPathData("M21 19h-10")
            addPathData("M3 8l4 4L3 16")
        }
        return _listIndentIncrease!!
    }

private var _listIndentIncrease: ImageVector? = null
