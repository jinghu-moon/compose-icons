package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationEast: ImageVector
    get() {
        if (_navigationEast != null) return _navigationEast!!
        _navigationEast = tablerOutlineIcon(
            name = "NavigationEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3h-4v6h4")
            addPathData("M10 6h2.5")
            addPathData("M16 21 12 13 8 21l4-2 4 2")
        }
        return _navigationEast!!
    }

private var _navigationEast: ImageVector? = null
