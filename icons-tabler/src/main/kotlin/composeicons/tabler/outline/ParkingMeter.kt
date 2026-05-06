package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ParkingMeter: ImageVector
    get() {
        if (_parkingMeter != null) return _parkingMeter!!
        _parkingMeter = tablerOutlineIcon(
            name = "ParkingMeter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 9C15 7.343 13.657 6 12 6 10.343 6 9 7.343 9 9")
            addPathData("M12 19v3")
            addPathData("M10.938 19h2.122c1.767 .007 3.334-1.135 3.868-2.82l1.775-5.68C19.785 7.037 17.821 3.362 14.317 2.292 13.682 2.098 13.021 2 12.357 2h-.716C7.973 2 5 4.939 5 8.563c0 .657 .1 1.31 .296 1.937l1.775 5.68c.534 1.685 2.1 2.827 3.867 2.82")
            addPathData("M11 12h2")
            addPathData("M12 12v3")
        }
        return _parkingMeter!!
    }

private var _parkingMeter: ImageVector? = null
