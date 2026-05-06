package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GripHorizontal: ImageVector
    get() {
        if (_gripHorizontal != null) return _gripHorizontal!!
        _gripHorizontal = tablerOutlineIcon(
            name = "GripHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C6 8.448 5.552 8 5 8 4.448 8 4 8.448 4 9")
            addPathData("M4 15c0 .552 .448 1 1 1 .552 0 1-.448 1-1C6 14.448 5.552 14 5 14c-.552 0-1 .448-1 1")
            addPathData("M11 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 8.448 12.552 8 12 8c-.552 0-1 .448-1 1")
            addPathData("M11 15c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M18 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C20 8.448 19.552 8 19 8c-.552 0-1 .448-1 1")
            addPathData("M18 15c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _gripHorizontal!!
    }

private var _gripHorizontal: ImageVector? = null
