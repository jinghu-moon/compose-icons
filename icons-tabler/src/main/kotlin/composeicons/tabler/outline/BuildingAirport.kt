package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingAirport: ImageVector
    get() {
        if (_buildingAirport != null) return _buildingAirport!!
        _buildingAirport = tablerOutlineIcon(
            name = "BuildingAirport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.59 7h8.82c.344-0 .664 .176 .847 .467 .183 .291 .204 .656 .055 .966l-1.44 3c-.166 .346-.517 .567-.901 .567h-5.942c-.384-0-.735-.221-.901-.567l-1.44-3c-.149-.31-.128-.674 .055-.965C2.926 7.177 3.245 7 3.589 7")
            addPathData("M6 7 5.22 4.658c-.051-.152-.025-.32 .068-.45C5.382 4.078 5.533 4 5.693 4h4.612c.161-0 .312 .077 .406 .207 .094 .13 .12 .298 .069 .451L10 7")
            addPathData("M8 2v2")
            addPathData("M6 12v9h4v-9")
            addPathData("M3 21h18")
            addPathData("M22 5h-6L15 4")
            addPathData("M18 3l2 2L18 7")
            addPathData("M10 17h7c1.105 0 2 .895 2 2v2")
        }
        return _buildingAirport!!
    }

private var _buildingAirport: ImageVector? = null
