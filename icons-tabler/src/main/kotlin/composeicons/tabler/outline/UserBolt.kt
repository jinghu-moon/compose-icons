package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserBolt: ImageVector
    get() {
        if (_userBolt != null) return _userBolt!!
        _userBolt = tablerOutlineIcon(
            name = "UserBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7")
            addPathData("M6 21v-2c0-2.209 1.791-4 4-4h4c.267 0 .529 .026 .781 .076")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _userBolt!!
    }

private var _userBolt: ImageVector? = null
