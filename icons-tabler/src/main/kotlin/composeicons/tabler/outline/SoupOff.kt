package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SoupOff: ImageVector
    get() {
        if (_soupOff != null) return _soupOff!!
        _soupOff = tablerOutlineIcon(
            name = "SoupOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19h16")
            addPathData("M15 11h6c0 1.691-.525 3.26-1.42 4.552M17.546 17.584C16.211 18.509 14.624 19.003 13 19h-2C6.582 19 3 15.418 3 11h8")
            addPathData("M12 5v3")
            addPathData("M15 5v3")
            addPathData("M3 3 21 21")
        }
        return _soupOff!!
    }

private var _soupOff: ImageVector? = null
