package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceImacShare: ImageVector
    get() {
        if (_deviceImacShare != null) return _deviceImacShare!!
        _deviceImacShare = tablerOutlineIcon(
            name = "DeviceImacShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 17h-8.5C3.448 17 3 16.552 3 16v-12C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v9")
            addPathData("M3 13h18")
            addPathData("M8 21h4")
            addPathData("M10 17l-.5 4")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _deviceImacShare!!
    }

private var _deviceImacShare: ImageVector? = null
