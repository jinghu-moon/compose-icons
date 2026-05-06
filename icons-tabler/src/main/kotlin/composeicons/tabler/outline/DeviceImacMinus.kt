package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceImacMinus: ImageVector
    get() {
        if (_deviceImacMinus != null) return _deviceImacMinus!!
        _deviceImacMinus = tablerOutlineIcon(
            name = "DeviceImacMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 17h-8.5C3.448 17 3 16.552 3 16v-12C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v11")
            addPathData("M3 13h18")
            addPathData("M8 21h4.5")
            addPathData("M10 17l-.5 4")
            addPathData("M16 19h6")
        }
        return _deviceImacMinus!!
    }

private var _deviceImacMinus: ImageVector? = null
