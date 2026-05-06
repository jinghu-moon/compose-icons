package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TopologyFull: ImageVector
    get() {
        if (_topologyFull != null) return _topologyFull!!
        _topologyFull = tablerOutlineIcon(
            name = "TopologyFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 18c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M8 18C8 16.895 7.105 16 6 16c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M8 6C8 4.895 7.105 4 6 4 4.895 4 4 4.895 4 6c0 1.105 .895 2 2 2C7.105 8 8 7.105 8 6")
            addPathData("M20 6C20 4.895 19.105 4 18 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M6 8v8")
            addPathData("M18 16v-8")
            addPathData("M8 6h8")
            addPathData("M16 18h-8")
            addPathData("M7.5 7.5l9 9")
            addPathData("M7.5 16.5l9-9")
        }
        return _topologyFull!!
    }

private var _topologyFull: ImageVector? = null
