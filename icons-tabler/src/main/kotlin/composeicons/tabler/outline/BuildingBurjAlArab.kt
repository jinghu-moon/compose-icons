package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingBurjAlArab: ImageVector
    get() {
        if (_buildingBurjAlArab != null) return _buildingBurjAlArab!!
        _buildingBurjAlArab = tablerOutlineIcon(
            name = "BuildingBurjAlArab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M7 21v-18")
            addPathData("M7 4c5.675 .908 10 5.613 10 11.28-0 2.018-.556 3.997-1.605 5.72")
            addPathData("M5 9h12")
            addPathData("M7 13h4")
            addPathData("M7 17h4")
        }
        return _buildingBurjAlArab!!
    }

private var _buildingBurjAlArab: ImageVector? = null
