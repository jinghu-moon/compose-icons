package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudOff: ImageVector
    get() {
        if (_cloudOff != null) return _cloudOff!!
        _cloudOff = tablerOutlineIcon(
            name = "CloudOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.58 5.548c.24-.11 .492-.207 .752-.286 1.88-.572 3.956-.193 5.444 1 1.488 1.19 2.162 3.007 1.77 4.769h.99c1.913 0 3.464 1.56 3.464 3.486 0 .957-.383 1.824-1.003 2.454M18 18.004h-11.343C4.085 18 2 15.993 2 13.517 2 11.042 4.085 9.035 6.657 9.035c.13-.582 .37-1.128 .7-1.62")
            addPathData("M3 3 21 21")
        }
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
