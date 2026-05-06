package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceImacOff: ImageVector
    get() {
        if (_deviceImacOff != null) return _deviceImacOff!!
        _deviceImacOff = tablerOutlineIcon(
            name = "DeviceImacOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h13c.552 0 1 .448 1 1v12c0 .28-.115 .532-.3 .713M17 17h-13C3.448 17 3 16.552 3 16v-12c0-.276 .112-.526 .293-.707")
            addPathData("M3 13h10M17 13h4")
            addPathData("M8 21h8")
            addPathData("M10 17l-.5 4")
            addPathData("M14 17l.5 4")
            addPathData("M3 3 21 21")
        }
        return _deviceImacOff!!
    }

private var _deviceImacOff: ImageVector? = null
