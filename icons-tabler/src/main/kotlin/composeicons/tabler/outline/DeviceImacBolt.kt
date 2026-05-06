package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceImacBolt: ImageVector
    get() {
        if (_deviceImacBolt != null) return _deviceImacBolt!!
        _deviceImacBolt = tablerOutlineIcon(
            name = "DeviceImacBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 17h-9.5C3.448 17 3 16.552 3 16v-12C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v8.5")
            addPathData("M3 13h13")
            addPathData("M8 21h5.5")
            addPathData("M10 17l-.5 4")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _deviceImacBolt!!
    }

private var _deviceImacBolt: ImageVector? = null
