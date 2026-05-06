package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingTunnel: ImageVector
    get() {
        if (_buildingTunnel != null) return _buildingTunnel!!
        _buildingTunnel = tablerOutlineIcon(
            name = "BuildingTunnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21h14c1.105 0 2-.895 2-2v-7C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12v7c0 1.105 .895 2 2 2")
            addPathData("M8 21v-9C8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4v9")
            addPathData("M3 17h4")
            addPathData("M17 17h4")
            addPathData("M21 12h-4")
            addPathData("M7 12h-4")
            addPathData("M12 3v5")
            addPathData("M6 6 9 9")
            addPathData("M15 9 18 6 15 9")
        }
        return _buildingTunnel!!
    }

private var _buildingTunnel: ImageVector? = null
