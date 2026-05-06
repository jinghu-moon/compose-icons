package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortDescendingNumbers: ImageVector
    get() {
        if (_sortDescendingNumbers != null) return _sortDescendingNumbers!!
        _sortDescendingNumbers = tablerOutlineIcon(
            name = "SortDescendingNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15l3 3 3-3")
            addPathData("M7 6v12")
            addPathData("M17 14c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-3c0-1.105 .895-2 2-2")
            addPathData("M15 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C19 3.895 18.105 3 17 3c-1.105 0-2 .895-2 2")
            addPathData("M19 5v3c0 1.105-.895 2-2 2h-1.5")
        }
        return _sortDescendingNumbers!!
    }

private var _sortDescendingNumbers: ImageVector? = null
