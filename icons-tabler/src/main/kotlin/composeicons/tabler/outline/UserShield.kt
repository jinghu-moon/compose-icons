package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserShield: ImageVector
    get() {
        if (_userShield != null) return _userShield!!
        _userShield = tablerOutlineIcon(
            name = "UserShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 21v-2c0-2.209 1.791-4 4-4h2")
            addPathData("M22 16c0 4-2.5 6-3.5 6C17.5 22 15 20 15 16c1 0 2.5-.5 3.5-1.5C19.5 15.5 21 16 22 16")
            addPathData("M8 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7")
        }
        return _userShield!!
    }

private var _userShield: ImageVector? = null
