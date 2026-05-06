package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutKanban: ImageVector
    get() {
        if (_layoutKanban != null) return _layoutKanban!!
        _layoutKanban = tablerFilledIcon(
            name = "LayoutKanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6C3.448 5 3 4.552 3 4 3 3.448 3.448 3 4 3Z")
            addPathData("M20 3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6C13.448 5 13 4.552 13 4c0-.552 .448-1 1-1Z")
            addPathData("M8 7c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-2C4.343 21 3 19.657 3 18v-8C3 8.343 4.343 7 6 7Z")
            addPathData("M18 7c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-2c-1.657 0-3-1.343-3-3v-2C13 8.343 14.343 7 16 7Z")
        }
        return _layoutKanban!!
    }

private var _layoutKanban: ImageVector? = null
