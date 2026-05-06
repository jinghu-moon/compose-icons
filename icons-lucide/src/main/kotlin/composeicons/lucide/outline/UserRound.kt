package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRound: ImageVector
    get() {
        if (_userRound != null) return _userRound!!
        _userRound = lucideOutlineIcon(
            name = "UserRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 8c0 2.761-2.239 5-5 5C9.239 13 7 10.761 7 8 7 5.239 9.239 3 12 3c2.761 0 5 2.239 5 5Z")
            addPathData("M20 21c0-4.418-3.582-8-8-8C7.582 13 4 16.582 4 21")
        }
        return _userRound!!
    }

private var _userRound: ImageVector? = null
