package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UsersMinus: ImageVector
    get() {
        if (_usersMinus != null) return _usersMinus!!
        _usersMinus = tablerOutlineIcon(
            name = "UsersMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C13 4.791 11.209 3 9 3 6.791 3 5 4.791 5 7")
            addPathData("M3 21v-2C3 16.791 4.791 15 7 15h4c.948 0 1.818 .33 2.504 .88")
            addPathData("M16 3.13c1.77 .453 3.008 2.048 3.008 3.875 0 1.827-1.238 3.422-3.008 3.875")
            addPathData("M16 19h6")
        }
        return _usersMinus!!
    }

private var _usersMinus: ImageVector? = null
