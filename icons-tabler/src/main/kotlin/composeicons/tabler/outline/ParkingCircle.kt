package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ParkingCircle: ImageVector
    get() {
        if (_parkingCircle != null) return _parkingCircle!!
        _parkingCircle = tablerOutlineIcon(
            name = "ParkingCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16v-8h3.334C14.254 8 15 8.895 15 10c0 1.105-.746 2-1.666 2h-3.334")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _parkingCircle!!
    }

private var _parkingCircle: ImageVector? = null
