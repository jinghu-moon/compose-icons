package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceComputerCamera: ImageVector
    get() {
        if (_deviceComputerCamera != null) return _deviceComputerCamera!!
        _deviceComputerCamera = tablerOutlineIcon(
            name = "DeviceComputerCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 10c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 6.134 15.866 3 12 3 8.134 3 5 6.134 5 10")
            addPathData("M9 10c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 8.343 13.657 7 12 7 10.343 7 9 8.343 9 10")
            addPathData("M8 16 5.909 19.486c-.185 .309-.19 .693-.012 1.007 .177 .313 .509 .507 .869 .507h10.468c.36-0 .692-.194 .869-.507 .177-.313 .173-.698-.012-1.007L16 16")
        }
        return _deviceComputerCamera!!
    }

private var _deviceComputerCamera: ImageVector? = null
