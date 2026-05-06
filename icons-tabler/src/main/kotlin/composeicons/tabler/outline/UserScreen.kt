package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserScreen: ImageVector
    get() {
        if (_userScreen != null) return _userScreen!!
        _userScreen = tablerOutlineIcon(
            name = "UserScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.03 17.818C20.213 17.385 21 16.26 21 15v-8C21 5.343 19.657 4 18 4h-12C4.343 4 3 5.343 3 7v8c0 1.317 .85 2.436 2.03 2.84")
            addPathData("M10 14c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M8 21c0-1.105 .895-2 2-2h4c1.105 0 2 .895 2 2")
        }
        return _userScreen!!
    }

private var _userScreen: ImageVector? = null
