package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stack2: ImageVector
    get() {
        if (_stack2 != null) return _stack2!!
        _stack2 = tablerOutlineIcon(
            name = "Stack2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4 4 8l8 4L20 8 12 4")
            addPathData("M4 12l8 4 8-4")
            addPathData("M4 16l8 4 8-4")
        }
        return _stack2!!
    }

private var _stack2: ImageVector? = null
