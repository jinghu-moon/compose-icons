package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SortAscending2: ImageVector
    get() {
        if (_sortAscending2 != null) return _sortAscending2!!
        _sortAscending2 = tablerOutlineIcon(
            name = "SortAscending2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 9 17 6l3 3")
            addPathData("M5 5.5C5 5.224 5.224 5 5.5 5h4c.276 0 .5 .224 .5 .5v4C10 9.776 9.776 10 9.5 10h-4C5.224 10 5 9.776 5 9.5v-4")
            addPathData("M5 14.5C5 14.224 5.224 14 5.5 14h4c.276 0 .5 .224 .5 .5v4c0 .276-.224 .5-.5 .5h-4C5.224 19 5 18.776 5 18.5v-4")
            addPathData("M17 6v12")
        }
        return _sortAscending2!!
    }

private var _sortAscending2: ImageVector? = null
