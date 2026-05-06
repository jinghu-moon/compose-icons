package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookmarkOff: ImageVector
    get() {
        if (_bookmarkOff != null) return _bookmarkOff!!
        _bookmarkOff = tablerOutlineIcon(
            name = "BookmarkOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.708 3.721C8.38 3.25 9.18 2.999 10 3h4c2.209 0 4 1.791 4 4v7M18 18v3L12 17 6 21v-14c0-.308 .035-.609 .1-.897")
            addPathData("M3 3 21 21")
        }
        return _bookmarkOff!!
    }

private var _bookmarkOff: ImageVector? = null
