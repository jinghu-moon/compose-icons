package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationWest: ImageVector
    get() {
        if (_navigationWest != null) return _navigationWest!!
        _navigationWest = tablerOutlineIcon(
            name = "NavigationWest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3l1 6L12 5.25 14 9 15 3")
            addPathData("M16 21 12 13 8 21l4-2 4 2")
        }
        return _navigationWest!!
    }

private var _navigationWest: ImageVector? = null
