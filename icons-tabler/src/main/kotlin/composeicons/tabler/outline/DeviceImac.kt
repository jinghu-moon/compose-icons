package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceImac: ImageVector
    get() {
        if (_deviceImac != null) return _deviceImac!!
        _deviceImac = tablerOutlineIcon(
            name = "DeviceImac",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-16C3.448 17 3 16.552 3 16v-12")
            addPathData("M3 13h18")
            addPathData("M8 21h8")
            addPathData("M10 17l-.5 4")
            addPathData("M14 17l.5 4")
        }
        return _deviceImac!!
    }

private var _deviceImac: ImageVector? = null
