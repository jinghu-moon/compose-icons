package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.QueuePopIn: ImageVector
    get() {
        if (_queuePopIn != null) return _queuePopIn!!
        _queuePopIn = tablerOutlineIcon(
            name = "QueuePopIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 6h-3C3.895 6 3 6.895 3 8v11c0 1.105 .895 2 2 2h11c1.105 0 2-.895 2-2v-3.357")
            addPathData("M13 5c0-1.105 .895-2 2-2h4c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-4c-1.105 0-2-.895-2-2v-4")
            addPathData("M13.5 10.5 8 16")
            addPathData("M8 11v5h5")
        }
        return _queuePopIn!!
    }

private var _queuePopIn: ImageVector? = null
