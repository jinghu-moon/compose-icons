package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = tablerOutlineIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6 4 10l8 4 8-4L12 6")
            addPathData("M4 14l8 4 8-4")
        }
        return _stack!!
    }

private var _stack: ImageVector? = null
