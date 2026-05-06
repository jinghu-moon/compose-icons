package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TopologyStarRing3: ImageVector
    get() {
        if (_topologyStarRing3 != null) return _topologyStarRing3!!
        _topologyStarRing3 = tablerOutlineIcon(
            name = "TopologyStarRing3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 19C10 17.895 9.105 17 8 17c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M18 5C18 3.895 17.105 3 16 3c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M10 5C10 3.895 9.105 3 8 3 6.895 3 6 3.895 6 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M6 12C6 10.895 5.105 10 4 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M18 19c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M14 12c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M22 12c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M6 12h4")
            addPathData("M14 12h4")
            addPathData("M15 7l-2 3")
            addPathData("M9 7l2 3")
            addPathData("M11 14 9 17")
            addPathData("M13 14l2 3")
            addPathData("M10 5h4")
            addPathData("M10 19h4")
            addPathData("M17 17l2-3")
            addPathData("M19 10 17 7")
            addPathData("M7 7 5 10")
            addPathData("M5 14l2 3")
        }
        return _topologyStarRing3!!
    }

private var _topologyStarRing3: ImageVector? = null
