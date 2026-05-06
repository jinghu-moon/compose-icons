package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingFortress: ImageVector
    get() {
        if (_buildingFortress != null) return _buildingFortress!!
        _buildingFortress = tablerOutlineIcon(
            name = "BuildingFortress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 21h1c.552 0 1-.448 1-1v-1c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3M18 21h1c.552 0 1-.448 1-1v-15L17 3 14 5v6h-4v-6L7 3 4 5v15c0 .552 .448 1 1 1h2M15 19v1c0 .552 .448 1 1 1h2")
            addPathData("M7 7v.01")
            addPathData("M7 10v.01")
            addPathData("M7 13v.01")
            addPathData("M17 7v.01")
            addPathData("M17 10v.01")
            addPathData("M17 13v.01")
        }
        return _buildingFortress!!
    }

private var _buildingFortress: ImageVector? = null
