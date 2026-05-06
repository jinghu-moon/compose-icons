package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceRemote: ImageVector
    get() {
        if (_deviceRemote != null) return _deviceRemote!!
        _deviceRemote = tablerOutlineIcon(
            name = "DeviceRemote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 8.895 13.105 8 12 8c-1.105 0-2 .895-2 2")
            addPathData("M7 5C7 3.895 7.895 3 9 3h6c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-6C7.895 21 7 20.105 7 19v-14")
            addPathData("M12 3v2")
            addPathData("M10 15v.01")
            addPathData("M10 18v.01")
            addPathData("M14 18v.01")
            addPathData("M14 15v.01")
        }
        return _deviceRemote!!
    }

private var _deviceRemote: ImageVector? = null
