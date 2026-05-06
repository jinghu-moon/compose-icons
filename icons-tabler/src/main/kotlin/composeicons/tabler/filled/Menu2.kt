package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Menu2: ImageVector
    get() {
        if (_menu2 != null) return _menu2!!
        _menu2 = tablerFilledIcon(
            name = "Menu2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 6c0 .552-.448 1-1 1h-16C3.448 7 3 6.552 3 6 3 5.448 3.448 5 4 5h16c.552 0 1 .448 1 1")
            addPathData("M21 12c0 .552-.448 1-1 1h-16C3.448 13 3 12.552 3 12c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1")
            addPathData("M21 18c0 .552-.448 1-1 1h-16C3.448 19 3 18.552 3 18c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1")
        }
        return _menu2!!
    }

private var _menu2: ImageVector? = null
