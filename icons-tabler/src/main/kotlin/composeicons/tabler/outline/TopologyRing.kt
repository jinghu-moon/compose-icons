package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TopologyRing: ImageVector
    get() {
        if (_topologyRing != null) return _topologyRing!!
        _topologyRing = tablerOutlineIcon(
            name = "TopologyRing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 20c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M14 4C14 2.895 13.105 2 12 2c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M6 12C6 10.895 5.105 10 4 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M22 12c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M13.5 5.5l5 5")
            addPathData("M5.5 13.5l5 5")
            addPathData("M13.5 18.5l5-5")
            addPathData("M10.5 5.5l-5 5")
        }
        return _topologyRing!!
    }

private var _topologyRing: ImageVector? = null
