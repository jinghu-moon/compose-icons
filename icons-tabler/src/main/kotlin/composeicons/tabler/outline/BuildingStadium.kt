package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingStadium: ImageVector
    get() {
        if (_buildingStadium != null) return _buildingStadium!!
        _buildingStadium = tablerOutlineIcon(
            name = "BuildingStadium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12c0 1.105 3.582 2 8 2 4.418 0 8-.895 8-2 0-1.105-3.582-2-8-2-4.418 0-8 .895-8 2")
            addPathData("M4 12v7c0 .94 2.51 1.785 6 2v-3h4v3c3.435-.225 6-1.07 6-2v-7")
            addPathData("M15 6h4v-3h-4v7")
            addPathData("M7 6h4v-3h-4v7")
        }
        return _buildingStadium!!
    }

private var _buildingStadium: ImageVector? = null
