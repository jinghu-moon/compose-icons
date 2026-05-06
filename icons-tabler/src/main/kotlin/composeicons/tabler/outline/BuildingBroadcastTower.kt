package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingBroadcastTower: ImageVector
    get() {
        if (_buildingBroadcastTower != null) return _buildingBroadcastTower!!
        _buildingBroadcastTower = tablerOutlineIcon(
            name = "BuildingBroadcastTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M16.616 13.924c.872-2.091 .228-4.508-1.568-5.888C13.251 6.655 10.751 6.655 8.954 8.036 7.158 9.416 6.514 11.833 7.386 13.924")
            addPathData("M20.307 15.469C21.876 11.705 20.717 7.356 17.483 4.871 14.25 2.386 9.749 2.386 6.516 4.871 3.282 7.356 2.123 11.705 3.692 15.469")
            addPathData("M9 21l3-9 3 9")
            addPathData("M10 19h4")
        }
        return _buildingBroadcastTower!!
    }

private var _buildingBroadcastTower: ImageVector? = null
