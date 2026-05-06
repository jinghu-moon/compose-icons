package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = tablerOutlineIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C13 4.791 11.209 3 9 3 6.791 3 5 4.791 5 7")
            addPathData("M3 21v-2C3 16.791 4.791 15 7 15h4c2.209 0 4 1.791 4 4v2")
            addPathData("M16 3.13c1.77 .453 3.008 2.048 3.008 3.875 0 1.827-1.238 3.422-3.008 3.875")
            addPathData("M21 21v-2c-.01-1.815-1.242-3.396-3-3.85")
        }
        return _users!!
    }

private var _users: ImageVector? = null
