package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortAscendingSmallBig: ImageVector
    get() {
        if (_sortAscendingSmallBig != null) return _sortAscendingSmallBig!!
        _sortAscendingSmallBig = tablerOutlineIcon(
            name = "SortAscendingSmallBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15l3 3 3-3")
            addPathData("M7 6v12")
            addPathData("M14 5.667C14 5.298 14.298 5 14.667 5h2.666c.369 0 .667 .298 .667 .667v2.666C18 8.701 17.701 9 17.333 9h-2.666C14.299 9 14 8.701 14 8.333v-2.666")
            addPathData("M14 13.167C14 12.522 14.522 12 15.167 12h4.666c.645 0 1.167 .522 1.167 1.167v4.666C21 18.478 20.478 19 19.833 19h-4.666C14.522 19 14 18.478 14 17.833v-4.666")
        }
        return _sortAscendingSmallBig!!
    }

private var _sortAscendingSmallBig: ImageVector? = null
