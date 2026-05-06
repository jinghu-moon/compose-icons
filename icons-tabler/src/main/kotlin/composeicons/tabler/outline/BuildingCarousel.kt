package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingCarousel: ImageVector
    get() {
        if (_buildingCarousel != null) return _buildingCarousel!!
        _buildingCarousel = tablerOutlineIcon(
            name = "BuildingCarousel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 12c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 8.686 15.314 6 12 6 8.686 6 6 8.686 6 12")
            addPathData("M3 8c0 1.105 .895 2 2 2C6.105 10 7 9.105 7 8 7 6.895 6.105 6 5 6 3.895 6 3 6.895 3 8")
            addPathData("M10 4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 2.895 13.105 2 12 2c-1.105 0-2 .895-2 2")
            addPathData("M17 8c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 6.895 20.105 6 19 6c-1.105 0-2 .895-2 2")
            addPathData("M3 16c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 14.895 6.105 14 5 14c-1.105 0-2 .895-2 2")
            addPathData("M17 16c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M8 22 12 12l4 10")
        }
        return _buildingCarousel!!
    }

private var _buildingCarousel: ImageVector? = null
