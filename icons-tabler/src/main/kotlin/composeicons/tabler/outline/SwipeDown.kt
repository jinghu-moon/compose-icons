package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SwipeDown: ImageVector
    get() {
        if (_swipeDown != null) return _swipeDown!!
        _swipeDown = tablerOutlineIcon(
            name = "SwipeDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C9.791 12 8 10.209 8 8 8 5.791 9.791 4 12 4")
            addPathData("M12 12v8")
            addPathData("M9 17l3 3 3-3")
        }
        return _swipeDown!!
    }

private var _swipeDown: ImageVector? = null
