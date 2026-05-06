package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ListSearch: ImageVector
    get() {
        if (_listSearch != null) return _listSearch!!
        _listSearch = tablerOutlineIcon(
            name = "ListSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 15c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4")
            addPathData("M18.5 18.5 21 21")
            addPathData("M4 6h16")
            addPathData("M4 12h4")
            addPathData("M4 18h4")
        }
        return _listSearch!!
    }

private var _listSearch: ImageVector? = null
