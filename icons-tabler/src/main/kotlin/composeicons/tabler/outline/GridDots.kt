package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GridDots: ImageVector
    get() {
        if (_gridDots != null) return _gridDots!!
        _gridDots = tablerOutlineIcon(
            name = "GridDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5c0 .552 .448 1 1 1C5.552 6 6 5.552 6 5 6 4.448 5.552 4 5 4 4.448 4 4 4.448 4 5")
            addPathData("M11 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 4.448 12.552 4 12 4c-.552 0-1 .448-1 1")
            addPathData("M18 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C20 4.448 19.552 4 19 4c-.552 0-1 .448-1 1")
            addPathData("M4 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1C6 11.448 5.552 11 5 11c-.552 0-1 .448-1 1")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M18 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M4 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1C6 18.448 5.552 18 5 18c-.552 0-1 .448-1 1")
            addPathData("M11 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M18 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _gridDots!!
    }

private var _gridDots: ImageVector? = null
