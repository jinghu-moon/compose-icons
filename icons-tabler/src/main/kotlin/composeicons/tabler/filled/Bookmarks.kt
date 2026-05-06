package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = tablerFilledIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6c2.209 0 4 1.791 4 4v11c-0 .36-.194 .692-.507 .869-.313 .177-.698 .173-1.007-.012L10 19.166 5.514 21.857c-.291 .175-.652 .19-.957 .04-.305-.15-.513-.445-.551-.783L4 21v-11C4 7.791 5.791 6 8 6h4Z")
            addPathData("M16 2c2.209 0 4 1.791 4 4v11c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-11C18 4.895 17.105 4 16 4h-5C10.448 4 10 3.552 10 3c0-.552 .448-1 1-1h5Z")
        }
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
