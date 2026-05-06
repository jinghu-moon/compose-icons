package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = tablerOutlineIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 10c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 8.343 13.657 7 12 7 10.343 7 9 8.343 9 10")
            addPathData("M6 21v-1c0-2.209 1.791-4 4-4h4c2.209 0 4 1.791 4 4v1")
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
        }
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
