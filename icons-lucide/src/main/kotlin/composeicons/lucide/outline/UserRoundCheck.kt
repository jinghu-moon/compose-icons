package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRoundCheck: ImageVector
    get() {
        if (_userRoundCheck != null) return _userRoundCheck!!
        _userRoundCheck = lucideOutlineIcon(
            name = "UserRoundCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 21C2 17.855 3.842 15.002 6.709 13.708c2.866-1.294 6.225-.788 8.583 1.292")
            addPathData("M15 8c0 2.761-2.239 5-5 5C7.239 13 5 10.761 5 8 5 5.239 7.239 3 10 3c2.761 0 5 2.239 5 5Z")
            addPathData("M16 19l2 2 4-4")
        }
        return _userRoundCheck!!
    }

private var _userRoundCheck: ImageVector? = null
