package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingPavilion: ImageVector
    get() {
        if (_buildingPavilion != null) return _buildingPavilion!!
        _buildingPavilion = tablerOutlineIcon(
            name = "BuildingPavilion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h7v-3c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v3h7")
            addPathData("M6 21v-9")
            addPathData("M18 21v-9")
            addPathData("M6 12h12c1.657 0 3-1.343 3-3C16.79 9.118 13.051 6.626 12 3 10.949 6.626 7.21 9.118 3 9c0 1.657 1.343 3 3 3")
        }
        return _buildingPavilion!!
    }

private var _buildingPavilion: ImageVector? = null
