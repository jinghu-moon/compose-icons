package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingOff: ImageVector
    get() {
        if (_buildingOff != null) return _buildingOff!!
        _buildingOff = tablerOutlineIcon(
            name = "BuildingOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M9 12h1")
            addPathData("M9 16h1")
            addPathData("M14 8h1")
            addPathData("M14 16h1")
            addPathData("M5 21v-16")
            addPathData("M7 3h10c1 0 2 1 2 2v10")
            addPathData("M19 19v2")
            addPathData("M3 3 21 21")
        }
        return _buildingOff!!
    }

private var _buildingOff: ImageVector? = null
