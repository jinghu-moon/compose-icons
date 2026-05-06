package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TicketOff: ImageVector
    get() {
        if (_ticketOff != null) return _ticketOff!!
        _ticketOff = tablerOutlineIcon(
            name = "TicketOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 5v2")
            addPathData("M15 17v2")
            addPathData("M9 5h10c1.105 0 2 .895 2 2v3c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2v3M19 19h-14C3.895 19 3 18.105 3 17v-3c1.105 0 2-.895 2-2C5 10.895 4.105 10 3 10v-3C3 5.895 3.895 5 5 5")
            addPathData("M3 3 21 21")
        }
        return _ticketOff!!
    }

private var _ticketOff: ImageVector? = null
