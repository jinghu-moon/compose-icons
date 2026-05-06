package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingSkyscraper: ImageVector
    get() {
        if (_buildingSkyscraper != null) return _buildingSkyscraper!!
        _buildingSkyscraper = tablerOutlineIcon(
            name = "BuildingSkyscraper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M5 21v-14L13 3v18")
            addPathData("M19 21v-10L13 7")
            addPathData("M9 9v.01")
            addPathData("M9 12v.01")
            addPathData("M9 15v.01")
            addPathData("M9 18v.01")
        }
        return _buildingSkyscraper!!
    }

private var _buildingSkyscraper: ImageVector? = null
