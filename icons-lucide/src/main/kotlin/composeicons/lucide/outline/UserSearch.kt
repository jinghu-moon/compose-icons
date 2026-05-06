package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserSearch: ImageVector
    get() {
        if (_userSearch != null) return _userSearch!!
        _userSearch = lucideOutlineIcon(
            name = "UserSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 7c0 2.209-1.791 4-4 4C7.791 11 6 9.209 6 7 6 4.791 7.791 3 10 3c2.209 0 4 1.791 4 4Z")
            addPathData("M10.3 15h-3.3C4.791 15 3 16.791 3 19v2")
            addPathData("M20 17c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M21 21 19.1 19.1")
        }
        return _userSearch!!
    }

private var _userSearch: ImageVector? = null
