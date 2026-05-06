package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Explicit: ImageVector
    get() {
        if (_explicit != null) return _explicit!!
        _explicit = tablerOutlineIcon(
            name = "Explicit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5C4 4.448 4.448 4 5 4h14c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14C4.448 20 4 19.552 4 19v-14")
            addPathData("M14 8h-4v8h4")
            addPathData("M14 12h-4")
        }
        return _explicit!!
    }

private var _explicit: ImageVector? = null
