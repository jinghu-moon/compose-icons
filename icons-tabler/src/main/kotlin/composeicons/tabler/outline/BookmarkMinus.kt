package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookmarkMinus: ImageVector
    get() {
        if (_bookmarkMinus != null) return _bookmarkMinus!!
        _bookmarkMinus = tablerOutlineIcon(
            name = "BookmarkMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17 6 21v-14C6 4.791 7.791 3 10 3h4c2.209 0 4 1.791 4 4v8")
            addPathData("M16 19h6")
        }
        return _bookmarkMinus!!
    }

private var _bookmarkMinus: ImageVector? = null
