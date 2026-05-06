package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToolsKitchenOff: ImageVector
    get() {
        if (_toolsKitchenOff != null) return _toolsKitchenOff!!
        _toolsKitchenOff = tablerOutlineIcon(
            name = "ToolsKitchenOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h5l-.5 4.5M11.1 11.095 11 12h-6L4.125 4.126")
            addPathData("M7 18h2v3h-2v-3")
            addPathData("M15.225 11.216C15.645 8.698 16.814 6.039 20 3v12h-1")
            addPathData("M20 15v1M20 20v1h-1v-2")
            addPathData("M8 12v6")
            addPathData("M3 3 21 21")
        }
        return _toolsKitchenOff!!
    }

private var _toolsKitchenOff: ImageVector? = null
