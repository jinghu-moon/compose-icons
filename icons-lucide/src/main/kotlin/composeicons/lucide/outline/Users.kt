package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = lucideOutlineIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 21v-2c0-2.209-1.791-4-4-4h-6C3.791 15 2 16.791 2 19v2")
            addPathData("M16 3.128c1.764 .457 2.996 2.049 2.996 3.872 0 1.823-1.232 3.415-2.996 3.872")
            addPathData("M22 21v-2c-.001-1.823-1.235-3.414-3-3.87")
            addPathData("M13 7c0 2.209-1.791 4-4 4C6.791 11 5 9.209 5 7 5 4.791 6.791 3 9 3c2.209 0 4 1.791 4 4Z")
        }
        return _users!!
    }

private var _users: ImageVector? = null
