package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Vinyl: ImageVector
    get() {
        if (_vinyl != null) return _vinyl!!
        _vinyl = tablerOutlineIcon(
            name = "Vinyl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3.937C12.398 2.15 8.048 2.969 5.342 5.943 2.637 8.917 2.232 13.325 4.351 16.742c2.119 3.417 6.247 5.014 10.114 3.913C18.332 19.553 21 16.021 21 12")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M19 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C21 3.448 20.552 3 20 3c-.552 0-1 .448-1 1")
            addPathData("M20 4 16.5 14 14 16")
        }
        return _vinyl!!
    }

private var _vinyl: ImageVector? = null
