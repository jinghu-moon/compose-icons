package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TopologyBus: ImageVector
    get() {
        if (_topologyBus != null) return _topologyBus!!
        _topologyBus = tablerOutlineIcon(
            name = "TopologyBus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10C14 8.895 13.105 8 12 8c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M6 10C6 8.895 5.105 8 4 8 2.895 8 2 8.895 2 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M22 10C22 8.895 21.105 8 20 8c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M2 16h20")
            addPathData("M4 12v4")
            addPathData("M12 12v4")
            addPathData("M20 12v4")
        }
        return _topologyBus!!
    }

private var _topologyBus: ImageVector? = null
