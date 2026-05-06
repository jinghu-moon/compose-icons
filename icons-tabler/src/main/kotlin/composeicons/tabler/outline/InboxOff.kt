package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InboxOff: ImageVector
    get() {
        if (_inboxOff != null) return _inboxOff!!
        _inboxOff = tablerOutlineIcon(
            name = "InboxOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.407 19.422c-.375 .37-.88 .578-1.407 .578h-12C4.895 20 4 19.105 4 18v-12C4 5.446 4.225 4.944 4.59 4.582")
            addPathData("M4 13h3l3 3h4l.987-.987M17 13h3")
            addPathData("M3 3 21 21")
        }
        return _inboxOff!!
    }

private var _inboxOff: ImageVector? = null
