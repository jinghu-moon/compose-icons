package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceImacCode: ImageVector
    get() {
        if (_deviceImacCode != null) return _deviceImacCode!!
        _deviceImacCode = tablerOutlineIcon(
            name = "DeviceImacCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 17h-7.5C3.448 17 3 16.552 3 16v-12C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v9")
            addPathData("M3 13h18")
            addPathData("M8 21h3.5")
            addPathData("M10 17l-.5 4")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _deviceImacCode!!
    }

private var _deviceImacCode: ImageVector? = null
