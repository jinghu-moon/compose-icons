package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DroneOff: ImageVector
    get() {
        if (_droneOff != null) return _droneOff!!
        _droneOff = tablerOutlineIcon(
            name = "DroneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 14h-4v-4")
            addPathData("M10 10 6.5 6.5")
            addPathData("M9.957 5.95C9.718 4.45 8.54 3.275 7.04 3.04M4.02 4.029C3.085 4.967 2.759 6.352 3.178 7.608 3.597 8.864 4.689 9.777 6 9.965")
            addPathData("M14 10 17.5 6.5")
            addPathData("M18 9.965c1.785-.259 3.081-1.831 2.994-3.632C20.907 4.532 19.466 3.091 17.665 3.005 15.864 2.919 14.292 4.215 14.034 6")
            addPathData("M14 14l3.5 3.5")
            addPathData("M14.035 18c.188 1.311 1.101 2.403 2.357 2.822 1.256 .419 2.641 .093 3.579-.842M20.958 16.954c-.238-1.501-1.416-2.678-2.918-2.913")
            addPathData("M10 14 6.5 17.5")
            addPathData("M6 14.035c-1.785 .259-3.081 1.831-2.994 3.632 .087 1.801 1.528 3.242 3.329 3.328C8.136 21.081 9.708 19.785 9.966 18")
            addPathData("M3 3 21 21")
        }
        return _droneOff!!
    }

private var _droneOff: ImageVector? = null
