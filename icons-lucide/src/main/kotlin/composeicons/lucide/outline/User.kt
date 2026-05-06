package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = lucideOutlineIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 21v-2c0-2.209-1.791-4-4-4h-6C6.791 15 5 16.791 5 19v2")
            addPathData("M16 7c0 2.209-1.791 4-4 4C9.791 11 8 9.209 8 7 8 4.791 9.791 3 12 3c2.209 0 4 1.791 4 4Z")
        }
        return _user!!
    }

private var _user: ImageVector? = null
