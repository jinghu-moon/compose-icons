package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingStore: ImageVector
    get() {
        if (_buildingStore != null) return _buildingStore!!
        _buildingStore = tablerOutlineIcon(
            name = "BuildingStore",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M3 7v1c0 1.657 1.343 3 3 3C7.657 11 9 9.657 9 8v-1M9 8c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-1M15 8c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-1h-18L5 3h14l2 4")
            addPathData("M5 21v-10.15")
            addPathData("M19 21v-10.15")
            addPathData("M9 21v-4c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v4")
        }
        return _buildingStore!!
    }

private var _buildingStore: ImageVector? = null
