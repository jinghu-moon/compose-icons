package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GripVertical: ImageVector
    get() {
        if (_gripVertical != null) return _gripVertical!!
        _gripVertical = tablerOutlineIcon(
            name = "GripVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C10 4.448 9.552 4 9 4 8.448 4 8 4.448 8 5")
            addPathData("M8 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M8 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M14 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C16 4.448 15.552 4 15 4c-.552 0-1 .448-1 1")
            addPathData("M14 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M14 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _gripVertical!!
    }

private var _gripVertical: ImageVector? = null
