package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortDescendingSmallBig: ImageVector
    get() {
        if (_sortDescendingSmallBig != null) return _sortDescendingSmallBig!!
        _sortDescendingSmallBig = tablerOutlineIcon(
            name = "SortDescendingSmallBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15 7 18 4 15")
            addPathData("M7 6v12")
            addPathData("M14 18.333c0 .369 .298 .667 .667 .667h2.666c.368 0 .667-.299 .667-.667v-2.666C18 15.299 17.701 15 17.333 15h-2.666c-.368 0-.667 .299-.667 .667v2.666")
            addPathData("M14 10.833c0 .645 .522 1.167 1.167 1.167h4.666C20.478 12 21 11.478 21 10.833v-4.666C21 5.522 20.478 5 19.833 5h-4.666C14.522 5 14 5.522 14 6.167v4.666")
        }
        return _sortDescendingSmallBig!!
    }

private var _sortDescendingSmallBig: ImageVector? = null
