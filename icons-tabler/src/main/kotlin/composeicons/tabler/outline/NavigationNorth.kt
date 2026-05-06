package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationNorth: ImageVector
    get() {
        if (_navigationNorth != null) return _navigationNorth!!
        _navigationNorth = tablerOutlineIcon(
            name = "NavigationNorth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 21 12 13 8 21l4-2 4 2")
            addPathData("M10 9v-6l4 6v-6")
        }
        return _navigationNorth!!
    }

private var _navigationNorth: ImageVector? = null
