package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = tablerOutlineIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h7")
            addPathData("M4 12h7")
            addPathData("M4 18h9")
            addPathData("M15 9 18 6l3 3")
            addPathData("M18 6v12")
        }
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
