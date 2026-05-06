package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserCog: ImageVector
    get() {
        if (_userCog != null) return _userCog!!
        _userCog = lucideOutlineIcon(
            name = "UserCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15h-4C3.791 15 2 16.791 2 19v2")
            addPathData("M14.305 16.53l.923-.382")
            addPathData("M15.228 13.852l-.923-.383")
            addPathData("M16.852 12.228l-.383-.923")
            addPathData("M16.852 17.772l-.383 .924")
            addPathData("M19.148 12.228l.383-.923")
            addPathData("M19.53 18.696l-.382-.924")
            addPathData("M20.772 13.852l.924-.383")
            addPathData("M20.772 16.148l.924 .383")
            addPathData("M21 15c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M13 7c0 2.209-1.791 4-4 4C6.791 11 5 9.209 5 7 5 4.791 6.791 3 9 3c2.209 0 4 1.791 4 4Z")
        }
        return _userCog!!
    }

private var _userCog: ImageVector? = null
