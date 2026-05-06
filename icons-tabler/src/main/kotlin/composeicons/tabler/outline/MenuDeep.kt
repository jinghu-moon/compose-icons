package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MenuDeep: ImageVector
    get() {
        if (_menuDeep != null) return _menuDeep!!
        _menuDeep = tablerOutlineIcon(
            name = "MenuDeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M7 12h13")
            addPathData("M10 18h10")
        }
        return _menuDeep!!
    }

private var _menuDeep: ImageVector? = null
