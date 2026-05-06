package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.List: ImageVector
    get() {
        if (_list != null) return _list!!
        _list = tablerFilledIcon(
            name = "List",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 6c0 .552-.448 1-1 1h-10C9.448 7 9 6.552 9 6 9 5.448 9.448 5 10 5h10c.552 0 1 .448 1 1")
            addPathData("M21 12c0 .552-.448 1-1 1h-10C9.448 13 9 12.552 9 12c0-.552 .448-1 1-1h10c.552 0 1 .448 1 1")
            addPathData("M21 18c0 .552-.448 1-1 1h-10C9.448 19 9 18.552 9 18c0-.552 .448-1 1-1h10c.552 0 1 .448 1 1")
            addPathData("M7 5.995v.02C7 7.114 6.105 8.005 5 8.005 3.895 8.005 3 7.114 3 6.015v-.02C3 4.896 3.895 4.005 5 4.005c1.105 0 2 .891 2 1.99")
            addPathData("M7 11.995v.02c0 1.099-.895 1.99-2 1.99-1.105 0-2-.891-2-1.99v-.02c0-1.099 .895-1.99 2-1.99 1.105 0 2 .891 2 1.99")
            addPathData("M7 17.995v.02c0 1.099-.895 1.99-2 1.99-1.105 0-2-.891-2-1.99v-.02c0-1.099 .895-1.99 2-1.99 1.105 0 2 .891 2 1.99")
        }
        return _list!!
    }

private var _list: ImageVector? = null
