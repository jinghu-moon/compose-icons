package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRoundX: ImageVector
    get() {
        if (_userRoundX != null) return _userRoundX!!
        _userRoundX = lucideOutlineIcon(
            name = "UserRoundX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 21C2 18.168 3.497 15.547 5.937 14.109 8.377 12.67 11.395 12.629 13.873 14")
            addPathData("M15 8c0 2.761-2.239 5-5 5C7.239 13 5 10.761 5 8 5 5.239 7.239 3 10 3c2.761 0 5 2.239 5 5Z")
            addPathData("M17 17l5 5")
            addPathData("M22 17l-5 5")
        }
        return _userRoundX!!
    }

private var _userRoundX: ImageVector? = null
