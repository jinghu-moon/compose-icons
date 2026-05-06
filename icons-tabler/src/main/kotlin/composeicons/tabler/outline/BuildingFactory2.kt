package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingFactory2: ImageVector
    get() {
        if (_buildingFactory2 != null) return _buildingFactory2!!
        _buildingFactory2 = tablerOutlineIcon(
            name = "BuildingFactory2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h18")
            addPathData("M5 21v-12l5 4v-4l5 4h4")
            addPathData("M19 21v-8L17.564 3.426C17.527 3.181 17.317 3 17.069 3h-1.145c-.245-0-.454 .177-.494 .418L14 12")
            addPathData("M9 17h1")
            addPathData("M14 17h1")
        }
        return _buildingFactory2!!
    }

private var _buildingFactory2: ImageVector? = null
