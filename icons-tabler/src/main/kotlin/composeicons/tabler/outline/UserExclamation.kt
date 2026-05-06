package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserExclamation: ImageVector
    get() {
        if (_userExclamation != null) return _userExclamation!!
        _userExclamation = tablerOutlineIcon(
            name = "UserExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7")
            addPathData("M6 21v-2c0-2.209 1.791-4 4-4h4c.348 0 .686 .045 1.008 .128")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _userExclamation!!
    }

private var _userExclamation: ImageVector? = null
