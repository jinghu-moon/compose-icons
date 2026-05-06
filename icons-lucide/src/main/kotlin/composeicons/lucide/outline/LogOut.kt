package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LogOut: ImageVector
    get() {
        if (_logOut != null) return _logOut!!
        _logOut = lucideOutlineIcon(
            name = "LogOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 17l5-5L16 7")
            addPathData("M21 12h-12")
            addPathData("M9 21h-4C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h4")
        }
        return _logOut!!
    }

private var _logOut: ImageVector? = null
