package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UsersGroup: ImageVector
    get() {
        if (_usersGroup != null) return _usersGroup!!
        _usersGroup = tablerOutlineIcon(
            name = "UsersGroup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M8 21v-1c0-1.105 .895-2 2-2h4c1.105 0 2 .895 2 2v1")
            addPathData("M15 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C19 3.895 18.105 3 17 3c-1.105 0-2 .895-2 2")
            addPathData("M17 10h2c1.105 0 2 .895 2 2v1")
            addPathData("M5 5c0 1.105 .895 2 2 2C8.105 7 9 6.105 9 5 9 3.895 8.105 3 7 3 5.895 3 5 3.895 5 5")
            addPathData("M3 13v-1c0-1.105 .895-2 2-2h2")
        }
        return _usersGroup!!
    }

private var _usersGroup: ImageVector? = null
