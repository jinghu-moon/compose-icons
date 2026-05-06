package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingCottage: ImageVector
    get() {
        if (_buildingCottage != null) return _buildingCottage!!
        _buildingCottage = tablerOutlineIcon(
            name = "BuildingCottage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M4 21v-11L6.5 5.5 12 3l5.5 2.5L20 10v11")
            addPathData("M10 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 7.895 13.105 7 12 7c-1.105 0-2 .895-2 2")
            addPathData("M9 21v-5c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v5")
        }
        return _buildingCottage!!
    }

private var _buildingCottage: ImageVector? = null
