package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GardenCartOff: ImageVector
    get() {
        if (_gardenCartOff != null) return _gardenCartOff!!
        _gardenCartOff = tablerOutlineIcon(
            name = "GardenCartOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.733 15.732c-.634 .632-.881 1.555-.649 2.42 .233 .865 .91 1.539 1.776 1.767 .866 .229 1.787-.023 2.417-.66")
            addPathData("M6 8v11c0 .432 .278 .815 .689 .949 .411 .134 .861-.01 1.117-.358l3.694-5.091v.055")
            addPathData("M6 8h2M12 8h9l-3 6.01M14.681 14.703l-4.276-.45C8.929 14.098 7.66 13.138 7.109 11.76L4.256 4.63C4.105 4.25 3.737 4 3.328 4h-1.323")
            addPathData("M3 3 21 21")
        }
        return _gardenCartOff!!
    }

private var _gardenCartOff: ImageVector? = null
