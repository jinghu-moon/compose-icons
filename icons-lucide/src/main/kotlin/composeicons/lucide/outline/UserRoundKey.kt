package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRoundKey: ImageVector
    get() {
        if (_userRoundKey != null) return _userRoundKey!!
        _userRoundKey = lucideOutlineIcon(
            name = "UserRoundKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 11v6")
            addPathData("M19 13h2")
            addPathData("M2 21C2 17.954 3.729 15.173 6.46 13.825c2.731-1.348 5.991-1.027 8.408 .826")
            addPathData("M15 8c0 2.761-2.239 5-5 5C7.239 13 5 10.761 5 8 5 5.239 7.239 3 10 3c2.761 0 5 2.239 5 5Z")
            addPathData("M21 19c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _userRoundKey!!
    }

private var _userRoundKey: ImageVector? = null
