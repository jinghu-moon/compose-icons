package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingChurch: ImageVector
    get() {
        if (_buildingChurch != null) return _buildingChurch!!
        _buildingChurch = tablerOutlineIcon(
            name = "BuildingChurch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M10 21v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4")
            addPathData("M10 5h4")
            addPathData("M12 3v5")
            addPathData("M6 21v-7M4 16 12 8l8 8M18 14v7")
        }
        return _buildingChurch!!
    }

private var _buildingChurch: ImageVector? = null
