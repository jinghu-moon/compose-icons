package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserSquareRounded: ImageVector
    get() {
        if (_userSquareRounded != null) return _userSquareRounded!!
        _userSquareRounded = tablerOutlineIcon(
            name = "UserSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13c1.657 0 3-1.343 3-3C15 8.343 13.657 7 12 7 10.343 7 9 8.343 9 10c0 1.657 1.343 3 3 3")
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
            addPathData("M6 20.05v-.05c0-2.209 1.791-4 4-4h4c2.209 0 4 1.791 4 4v.05")
        }
        return _userSquareRounded!!
    }

private var _userSquareRounded: ImageVector? = null
