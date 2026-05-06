package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Steam: ImageVector
    get() {
        if (_steam != null) return _steam!!
        _steam = tablerOutlineIcon(
            name = "Steam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 3.448 12.552 3 12 3c-.552 0-1 .448-1 1")
            addPathData("M3 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1C5 11.448 4.552 11 4 11c-.552 0-1 .448-1 1")
            addPathData("M19 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M11 20c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M5.5 5.5l3 3")
            addPathData("M15.5 15.5l3 3")
            addPathData("M18.5 5.5l-3 3")
            addPathData("M8.5 15.5l-3 3")
        }
        return _steam!!
    }

private var _steam: ImageVector? = null
