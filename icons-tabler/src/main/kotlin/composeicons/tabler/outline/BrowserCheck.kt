package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrowserCheck: ImageVector
    get() {
        if (_browserCheck != null) return _browserCheck!!
        _browserCheck = tablerOutlineIcon(
            name = "BrowserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5C4 4.448 4.448 4 5 4h14c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14C4.448 20 4 19.552 4 19v-14")
            addPathData("M4 8h16")
            addPathData("M8 4v4")
            addPathData("M9.5 14.5 11 16l3-3")
        }
        return _browserCheck!!
    }

private var _browserCheck: ImageVector? = null
