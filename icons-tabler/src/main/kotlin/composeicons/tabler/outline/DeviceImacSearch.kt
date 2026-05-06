package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceImacSearch: ImageVector
    get() {
        if (_deviceImacSearch != null) return _deviceImacSearch!!
        _deviceImacSearch = tablerOutlineIcon(
            name = "DeviceImacSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 17h-7C3.448 17 3 16.552 3 16v-12C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v8")
            addPathData("M3 13h10")
            addPathData("M8 21h4")
            addPathData("M10 17l-.5 4")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
        }
        return _deviceImacSearch!!
    }

private var _deviceImacSearch: ImageVector? = null
