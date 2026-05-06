package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FriendsOff: ImageVector
    get() {
        if (_friendsOff != null) return _friendsOff!!
        _friendsOff = tablerOutlineIcon(
            name = "FriendsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5c0 1.105 .895 2 2 2M9 5C9 3.895 8.105 3 7 3")
            addPathData("M5 22v-5L4 16v-4c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4L9 17v5")
            addPathData("M15 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C19 3.895 18.105 3 17 3c-1.105 0-2 .895-2 2")
            addPathData("M15 22v-4h-2l1.254-3.763M15.29 11.295c.188-.189 .443-.295 .71-.295h2c.552 0 1 .448 1 1l1.503 4.508M19 19v3")
            addPathData("M3 3 21 21")
        }
        return _friendsOff!!
    }

private var _friendsOff: ImageVector? = null
