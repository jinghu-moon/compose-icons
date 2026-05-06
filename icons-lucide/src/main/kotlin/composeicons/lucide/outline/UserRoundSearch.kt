package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRoundSearch: ImageVector
    get() {
        if (_userRoundSearch != null) return _userRoundSearch!!
        _userRoundSearch = lucideOutlineIcon(
            name = "UserRoundSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8c0 2.761-2.239 5-5 5C7.239 13 5 10.761 5 8 5 5.239 7.239 3 10 3c2.761 0 5 2.239 5 5Z")
            addPathData("M2 21c0-2.554 1.22-4.954 3.282-6.46 2.062-1.506 4.72-1.937 7.152-1.16")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M22 22 20.1 20.1")
        }
        return _userRoundSearch!!
    }

private var _userRoundSearch: ImageVector? = null
