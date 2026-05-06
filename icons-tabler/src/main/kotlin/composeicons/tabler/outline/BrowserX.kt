package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrowserX: ImageVector
    get() {
        if (_browserX != null) return _browserX!!
        _browserX = tablerOutlineIcon(
            name = "BrowserX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5C4 4.448 4.448 4 5 4h14c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14C4.448 20 4 19.552 4 19v-14")
            addPathData("M4 8h16")
            addPathData("M8 4v4")
            addPathData("M10 16l4-4")
            addPathData("M14 16 10 12")
        }
        return _browserX!!
    }

private var _browserX: ImageVector? = null
