package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DotsDiagonal: ImageVector
    get() {
        if (_dotsDiagonal != null) return _dotsDiagonal!!
        _dotsDiagonal = tablerOutlineIcon(
            name = "DotsDiagonal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 17c0 .552 .448 1 1 1 .552 0 1-.448 1-1C8 16.448 7.552 16 7 16c-.552 0-1 .448-1 1")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M16 7c0 .552 .448 1 1 1 .552 0 1-.448 1-1C18 6.448 17.552 6 17 6c-.552 0-1 .448-1 1")
        }
        return _dotsDiagonal!!
    }

private var _dotsDiagonal: ImageVector? = null
