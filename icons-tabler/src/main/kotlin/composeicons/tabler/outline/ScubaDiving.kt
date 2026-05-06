package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScubaDiving: ImageVector
    get() {
        if (_scubaDiving != null) return _scubaDiving!!
        _scubaDiving = tablerOutlineIcon(
            name = "ScubaDiving",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M2 2 5 5 6.5 9 10 11l6 2 1 4 2.5 3")
            addPathData("M11 8l4.5 1.5")
        }
        return _scubaDiving!!
    }

private var _scubaDiving: ImageVector? = null
