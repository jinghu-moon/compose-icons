package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stack3: ImageVector
    get() {
        if (_stack3 != null) return _stack3!!
        _stack3 = tablerOutlineIcon(
            name = "Stack3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2 4 6l8 4L20 6 12 2")
            addPathData("M4 10l8 4 8-4")
            addPathData("M4 18l8 4 8-4")
            addPathData("M4 14l8 4 8-4")
        }
        return _stack3!!
    }

private var _stack3: ImageVector? = null
