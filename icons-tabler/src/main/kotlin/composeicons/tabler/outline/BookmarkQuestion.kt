package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookmarkQuestion: ImageVector
    get() {
        if (_bookmarkQuestion != null) return _bookmarkQuestion!!
        _bookmarkQuestion = tablerOutlineIcon(
            name = "BookmarkQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 19 12 17 6 21v-14C6 4.791 7.791 3 10 3h4c2.209 0 4 1.791 4 4v4")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _bookmarkQuestion!!
    }

private var _bookmarkQuestion: ImageVector? = null
