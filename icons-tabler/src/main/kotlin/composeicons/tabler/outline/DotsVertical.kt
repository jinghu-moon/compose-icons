package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DotsVertical: ImageVector
    get() {
        if (_dotsVertical != null) return _dotsVertical!!
        _dotsVertical = tablerOutlineIcon(
            name = "DotsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M11 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M11 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 4.448 12.552 4 12 4c-.552 0-1 .448-1 1")
        }
        return _dotsVertical!!
    }

private var _dotsVertical: ImageVector? = null
