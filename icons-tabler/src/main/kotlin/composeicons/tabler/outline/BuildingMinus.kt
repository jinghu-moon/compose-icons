package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingMinus: ImageVector
    get() {
        if (_buildingMinus != null) return _buildingMinus!!
        _buildingMinus = tablerOutlineIcon(
            name = "BuildingMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h9")
            addPathData("M9 8h1")
            addPathData("M9 12h1")
            addPathData("M9 16h1")
            addPathData("M14 8h1")
            addPathData("M14 12h1")
            addPathData("M5 21v-16C5 4.47 5.211 3.961 5.586 3.586 5.961 3.211 6.47 3 7 3h10c.53 0 1.039 .211 1.414 .586C18.789 3.961 19 4.47 19 5v7")
            addPathData("M16 19h6")
        }
        return _buildingMinus!!
    }

private var _buildingMinus: ImageVector? = null
