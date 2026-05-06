package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortAscendingLetters: ImageVector
    get() {
        if (_sortAscendingLetters != null) return _sortAscendingLetters!!
        _sortAscendingLetters = tablerOutlineIcon(
            name = "SortAscendingLetters",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 10v-5c0-1.38 .62-2 2-2 1.38 0 2 .62 2 2v5M19 7h-4")
            addPathData("M19 21h-4l4-7h-4")
            addPathData("M4 15l3 3 3-3")
            addPathData("M7 6v12")
        }
        return _sortAscendingLetters!!
    }

private var _sortAscendingLetters: ImageVector? = null
