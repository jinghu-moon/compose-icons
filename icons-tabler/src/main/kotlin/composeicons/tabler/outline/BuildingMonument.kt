package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingMonument: ImageVector
    get() {
        if (_buildingMonument != null) return _buildingMonument!!
        _buildingMonument = tablerOutlineIcon(
            name = "BuildingMonument",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 18 10 5 12 3l2 2 2 13")
            addPathData("M5 21v-3h14v3")
            addPathData("M3 21h18")
        }
        return _buildingMonument!!
    }

private var _buildingMonument: ImageVector? = null
