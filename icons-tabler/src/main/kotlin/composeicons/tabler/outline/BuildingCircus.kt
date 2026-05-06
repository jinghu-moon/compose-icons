package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingCircus: ImageVector
    get() {
        if (_buildingCircus != null) return _buildingCircus!!
        _buildingCircus = tablerOutlineIcon(
            name = "BuildingCircus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11h16")
            addPathData("M12 6.5C12 7.5 7 11 4 11")
            addPathData("M12 6.5c0 1 5 4.5 8 4.5")
            addPathData("M6 11C5.667 16.333 5 19.667 4 21h4c1 0 4-4 4-9v-1")
            addPathData("M18 11c.333 5.333 1 8.667 2 10h-4c-1 0-4-4-4-9v-1")
            addPathData("M12 7v-4l2 1h-2")
        }
        return _buildingCircus!!
    }

private var _buildingCircus: ImageVector? = null
