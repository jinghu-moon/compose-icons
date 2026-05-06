package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarGarage: ImageVector
    get() {
        if (_carGarage != null) return _carGarage!!
        _carGarage = tablerOutlineIcon(
            name = "CarGarage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 20c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 18.895 8.105 18 7 18c-1.105 0-2 .895-2 2")
            addPathData("M15 20c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M5 20h-2v-6L5 9h9l4 5h1c1.105 0 2 .895 2 2v4h-2M15 20h-6M3 14h15M12 14v-5")
            addPathData("M3 6 12 2l9 4")
        }
        return _carGarage!!
    }

private var _carGarage: ImageVector? = null
