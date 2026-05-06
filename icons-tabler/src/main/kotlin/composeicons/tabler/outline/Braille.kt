package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Braille: ImageVector
    get() {
        if (_braille != null) return _braille!!
        _braille = tablerOutlineIcon(
            name = "Braille",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C17 4.448 16.552 4 16 4c-.552 0-1 .448-1 1")
            addPathData("M7 5c0 .552 .448 1 1 1C8.552 6 9 5.552 9 5 9 4.448 8.552 4 8 4 7.448 4 7 4.448 7 5")
            addPathData("M7 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1C9 18.448 8.552 18 8 18c-.552 0-1 .448-1 1")
            addPathData("M16 12h.01")
            addPathData("M8 12h.01")
            addPathData("M16 19h.01")
        }
        return _braille!!
    }

private var _braille: ImageVector? = null
