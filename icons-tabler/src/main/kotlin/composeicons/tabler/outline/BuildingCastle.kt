package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingCastle: ImageVector
    get() {
        if (_buildingCastle != null) return _buildingCastle!!
        _buildingCastle = tablerOutlineIcon(
            name = "BuildingCastle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 19v-2c0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3v2c0 .552-.448 1-1 1h-4C3.448 20 3 19.552 3 19v-14h4v3h3v-3h4v3h3v-3h4v14c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1")
            addPathData("M3 11h18")
        }
        return _buildingCastle!!
    }

private var _buildingCastle: ImageVector? = null
