package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookmarkEdit: ImageVector
    get() {
        if (_bookmarkEdit != null) return _bookmarkEdit!!
        _bookmarkEdit = tablerOutlineIcon(
            name = "BookmarkEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17 6 21v-14C6 4.791 7.791 3 10 3h4c2.209 0 4 1.791 4 4v4")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _bookmarkEdit!!
    }

private var _bookmarkEdit: ImageVector? = null
