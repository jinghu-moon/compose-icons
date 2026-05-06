package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrowserOff: ImageVector
    get() {
        if (_browserOff != null) return _browserOff!!
        _browserOff = tablerOutlineIcon(
            name = "BrowserOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h11c.552 0 1 .448 1 1v11M19.712 19.702c-.188 .191-.444 .298-.712 .298h-14C4.448 20 4 19.552 4 19v-14c0-.276 .112-.526 .293-.707")
            addPathData("M4 8h4M12 8h8")
            addPathData("M3 3 21 21")
        }
        return _browserOff!!
    }

private var _browserOff: ImageVector? = null
