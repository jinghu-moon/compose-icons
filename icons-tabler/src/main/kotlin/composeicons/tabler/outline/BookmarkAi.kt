package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookmarkAi: ImageVector
    get() {
        if (_bookmarkAi != null) return _bookmarkAi!!
        _bookmarkAi = tablerOutlineIcon(
            name = "BookmarkAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.02 18.32 6 21v-14C6 4.791 7.791 3 10 3h4c2.209 0 4 1.791 4 4v4.5")
            addPathData("M14 21v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4")
            addPathData("M14 19h4")
            addPathData("M21 15v6")
        }
        return _bookmarkAi!!
    }

private var _bookmarkAi: ImageVector? = null
