package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingFactory: ImageVector
    get() {
        if (_buildingFactory != null) return _buildingFactory!!
        _buildingFactory = tablerOutlineIcon(
            name = "BuildingFactory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 21C5.147 16.98 5.983 12.973 6 9h6c.017 3.973 .853 7.98 2 12")
            addPathData("M12.5 13h4.5c.025 2.612 .894 5.296 2 8")
            addPathData("M9 5c.461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1 .461 .643 1.209 1.017 2 1 .791 .017 1.539-.357 2-1 .461-.643 1.209-1.017 2-1 .791-.017 1.539 .357 2 1")
            addPathData("M3 21h19")
        }
        return _buildingFactory!!
    }

private var _buildingFactory: ImageVector? = null
