package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stretching: ImageVector
    get() {
        if (_stretching != null) return _stretching!!
        _stretching = tablerOutlineIcon(
            name = "Stretching",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C17 4.448 16.552 4 16 4c-.552 0-1 .448-1 1")
            addPathData("M5 20l5-.5 1-2")
            addPathData("M18 20v-5h-5.5L15 8.5l-5.5 1 1.5 2")
        }
        return _stretching!!
    }

private var _stretching: ImageVector? = null
