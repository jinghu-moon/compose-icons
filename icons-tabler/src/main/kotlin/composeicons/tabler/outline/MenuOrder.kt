package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MenuOrder: ImageVector
    get() {
        if (_menuOrder != null) return _menuOrder!!
        _menuOrder = tablerOutlineIcon(
            name = "MenuOrder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10h16")
            addPathData("M4 14h16")
            addPathData("M9 18l3 3 3-3")
            addPathData("M9 6 12 3l3 3")
        }
        return _menuOrder!!
    }

private var _menuOrder: ImageVector? = null
