package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceCameraPhone: ImageVector
    get() {
        if (_deviceCameraPhone != null) return _deviceCameraPhone!!
        _deviceCameraPhone = tablerOutlineIcon(
            name = "DeviceCameraPhone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 8.5C16 9.881 17.119 11 18.5 11 19.881 11 21 9.881 21 8.5 21 7.119 19.881 6 18.5 6 17.119 6 16 7.119 16 8.5")
            addPathData("M13 7h-8C3.895 7 3 7.895 3 9v7c0 1.105 .895 2 2 2h13c1.105 0 2-.895 2-2v-2")
            addPathData("M17 15v-1")
        }
        return _deviceCameraPhone!!
    }

private var _deviceCameraPhone: ImageVector? = null
