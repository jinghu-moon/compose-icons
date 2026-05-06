package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingBridge: ImageVector
    get() {
        if (_buildingBridge != null) return _buildingBridge!!
        _buildingBridge = tablerOutlineIcon(
            name = "BuildingBridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5v14")
            addPathData("M18 5v14")
            addPathData("M2 15h20")
            addPathData("M3 8C4.148 7.587 5.178 6.901 6 6c1.009 2.422 3.376 4 6 4 2.624 0 4.991-1.578 6-4 .822 .901 1.852 1.587 3 2")
            addPathData("M12 10v5")
        }
        return _buildingBridge!!
    }

private var _buildingBridge: ImageVector? = null
