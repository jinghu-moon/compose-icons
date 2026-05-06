package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BuildingMosque: ImageVector
    get() {
        if (_buildingMosque != null) return _buildingMosque!!
        _buildingMosque = tablerOutlineIcon(
            name = "BuildingMosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21h7v-2c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v2h7")
            addPathData("M4 21v-10")
            addPathData("M20 21v-10")
            addPathData("M4 16h3v-3h10v3h3")
            addPathData("M17 13C17 10.239 14.761 8 12 8 9.239 8 7 10.239 7 13")
            addPathData("M21 10.5c0-.329-.077-.653-.224-.947L20 8l-.776 1.553c-.147 .294-.224 .618-.224 .947 0 .276 .224 .5 .5 .5h1c.276 0 .5-.224 .5-.5")
            addPathData("M5 10.5c0-.329-.077-.653-.224-.947L4 8 3.224 9.553c-.147 .294-.224 .618-.224 .947 0 .276 .224 .5 .5 .5h1C4.776 11 5 10.776 5 10.5")
            addPathData("M12 2c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M12 6v2")
        }
        return _buildingMosque!!
    }

private var _buildingMosque: ImageVector? = null
