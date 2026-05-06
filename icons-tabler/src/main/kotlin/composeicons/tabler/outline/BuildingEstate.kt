package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingEstate: ImageVector
    get() {
        if (_buildingEstate != null) return _buildingEstate!!
        _buildingEstate = tablerOutlineIcon(
            name = "BuildingEstate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M19 21v-4")
            addPathData("M19 17c1.105 0 2-.895 2-2v-2c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2")
            addPathData("M14 21v-14C14 5.343 12.657 4 11 4h-4C5.343 4 4 5.343 4 7v14")
            addPathData("M9 17v4")
            addPathData("M8 13h2")
            addPathData("M8 9h2")
        }
        return _buildingEstate!!
    }

private var _buildingEstate: ImageVector? = null
