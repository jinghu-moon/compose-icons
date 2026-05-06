package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsSort: ImageVector
    get() {
        if (_arrowsSort != null) return _arrowsSort!!
        _arrowsSort = tablerOutlineIcon(
            name = "ArrowsSort",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9 7 5l4 4M7 5v14")
            addPathData("M21 15l-4 4L13 15M17 19v-14")
        }
        return _arrowsSort!!
    }

private var _arrowsSort: ImageVector? = null
