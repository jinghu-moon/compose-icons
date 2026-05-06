package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Connection: ImageVector
    get() {
        if (_connection != null) return _connection!!
        _connection = tablerOutlineIcon(
            name = "Connection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 6.5C15 7.881 16.119 9 17.5 9 18.881 9 20 7.881 20 6.5 20 5.119 18.881 4 17.5 4 16.119 4 15 5.119 15 6.5")
            addPathData("M4 17.5C4 18.881 5.119 20 6.5 20 7.881 20 9 18.881 9 17.5 9 16.119 7.881 15 6.5 15 5.119 15 4 16.119 4 17.5")
            addPathData("M8.5 15.5l7-7")
        }
        return _connection!!
    }

private var _connection: ImageVector? = null
