package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingBank: ImageVector
    get() {
        if (_buildingBank != null) return _buildingBank!!
        _buildingBank = tablerOutlineIcon(
            name = "BuildingBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M3 10h18")
            addPathData("M5 6 12 3l7 3")
            addPathData("M4 10v11")
            addPathData("M20 10v11")
            addPathData("M8 14v3")
            addPathData("M12 14v3")
            addPathData("M16 14v3")
        }
        return _buildingBank!!
    }

private var _buildingBank: ImageVector? = null
