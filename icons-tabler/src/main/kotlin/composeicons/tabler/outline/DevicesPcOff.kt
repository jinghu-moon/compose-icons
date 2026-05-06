package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DevicesPcOff: ImageVector
    get() {
        if (_devicesPcOff != null) return _devicesPcOff!!
        _devicesPcOff = tablerOutlineIcon(
            name = "DevicesPcOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9v10h-6v-14h2")
            addPathData("M13 9h9v7h-2M16 16h-4v-4")
            addPathData("M14 19h5")
            addPathData("M17 17v2")
            addPathData("M6 13v.01")
            addPathData("M6 16v.01")
            addPathData("M3 3 21 21")
        }
        return _devicesPcOff!!
    }

private var _devicesPcOff: ImageVector? = null
