package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DevicesBolt: ImageVector
    get() {
        if (_devicesBolt != null) return _devicesBolt!!
        _devicesBolt = tablerOutlineIcon(
            name = "DevicesBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 19v-10c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v3.5")
            addPathData("M18 8v-3C18 4.448 17.552 4 17 4h-13C3.448 4 3 4.448 3 5v12c0 .552 .448 1 1 1h9")
            addPathData("M19 16l-2 3h4l-2 3")
            addPathData("M16 9h2")
        }
        return _devicesBolt!!
    }

private var _devicesBolt: ImageVector? = null
