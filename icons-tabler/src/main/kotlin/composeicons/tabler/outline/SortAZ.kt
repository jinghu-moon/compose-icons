package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortAZ: ImageVector
    get() {
        if (_sortAZ != null) return _sortAZ!!
        _sortAZ = tablerOutlineIcon(
            name = "SortAZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 8h4l-4 8h4")
            addPathData("M4 16v-6C4 8.895 4.895 8 6 8c1.105 0 2 .895 2 2v6")
            addPathData("M4 13h4")
            addPathData("M11 12h2")
        }
        return _sortAZ!!
    }

private var _sortAZ: ImageVector? = null
