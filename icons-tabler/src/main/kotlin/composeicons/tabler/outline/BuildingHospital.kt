package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingHospital: ImageVector
    get() {
        if (_buildingHospital != null) return _buildingHospital!!
        _buildingHospital = tablerOutlineIcon(
            name = "BuildingHospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M5 21v-16C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v16")
            addPathData("M9 21v-4c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v4")
            addPathData("M10 9h4")
            addPathData("M12 7v4")
        }
        return _buildingHospital!!
    }

private var _buildingHospital: ImageVector? = null
