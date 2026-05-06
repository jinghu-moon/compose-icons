package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingCommunity: ImageVector
    get() {
        if (_buildingCommunity != null) return _buildingCommunity!!
        _buildingCommunity = tablerOutlineIcon(
            name = "BuildingCommunity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9l5 5v7h-5v-4M8 21h-5v-7L8 9M9 10v-6C9 3.448 9.448 3 10 3h10c.552 0 1 .448 1 1v17h-8")
            addPathData("M13 7v.01")
            addPathData("M17 7v.01")
            addPathData("M17 11v.01")
            addPathData("M17 15v.01")
        }
        return _buildingCommunity!!
    }

private var _buildingCommunity: ImageVector? = null
