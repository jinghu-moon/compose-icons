package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) return _swipeRight!!
        _swipeRight = tablerOutlineIcon(
            name = "SwipeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12C4 9.791 5.791 8 8 8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C5.791 16 4 14.209 4 12")
            addPathData("M12 12h8")
            addPathData("M17 15l3-3L17 9")
        }
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
