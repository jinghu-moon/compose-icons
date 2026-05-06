package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingLighthouse: ImageVector
    get() {
        if (_buildingLighthouse != null) return _buildingLighthouse!!
        _buildingLighthouse = tablerOutlineIcon(
            name = "BuildingLighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3l2 3 2 15h-8L10 6 12 3")
            addPathData("M8 9h8")
            addPathData("M3 11 5 9 3 7")
            addPathData("M21 11 19 9 21 7")
        }
        return _buildingLighthouse!!
    }

private var _buildingLighthouse: ImageVector? = null
