package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserKey: ImageVector
    get() {
        if (_userKey != null) return _userKey!!
        _userKey = lucideOutlineIcon(
            name = "UserKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11v6")
            addPathData("M20 13h2")
            addPathData("M3 21v-2C3 16.791 4.791 15 7 15h6c.73-0 1.447 .2 2.072 .578")
            addPathData("M14 7c0 2.209-1.791 4-4 4C7.791 11 6 9.209 6 7 6 4.791 7.791 3 10 3c2.209 0 4 1.791 4 4Z")
            addPathData("M22 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _userKey!!
    }

private var _userKey: ImageVector? = null
