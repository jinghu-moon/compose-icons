package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceProjector: ImageVector
    get() {
        if (_deviceProjector != null) return _deviceProjector!!
        _deviceProjector = tablerOutlineIcon(
            name = "DeviceProjector",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C18 6.239 15.761 4 13 4 10.239 4 8 6.239 8 9")
            addPathData("M9 6h-4C3.895 6 3 6.895 3 8v8c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-8C21 6.895 20.105 6 19 6h-2")
            addPathData("M6 15h1")
            addPathData("M7 18 6 20")
            addPathData("M18 18l1 2")
        }
        return _deviceProjector!!
    }

private var _deviceProjector: ImageVector? = null
