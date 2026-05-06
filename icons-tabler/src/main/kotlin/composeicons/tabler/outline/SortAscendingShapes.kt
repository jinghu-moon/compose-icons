package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortAscendingShapes: ImageVector
    get() {
        if (_sortAscendingShapes != null) return _sortAscendingShapes!!
        _sortAscendingShapes = tablerOutlineIcon(
            name = "SortAscendingShapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15l3 3 3-3")
            addPathData("M7 6v12")
            addPathData("M14 5c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-4")
            addPathData("M17 14l-3.5 6h7L17 14")
        }
        return _sortAscendingShapes!!
    }

private var _sortAscendingShapes: ImageVector? = null
