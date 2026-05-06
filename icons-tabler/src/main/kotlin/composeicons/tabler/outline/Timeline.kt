package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Timeline: ImageVector
    get() {
        if (_timeline != null) return _timeline!!
        _timeline = tablerOutlineIcon(
            name = "Timeline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 16 10 9l5 5L20 8")
            addPathData("M14 14c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M9 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C11 8.448 10.552 8 10 8 9.448 8 9 8.448 9 9")
            addPathData("M3 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1C5 15.448 4.552 15 4 15c-.552 0-1 .448-1 1")
            addPathData("M19 8c0 .552 .448 1 1 1 .552 0 1-.448 1-1C21 7.448 20.552 7 20 7c-.552 0-1 .448-1 1")
        }
        return _timeline!!
    }

private var _timeline: ImageVector? = null
