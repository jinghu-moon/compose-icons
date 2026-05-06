package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingArch: ImageVector
    get() {
        if (_buildingArch != null) return _buildingArch!!
        _buildingArch = tablerOutlineIcon(
            name = "BuildingArch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M4 21v-15C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v15")
            addPathData("M9 21v-8c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3v8")
        }
        return _buildingArch!!
    }

private var _buildingArch: ImageVector? = null
