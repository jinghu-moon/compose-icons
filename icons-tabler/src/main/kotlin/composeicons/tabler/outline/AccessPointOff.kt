package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AccessPointOff: ImageVector
    get() {
        if (_accessPointOff != null) return _accessPointOff!!
        _accessPointOff = tablerOutlineIcon(
            name = "AccessPointOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M14.828 9.172c.75 .75 1.172 1.767 1.172 2.828")
            addPathData("M17.657 6.343c2.354 2.353 3.006 5.918 1.635 8.952")
            addPathData("M9.168 14.828C7.606 13.266 7.606 10.734 9.168 9.172")
            addPathData("M6.337 17.657C4.837 16.157 3.994 14.122 3.994 12c0-2.122 .843-4.157 2.343-5.657")
        }
        return _accessPointOff!!
    }

private var _accessPointOff: ImageVector? = null
