package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NotificationOff: ImageVector
    get() {
        if (_notificationOff != null) return _notificationOff!!
        _notificationOff = tablerOutlineIcon(
            name = "NotificationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.154 6.187C5.45 6.516 5 7.223 5 8v9c0 1.105 .895 2 2 2h9c.776 0 1.482-.449 1.811-1.151")
            addPathData("M14 7c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C20 5.343 18.657 4 17 4 15.343 4 14 5.343 14 7")
            addPathData("M3 3 21 21")
        }
        return _notificationOff!!
    }

private var _notificationOff: ImageVector? = null
