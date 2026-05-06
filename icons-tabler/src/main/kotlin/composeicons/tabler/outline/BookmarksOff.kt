package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookmarksOff: ImageVector
    get() {
        if (_bookmarksOff != null) return _bookmarksOff!!
        _bookmarksOff = tablerOutlineIcon(
            name = "BookmarksOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7h2c1.105 0 2 .895 2 2v2M15 15v6L10 18 5 21v-12C5 7.895 5.895 7 7 7")
            addPathData("M9.265 4C9.623 3.38 10.284 2.999 11 3h6c1.105 0 2 .895 2 2v10")
            addPathData("M3 3 21 21")
        }
        return _bookmarksOff!!
    }

private var _bookmarksOff: ImageVector? = null
