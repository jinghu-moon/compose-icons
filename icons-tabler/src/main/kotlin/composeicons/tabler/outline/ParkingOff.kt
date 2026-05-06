package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ParkingOff: ImageVector
    get() {
        if (_parkingOff != null) return _parkingOff!!
        _parkingOff = tablerOutlineIcon(
            name = "ParkingOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.418 19.41C19.056 19.775 18.554 20 18 20h-12C4.895 20 4 19.105 4 18v-12C4 5.446 4.225 4.944 4.59 4.582")
            addPathData("M9 16v-7M12 8h1c.682-0 1.316 .347 1.684 .921 .368 .574 .418 1.296 .133 1.915M12 12h-3")
            addPathData("M3 3 21 21")
        }
        return _parkingOff!!
    }

private var _parkingOff: ImageVector? = null
