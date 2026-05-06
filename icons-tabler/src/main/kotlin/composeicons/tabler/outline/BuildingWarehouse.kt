package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingWarehouse: ImageVector
    get() {
        if (_buildingWarehouse != null) return _buildingWarehouse!!
        _buildingWarehouse = tablerOutlineIcon(
            name = "BuildingWarehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21v-13L12 4l9 4v13")
            addPathData("M13 13h4v8h-10v-6h6")
            addPathData("M13 21v-9c0-.552-.448-1-1-1h-2c-.552 0-1 .448-1 1v3")
        }
        return _buildingWarehouse!!
    }

private var _buildingWarehouse: ImageVector? = null
