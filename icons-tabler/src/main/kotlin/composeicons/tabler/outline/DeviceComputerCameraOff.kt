package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceComputerCameraOff: ImageVector
    get() {
        if (_deviceComputerCameraOff != null) return _deviceComputerCameraOff!!
        _deviceComputerCameraOff = tablerOutlineIcon(
            name = "DeviceComputerCameraOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.15 6.153c-1.827 2.774-1.452 6.45 .897 8.799 2.349 2.349 6.025 2.723 8.799 .897M17.846 13.849c1.828-2.775 1.454-6.453-.897-8.802C14.599 2.698 10.921 2.325 8.147 4.154")
            addPathData("M9.13 9.122c-.325 1.061-.039 2.214 .745 2.999 .784 .785 1.937 1.073 2.998 .75M14.873 10.871c.318-1.057 .029-2.204-.752-2.985C13.34 7.106 12.193 6.817 11.136 7.135")
            addPathData("M8 16 5.909 19.486c-.185 .309-.19 .693-.012 1.007 .177 .313 .509 .507 .869 .507h10.468c.36-0 .692-.194 .869-.507 .177-.313 .173-.698-.012-1.007L16 16")
            addPathData("M3 3 21 21")
        }
        return _deviceComputerCameraOff!!
    }

private var _deviceComputerCameraOff: ImageVector? = null
