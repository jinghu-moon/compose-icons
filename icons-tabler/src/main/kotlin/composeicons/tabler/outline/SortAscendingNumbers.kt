package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortAscendingNumbers: ImageVector
    get() {
        if (_sortAscendingNumbers != null) return _sortAscendingNumbers!!
        _sortAscendingNumbers = tablerOutlineIcon(
            name = "SortAscendingNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15l3 3 3-3")
            addPathData("M7 6v12")
            addPathData("M17 3c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2C15.895 10 15 9.105 15 8v-3c0-1.105 .895-2 2-2")
            addPathData("M15 16c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19 16v3c0 1.105-.895 2-2 2h-1.5")
        }
        return _sortAscendingNumbers!!
    }

private var _sortAscendingNumbers: ImageVector? = null
