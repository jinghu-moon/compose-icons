package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) return _swipeUp!!
        _swipeUp = tablerOutlineIcon(
            name = "SwipeUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C9.791 12 8 13.791 8 16")
            addPathData("M12 12v-8")
            addPathData("M9 7 12 4l3 3")
        }
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
