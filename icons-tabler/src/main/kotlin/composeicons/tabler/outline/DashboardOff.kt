package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DashboardOff: ImageVector
    get() {
        if (_dashboardOff != null) return _dashboardOff!!
        _dashboardOff = tablerOutlineIcon(
            name = "DashboardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.175 11.178c-.811 .368-1.282 1.228-1.154 2.109 .128 .882 .824 1.572 1.706 1.694 .882 .122 1.739-.355 2.101-1.169")
            addPathData("M14.5 10.5l1-1")
            addPathData("M8.621 4.612c3.35-1.357 7.187-.578 9.743 1.977 2.556 2.556 3.335 6.393 1.978 9.743M18.826 18.82c-.371 .431-.781 .826-1.226 1.18h-11.2C4.299 18.331 3.053 15.811 3.001 13.128 2.95 10.445 4.097 7.879 6.132 6.13")
            addPathData("M3 3 21 21")
        }
        return _dashboardOff!!
    }

private var _dashboardOff: ImageVector? = null
