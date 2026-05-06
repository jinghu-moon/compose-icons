package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapSouth: ImageVector
    get() {
        if (_mapSouth != null) return _mapSouth!!
        _mapSouth = tablerOutlineIcon(
            name = "MapSouth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M10 14.25c0 .414 .336 .75 .75 .75h2.25c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1h-2c-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1h2.25c.414 0 .75 .336 .75 .75")
        }
        return _mapSouth!!
    }

private var _mapSouth: ImageVector? = null
