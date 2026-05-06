package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SwipeLeft: ImageVector
    get() {
        if (_swipeLeft != null) return _swipeLeft!!
        _swipeLeft = tablerOutlineIcon(
            name = "SwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 12C20 9.791 18.209 8 16 8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4")
            addPathData("M12 12h-8")
            addPathData("M7 15 4 12 7 9")
        }
        return _swipeLeft!!
    }

private var _swipeLeft: ImageVector? = null
