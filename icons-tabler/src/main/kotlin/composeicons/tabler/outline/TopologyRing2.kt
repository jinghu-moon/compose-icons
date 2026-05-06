package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TopologyRing2: ImageVector
    get() {
        if (_topologyRing2 != null) return _topologyRing2!!
        _topologyRing2 = tablerOutlineIcon(
            name = "TopologyRing2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 6C14 4.895 13.105 4 12 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M7 18C7 16.895 6.105 16 5 16c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M21 18c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M7 18h10")
            addPathData("M18 16 13 8")
            addPathData("M11 8 6 16")
        }
        return _topologyRing2!!
    }

private var _topologyRing2: ImageVector? = null
