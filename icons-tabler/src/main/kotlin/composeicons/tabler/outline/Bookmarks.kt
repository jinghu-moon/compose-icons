package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = tablerOutlineIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 10v11L10 18 5 21v-11C5 8.343 6.343 7 8 7h4c1.657 0 3 1.343 3 3")
            addPathData("M11 3h5c1.657 0 3 1.343 3 3v11")
        }
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
