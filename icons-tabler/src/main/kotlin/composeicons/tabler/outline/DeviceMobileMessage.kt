package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileMessage: ImageVector
    get() {
        if (_deviceMobileMessage != null) return _deviceMobileMessage!!
        _deviceMobileMessage = tablerOutlineIcon(
            name = "DeviceMobileMessage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 3h10v8h-3l-4 2v-2h-3v-8")
            addPathData("M15 16v4c0 .552-.448 1-1 1h-8C5.448 21 5 20.552 5 20v-14C5 5.448 5.448 5 6 5h2")
            addPathData("M10 18v.01")
        }
        return _deviceMobileMessage!!
    }

private var _deviceMobileMessage: ImageVector? = null
