package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationSouth: ImageVector
    get() {
        if (_navigationSouth != null) return _navigationSouth!!
        _navigationSouth = tablerOutlineIcon(
            name = "NavigationSouth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8.25c0 .414 .336 .75 .75 .75h2.25c.552 0 1-.448 1-1v-1C14 6.448 13.552 6 13 6h-2C10.448 6 10 5.552 10 5v-1c0-.552 .448-1 1-1h2.25c.414 0 .75 .336 .75 .75")
            addPathData("M16 21 12 13 8 21l4-2 4 2")
        }
        return _navigationSouth!!
    }

private var _navigationSouth: ImageVector? = null
