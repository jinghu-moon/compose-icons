package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ListIndentDecrease: ImageVector
    get() {
        if (_listIndentDecrease != null) return _listIndentDecrease!!
        _listIndentDecrease = lucideOutlineIcon(
            name = "ListIndentDecrease",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5h-10")
            addPathData("M21 12h-10")
            addPathData("M21 19h-10")
            addPathData("M7 8 3 12l4 4")
        }
        return _listIndentDecrease!!
    }

private var _listIndentDecrease: ImageVector? = null
